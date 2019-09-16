package stringbuilder;

public class mainSB3 
{
	public static void main(String[] args)
	{
	StringBuilder sb=new StringBuilder(5);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	sb.append("jspider");
	System.out.println(sb);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	String str=sb.toString();// stringbuilder to string type
	System.out.println(str);
	String str1="amit";
	StringBuilder sb1=new StringBuilder(str1);//strong to stringbuilder
	System.out.println(sb1);
	}
}
