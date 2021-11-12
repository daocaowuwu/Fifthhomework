
public class LinearEquation {
	private double a,b,c,d,e,f;
	LinearEquation(){
		a=0;
		b=e=1;
		c=f=1;
		d=0;
	}
	public void setA(double n)
	{
		a=n;
	}
	public void setB(double n)
	{
		b=n;
	}
	public void setC(double n)
	{
		c=n;
	}
	public void setD(double n)
	{
		d=n;
	}
	public void setE(double n)
	{
		e=n;
	}
	public void setF(double n)
	{
		f=n;
	}
	public boolean isSolveable() {
		if (a*d-b*c!=0)
			return true;
		else
			return false;
	}
	public double getX()
	{
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY()
	{
		return (a*f-e*c)/(a*d-b*c);
	}
	

}
