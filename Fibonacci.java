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
    //recursive faster for small num; larger num need to use for loop
    /*F(10) = F(9)                      + F(8)
      F(10) = F(8)        + F(7)        + F(7) + F(6)
      F(10) = F(7) + F(6) + F(6) + F(5) + 4 more calls.
      Moi lan Recursive goi chinh no nen phai goi ra 2 F(8), 3 F(7) ... tao ra ganh nang cho so lon*/
    // public static long F(int N) {
    //     if (N == 0) return 0;
    //     if (N == 1) return 1;
    //     return F(N - 1) + F(N - 2);
    // }

    //Faster way to run fibonacci sequence (using iterate instead of recursive)
    public static int F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        //create long array inclusive 0 and N
        int[] f = new int[N + 1];
        //1st and 2nd element is 0, 1 relatively
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= N; i++) {
            /*o day dung array value goi ra de tinh khong dung recursive
            iterate N times*/
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[N];
    }
}
