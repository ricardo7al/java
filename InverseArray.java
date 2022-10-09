package array;

import java.util.Arrays;

public class InverseArray {

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

        System.out.println("---------- Inverse For-------------");
        for(int i=0;i<total;i++){
            System.out.println("Index" + (total-1-i) + " : " + products[total-1-i]);
        }

        System.out.println("---------- Inverse For 2-------------");
        for(int i=total-1;i>=0;i--){
            System.out.println("Index" + i + " : " + products[i]);
        }



    }

}
