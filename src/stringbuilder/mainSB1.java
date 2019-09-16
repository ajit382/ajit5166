package stringbuilder;

public class mainSB1 
{
public static void main(String[] args)
{
StringBuilder sb=new StringBuilder();
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("jspider");
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("welcome to bangalore");
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("birthaday");
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.insert(7," and ");
System.out.println(sb);
sb.replace(0,7,"btm");
System.out.println(sb);

}
}
