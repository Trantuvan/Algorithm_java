public class Multiple {

  /*Multiplication for square matrices
   * a[][]*b[][]= c[][]*/
  public static void multiple() {
    int[][] a = {{1, 2}, {3, 4}};
    int[][] b = {{1, 23}, {323, 1}};
    int N = a.length;
//    create 2D template (0.0) with row N va col N
    int[][] c = new int[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
//        compute dot product of row i and col j
        for (int k = 0; k < N; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }

//    print the matrix c
    System.out.println("Matrix C:");
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}
