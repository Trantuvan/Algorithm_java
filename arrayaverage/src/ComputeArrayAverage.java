public class ComputeArrayAverage {

  public static void findArrayAverage() {
    Double[] a = {12.4, 243.3, 3.0, 4.0, 5.1};
    int N = a.length;
    double sum = 0.0;
    for (int i = 0; i < N; i++) {
      sum += a[i];
    }
    double average = sum / N;
    System.out.println("The average of the array is: " + average);
  }
}
