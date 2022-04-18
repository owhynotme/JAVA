
class namec implements Runnable
{
    public void run() 
    {
        Thread t= new Thread();
        t.setName("Boi");
        System.out.println("Thread name-> "+t);
        String s=t.getName();
        System.out.println("got Thread name-> "+s);

    }
}

public class Thread_name_change {

        public static void main(String ar[])
        {
            namec obj=new namec();
            Thread oo = new Thread(obj);
            oo.start();

        }
}
