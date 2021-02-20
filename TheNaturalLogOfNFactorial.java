/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class TheNaturalLogOfNFactorial {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double value = fact(N);
        StdOut.print(value);
    }

    /*ln(n!) = ln(n*n-1*n-2*…..*2*1) = ln(n)+ln(n-1)+……+ln(2)+ln(1)
     * ben tren la logic. N! la phep nhan (n-1) but log nhan la ln + ln*/
    public static double fact(int n) {
        if (n == 0 || n == 1) return 0;
        //tra lai log + log (voi argument la fact(n-1))
        return fact(n - 1) + Math.log(n);
    }
}
