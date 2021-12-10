package chapter6_1207;

import java.util.Calendar;

public class Ex6_11 {
	public static void printCalendar(String msg,Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;//get()�� 0~30������ ���� ����
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond=cal.get(Calendar.MILLISECOND);
		System.out.print(msg+year+"/"+month+"/"+day+"/");
		
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("�Ͽ���");break;
		case Calendar.MONDAY : System.out.print("������");break;
		case Calendar.TUESDAY : System.out.print("ȭ����");break;
		case Calendar.WEDNESDAY : System.out.print("������");break;
		case Calendar.THURSDAY : System.out.print("�����");break;
		case Calendar.FRIDAY : System.out.print("�ݿ���");break;
		case Calendar.SATURDAY : System.out.print("�����");break;
		}
		
		System.out.print("("+hourOfDay+"��)");
		if(ampm==Calendar.AM)
			System.out.print("����");
		else
			System.out.print("����");
		
		System.out.println(hour+"�� "+minute+"�� "+second+"�� "+millisecond+"�и���");
	}
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		printCalendar("����",now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();//���� ��¥�� �ð������� ��� �����.
		firstDate.set(1994,6,19);//1994�� 7�� 25��, 7���� ǥ���ϱ����� month 6���� ����.
		
		firstDate.set(Calendar.HOUR_OF_DAY,20);//���� 8��
		firstDate.set(Calendar.MINUTE,30);//30��
		printCalendar("���� �¾ ����",firstDate);
	}

}