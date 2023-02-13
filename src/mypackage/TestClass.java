package mypackage;

public class TestClass {

    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton singleton = null;

                    singleton = MySingleton.getInstance();

                singleton.printSomething("I am in t1");
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton singleton = null;

                    singleton = MySingleton.getInstance();

                singleton.printSomething("I am in t2");
            }
        });


        t2.start();
    }
}
