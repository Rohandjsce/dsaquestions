
/**
 * fibusingrecussiom
 */
public class fibusingrecussiom {
    public static void main(String[] args) {
        //System.out.println("enter the no till you want to print fibonacci series");
int n=7;
System.out.println(fibrec(n)); 
    } 
    static int fibrec(int n)
    {
        //base condition
        if(n<2)
        {
            return n;
        }
        //by logic we get this expression
        return(fibrec(n-1)+fibrec(n-2));
    }
    
}