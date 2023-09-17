public class lettercombo {
public static void main(String[] args) {
    
 phhack("","23");
       
}
static void phhack( String ans,String set)
{
    if(set.isEmpty())
    {
        System.out.println(ans);
        return;
    }
    int digit=set.charAt(0)-'0';
    for (int i = (digit-1)*3; i <digit*3; i++) {
        char ch=(char)('a'+i);
        phhack(ans+ch, set.substring(1));
    }
 

}
}
