/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delioarruda
 */
public class heapSort {
    
    private static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    public static void heapSort(int[] valores) {
        buildMaxHeap(valores);
        int n = valores.length;

        for (int i = valores.length - 1; i > 0; i--) {
            swap(valores, i, 0);
            maxHeapify(valores, 0, --n);
        }
    }
    
    private static void buildMaxHeap(int v[]) {
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            maxHeapify(v, i, v.length);
        }
    }
    
    private static void maxHeapify(int[] v, int pos, int n) {
        int max = 2 * pos + 1, right = max + 1;
        if (max < n) {
            if (right < n && v[max] < v[right]) {
                max = right;
            }
            if (v[max] > v[pos]) {
                swap(v, max, pos);
                maxHeapify(v, max, n);
            }
        }
    }
    
}
