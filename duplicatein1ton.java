import java.util.Arrays;

public class duplicatein1ton {
    public static void main(String[] args) {
        int a[]={2,1,2};
        System.out.println(findduplicate(a));
    }
    static int findduplicate(int a[])
    {
        int i=0;
        while(i<a.length)
        {
            int correctindex=a[i]-1;
            if(a[i]!=a[correctindex])
            {
                
                int temp = a[correctindex];

                a[correctindex] = a[i];
                a[i] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
        return a[a.length-1];
    }
}
