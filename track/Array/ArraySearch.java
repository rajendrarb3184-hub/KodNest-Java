
class array {

    void search(int ref[], int target) {

        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == target) {
                System.out.println("Element found : " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found ");
        }

    }
}

public class ArraySearch {

    public static void main(String[] args) {

        int arr[] = {12, 23, 43, 54, 57};
        array s1 = new array();
        s1.search(arr, 43);
    }
}
