import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        
        Boolean status = isEven(number);
        if(status)
            System.out.println(number + " is an even number");
        else
            System.out.println(number + " is an odd number");
    }
    public static Boolean isEven(int x) {
        if (x%2 == 0)
            return true;
        else
            return false;
    }
}