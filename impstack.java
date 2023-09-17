import java.lang.reflect.Array;
import java.util.*;

public class impstack {

  
static int top=-1;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] stack = new int[4];

    int size = stack.length;
    System.out.println("enter the no. to be pushed");

    int data = sc.nextInt();
    push(stack, size, data);
    display(stack);
    pop(stack, size);
    peak(stack, size);
  }
  

  public static void push(int stack[], int size, int data) {

    if (top == size - 1) {
      System.out.println("overflow");
    } else {
      top = top + 1;

      stack[top] = data;

    
    }
  }

  public static void pop(int stack[],  int size) {
    System.out.println("\n pop function triggered");
    
    if (top == -1) {
      System.out.println("overflow");
    } else {
      System.out.println("the deleted data is " + stack[top]);
      top--;
      System.out.println("top "+top);
     
    }
    
  }
  public static void peak(int stack[],  int size)
    {
        System.out.println("peak function triggered");
       if (top == -1) {
      System.out.println("overflow");
    }
    else{

        System.out.println("peak element is"+stack[top]);
    }
    
    }
    public static void display(int stack[])
    {
        if(top==-1)
        {
            System.out.println("empty stack");
        }
        else
        {
            for(int i=0;i<stack.length;i++)
            {
                System.out.print(stack[i]+" ");
            }
        }
    }
}
