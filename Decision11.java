//display grades of students on the basis of marks
class Decision11
{
   public static void main(String[]args)
       {
          int a=40;
           if(a>90)
             {
               System.out.println("Distinction");
             }
            else if(70<=a && a<=90)
             {
                 System.out.println("very good");
             }
            else if(50<=a && a<=70)
             {
                 System.out.println("good");
             }
            else if(30<=a && a<=50)
             {
                 System.out.println("average");
             }
            else
             {
                 System.out.println("fail");
             }
        }
}