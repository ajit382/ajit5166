package tostring;

public class emp
{
int id;
String name;
double sal;
public emp(int id, String name, double sal) 
{
	this.id = id;
	this.name = name;
	this.sal = sal;
}
public String toString()
{
	return "["+id+","+name+","+sal+"]" ;


}

}

