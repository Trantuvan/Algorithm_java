/* *****************************************************************************
 * Add to the BinarySearch test client the ability to respond to a second argument:
 * + to print numbers from standard input that are not in the whitelist,
 * - to print numbers that are in the whitelist
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Bai_1_1_23 {
    public static void main(String[] args) {
        //whitelist
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        StdOut.println("Whitelist: " + Arrays.toString(whitelist));

        //Read input
        int[] input = In.readInts(args[1]);
        StdOut.println("Input: " + Arrays.toString(input));

        //    Get+/- argument
        StdOut.println("\nEnter + to print numbers that are not in the whitelist, " +
                               "- to print numbers that are in the whitelist: ");
        String s = StdIn.readLine();
        // + to print numbers that are not in the whitelist
        // - to print numbers that are in whitelist
        if (s.equals("+")) {
            for (int key : input) {
                if (rank(key, whitelist) == -1) {
                    StdOut.printf(key + " ");
                }
            }
        }
        else {
            for (int key : input) {
                if (rank(key, whitelist) > 0) {
                    StdOut.printf(key + " ");
                }
            }

        }
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }

}
