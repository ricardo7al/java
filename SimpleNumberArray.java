package array;

import java.sql.SQLOutput;

public class SimpleNumberArray {

    public static void main(String[] args) {

        int[] numbers = new int[4];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[numbers.length-1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);



    }

}
