import java.util.Arrays;
import java.util.Scanner;

public class tostring {

  public static void main(String[] args) {
    int[] a = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 5 nos");
    for (int i = 0; i < 5; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(a));
//array of objects
String [] s=new String[4];
for (int i = 0; i < s.length; i++) {
    s[i]=sc.next();

    
}
System.out.println(Arrays.toString(s));

  }
}
