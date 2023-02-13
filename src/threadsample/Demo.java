package threadsample;

class Demo implements Runnable {
    Cust c; int depo;

    Demo(Cust c, int depo){
        this.c = c;
        this.depo = depo;
    }

    @Override
    public void run() {
        c.deposit(depo);
    }
}
