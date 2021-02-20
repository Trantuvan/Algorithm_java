/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Bai2_1_21 {
    public static void main(String[] args) {
        String[][] a = new String[2][4];
        int n = 0;
        String line;

        // Get data
        StdOut.println("Enter: name number number");
        while (!(line = StdIn.readLine()).isEmpty()) {
            String[] items = line.split(" ");
            a[n][0] = items[0];
            a[n][1] = items[1];
            a[n][2] = items[2];
            Double d =
                    Math.round(1000.0 * Double.parseDouble(items[1]) / Double.parseDouble(items[2]))
                            / 1000.0;
            a[n][3] = String.format("%8.3f", d);
            if (++n == a.length) {
                a = resize(a, a.length * 2);
            }
        }
        // Print rows
        StdOut.printf("%12s %4s %4s %8s\n", "Name", "Num1", "Num2", "Average");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%12s %4s %4s %8s\n", a[i][0], a[i][1], a[i][2], a[i][3]);
        }

    }

    private static String[][] resize(String[][] a, int n) {
        String[][] copy = new String[n][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 4; j++) {
                copy[i][j] = a[i][j];
            }
        }
        return copy;
    }
}
