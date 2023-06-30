public class stepstoreduceto0 {

  public static void main(String[] args) {
    System.out.println(redz(41));
  }

  static int redz(int n) {
    return helper(n, 0);
  }

    static int helper(int n, int steps) {
        if (n == 0) {
        return steps;
        }
        if (n % 2 == 0) {
        return helper(n / 2, ++steps);
        } else {
        return helper(n - 1, ++steps);
        }
  }
}
