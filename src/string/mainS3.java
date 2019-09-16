package string;

public class mainS3
{
public static void main(String[] args) 
{
String s1="ajit";
String s2="amit";
String s3="ajit";
System.out.println(s1==s3);
System.out.println(s1.compareTo(s2));
System.out.println(s2.compareTo(s1));
System.out.println(s1.compareTo(s1));
System.out.println("A".compareTo("B"));
System.out.println("B".compareTo("A"));
System.out.println("A".compareTo("a"));
Comparable st="raghu";
int a=st.compareTo("mohit");
System.out.println(a);
}
}
