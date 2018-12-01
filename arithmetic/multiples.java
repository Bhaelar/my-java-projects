import java.util.Scanner;

public class multiples{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x,y;
        System.out.println("Enter two integers: ");
        x= input.nextInt();
        y = input.nextInt();
        
        Boolean check = multipleTest(x,y);
        System.out.println("are they multiples?  " + check);
    }
    public static Boolean multipleTest(int x, int y) {
        if (y%x == 0)
            return true;
        else
            return false;
    }
}