package equal;
public class main5
{
	public static void main(String[] args)
	{
	sample s1=new sample();
	simple s=new simple();
	simple si=new simple();
	System.out.println(s.equals(si));
	System.out.println(si.equals(s));
	System.out.println(s.equals(s1));
	System.out.println(s1.equals(s));
	System.out.println(s==si);
	
	
	}
}
