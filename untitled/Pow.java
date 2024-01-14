public class Pow {
    public static void main(String[] args) {
//        double result = Math.pow(2.00000, -2);
//        System.out.println(result);

        System.out.println(myPow(2.00000, -2));
    }

    public static double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / myPow(x, -n);
        if (n>0)
            return x * myPow(x, n - 1);
        return myPow(x * x, n / 2);
    }
}
