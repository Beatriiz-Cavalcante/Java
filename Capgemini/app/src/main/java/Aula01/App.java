
package Aula01;
import java.util.Scanner;
public class App {
   
    public static void main(String[] args) {
        //primeiro comando de saída /**/
        System.out.println("oie, funcionou?");
        //Primeiro comando de entrada
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        float dinheiro = leitor.nextFloat();
        //Saida
        System.out.printf("idade: %d", idade);
        System.out.printf("Preço: R$ %f",dinheiro);
    }
}
