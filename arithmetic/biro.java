import java.util.Scanner;
public class biro {
    private String brand;
    private String inkColor;
    String ans;
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    
    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }
    public String getInkColor() {
        return inkColor;
    }
    public void write() {
        if (ans!="no") {
            System.out.println("Writing...");
        }
        
    } 
    
    public static void main(String[] args) {
        biro biro1 = new biro();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the brand name of the biro:  ");
        String brandName = input.nextLine();
        biro1.setBrand(brandName);
       
        
        System.out.print("Enter the ink color of the biro:  ");
        String ink = input.nextLine();
        biro1.setInkColor(ink);
        
        System.out.printf("Your biro is a %s biro%n",biro1.getBrand());
        System.out.printf("Your biro has a %s ink%n",biro1.getInkColor());
        
        System.out.println("Do you want to write?  ");
        String answer = input.nextLine();
        biro1.ans = answer;
        biro1.write();
    }
}

