public class FactorialTrailingZero {
    public static void main(String[] args) {
        FactorialTrailingZero ft = new FactorialTrailingZero();
        System.out.println(ft.trailingZeroes(10));
    }

    public int trailingZeroes(int n) {
        int count = 0;
        int j = 5;
        while (n > 0){
            count = count + n/5;
            n = n/5;
            j = j*2;
        }
        return count;
    }

}
