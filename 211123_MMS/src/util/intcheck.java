package util;
import java.util.Scanner;

public class intcheck {
	private int cnum;
	public int checkk(String num) {//문자열을 매개변수로
		Scanner scan=new Scanner(System.in);
		char tmp;
		boolean check=false;//와일문 반복을 위한 check
		while(!check) {
			for(int i=0;i<num.length();i++) {//입력받은 문자열 num의 길이만큼반복
				tmp=num.charAt(i);			//각 자리를 tmp에 대입
				if(!('0'<=tmp&&tmp<='9')) {///만약 하나라도 0~9를 벗어 난다면
					num=null;		//num을 비우고
					System.out.print("숫자만 입력해 주시기 바랍니다.>>>");
					num=scan.next();//재입력받아 저장
					i=-1;			//후에 입력받은값을 i=0부터 시작하기위해 -1입력.
				}
			}
		cnum=Integer.parseInt(num); //int형은 2147483647 까지 밖에 받지 못하므로 num에서 그 숫자가 넘어가는경우
		check=true;					//에러발생.
		}
		return cnum;
	}
	public static void main(String[] args) {//함수가 작동하는지 확인하기위한 메인문
		Scanner scan=new Scanner(System.in);
		while(true) {
			intcheck intcheck=new intcheck();
			System.out.print("아무 문자나 입력 : ");
			
			String p=scan.nextLine();
			
			System.out.println(intcheck.checkk(p));
		}
	}

}
