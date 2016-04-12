/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delioarruda
 */
public class radixSort {
    
    public static void radixSort(int[] valores, int k) {
        for (int digit = 0; digit < k; digit++) {
            int power = (int) Math.pow(10, digit + 1);

            int z[][] = new int[valores.length][10];
            int n[] = new int[10];

            for (int i = 0; i < valores.length; i++) {
                int num = valores[i];
                z[n[(num % power) / (power / 10)]][(num % power) / (power / 10)] = num;
                n[(num % power) / (power / 10)]++;

            }
            int c = 0;
            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < valores.length; j++) {
                    if (j < n[i]) {
                        valores[c] = z[j][i];
                        c++;
                    } else {
                        break;
                    }
                }
            }

        }
    }
    
    
}
