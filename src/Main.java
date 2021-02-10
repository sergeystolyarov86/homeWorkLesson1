public class Homework {
 
    byte A = -128;
    short B = -32678;
    int C = 1000000;
    long D = 15000000000l;
    float E = 2.8f;
    double F = 159.58;
    char G = '*';
    boolean H = true;
    boolean I = false;


    public static void main(String[] args) {

        System.out.println(printResult(2, 5, 24, 4));
        System.out.println(check(45, 5));
        positiveorNegative(-8);
        System.out.println(numberPlus(-8));
        name("Аркадий");
        year(100);

    }

    static int printResult(int a, int b, int c, int d) {
        return a * (b + (c / d));

    }

    static boolean check(int k, int s) {
        int i = k + s;
        return (10 <= i && i <= 20);
    }

    static void positiveorNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    static boolean numberPlus(int n) {
        if (n > 0) {
            return false;
        }  else  {
            return true;
        }

    }
    static void name(String name){
        System.out.println("Привет," +name+"!");
    }
    static void year(int w) {

        if (w%4!=0 || w%400!=0 && w%100==0 ){
            System.out.println("Невисокосный год");
        }else {
            System.out.println("Високосный год");
        }
    }
}







