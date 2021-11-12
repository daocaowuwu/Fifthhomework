import java.util.Random;
public class Nine_4 {

	public static void main(String[] args) {
		Random r=new Random(1000);
		//r.setseed(1000);
		int i;
		for (i=0;i<50;i++)
		{
			int d=r.nextInt(100);//[0,100)
			System.out.println(d);
		}
		

	}

}
