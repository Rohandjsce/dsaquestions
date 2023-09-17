public class parenthesischeck {

  static int top = -1;

  public static void main(String[] args) {
    String s = "{(a+b)-c}";

    char[] stack = new char[s.length()];

    checkpar(stack, s);
  }

  public static void checkpar(char stack[], String s) {
    for (int i = 0; i < stack.length; i++) {
      if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
        push(stack, s.charAt(i));
      } else if (
        s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'
      ) {
        if (top != -1) {
          pop(stack, s, i);
        } else {
          top++;
        }
      }
    }

    if (top == -1) {
      System.out.println("parenthesis is complete");
    } else {
      System.out.println("parenthesis error");
    }
  }

  public static void push(char stack[], char u) {
    int size = stack.length;

    if (top == size - 1) {
      System.out.println("overflow");
    } else {
      top++;

      stack[top] = u;
    }
  }

  public static void pop(char stack[], String s, int i) {
    if (top == -1) {
      System.out.print("underflow");
    }

    int l = match(stack, s.charAt(i));

    if (l == 1) {
      top--;
    }
  }

  public static int match(char stack[], char m) {
    if (m == ')' && stack[top] == '(') {
      return 1;
    } else if (m == '}' && stack[top] == '{') {
      return 1;
    } else if (m == ']' && stack[top] == '[') {
      return 1;
    } else {
      return 0;
    }
  }
}
