package array;

import java.util.Arrays;

public class LoopArray {

    public static void main(String[] args) {

        String[] products = new String[6];

        products[0] = "Pendrive";
        products[1] = "Smartphone";
        products[2] = "Tablet";
        products[3] = "SD memory";
        products[4] = "Notebook";
        products[5] = "Graphics card";

        Arrays.sort(products);
        int total = products.length;

        System.out.println("----------For-------------");
        for(int i=0;i<total;i++){
            System.out.println("Index" + i + " : " + products[i]);
        }
        System.out.println("----------For each-------------");
        for (String prod: products)
        {
            System.out.println("Products = " + prod);
        }
        System.out.println("----------While-------------");
        int i = 0;
        while (i<total) {
            System.out.println("Index" + i + ":" + products[i]);
            i++;
        }
        System.out.println("----------DoWhile-------------");
        int j = 0;
        do {
            System.out.println("Index" + j + ":" + products[j]);
            j++;
        } while (j<total);

           System.out.println("----------Number For-------------");

        int[] numbers = new int[10];

        int totalNumber = numbers.length;
        for(int k=0; k<totalNumber;k++) {
            numbers[k] = k+1;
        }

        for(int k=0;k<totalNumber;k++){
            System.out.println("numbers = " + numbers[k]);
        }



    }
}
