package array;

public class ReverseArray {

    public static void main(String[] args) {

        int number[] = {0,1,2,3,4,5,6,7,8,9,10};
        reverseArray(number);
        
        for (int i = 0; i < number.length; i++) {
            System.out.println("(number[i]) = " + (number[i]));
            
        }



    }

    public static void reverseArray (int number[]) {

        int first = 0 , last = number.length-1;

        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;

        }
    }

}
