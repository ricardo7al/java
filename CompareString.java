public class CompareString {

    public static void main(String[] args) {

        String signals = "anxiety";
        String conditions = new String("primary");
        String mood = new String("anxiety");

        boolean toEquals = signals == conditions;
        System.out.println("Equals?="+ toEquals);

        toEquals = signals.equals(conditions);
        System.out.println("Equals?="+ toEquals);

        toEquals = signals.equals(mood);
        System.out.println("Equals?="+ toEquals);
    }
}
