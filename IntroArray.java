import java.util.ArrayList;
import java.util.Arrays;

public class IntroArray {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        /*
         * int[] numbers = new int[3];
         * numbers[0] = 10;
         * numbers[1] = 20;
         * numbers[2] = 30;
         */
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        // integer - wrapper class- object
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        System.out.println(list.indexOf(30));
        System.out.println(list);

    }
}

// array used to store sequence of data, static ..fixed size., will not grow.or
// shrink
// use when we know number of items
// vector -synchronized or arraylist
