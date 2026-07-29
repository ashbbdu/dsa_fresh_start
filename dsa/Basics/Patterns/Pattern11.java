package dsa.Basics.Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        for(int row = 0 ; row < n ; row++) {
            if(row % 2 == 0) {
                start = 1; // because of zero indexing
            } else {
                start = 0;
            }

            for(int col = 0 ; col < row + 1 ; col++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
