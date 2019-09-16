package string;

public class maianS2 
{
public static void main(String[] args)
{
String s1="ajit";
String s2="amit";
String s3="ajit";
String st1=new String("ajit");
String st2=new String("amit");
String st3=new String("ajit");
//it compare the address
System.out.println("s1==st1"+(s1==st1));
System.out.println("s2==st2"+(s2==st2));
System.out.println("s3==st3"+(s3==st3));
System.out.println("s1==s2"+(s1==s2));
System.out.println("s1==s3"+(s1==s3));
//it compare the content
System.out.println("--------------");
System.out.println("s1 equal s2"+s1.equals(s2));
System.out.println("s1 equal s3"+s1.equals(s3));
System.out.println("s1 equal st1"+s1.equals(st1));
System.out.println("s2 equal st2"+s2.equals(st2));
System.out.println("s3 equal st3"+s3.equals(st3));
System.out.println("--------------");
System.out.println("s1 equal st2"+s1.equals(st2));
System.out.println("s1 equal st3"+s1.equals(st3));



}
}
