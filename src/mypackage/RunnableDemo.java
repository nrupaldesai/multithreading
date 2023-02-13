package mypackage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread is- "
                + Thread.currentThread().getName());

        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i=0;i<25;i++) {

            service.execute(() -> {

                System.out.println("In thread:"+Thread.currentThread().getId());
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

    }


}