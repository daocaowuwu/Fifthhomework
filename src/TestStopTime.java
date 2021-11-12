
public class TestStopTime {

	public static void main(String[] args) {
		double[] num=new double[100001];
		int i=0;
		int j=0;
		for(i=0;i<100000;i++)
		{
			num[i]=i;
		}
		double min1;
		int k=0;
		StopWatch s=new StopWatch();
		s.start();
		for (i=0;i<100000;i++)
		{
			min1=num[i];
			k=i;
			for (j=i;j<100000;j++)
			{
				if (num[j]<min1)
				{
					min1=num[j];
					k=j;
				}
				
			}
			num[i]=min1;
		}
		s.stop();
		System.out.println(s.getElapsedTime());
		/*
		for (i=0;i<100;i++)
		{
			System.out.println(num[i]);
		}
		*/

	}

}
