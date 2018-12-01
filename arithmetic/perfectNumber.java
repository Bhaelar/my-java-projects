import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        isPerfect(number);
    }
    public static void isPerfect(int n) {
        int sum,i=1;
       
        while(i<n) {
            if(n%i == 0) {
                sum += i;
                i++;
            }
        }
    }
}    