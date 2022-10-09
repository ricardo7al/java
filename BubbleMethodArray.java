package array;

import java.util.Arrays;
import java.util.Collections;



public class BubbleMethodArray {


    public static void inverseArray(String[] array){

        int total = array.length;

        for(int i= 0;i< total/2; i++){

            String first = array[i];
            String inverse = array[total-1-i];
            array[i]= inverse;
            array[total-1-i] = first;
        }


    }

    public static void main(String[] args) {


        String[] products = new String[6];

        products[0] = "Pendrive";
        products[1] = "Smartphone";
        products[2] = "Tablet";
        products[3] = "SD memory";
        products[4] = "Notebook";
        products[5] = "Graphics card";

        //Arrays.sort(products);
        //inverseArray(products);
        //Collections.reverse(Arrays.asList(products));

        int total = products.length;
        int count = 0;

        System.out.println("----------For-------------");
        for (int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if (products[i].compareTo(products[j]) < 0) {

                    String aux = products[i];
                    products[i] = products[j];
                    products[j] = aux;
                }
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("----------For-------------");
        for (int i = 0; i < total; i++){
            System.out.println("Index" + i + " : " + products[i]);
        }


    }

}
