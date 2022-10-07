public class FibonacciRecursivoReto {

    public static void main(String[] args) {

        int number = 10;

        System.out.println(fibonacci(number));

        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i)+ " ");
        }
    }

    public static int fibonacci(int number){

        if (number <= 1) {
            return number;
        }
        else {
            return fibonacci(number-1)+ fibonacci(number-2);
        }

    }
}
