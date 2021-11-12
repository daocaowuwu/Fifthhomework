import java.util.Scanner;

public class TestQE {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		QuadraticEquation qe=new QuadraticEquation();
		System.out.print("请输入三个数字a b c:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		qe.setParameter(a, b, c);
		if (qe.getDiscriminant()>0)
		{
			System.out.println("有两个根："+qe.getRoot1()+","+qe.getRoot2());
			
		}
		else if(qe.getDiscriminant()==0)
		{
			System.out.println("有一个根："+qe.getRoot1());
			
		}
		else
			System.out.println("无实数根");

	}

}
