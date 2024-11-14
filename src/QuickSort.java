public class QuickSort {
    Utils utils = new Utils();

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = this.partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public int partition(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        int pivot = arr[mid];

        utils.swap(arr, mid, right);

        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                utils.swap(arr, i, j);
            }
        }

        utils.swap(arr, i + 1, right);
        return i + 1;
    }


}