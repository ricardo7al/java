public class FibonacciIterativeReto {

    public static void main(String[] args) {

        int number = 10;
        System.out.println(fibonacci(number));

        for (int i = 0; i <= number; i++) {

            System.out.print(fibonacci(i));

        }

    }

    public static double fibonacci(int number) {

        double prev = 0d, next = 1d, result = 0d;

        for (int i = 0; i < number; i++) {

            result = prev + next;
            prev = next;
            next = result;

        }

        return result;
    }


}
