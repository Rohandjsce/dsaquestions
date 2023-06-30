
public class leetcode268missingnos {

  public static void main(String[] args) {
    int a[] = { 4, 0, 2, 1, 3 }; //ans should be 3
    //when given nos. from range 1 to N use cyclic sort
    //Time complexity O(n)
    System.out.println(missingnumber(a));
  }

  public static int missingnumber(int a[]) {
    int i = 0;
    while (i < a.length) {
      int correctindex = a[i];
      if (a[i] < a.length && a[i] != a[correctindex]) {
        int temp = a[correctindex];
        a[correctindex] = a[i];
        a[i] = temp;
      } else {
        i++;
      }
    }
    for (int j = 0; j < a.length; j++) {
      if (a[j] != j) {
        return j;
      }
    }
    // case 2 if the nth no is only not present that means there is no number missing
    return a.length;
  }
}
