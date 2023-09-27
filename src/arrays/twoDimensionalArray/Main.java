package arrays.twoDimensionalArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insert(0, 0, 10);
        tda.insert(0, 1, 20);
        tda.insert(1, 0, 30);
        tda.insert(2, 0, 40);

//        tda.accessCell(0, 1);
//        tda.traverse2DArray();
//        tda.search(50);

        System.out.println(Arrays.deepToString(tda.arr));
        tda.deleteValueFromArray(0, 0);
        System.out.println(Arrays.deepToString(tda.arr));
    }

}
