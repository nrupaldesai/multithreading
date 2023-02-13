package threadsample;

class Cust {

    private int totalAmount = 1000;

    public synchronized void withdrawal(int amount) {
        System.out.println("Total amount " + totalAmount + " withdrawing amount " + amount);
        while (this.totalAmount < amount) {
            System.out.println("not enough amount..waiting for deposit..");
            try { wait(); } catch (Exception e) {}
        }
        this.totalAmount -= amount;
        System.out.println("Withdrawal successful.. Remaining balance is "+totalAmount);
    }

    public synchronized void deposit(int amount){
        System.out.println("Depositing amount "+amount);
        this.totalAmount += amount;
        System.out.println("deposit completed...and Now totalAmount is " + this.totalAmount);
        notify();
    }
}