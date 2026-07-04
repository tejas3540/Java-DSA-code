import java.util.*;

class Solution {

    static List<List<String>> l;

    public List<List<String>> solveNQueens(int n) {
        l = new ArrayList<>();

        int[][] arr = new int[n][n];

        place(0, arr);

        return l;
    }

    public static void place(int row, int[][] arr) {

        if (row == arr.length) {
            print(arr);
            return;
        }

        for (int col = 0; col < arr.length; col++) {

            if (isSafe(row, col, arr)) {

                arr[row][col] = 1;

                place(row + 1, arr);

                arr[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int row, int col, int[][] arr) {

        int r = row;
        int c = col;

        // check column
        while (r >= 0) {
            if (arr[r][c] == 1)
                return false;
            r--;
        }

        // left diagonal
        r = row;
        c = col;

        while (r >= 0 && c >= 0) {
            if (arr[r][c] == 1)
                return false;
            r--;
            c--;
        }

        // right diagonal
        r = row;
        c = col;

        while (r >= 0 && c < arr.length) {
            if (arr[r][c] == 1)
                return false;
            r--;
            c++;
        }

        return true;
    }

    public static void print(int[][] arr) {

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            String s = "";

            for (int j = 0; j < arr.length; j++) {

                if (arr[i][j] == 1)
                    s += "Q";
                else
                    s += ".";
            }

            ans.add(s);
        }

        l.add(ans);
    }
}