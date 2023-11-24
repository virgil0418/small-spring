import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("t1begin");
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("t1end1");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("t1end2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        thread1.start();
        Thread thread2 = new Thread(()->{
            System.out.println("t2begin");
            synchronized (thread1){
                try {
                    System.out.println("t2end1");
                    thread1.wait();
                    System.out.println("t2end2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        thread2.start();
    }
}
