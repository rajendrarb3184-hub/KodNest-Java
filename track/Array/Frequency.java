
class Freq {

    void count(int arr[], int target) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println(target + " : " + count);
    }
}

public class Frequency {

    public static void main(String[] args) {

        int arr[] = {23, 45, 43, 56, 23, 23, 54};
        Freq f1 = new Freq();
        f1.count(arr, 23);
    }
}
