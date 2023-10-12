//check the person is eligible for blood donation or not
class Decision12
{
  public static void main(String[]args)
    {
      int age=19;
      int weight=57;
      if(age>=18)
         {
            if(weight>=55)
            {
              System.out.println("eligible");
            }
           else
            {
             System.out.println("not eligible by weight");
            }
            }
           else
            {
             System.out.println("not eligible by age");
            }
         }
           
         
     }
 }    
           