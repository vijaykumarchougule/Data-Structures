public class ReverseArray {
    static void ArrayReverse(int arr[], int size) {
        int temp;
        int start = 0;
        int end = 5;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    static void printArray(int arr[], int size) {
        System.out.println("Entered array is");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        printArray(arr, arr.length);
        System.out.println("");
        ArrayReverse(arr, arr.length);
        printArray(arr, arr.length);

    }
}
