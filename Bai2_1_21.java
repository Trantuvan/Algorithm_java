/* *****************************************************************************
Write a program that reads in lines from standard input with each line containing a name
and 2 integers and then uses printf() to print a table with col of the names, the integers
and the results of dividing the 1st by the 2nd, accurate to 3 decimal places. You could
use a program like this to tabulate batting averages for baseball players or grades for students.
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Bai2_1_21 {
    public static void main(String[] args) {
        //tao String array 2D voi 2 elem, moi elem 4 gia tri(Name, 2 int, result)
        String[][] a = new String[2][4];
        int n = 0;
        String line;

        // Get data
        StdOut.println("Enter: name number number");
        while (!(line = StdIn.readLine()).isEmpty()) {
            //items la array chua 4 elem trong ruot cua 2D array a
            //voi 3 gia tri dau la lay tu command line StdIn.readLine
            //d gia tri cuoi duoc lay ra tu item1/item2 va duoc format de dung voi 3 chu so sau "."
            String[] items = line.split(" "); //split giua space
            //voi n duoc goi tao = 0 dang dien vao array dau tien cua a[2][4]
            a[n][0] = items[0];
            a[n][1] = items[1];
            a[n][2] = items[2];
            Double d =
                    Math.round(1000.0 * Double.parseDouble(items[1]) / Double.parseDouble(items[2]))
                            / 1000.0;
            //de vao duoc String array thi can phai la String, String.format bien floating num --> String
            a[n][3] = String.format("%8.3f", d);
            //++n chi can dung no se tang n+1 khong can phai dung n truoc moi tang
            //hien tai a.length = 2, chay while loop lan dau dien 4 elem thi if condition se khong chay n=1
            //while loop lan 2 if condition chay tao ra them gap 2 slot cho array so voi ban dau
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
