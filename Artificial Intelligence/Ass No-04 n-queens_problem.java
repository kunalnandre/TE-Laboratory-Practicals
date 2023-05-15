import java.util.Scanner;

public class Main {

    public static boolean isSafe(int[][] arr, int x, int y, int n) {
        for (int row = 0; row < x; row++) {
            if (arr[row][y] == 1) {
                return false;
            }
        }

        int row = x;
        int col = y;
        while (row >= 0 && col >= 0) {
            if (arr[row][col] == 1) {
                return false;
            }
            row--;
            col--;
        }

        row = x;
        col = y;
        while (row >= 0 && col < n) {
            if (arr[row][col] == 1) {
                return false;
            }
            row--;
            col++;
        }

        return true;
    }

    public static boolean nQueen(int[][] arr, int x, int n) {

        if (x >= n) {
            return true;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(arr, x, col, n)) {
                arr[x][col] = 1;
                if (nQueen(arr, x + 1, n)) {
                    return true;
                }
                arr[x][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }

        if (nQueen(arr, 0, n)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// OUTPUT:-

// 4
// 0 1 0 0 
// 0 0 0 1 
// 1 0 0 0 
// 0 0 1 0 
  
// 5
// 1 0 0 0 0 
// 0 0 1 0 0 
// 0 0 0 0 1 
// 0 1 0 0 0 
// 0 0 0 1 0 
