public class tediuewf {

  public static void main(String[] args) {
    int target = 4;
    da("", 4);
  }

  static void da(String ans, int target) {
    if (target == 0) {  
      System.out.println(ans);
      return;
    }

    for (int i = 1; i <= 6 && i <= target; i++) {
      da(ans + i, target - i);
    }
  }
}
