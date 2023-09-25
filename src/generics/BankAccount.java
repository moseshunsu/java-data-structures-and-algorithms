package generics;

public class BankAccount<T> {

    T t1;

    public BankAccount(T t1) {
        this.t1 = t1;
    }

    public void display() {
        System.out.println(t1);
    }

    public static void main(String[] args) {
        BankAccount<String> b1 = new BankAccount<>("hello");
        BankAccount<Integer> b2 = new BankAccount<>(4);

        b1.display();
        b2.display();
    }

}
