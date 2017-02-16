package labWork_2_10_1;

/**
 * Created by Bulik on 04.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = new Integer("10");
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");

        System.out.println(x1==x2);
        System.out.println(x1==x3);
        System.out.println(x1==x4);
        System.out.println(x1==x5);

        System.out.println("---------------------------");
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x1.equals(x5));


        Integer x11 = 1000;
        Integer x21 = new Integer(1000);
        Integer x31 = new Integer("1000");
        Integer x41 = Integer.valueOf(1000);
        Integer x51 = Integer.parseInt("1000");

        System.out.println("==============================");
        System.out.println(x11==x21);
        System.out.println(x11==x31);
        System.out.println(x11==x41);
        System.out.println(x11==x51);
        System.out.println("==============================");

        System.out.println(x11.equals(x21));
        System.out.println(x11.equals(x31));
        System.out.println(x11.equals(x41));
        System.out.println(x11.equals(x51));

    }
}
