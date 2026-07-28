package dsa.Basics.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < n - row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
