public class ArrayMaxima {

  //  method la phai co () du co truyen param hay khong
  public static void findArrayMaxima() {
    //  notice java must have class and method inside to run
    double[] a = {1, 0.343, 5, -0.2};
    double max = a[0];

    for (int i = 1; i < a.length; i++) {
//      co diem yeu neu a[0] la so lon nhat if se khong chay
      if (a[i] > max) {
        max = a[i];
        System.out.printf("Here is the current maxima a[%d]: %s", i, a[i]);
      }
    }
  }
}
