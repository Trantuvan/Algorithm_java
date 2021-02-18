/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

public class Exercise2 {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();

        inRangeZeroOne(x, y);
    }

    public static boolean inRangeZeroOne(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("trong khoang 0-1");
            return true;
        }
        else {
            System.out.println("ngoai khoang 0-1");
            return false;
        }
    }
}
