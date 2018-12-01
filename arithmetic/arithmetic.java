
    import java.util.Scanner;
         
     public class arithmetic {
         public static void main(String [] args) {
             Scanner input = new Scanner(System.in);
             
             int x,y;
             System.out.print("Enter first integer:");
             x = input.nextInt();
             
             System.out.print("Enter second integer:");
             y = input.nextInt();
             
             int sum = x+y;
             int product = x*y;
             int difference= x-y;
             int division = x/y;
             
             System.out.printf("The sum of %d and %d is %d%n",x,y,sum);
             System.out.printf("The product of %d and %d is %d%n",x,y,product);
             System.out.printf("The difference of %d and %d is %d%n",x,y,difference);
             System.out.printf("The division of %d and %d is %d%n",x,y,division);
             
         }
     }