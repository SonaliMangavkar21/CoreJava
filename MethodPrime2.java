//check given number is prime or not using methods
class MethodPrime2
{
  public static String number(int a)
    
    {
      int count=0;
      //int a=1;
      for(int i=2;i<a;i++)
        {
           if(i%a==0)
             {
              count++;
             }
           
         
             else if(count==0)
             { 
              return "prime";
             }
           else
             {
               return "composite";
              }
            }
          }
    public static void main(String[]args)
      {
     //int res= (int) number(3);
         System.out.println(number(6));
      }
}
   
   