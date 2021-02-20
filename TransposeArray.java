/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class TransposeArray {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 } };
        System.out.println("Original Array:");
        showArray(a);
        System.out.println(" ");
        System.out.println("Transpose Array:");
        showArray(T(a));
    }

    public static int[][] T(int[][] b) {
        int row = b.length;
        int col = b[0].length;
        //array fix length nen phai tao array moi chua row voi col moi
        //chu y array moi co length row:col, col:row
        int[][] new_array = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                new_array[j][i] = b[i][j];
            }
        }
        return new_array;
    }

    public static void showArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%d, ", a[i][j]);
            }
            System.out.println(" ");
        }
    }
}
