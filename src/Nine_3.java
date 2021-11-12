import java.util.Date;
public class Nine_3 {

	public static void main(String[] args) {
		int i=0;
		long k=1000;
		for (i=0;i<8;i++)
		{
			
		k=k*10;
		Date d1=new Date(k);
		System.out.println(d1.toString());
		}

	}

}
