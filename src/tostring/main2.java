package tostring;

public class main2 
{
public static void main(String[] args)
{
sample s1=new sample();
String st=s1.toString();
System.out.println(st);
System.out.println(s1);//s1.tostring();
System.out.println("-----------");
simple si=new simple();
String st1=si.toString();
System.out.println(st1);
System.out.println(si);//si.tostring();
System.out.println("----------");
Object o1=new simple();
Object o2=new sample();
System.out.println(o1);
System.out.println(o2);


}
}
   