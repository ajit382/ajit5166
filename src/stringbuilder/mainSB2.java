package stringbuilder;

public class mainSB2 
{
	public static void main(String[] args)
	{
	StringBuilder sb=new StringBuilder("ajit");
	System.out.println(sb);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	sb.reverse();
	System.out.println(sb);
	sb.delete(1,3);
	System.out.println(sb);
}
}
