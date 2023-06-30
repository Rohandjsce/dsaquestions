public class sumofdigitsusingrecur {
    public static void main(String[] args) {
System.out.println(sod(696969));
System.out.println(prod(1432));
    }
    static int sod(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return n%10+sod(n/10);
    }
     static int prod(int n)
    {
        if(n%10==n)
        {
            return 0;
        }
        return n%10*sod(n/10);
    }
}
