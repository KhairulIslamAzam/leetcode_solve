public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[] { 'h','e','l','l','o'};
        int right = s.length -1;
        int left = 0;
        while(left<right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            right--;
            left++;
        }
        System.out.println(s);
    }
}
