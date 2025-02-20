
package exercicios;

import java.util.Scanner;

public class exercicios15e16 {
    public static void main(String[] args){
        // 15 - Receber um número e informar se ele esta entre 100 e 200
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe um número");
        int numero = leitor.nextInt();
        if (numero >= 100 && numero<=200){
            System.out.printf("O numero %d está entre 100 e 200", numero);
        } else {
            System.out.printf("O numero %d não está entre 100 e 200", numero);
        }
    }
}
