package Aula01;

import java.util.Scanner;

public class laçosRepeticao {
    public static void main(String[] args){
       //sintaxe do for
       for(int i = 1; i<=10; i++){
           System.out.print(i);
       }
       //sintaxe while
       int totalAlunos = 10;
       Scanner input = new Scanner(System.in);
       while (totalAlunos > 0){
           System.out.println("\nInforme o nome do aluno:");
           String nomeAluno = input.nextLine();
           System.out.println("\nInforme a idade do aluno:");
           int idadeAluno = input.nextInt();
           input.nextLine();
           System.out.printf("Aluno %d - %s - %d", totalAlunos, nomeAluno, idadeAluno);
           totalAlunos --;
       }
    }
}
