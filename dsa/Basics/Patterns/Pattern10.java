package dsa.Basics.Patterns;

public class Pattern10 {
    public static void erectPyramid (int n) {
        for(int row = 0 ; row < n - 1 ; row++) {
            for(int col = 0 ; col < row + 1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void revertPyramid (int n) {
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < n - row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        erectPyramid(n);
        revertPyramid(n);
    }
}
