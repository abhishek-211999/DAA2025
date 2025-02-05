package Btech_Lab.Section_O;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,5,3,9,1,6};
        insertionSort(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

}
