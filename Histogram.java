/* *****************************************************************************
Create method histogram take int[] a, int M as argument --> create new array (result) with length M.
array result contains so lan value cua array a xuat hien tai dung vi tri index cua value ay.
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 5, 5, 0 };
        int[] b = histogram(a, 9);
        // phai dung Arrays.toString moi in ket qua array ra duoc
        StdOut.println(Arrays.toString(a));
        StdOut.println(Arrays.toString(b));
    }

    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        // loop through the a array i : a index
        for (int i = 0; i < a.length; i++) {
            // dem moi lan value cua a xuat hien + 1 vao vi tri day
            result[a[i]] += 1;
        }
        return result;
    }
}
