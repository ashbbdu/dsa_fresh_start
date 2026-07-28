package dsa.Basics.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < row + 1 ; col++) {
                System.out.print(row+1);
            }
            System.out.println();
        }
    }
}
