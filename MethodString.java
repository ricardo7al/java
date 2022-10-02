public class MethodString {

    public static void main(String[] args) {

        String object = "sculpture";
        System.out.println("object.length() = " + object.length());
        System.out.println("object.toUpperCase() = " + object.toUpperCase());
        System.out.println("object.toLoweCase() = " + object.toLowerCase());
        System.out.println("object.equals(\"sculpture\") = " + object.equals(("sculpture")));
        System.out.println("object.equalsIgnoreCase(\"sculpture\") = " + object.equalsIgnoreCase("sculpture"));
        System.out.println("object.compareTo(\"sculpture\") = " + object.compareTo("sculpture"));
        System.out.println("object.charAt(0) = " + object.charAt(0));
        System.out.println("object.charAt(nombre.length()) = " + object.charAt(object.length()-1));
        System.out.println("object.substring(1) = " + object.substring(1));
        System.out.println("object.substring(1, 4) = " + object.substring(1, 4));
        System.out.println("object.substring(4, 5) = " + object.substring(4, 5));
        System.out.println("object.substring(nombre.length()-2) = " + object.substring(object.length()-2));

        String community = "community";

        System.out.println("community.replace() = " + community.replace("m", "#"));
        System.out.println("community = " + community);
        System.out.println("community.indexOf('m') = " + community.indexOf('a'));
        System.out.println("community.lastIndexOf('n') = " + community.lastIndexOf('n'));
        System.out.println("community.indexOf('u') = " + community.indexOf('u'));
        System.out.println("community.contains('u') = " + community.indexOf('u'));
        System.out.println("community.starsWith(\"com\") = " + community.startsWith("com"));
        System.out.println("community.endsWith(\"y\") = " + community.endsWith("y"));
        System.out.println("community = " + community);
        System.out.println("community".trim());


    }
}
