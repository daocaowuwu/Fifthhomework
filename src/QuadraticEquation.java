
public class QuadraticEquation {
	private double a,b,c;
	QuadraticEquation() {
		a=b=c=0;
	}
	public void setParameter(double x,double y,double z) {
		a=x;
		b=y;
		c=z;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		if (getDiscriminant()<0)
		{
			return 0;
		}
		else 
			return (-b+getDiscriminant())/(2*a);
	}
	public double getRoot2() {
		if (getDiscriminant()<0)
		{
			return 0;
		}
		else 
			return (-b-getDiscriminant())/(2*a);
	}
	

}
