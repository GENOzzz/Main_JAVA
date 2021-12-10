package TEST_6;

class Circle{
	int x,y,r;
	Circle(int x,int y,int r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public String toString() {
		return "Circle("+this.x+","+this.y+")������"+this.r;
	}
	public boolean equals(Object obj) {
		Circle c=(Circle)obj;
		if(x==c.x&&y==c.y) return true;
		else return false;
	}
}

public class test6_2 {
	public static void main(String[] args) {
		Circle a= new Circle(2,3,5);
		Circle b= new Circle(2,3,30);
		System.out.println("�� a : "+a);
		System.out.println("�� b : "+b);
		if(a.equals(b))
			System.out.println("������");
		else
			System.out.println("�ٸ���");
	}

}