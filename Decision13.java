//leap year
class Decision13
{
  public static void main(String[]args)
   {
    int year=1996;
    if(year%4==0)
       {
         if(year%100==0)
           {
             if(year%400==0)
               {
                 System.out.println("century leap year");
               }
            else
               {
                 System.out.println("not century leap year");
                }
            }
         else
               {
                   System.out.println("not a century year but leap year");
               }

          }
   }
}
