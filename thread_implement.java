
class imt1 implements Runnable {

    int c = 0;

    public void run() {
        int i = 1;
        while (i < 51) {
            c++;
            System.out.println("Thread juice wrld " + c);
            i++;
        }
    }
}

class imt2 implements Runnable {

    int c = 0;

    public void run() {
        int i = 1;
        while (i < 51) {
            c++;
            System.out.println("Thread 1975 " + c);
            i++;
        }
    }
}

public class thread_implement {

    public static void main(String a[]) {
        imt1 t1 = new imt1();
        Thread t11 = new Thread(t1);

        imt2 t2 = new imt2();
        Thread t22 = new Thread(t2);

        t11.start();
        t22.start();

    }

}
