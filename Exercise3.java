/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Exercise3 {
    public static void main(String[] args) {
        // int f = 0;
        // int g = 1;
        //
        // for (int i = 0; i <= 15; i++) {
        //     StdOut.println(f);
        //     f = f + g;
        //     g = f - g;
        // }

        // double t = 9.0;
        // while (Math.abs(t - 9.0 / t) > .001) {
        //     t = (9.0 / t + t) / 2.0;
        //     StdOut.printf("%.5f\n", t);
        // }

        // int sum = 0;
        // for (int i = 1; i < 1000; i++) {
        //     for (int j = 0; j < i; j++) {
        //         sum++;
        //     }
        // }
        // StdOut.println(sum);

        // int sum = 0;
        // for (int i = 1; i < 1000; i *= 2) {
        //     for (int j = 0; j < i; j++) {
        //         sum++;
        //     }
        // }
        // StdOut.println(sum);
        // System.out.println((char) ('a' + 4));
        //
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
