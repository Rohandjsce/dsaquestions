import java.util.*;

class linearsearch {

  static int lsearch(int b, int a[]) {
    for (int i = 0; i < a.length; i++) {
      if (b == a[i]) return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = { 22, 33, 44, 55, 66, 77 };
    System.out.println("what no. you want to search");
    int b = sc.nextInt();

    System.out.println(lsearch(b, a));
  }
}
