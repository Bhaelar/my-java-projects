import java.util.Scanner;

public class hypotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double side1,side2,result;
        System.out.println("Enter the length of first side: ");
        side1 = input.nextDouble();
        System.out.println("Enter the length of the second side: ");
        side2 = input.nextDouble();
        
        result = hypotenuse(side1,side2);
        System.out.println("Hypotenus is " + result);
    }
    public static double hypotenuse(double s1,double s2) {
        double hypo;
        hypo = Math.sqrt((Math.pow(s1,2) + Math.pow(s2,2)));
        return hypo;
    }
}
