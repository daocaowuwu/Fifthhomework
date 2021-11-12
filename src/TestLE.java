import java.util.Scanner;

public class TestLE {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		LinearEquation le=new LinearEquation();
		System.out.print("ÇëÊäÈë6¸öÊı×Öa b c d e f:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		if (!le.isSolveable())
			System.out.println("The equation has no solution.");
		else
			System.out.println("X="+le.getX()+" Y="+le.getY());

	}

}
