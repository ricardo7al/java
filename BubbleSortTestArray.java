package array;

import java.util.Arrays;

public class BubbleSortTestArray {

    public static void main(String[] args) {

        int[] numbers = new int[6];

        numbers[0] = 7;
        numbers[1] = 15;
        numbers[2] = 23;
        numbers[3] = 65;
        numbers[4] = 45;
        numbers[5] = 34;

        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }

    public static int [] bubbleSort (int[] numbers) {

        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
            }
        }

        return numbers;

    }





}
