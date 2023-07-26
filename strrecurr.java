public class strrecurr {

  public static void main(String[] args) {
    System.out.println(removea("", "baccad"));
  }

  static String removea(String answer, String strgiven) {
    if (strgiven.isEmpty()) {
     
      return answer;
    }
    if (strgiven.charAt(0) == 'a') {
      return removea(answer, strgiven.substring(1));
    } else {
      answer = answer + strgiven.charAt(0);
      return removea(answer, strgiven.substring(1));
    }
  }
}
