
package exercicios;
import java.util.Scanner;
//Receba N números e mostre positivo, negativo ou zero para cada um deles
public class exercicio24 {
    public static void main (String[] args){
      Scanner input = new Scanner(System.in);  
      int c = 1;
      while(c==1){
          System.out.println("\nDeseja continuar?\n1-Sim;\n2-Não");
          c = input.nextInt();
          System.out.println("Informe um número");
          int num = input.nextInt();
          if(num == 0){
            System.out.printf("%d é igual a zero", num);
          } else {
              if (num > 0) {
                  System.out.printf("%d é positivo", num);
              } else {
                  System.out.printf("%d é negativo", num);
              }
          }
      }
    }
}
