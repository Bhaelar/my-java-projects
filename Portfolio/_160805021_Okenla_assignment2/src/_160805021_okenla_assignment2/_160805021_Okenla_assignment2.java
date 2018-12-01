package _160805021_okenla_assignment2;

public class _160805021_Okenla_assignment2 {
    public static void main(String[] args) {
        // TODO code application logic here
        calcEquation1();
        System.out.println();
        System.out.println();
        calcEquation2();
        double w = 2.0000 * Math.exp(2.0000);
        System.out.println(w);
    }
    public static double equation1(double l) {
        double y =  (Math.pow(l,3) - (2 * l) - 5);
        return y;
    }
    public static double equation2(double l) {
        double w = l * Math.exp(l);
        return w;
    }
    public static void calcEquation1() {
        
        double x = 0;
        double a = 2;
        double b = 4;
        double er = 0;
        double j = 0;
        double k = 0;
       System.out.printf("\t\t\t\t\t%s%n%n\t%s\t%3s\t%12s\t%12s\t%13s\t%13s\t%13s\t%n","Equation = x ^ 3 - 3x - 5","n","x","a","b","f(a)","f(b)","f(x)");
        for (int i = 1 ; i < 16 ; i++) {
            x = (a + b) / 2;
            if ((equation1(a) * equation1(x)) == 0) {
                j = b;
                k = a;
                System.out.printf("\t%d\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,x,a,b,equation1(k),equation1(j),equation1(x));
                break;
            }
            if ((equation1(a) * equation1(x)) < 0) {
                er = Math.abs(((b - x) / x));
                j = b;
                k = a;
                System.out.printf("\t%d\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,x,a,b,equation1(k),equation1(j),equation1(x));
                b = x;
            }
            if ((equation1(a) * equation1(x)) > 0) {
                er = Math.abs(((a - x) / x));
                k = a;
                j = b;
                System.out.printf("\t%d\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,x,a,b,equation1(k),equation1(j),equation1(x));
                a = x;
            }
            
            if (er <= 0.0001) {
                break;
            }
        }
    }
    public static void calcEquation2() {
        double x = 0;
        double a = 2;
        double b = -3;
        double er = 0;
        double j = 0;
        double k = 0;
        System.out.printf("\t\t\t\t\t%s%n%n\t%s\t%3s\t%12s\t%12s\t%13s\t%13s\t%13s\t%n","Equation = x*e^x","n","x","a","b","f(a)","f(b)","f(x)");
        for (int i = 1 ; i < 16 ; i++) {
            x = (a + b) / 2;
            if ((equation2(a) * equation2(x)) == 0) {
                System.out.printf("\t%d\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,x,a,b,equation2(k),equation2(j),equation2(x));
                break;
            }
            if ((equation2(a) * equation2(x)) < 0) {
                er = Math.abs(((b - x) / x));
                j = b;
                k = a;
                System.out.printf("\t%d\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,x,a,b,equation2(k),equation2(j),equation2(x));
                b = x;
            }
            if ((equation2(a) * equation2(x)) > 0) {
                er = Math.abs(((a - x) / x));
                k = a;
                j = b;
                System.out.printf("\t%d\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,x,a,b,equation2(k),equation2(j),equation2(x));
                a = x;
            }
            
            if (er <= 0.05) {
                System.out.printf("\t%d\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,x,a,b,equation2(k),equation2(j),equation2(x));
                break;
            }
        }
    }
}
