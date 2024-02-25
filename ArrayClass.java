
public class ArrayClass {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(10);
        array.insert(11);
        array.insert(12);
        array.insert(13);
        array.removeAt(2);
        array.print();
        System.out.println(array.indexOf(130));
        ;
    }
}
