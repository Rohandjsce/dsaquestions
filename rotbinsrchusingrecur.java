public class rotbinsrchusingrecur {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        int t=2;
        System.out.println(RBS(arr,0,arr.length-1,t));
        
    }
    static int RBS(int arr[],int start,int end,int t)

    {
if(start>end)
{
    return -1;
}
int m=start + (end-start)/2;
if(arr[m]==t)
{
    return m;

}
else if (arr[start]<=arr[m])
{
    if (t>=arr[start] && t<= arr[m])
    {
        return RBS(arr, start, m-1, t);
    }
    else
    {
        return RBS(arr, m+1, end, t);
    }

}
if(t>=arr[m] && t<=arr[end])
{
return RBS(arr, m+1, end, t);
}
return RBS(arr, start, m-1, t);

    }
}
