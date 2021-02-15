public class ReverseElements {

  /* dao nguoc array nghia la xoay array quanh so chinh giua
   * int N/2 tim so chinh giua (chi lay phan nguyen) de dung duoc khi array odd or even*/
  public static void reverseArray() {
    int[] a = {0, 2, 4, 6, 8};
    int N = a.length;

    for (int i = 0; i < N / 2; i++) {
      int temp = a[i];
//      tim so last element in array (N-1) relative with i
      a[i] = a[N - 1 - i];
      a[N - i - 1] = temp;
    }
    System.out.println("original array: \n 0 2 4 6 8 ");
    System.out.println();
    System.out.println("reverse array:");

    for (int x : a) {
      System.out.print(" " + x);
    }
  }
}
