import java.util.GregorianCalendar;
public class Nine_5 {

	public static void main(String[] args) {
		GregorianCalendar ymd=new GregorianCalendar();//获取当前日期
		int y=ymd.get(GregorianCalendar.YEAR);
		int m=ymd.get(GregorianCalendar.MONTH)+1;    //！！月份加1，才是真正的月份
		int d=ymd.get(GregorianCalendar.DAY_OF_YEAR);
		System.out.println("Now year is "+y+", month is "+m+", Day of year is "+d);
		
		ymd.setTimeInMillis(1234567898765L);
		 y=ymd.get(GregorianCalendar.YEAR);
		 m=ymd.get(GregorianCalendar.MONTH)+1;
		 d=ymd.get(GregorianCalendar.DAY_OF_YEAR);
		System.out.println("year is "+y+", month is "+m+", Day of year is "+d);
		

	}

}
