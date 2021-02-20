/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Boolean2dArray {
    public static void main(String[] args) {
        boolean[][] a = {
                { true, false, true, true }, { false, true, false, false },
                { true, true, true, false }
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j]) {
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println(" ");
        }
    }
}

