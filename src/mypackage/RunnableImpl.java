package mypackage;

import java.util.concurrent.FutureTask;

public class RunnableImpl implements Runnable {

    public void run()
    {
        System.out.println(Thread.currentThread().getName()
                + ", executing run() method!");
    }

}
