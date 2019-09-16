package string;

public class mainS1
{
	public static void main(String[] args)
	{
	
String s1=new String("GBR");
String s2=new String("GBR");
String s3=new String("xyz");
String s4=new String("gbr");
System.out.println("s1   "+s1.hashCode());
System.out.println("s2   "+s2.hashCode());
System.out.println("s3   "+s3.hashCode());
System.out.println("s4   "+s4.hashCode());
System.out.println("--------------");
System.out.println("s1==s2"+s1==s2);
System.out.println("s1==s3"+s1==s3);
System.out.println("s1==s4"+s1==s4);
System.out.println("s3==s4"+s1==s2);
System.out.println("--------------");
System.out.println("s1 equal s2"+s1.equals(s2));
System.out.println("s1 equal s3"+s1.equals(s3));
System.out.println("s1 equal s4"+s1.equals(s4));
System.out.println("s3 equal s4"+s3.equals(s4));
System.out.println("s4 equal s1"+s4.equals(s1));
}
}