package dsa.Basics.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0 ; row < n ; row++) {
//            spaces
            for(int col = 0 ;  col < n - row - 1 ; col++) {
                System.out.print(" ");
            }

//            stars
            for(int col = 0 ; col < 2*row+1 ; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
