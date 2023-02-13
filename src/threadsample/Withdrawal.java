package threadsample;

class Withdrawal implements Runnable {
    Cust c; int with;

    Withdrawal(Cust c, int with){
        this.c = c;
        this.with = with;
    }

    @Override
    public void run() {
        c.withdrawal(with);
    }
}
