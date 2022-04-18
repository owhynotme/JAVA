
class Test extends Thread
{
    public Test(String name)
    {
        super(name);
    }

    public void run()
    {
        System.out.println("Hello Boi");
    }

}

public class Name_Constructor {
    
    public static void main(String a[])
    {
        Test t1 = new Test("tarun");
        Test t2 = new Test("Bruhhh");
        t1.start();
        t2.start();
        System.out.println(" Thread 1 Name-> "+t1.getName());
        System.out.println("Thread 2Name-> "+t2.getName());
    }

}
