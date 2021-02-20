/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class Fibonacci {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + F(N));
        }

    }

    // public static long F(int N) {
    //     if (N == 0) return 0;
    //     if (N == 1) return 1;
    //     return F(N - 1) + F(N - 2);
    // }

    //Faster way to run fibonacci sequence
    public static int F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        //create long array inclusive 0 and N
        int[] f = new int[N + 1];
        //1st and 2nd element is 0, 1 relatively
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= N; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[N];
    }
}
