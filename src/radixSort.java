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
    
    // metodo que executa o algoritmo de ordenacao radix sort
    public static void radixSort(int[] valores, int k) {
        // executa para cada digito dos valores de entrada
        for (int digit = 0; digit < k; digit++) {
            // potencia de 10 relativa ao digito
            int power = (int) Math.pow(10, digit + 1);
            
            // matriz com uma coluna para cada digito
            // cada elemento com determinado digito sera inserido na coluna do digito
            int z[][] = new int[valores.length][10];
            
            // contagem de quantos elementos foram inseridos em cada coluna de z
            int n[] = new int[10];

            // executa para cada elemento da entrada
            for (int i = 0; i < valores.length; i++) {
                int num = valores[i];
                
                // insere o elemento na respectiva coluna do digito, que foi isolado do restante do numero
                z[n[(num % power) / (power / 10)]][(num % power) / (power / 10)] = num;
                
                // conta quantos elementos foram inseridos naquela coluna
                n[(num % power) / (power / 10)]++;

            }
            
            int c = 0;
            // executa para cada digito, em ordem
            for (int i = 0; i < 10; i++) {
                // percorre toda a coluna do digito preenchendo o vetor final
                for (int j = 0; j < valores.length; j++) {
                    // testa se nao chegou ao fim da coluna
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
