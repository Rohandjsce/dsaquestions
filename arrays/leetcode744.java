import java.util.*;

public class leetcode744 {

  public static void main(String[] args) {
    char[] letters = { 'd', 'f', 'j', 'j' };
    char target = 'j';
    System.out.println(nextGreatestLetter(letters, target));
  }

  public static char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2; //better way to find mid in this way if start and end are big..mid will will not exceed the particular value for int
      if (target < letters[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return letters[start % letters.length];
  }
}
