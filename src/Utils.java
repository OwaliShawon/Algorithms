public class Utils {
    public int minFromArray(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int maxFromArray(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
