public class finddunique {
    public static void main(String[] args) {
        int a[]={1,1,23,3,3};
        System.out.println(findingunique(a));
    }
    public static int findingunique(int a[])
    {
        //23 is 0001 0111 if we exor it with a[i] that is 1 exor 1 will be the no itself 
        int unique=0;
        for(int i=0;i<a.length;i++)
        {
         unique=unique^a[i];//a no. exor that no will give the same thing if that exor gives something different then there are nounique nos.
        }
        return unique;
    }
}
