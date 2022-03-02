import java.util.Scanner;
@FunctionalInterface
interface Asssign
{
	abstract double calculate(int x,int y);
}
class Assignment4Q1 {
	public double addition(int num1,int num2)
    {
		return (double) num1+num2;
    }
    public double subtraction(int num1,int num2)
    {
    	return (double) num1-num2;
    }
    public double multiplication(int num1,int num2)
    {
    	return (double) num1*num2;
    }
    public double division(int num1,int num2)
    {
    	return (double) num1/num2;
    }
    public static void main(String[] args) 
    {
		Scanner h=new Scanner(System.in);
		int i,k;
    	i=h.nextInt();
    	k=h.nextInt();
    	Assignment4Q1 assignment4Q1=new Assignment4Q1();
    	
    	Asssign r = (int c,int m)->assignment4Q1.addition(c, m);
    double gip=r.calculate(i, k);
    	System.out.println(gip);
    	
    	Asssign j = (int c,int m)->assignment4Q1.subtraction(c, m);
    	double gipe=j.calculate(i, k);
    	System.out.println(gipe);
    	
    	Asssign p = (int c,int m)->assignment4Q1.multiplication(c, m);
    	double cipe=p.calculate(i, k);
    	System.out.println(cipe);
    	
    	Asssign q = (int c,int m)->assignment4Q1.division(c, m);
    	double ciper=q.calculate(i, k);
    	System.out.println(ciper);
    }
	
}