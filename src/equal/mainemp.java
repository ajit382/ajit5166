package equal;



public class mainemp 
{

public static void main(String[] args) 
{
emp5 e1=new emp5(125, "ajit", 23555);
System.out.println(e1);
emp5 e2=new emp5(126, "amit", 23555);
System.out.println(e2);
Object ob=new emp5(129, "anil", 24524545);
System.out.println(ob);
System.out.println(e1.equals(e2));
System.out.println(e1.equals(e1));
System.out.println(e1.equals(ob));
System.out.println(ob.equals(e2));

}

}
