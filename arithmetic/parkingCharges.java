import java.util.Scanner;
public class parkingCharges {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double data type: ");
        double x = input.nextDouble();
        
        roundToInteger(x);
        roundToTenths(x);
        roundToHundredths(x);
        roundToThousandths(x);
        
        
    }
    public static double roundToInteger(double x) {
        double y = Math.floor(x + 0.5);
         
        return System.out.print(y);;
    }
    public static double roundToTenths(double x) {
        double y = Math.floor(x * 10 + 0.5)/10;
        return y;
    }
    public static double roundToHundredths(double x) {
        double y = Math.floor(x * 100 + 0.5) / 100;
        return y;
    }
    public static double roundToThousandths(double x) {
        double y = Math.floor(x * 1000 + 0.5)/1000;
        return y;
    }
}