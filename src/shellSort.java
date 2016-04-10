/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto
 */
public class shellSort {
    
    public static void shellSort(int[] valores) {
        int h = 1;
        int n = valores.length;
        
        while (h < n) {
            h = h * 3 + 1;
        }
        h = (h-1) / 3;
        int c, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = valores[i];
                j = i;
                while (j >= h && valores[j - h] > c) {
                    valores[j] = valores[j - h];
                    j = j - h;
                }
                valores[j] = c;
            }
            h = (h-1) / 3;
        }
    }
    
}
