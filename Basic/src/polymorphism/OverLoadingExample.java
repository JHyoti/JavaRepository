package polymorphism;

public class OverLoadingExample {
	public int add(int x,int y)//withreturn type with parameter
	{
		int z=x+y;
		return z;
	}
	public double add(double q)//withreturn type with parameter
	{
		double res=q+3;
		return res;
	}
	public float add(float a,float b,float c)//withreturn type with parameter
	{
		float res=a+b+c;
		return res;
	}

}
