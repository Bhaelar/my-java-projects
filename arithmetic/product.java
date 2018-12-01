import java.util.Scanner;
public class product{
    int a,c;
    
    int product;
    int [] f = new int[9];
    public void getProduct(int a) {
        for(int c=1;c<=f.length;c++) {
            product = a * c;
            System.out.println(a + "*"+ c +"="+ product);
            
        }
        
    }
}
