
// using Thread Class

class MyThread1 extends Thread {

    @Override
    public void run() {

        int i = 1;
        while (i < 51) {
            System.out.println("Eject Wtaer");
            i++;
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Love in Oct");
            i++;
        }

    }
}

public class thread_try1 {

    public static void main(String ar[]) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }

}
