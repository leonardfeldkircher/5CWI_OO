package algo.bubble;

public class Bubble {
    public static void bubble(int[] arr) {
        int n = arr.length;
        long startTime = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Bubble Sort took " + duration + " nanoseconds");
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        bubble(numbers);

        // Print the sorted array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}