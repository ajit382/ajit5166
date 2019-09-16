package string;

public class mainS4 
{
public static void main(String[] args) 
{
	CharSequence cs=new String("jspider");
	System.out.println(cs.length());
	System.out.println(cs.charAt(4));
	System.out.println(cs.subSequence(1, 5));
}
}
