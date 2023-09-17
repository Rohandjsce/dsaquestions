import java.util.Arrays;

public class queuearr {

  static int queue[] = new int[6];
  static int f = -1;
  static int r = -1;

  public static void main(String[] args) {
    enqueue(10);
    enqueue(20);
    enqueue(90);
    enqueue(90);
    enqueue(90);
    enqueue(36);
    System.out.println(Arrays.toString(queue));
    dequeue();
    dequeue();
    dequeue();
    display();
    

  }

  public static void enqueue(int data) {
    if (r == queue.length - 1) {
      System.out.println("overflow");
    } else if (f == -1 && r == -1) {
      f++;
      r++;
      queue[r] = data;
    } else {
      r++;
      queue[r] = data;
    }
  }

  public static void dequeue() {
    if (f == -1) {
      System.out.println("underflow");
    }
    else{
        System.out.println("the element deleted is "+queue[f]);
        if(f==r)
        {
            f=-1;
            r=-1;
        }
        f++;
    }
  }
  public static void display()
  {
    for(int i=f;i<queue.length;i++)
    {
        System.out.print(queue[i]+" ");
    }

  }
}
