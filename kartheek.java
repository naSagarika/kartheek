import java.util.Scanner;
 
class addition
{
   public static void main(String args[])
   {
      int x, y, z;
 
      System.out.println("Enter two integers to calculate their sum");
      
      x = Integer.parseInt(args[0]);
      y =Integer.parseInt(args[1]);
      z = x + y;
     
      System.out.println("Sum of the integers = " + z);
   }
}
