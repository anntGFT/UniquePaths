package org.example;

public class Solution {
    public Solution(){

    }

    public int uniquePaths(int m, int n) {

        if (m == 0) {

            return 0;
        }

        int[][] aux = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {

                    aux[i][j] = 1;
                } else {

                    aux[i][j] = aux[i - 1][j] + aux[i][j - 1];
                }
            }
        }

        return aux[m - 1][n - 1];
    }
}