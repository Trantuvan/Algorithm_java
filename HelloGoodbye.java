/* *****************************************************************************
 *  Name:              Tran Tu Van
 *  Coursera User ID:  TTuVan
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        System.out.println("Hello " + a + " and " + b + '.');
        System.out.println("Goodbye " + b + " and " + a + '.');
        input.close();
    }
}
