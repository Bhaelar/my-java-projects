import java.util.Scanner;

public class displayAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the square: ");
        int size = input.nextInt();
        squareOfAsterisks(size);
    }
    public static void squareOfAsterisks(int s) {
        int i,j;
        for(i=0;i<s;i++) {
            for(j=0;j<s;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}