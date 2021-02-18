/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);

        double a = (1 + 2.236) / 2;
        double b = 1 + 2 + 3 + 4.0;
        boolean c = 4.1 >= 4;
        String d = 1 + 2 + "3";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        while (!StdIn.isEmpty()) {
            equal(StdIn.readInt(), StdIn.readInt(), StdIn.readInt());
        }
    }

    public static void equal(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
