public class ConvertString {

    public static void main(String[] args) {

        String future = "future";
        System.out.println("future.toCharArray() = " + future.toCharArray());

        char[] array = future.toCharArray();
        int lengthy = array.length;

        System.out.println("lengthy = " + lengthy);
        for (int i = 0; i < lengthy; i++){
            System.out.println(array[i]);

        }
        System.out.println();
        System.out.println("\nfuture" + future.split("u"));

        String[] array2 = future.split("a");
        int l = array2.length;
        for (int j = 0; j<l; j++){
            System.out.println(array2[j]);
        }

        String archive = "tool.image.pdf";
        String[] archiveArray = archive.split("\\."); //[.]
        l = archiveArray.length;
        System.out.println("l = " + l);
        for (int j = 0; j < l; j++){
            System.out.println(archiveArray[j]);
        }
        System.out.println("extensión = " + archiveArray[l-1]);




    }
}
