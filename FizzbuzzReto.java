/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 *
 */

public class FizzbuzzReto {

    public static void main(String[] args) {

        for (int i = 0; i < 25; i++) {
            System.out.println(fizzBuzz(i));
        }


    }

    public static String fizzBuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";

        } else if (number % 3 == 0) {
            return "Fizz";

        } else if (number % 5 == 0) {
            return "Buzz";

        } else {
            return String.valueOf(number);
        }

    }


}
