package hashcode;

public class emp1 
{
	
	int id;
	String name;
	double sal;
	public emp1(int id, String name, double sal)
	{
	
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString()
	{
		return "["+id+","+name+","+sal+"]" ;
	}
	public int hashCode()
	{
		return id;
	}
	
	}
	

