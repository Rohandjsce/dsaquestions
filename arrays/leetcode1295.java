//find nos with even no of digits
class leetcode1295 {

  public static void main(String[] args) {
    int nums[] = { 1, 345, 2, 6, 789, 3 };
    System.out.println(findNumbers(nums));
  }

  public static int findNumbers(int nums[]) {
    int n = 0;
    int y = 0;
    for (int i = 0; i < nums.length; i++) {
      n = noofdig(nums[i]);
      if (n % 2 == 0) {
        y++;
      }
    }
    return y;
  }

  public static int noofdig(int x) {
    if (x < 0) {
      x = x * -1;
    }
    int c = 0;
    while (x > 0) {
      x = x / 10;
      c++;
    }
    return c;
  }
}
