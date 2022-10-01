public class ConcatenateString {
    public static void main(String[] args) {


        String damage = "nociceptors";
        String nerve = new String("fiber");

        int numberA = 9;
        int numberB = 7;
        
        /*two ways to concatenate strings.
        using addition operator and concat method.*/

        String details = damage + " are the "+ nerve;
        System.out.println(details);

        System.out.println(details + (numberA + numberB));
        System.out.println(numberA + numberB + details);

        String details2 = damage.concat(" are the ").concat(nerve);
        System.out.println("Details2= " + details2 );








    }
}
