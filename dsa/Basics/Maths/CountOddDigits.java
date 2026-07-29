package dsa.Basics.Maths;

public class CountOddDigits {
    public static void main(String[] args) {
        int n = 2341212;
        int count = 0;
        while(n > 0) {
            if(n % 2 != 0) {
                count = count+1;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
