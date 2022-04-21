/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisisalgoritmos.proyecto;

/**
 *
 * @author Sharon
 */
public class programacionDinamica {

    private int maxSum = 30000;
    private int arrSize = 15000;
    // variable to store
    // states of dp
    private int[][] dp;
    private boolean[][] visit;

    public programacionDinamica() {}
    
    public int aplicarMetodoDinamico(int i, int s, int arr[], int n){
        dp = new int[arrSize][maxSum];
        visit = new boolean[arrSize][maxSum];
        return Dinamico(i, s, arr, n);
    }

    // To find the number of subsets with sum equal to 0
    // Since S can be negative, we will maxSum
    // to it to make it positive
    public int Dinamico(int i, int s, int arr[], int n) {
        // Base cases
        if (i == n) {
            if (s == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        // Returns the value if a state is already solved
        if (visit[i][s + arrSize]) {
            return dp[i][s + arrSize];
        }

        // If the state is not visited, then continue
        visit[i][s + arrSize] = true;

        // Recurrence relation
        dp[i][s + arrSize] = Dinamico(i + 1, s + arr[i], arr, n)
                + Dinamico(i + 1, s, arr, n);

        // Returning the value
        return dp[i][s + arrSize];
    }

}
