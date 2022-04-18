
class base_constructor
{
	int num;
	base_constructor(int n)
	{
		num=n;
		System.out.println("Value = "+num);
	}

}

class sub_constructor extends base_constructor
{
	
	sub_constructor()
	{
		super(88);
	}

}

public class ConsPassCons {
    public static void main(String ar[])
    {
     sub_constructor obj=new sub_constructor();
    }
    
}
