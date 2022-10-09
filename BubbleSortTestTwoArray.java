package array;

import java.util.Arrays;

public class BubbleSortTestTwoArray {

    public static void main(String[] args) {

        int[] numbers = new int[6];

        numbers[0] = 7;
        numbers[1] = 15;
        numbers[2] = 23;
        numbers[3] = 65;
        numbers[4] = 45;
        numbers[5] = 34;

            System.out.println("bubblesort(numbers) = " + Arrays.toString(bubbleSort(numbers)));


    }

    public static int[] bubbleSort(int[] numbers) {
        boolean swapped = true;
        for(int i = numbers.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
                }
            }
        }
        return numbers;

    }
}
