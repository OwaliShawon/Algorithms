import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArraySort sorter = new ArraySort();

        System.out.print("Enter Array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Choose sorting algorithm :::: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Quick Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                array = sorter.bubbleSort(array);
                System.out.println("bubble sorted: " + Arrays.toString(array));
                break;
            case 2:
                array = sorter.selectionSort(array);
                System.out.println("selection sorted: " + Arrays.toString(array));
                break;
            case 3:
                array = sorter.insertionSort(array);
                System.out.println("insertion sorted: " + Arrays.toString(array));
                break;
            case 4:
                array = sorter.quickSort(array, 0, array.length - 1);
                System.out.println("quick sorted: " + Arrays.toString(array));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}