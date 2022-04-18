
class Mythread1 extends Thread {

    public void run() {
        try {
            System.out.println("Thread " + currentThread().getId());
            System.out.println("Thread " + getName());
        } catch (Exception e) {

            System.out.println(e);
        }
    }  
}

class Mythread2 implements Runnable{

    public void run()
    {
        System.out.println("Thread 2 "+Thread.currentThread().getId());
        System.out.println(" "+Thread.currentThread().getName());
    }
}

public class CurrentThread {
    public static void main(String a[]) 
    {
        // for(int i=0; i<7;i++)
        // {
            Mythread1 t1=new Mythread1();
            t1.start();
        // }


        Mythread2 t2= new Mythread2();
        Thread t22= new Thread(t2);
        t22.start();

    }
}