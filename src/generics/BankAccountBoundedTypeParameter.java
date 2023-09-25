package generics;

public class BankAccountBoundedTypeParameter<T extends Number > {
    public void display(T[] t1) {
        for (T i: t1) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccountBoundedTypeParameter<Number> b1 = new BankAccountBoundedTypeParameter<>();

        Integer[] m1 = {100, 200, 300};
        Double[] m2 = {20.45, 67.45, 30.00};
        String[] s1 = {"hi", "hello"};

        b1.display(m1);
        b1.display(m2);
//        b1.display(s1);

    }
}
