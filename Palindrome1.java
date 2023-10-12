// check given number is palindrome or not
class Palindrome1
{
  public static void main(String[]args)
  {
   int num=12341;
   int rev=0;
   int numcopy=num;
     while(num>0)
       {
        int last=num%10;
        rev=rev*10+last;
        num=num/10;
       }
        if(numcopy==rev)
        {
         System.out.println("palindrome");
        }
         System.out.println("not palindrome");
    }
}
 
    