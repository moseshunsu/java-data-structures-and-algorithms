package generics;

public class BankAccount<T> {

    T t1;

    public BankAccount(T t1) {
        this.t1 = t1;
    }

    public void display() {
        System.out.println(t1);
    }

    public <T> void depositMoney(T[] money) {
        for (T i: money) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount<String> b1 = new BankAccount<>("hello");
        BankAccount<Integer> b2 = new BankAccount<>(4);

//        b1.display();
//        b2.display();

        Integer[] m1 = {100, 200, 300};
        Double[] m2 = {20.45, 67.45, 30.00};

        b1.depositMoney(m1);
        b2.depositMoney(m2);
    }

}
