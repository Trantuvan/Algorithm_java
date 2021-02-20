/* *****************************************************************************
 Write a static method log() that takes an int value N as argument and returns
 the largest int not larger than the base 2 logarithm of N. Do not use Math.

 rearrange the sentence:
 counting the number int N (largest value) can divide for 2 (lg base2: la 2^x) stop when reaching 1.
 **************************************************************************** */

public class LogBase2Ex {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(largestNum(a));
    }
   
    public static int largestNum(int n) {
        int x = 0;
        // n phai lon hon 1 vi n la so lon nhat upperbound, 1 la lowerbound khi dung 1 thi ngung
        for (int i = n; i > 1; i /= 2) {
            x++;
        }
        // return largrest num < logbase2 (N)
        return x - 1;
    }
}
