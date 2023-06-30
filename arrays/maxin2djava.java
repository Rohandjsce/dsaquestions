public class maxin2djava {

  public static void main(String[] args) {
    int a[][] = {
      { 1, 1, 1 },
      { 1, 23, 4 },
      { 12, 23845884, 44 },
      { 2312, 23543, 33, 3 },
    };

    int b = max2d(a);
    System.out.println("max no is " + b);
  }

  public static int max2d(int a[][]) {
    int max = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > max) {
          max = a[i][j];
        }
      }
    }
    return max;
  }
}
