import java.util.Scanner;

public class WasherTest {
    static Thread thread = new Thread();
    public static void main(String[] args) throws InterruptedException {
        Washer washer1 = new Washer();
        
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        
       
        System.out.println("Enter the number of cloth pieces: ");
        int clothes = input.nextInt();
        washer1.setClothPieces(clothes);
        System.out.println();
        System.out.printf("The number of cloth pices are: %d%n",washer1.getClothPieces());
        
        
        System.out.print("Clothes to wash for how many minutes?: ");
        int time = input.nextInt();
        washer1.setTimer(time);
        System.out.println();
        System.out.printf("Clothes to wash for %d minutes%n",washer1.getTimer());
        
        
        washer1.washing();
        for (int i = time*60;i>=0;i--) {
            thread.sleep(1000);
            System.out.println(i);
            
            if(i < 1) {
                System.out.println("Your clothes are done being washed...");
                
            }
        }
        
        
    }
}