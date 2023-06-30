import java.util.ArrayList;

public class linearsearchwithrecur {
    public static void main(String[] args) {
        int t=5;
        int arr[]={2,3,24,3,5,5,524,5, 23};
        
        searchallindexes(arr, 0, t);
        System.out.println(list);
        
    }
static boolean search(int arr[],int n,int t)
{
    if(n>arr.length-1)
    {
        System.out.println(-1);
        return false;
    }
    if(arr[n]==t)
    {
        System.out.println(n);
        return true;
    }
    else
    return search(arr, n+1, t);


}
static ArrayList<Integer> list = new ArrayList<>();
static void searchallindexes(int arr[],int n,int t)
{
    if(n>arr.length-1)
    {
        System.out.println(-1);
        return ;
    }
    if(arr[n]==t)
    {
        list.add(n);
        
    }
   
    searchallindexes(arr, n+1, t);


}
}
