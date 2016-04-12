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
    
    // metodo auxiliar para trocar dois elementos de posicao no vetor
    private static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    // metodo principal que executa o algoritmo heapsort
    public static void heapSort(int[] valores) {
        // constroi a estrutura heap a partir dos valores nao ordenados
        buildMaxHeap(valores);
        
        int n = valores.length;
        
        // para cada elemento, retira o maior da raiz, troca pela ultima folha e atualiza a heap
        for (int i = valores.length - 1; i > 0; i--) {
            swap(valores, i, 0);
            maxHeapify(valores, 0, --n);
        }
    }
    
    // metodo que constroi a heap a partir de um vetor nao ordenado
    private static void buildMaxHeap(int v[]) {
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            maxHeapify(v, i, v.length);
        }
    }
    
    // metodo que atualiza a heap a partir de um dado no e dado o tamanho da heap
    private static void maxHeapify(int[] v, int pos, int n) {
        // determina os filhos esquerdo e direito do no pos
        int max = 2 * pos + 1, right = max + 1;
        
        // so executa se nao tiver passado do limite da heap
        if (max < n) {
            // verifica se o filho direito eh maior que o esquerdo
            if (right < n && v[max] < v[right]) {
                max = right;
            }
            
            // verifica se o maior filho eh maior que o pai
            if (v[max] > v[pos]) {
                // troca de posicao o pai com o maior filho
                swap(v, max, pos);
                // atualiza a heap a partir da sub-arvore do filho
                maxHeapify(v, max, n);
            }
        }
    }
    
}
