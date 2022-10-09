package array;

import java.util.Arrays;

public class MethodSortArray {

    public static void main(String[] args) {

        String[] products = new String[6];

        products[0] = "Pendrive";
        products[1] = "Smartphone";
        products[2] = "Tablet";
        products[3] = "SD memory";
        products[4] = "Notebook";
        products[5] = "Graphics card";

        Arrays.sort(products);

        String i = products[0];
        String j = products[1];
        String k = products[2];
        String l = products[3];
        String m = products[4];
        String n = products[5];


        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);



    }
}
