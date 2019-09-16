package equal;

public class mainrun 
{
public static void main(String[] args) 
{
Object ob1=new Object();
Object ob2=new Object();
boolean rs=ob1.equals(ob2);  //false.
System.out.println(rs);
System.out.println(ob1.equals(ob1));
System.out.println(ob2.equals(ob1));
System.out.println(ob2.equals(ob2));
System.out.println(ob1==ob2);

}
}
