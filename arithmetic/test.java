import java.util.Scanner;
public class test {
    public static void main(String [] args) {
        product mul = new product();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int a = input.nextInt();
        
        mul.getProduct(a);
        
    }
}

