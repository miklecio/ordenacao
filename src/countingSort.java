
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto
 */


public class countingSort {
    
    //metodo para calcular o maior elemento do vetor
    private static int getIndice(int[] vetor ){
        int k=0;
        for (int i=0; i<vetor.length;i++){
            if(vetor[i]>vetor[k])
                k=i;
        }
        return vetor[k]+1;
    }
    
    
    public static void countingSort(int[] valores) {
        int c[] = new int[getIndice(valores)];
        //precisamos utilizar essa copia para não perder o vetor
        int[] a = Arrays.copyOf(valores, valores.length);
        
        //conta os elementos e envia para o vetor c
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        
        //faz a soma de um elemento com o anterior
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }
        
        //atribui os valores ao vetor de saida na posição coreta
        for (int i = a.length - 1; i >= 0; i--) {
            valores[--c[a[i]]] = a[i];
        }
    }    
}
