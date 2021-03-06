package java211129;

class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() { //Object클래스의 toString() 메서드를 오버라이딩.
		return this.x+", "+this.y;
	}
	public boolean equals(Object obj) {//Object클래스의 equals() 메서드를 오버라이딩.
		Point p=(Point)obj;	//입력받은 obj를 Point로 다운캐스팅
		if(x==p.x&&y==p.y)return true; //호출한 객체의 x와 입력받은 객체의 x가 같고 호출한 객체의 y와 입력받은 객체의 y가 같다면 true;
		else return false;	//아니라면 false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());//Point클래에서 오버라이딩 하지 않았다면 Object클래스에서 정의된 함수 호출.
		System.out.println(obj);			//=>java211129.Point@15db9742
	}
	public static void main(String[] args) {
		Point p= new Point(2,3);
		print(p);
		Point a=new Point(2,3);
		Point b=new Point(3,4);
		if(a==b) System.out.println("a==b");//false
		if(a.equals(p)) System.out.println("a equals p");//true
		if(a.equals(b)) System.out.println("a equals b");//false
		System.out.println("--------------------------");
		a=b;
		if(a.equals(b)) System.out.println("a equals b");//true
	}

}
