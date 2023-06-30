public class sortedornotwithrecur {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,1};
        System.out.println(sonrecur(arr,0));
    }
    
    
    static boolean sonrecur(int arr[],int n)
    {
        if(n== arr.length-1 )
        {
            return true;
        }
        return  arr[n]<arr[n+1] && sonrecur(arr, n+1);
       
    }

}
