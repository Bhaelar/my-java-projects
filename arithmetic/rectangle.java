import java.util.Scanner;
public class rectangle {
    double length,width=1;
    double perimeter;
    double area;
    public rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }
    public void setPerimeter(double length, double width) {
        perimeter = 2 * length * width;
        this.perimeter = perimeter;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setArea(double length, double width) {
        area = length * width;
        this.area = area;
    }
    public double getArea() {
        return area;
    }
    public void setLength(double length) {
        if (length<=0.0 || length>=20.0)
            throw new IllegalArgumentException("Stay within range!");
        this.length = length;
    }
    public void setWidth(double width) {
        if (width<=0.0 || width>=20.0)
            throw new IllegalArgumentException("Stay within range!");
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        rectangle r1 = new rectangle(4.7,8.9);
        r1.setLength(4.7);
        r1.setWidth(8.9);
        
        
        System.out.println("length: " + r1.getLength() + " width: " + r1.getWidth());
        System.out.println("The perimeter of the rectangle is " + r1.getPerimeter());
        System.out.println("The area of the rectangle is " + r1.getArea());
    }
}