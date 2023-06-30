import java.util.*;

class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");
        int size = sc.nextInt();
        System.out.println("ENTER TARGET");
        int tg = sc.nextInt();
        int sum;
        int m1, m2;
        int nums[] = new int[size];
        // taking array input
        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i = 0; i < size; i++) {
            System.out.println("enter " + (i + 1) + "th element");
            nums[i] = sc.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {

            System.out.print(" " + nums[i]);

        }
       
        System.out.print("]");
        System.out.print("\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum = nums[i] + nums[j];
                if (sum == tg) {
                    m1 = nums[i];
                    m2 = nums[j];
                    System.out.println(m1);
                    System.out.println(m2 + "\n");
                    
                }

            }
        }
    }
}