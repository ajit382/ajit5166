package equal;

public class emp5 
{
	int id;
	String name;
	double sal;
	public emp5(int id, String name, double sal)
	{
	
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString()
	{
		return  "["+id+","+name+","+sal+"]" ;
	}
	public boolean equals (Object ob)
	{
		if(ob instanceof emp5)
		{
			emp5 e=(emp5)ob;
			return e.sal==this.sal;
		}
	return false;
}
}
