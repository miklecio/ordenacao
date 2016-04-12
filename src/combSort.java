/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delioarruda
 */
public class combSort {
    
    private static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    public static void combSort(int[] valores) {
        int gap = valores.length;
        boolean swapped = true;
        
        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / 1.247330950103979);
            }

            int i = 0;
            swapped = false;
            while (i + gap < valores.length) {
                if (valores[i] > valores[i + gap]) {
                    swap(valores, i, i + gap);
                    swapped = true;
                }
                i++;
            }
        }
    }
    
}
