import java.util.Scanner;

public class gasMileage {
    
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        int miles,gallons,totalMiles,trip,totalGallons,tripCounter;
        totalMiles = 0;
        totalGallons = 0;
        tripCounter = 0;
        
        System.out.print("Enter trip or -1 to quit:  ");
        trip = input.nextInt();
       
        
        while(trip != -1) {
            
            System.out.print("Enter miles driven:  ");
            miles = input.nextInt();
            totalMiles+= miles;
        
            System.out.print("Enter gallons used:  ");
            gallons = input.nextInt();
            totalGallons+= gallons;
            
            double milespergallons = (double) miles / gallons;
            System.out.printf("The miles per gallons in this trip is %.2f%n", milespergallons);
            
            tripCounter += 1;
            
            System.out.print("Enter trip or -1 to quit:  ");
            trip = input.nextInt();
            
        }
        
        if (tripCounter != 0) {
            double totalmilespergallons = (double) totalMiles / totalGallons;
            System.out.printf("The total miles per gallons for all %d trips is %.2f%n",tripCounter,totalmilespergallons);
         
        }
        else
            System.out.println("No values were inserted");
        
        
    }
}