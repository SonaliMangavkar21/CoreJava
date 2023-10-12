//mini calculator
class Switchcase4
{
   public static void main(String[]args)
       {
         int a=20;
         int b=30;
         String op="mul";
           switch(op)
              {
                case"add":System.out.println(a+b);break;
                case"sub":System.out.println(a-b);break;
                case"mul":System.out.println(a*b);break;
                case"div":System.out.println(a/b);break;
                case"mod":System.out.println(a%b);break;
              }
       }
}