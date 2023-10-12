//3^5 
class Dowhile6
{
   public static void main(String[]args)
     {
        int num=3;
        int pow=1;
        int res=1;
         do
           {
             res=res*num;
             pow++;
            }
           while(pow<=5);
           System.out.println(res);
       }
}