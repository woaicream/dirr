package exchanger1;

public class Myrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行了");
    }
}
