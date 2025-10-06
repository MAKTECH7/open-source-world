public class RotateArrayElementByNTimes {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr = { 3, 7, 8, 9, 10, 11 };
        int n = 3;
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            int j = 0;
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
