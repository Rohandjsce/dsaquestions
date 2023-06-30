public class poweroftwo {

  public static void main(String[] args) {
    int n = 129 ;
    //when it said to be poweer of 2 it looks like 10000000000 i.e it ends with 0 with only one 1 present
    //64=1000000, as we left shift it multiplies by 2
    int c = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        c++;
      }

      n = n >> 1;
    }
    if (c == 1) {
      System.out.println("it is a power of 2");
    } else {
      System.out.println("not a power of 2");
    }
  }
}
