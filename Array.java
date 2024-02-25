public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if the array is full,resize it
        if (items.length == count) {
            // create a new array(twice the size)
            int[] newItems = new int[count * 2];
            // copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // set newitems data to items so that it can access overall class
            items = newItems;

        }
        items[count++] = item;
        // count++;
    }

    public void removeAt(int index) {
        // validate the index
        // shift the items to the left to fill the space
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        // shift the element [1, ,3,4]-> [1,3,4,0]
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
            count--; // remove last index
        }

    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;

    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
