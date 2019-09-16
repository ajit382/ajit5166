package string;

public class mainS5
{
public static void main(String[] args)
{
String st="jspider"	;
char ch[]=st.toCharArray();// string to char convert
for(int i=0;i<ch.length;i++)
{
	System.out.println(ch[i]);
}
System.out.println("------------");
char c1[]= {'w','e','l','c','o','m','e'};
String st1=new String(c1);
System.out.println(st1);// char to string covert
System.out.println("------------");
String st2="Qspider"	;
byte[] b=st2.getBytes();//string to byte
for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}
}
}
