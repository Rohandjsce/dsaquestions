public class count0usingrecur {
    public static void main(String[] args) {
        System.out.println(czero(3020004));
    }
    static int count=0;
    static int czero(int n)
    {
        if(n==0)
        {
            return count;
        }
        
        if(n%10==0)
        {
            count++;
        }
        return czero(n/10);
        

    }
}
