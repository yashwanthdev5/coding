package OOPs;

public class Encapsulation {
    public static void main(String[] args) {
        bank b=new bank();
        int balance=b.getData();
        System.out.println("balance :"+balance);
    }
}
class bank{
    private int balance;
    void setData(int balance)
    {
        this.balance=balance;
    }
    int getData(){
        return balance;
    }
}
