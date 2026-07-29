package dsa.Basics.Patterns;

public class Pattern9 {

    public static void erectPyramid (int n) {
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

    public static void invertedPyramid (int n) {
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0; col < row ; col++) {
                System.out.print(" ");
            }
            for(int col = 0 ; col < (2*n) - (2*row + 1) ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        erectPyramid(n);
        invertedPyramid(n);
    }
}
