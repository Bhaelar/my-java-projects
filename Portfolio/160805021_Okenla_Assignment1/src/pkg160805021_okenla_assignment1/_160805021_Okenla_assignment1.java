
package pkg160805021_okenla_assignment1;
 
public class _160805021_Okenla_assignment1 {
    static double[] value = new double[11];
    static double[] absList = new double[10];
    static double[] relList = new double[10];
    static double[] perList = new double[10];
    static double[] addList = new double[10];
    static double[] mulList = new double[10];
    static double r0 = 0.99996;
    public static void main(String[] args) {
        // TODO code application logic here
        value();
        absoluteError();
        relativeError();
        percentError();
        addProp();
        mulProp();
        System.out.printf("%3s%10s%10s%10s%10s%10s%10s%10s%n","n","Ro","Rn","Ea","Er","Ep","AddProp","MulProp");
        for(int p = 1 ; p < 11 ; p++) {
            System.out.printf("%3d%10f%10.5f%10.5f%10.5f%10.5f%10.5f%10.5f%n",p,r0,value[p],absList[p-1],relList[p-1],perList[p-1],addList[p-1],mulList[p-1]);
        }
    }
    public static void value() {
        double r;
        value[0] = 0.99996;
        for (int i = 1 ; i < 11 ; i++) {
            r = value[i-1] / 3;
            value[i] = r;
        }
    }
    public static void absoluteError() {
        double absError;
        for (int l = 1 ; l < 11 ; l++) {
            absError = value[l] - r0;
            absList[l-1] = Math.abs(absError);
        }
    }
    public static void relativeError() {
        double a;
        for (int j = 0 ; j < 10 ; j++) {
            a = absList[j] / r0;
            relList[j] = a;
        }
    }
    public static void percentError() {
        double b;
        for ( int k = 0 ; k < 10 ; k++) {
            b = 100 * relList[k];
            perList[k] = b;
        }
    }
    public static void addProp() {
        double add;
        for ( int m = 0 ; m < 10 ; m++) {
            add = r0 + value[m+1] + absList[m] + absList[m];
            addList[m] = add;
        }
    }
    public static void mulProp() {
        double mul;
        for(int n = 0 ; n < 10 ; n++) {
            mul = (r0 * value[n+1]) + (r0 * absList[n]) + (r0 * absList[n]) + (absList[n] * absList[n]);
            mulList[n] = mul;
        }
    }
}
