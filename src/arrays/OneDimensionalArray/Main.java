package arrays.OneDimensionalArray;

public class Main {

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 0);
        sda.insert(1,10);
        sda.insert(2, 20);
        sda.insert(1, 30);
        sda.insert(12, 120);

//        var firstElement = sda.arr[0];  //--------------------------- Time & Space Complexity O(1)
//        System.out.println(firstElement);
//        var eleventhElement = sda.arr[11];  //----------------------- Time & Space Complexity O(1)
//        System.out.println(eleventhElement);

//        sda.traverseArray();
//        sda.searchInArray(120);
        sda.deleteValueFromArray(0);
        System.out.println(sda.arr[0]);
    }

}
