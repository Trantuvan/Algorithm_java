public class CopyToAnotherArray {

  public static void copyArray() {
    double[] a = {1, 2.3, 3.4, 90, 2};
    int N = a.length;
//    create empty array to copy all element in array a
    double[] b = new double[N];
    for (int i = 0; i < N; i++) {
//      assign each element of a in b element
      b[i] = a[i];
//      int [] b = a; link array b to array a( ca 2 array chi cung dia chi thay doi element 1 trong 2 se anh huong ca 2)
    }
    System.out.println("Element in array a");
    for (double i : a) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("Element in array a");
    for (double i : b) {
      System.out.print(i + " ");
    }
  }
}
