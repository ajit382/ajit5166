package hashcode;

public class mainemployee
{
public static void main(String[] args)
{

	emp1 p=new emp1(125, "ajit", 23535235);
	System.out.println(p.hashCode());
	emp1 p2=new emp1(126, "amit", 23535369);
	System.out.println(p2.hashCode());
	Object ob=new emp1(129, "anil", 24524545);
	System.out.println(ob.hashCode()); 
	
}
}
