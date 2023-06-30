import java.util.*;

class productusingfunction {

  static int prod(int x, int y) {
    int prod = x * y;
    return prod;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    System.out.println(prod(a, b));
  }
}
