public class TestConcatString {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long begin = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            //c= c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 10000 => 215ms, 100000 => 9701ms
            //c += a + b + "\n"; // 500 => 63ms, 10000 => 131ms , 100000 => 3414
            sb.append(a).append(b).append("\n");    // 500 => 0ms, 10000 => 4ms, 100000 => 21ms
        }

        long end = System.currentTimeMillis();

        System.out.println(end-begin);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);



    }


}
