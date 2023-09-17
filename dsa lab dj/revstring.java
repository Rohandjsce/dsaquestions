public class revstring {

  static int top = -1;

  public static void main(String[] args) {
    char[] stack = new char[4];
    charrev(stack);
  }

  public static void charrev(char[] stack) {
    char[] a = { 'E', 'X', 'T', 'C' };
    for (int i = 0; i < stack.length; i++) {
      push(stack, a[i]);
    }
    for (int i = 0; i < a.length; i++) {
      pop(stack);
    }
  }

  public static void push(char stack[], char data) {
    if (top == stack.length - 1) {
      System.out.println("overflow");
    } else {
      top = top + 1;

      stack[top] = data;
    }
  }

  public static void pop(char stack[]) {
    if (top == -1) {
      System.out.println("overflow");
    } else {
      System.out.println(stack[top]);
      top--;
    }
  }
}
