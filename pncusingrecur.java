

public class pncusingrecur {

  public static void main(String[] args) {
    String str = "abc";
    pnc("", str);
  }

  public static void pnc(String ans, String str) {
    if (str.isEmpty()) {
      System.out.println(ans);
      return;
    }

    char ch = str.charAt(0);
    for (int i = 0; i <=ans.length(); i++) {
        String f=ans.substring(0, i);
        String s=ans.substring(i,ans.length());
      pnc(f+ch+s, str.substring(1));

    }
  }
}
