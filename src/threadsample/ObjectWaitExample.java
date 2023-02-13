package threadsample;

public class ObjectWaitExample {

    public static void main(String[] args) {
        Cust c = new Cust();
        Thread w = new Thread(new Withdrawal(c, 2000));
        Thread d1 = new Thread(new Demo(c, 50));
        Thread d2 = new Thread(new Demo(c, 150));
        Thread d3 = new Thread(new Demo(c, 900));
        w.start();
        d1.start();
        d2.start();
        d3.start();
    }

}
