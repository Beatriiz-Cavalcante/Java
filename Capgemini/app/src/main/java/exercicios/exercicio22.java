
package exercicios;

import java.util.Scanner;
/* 
Faça um algorítmo que receba o preço de custo e o preço de venda de 40 produtos.
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
Informe o valor de custo de cada produto, o valor de venda de cada produto
e as médias de custo e de preço de venda.
*/
public class exercicio22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float somaCusto = 0.0f;
        float somaVenda = 0.0f;
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;
        for(; i<3; i++){
            System.out.println("Digite o nome do produto");
            nomeProduto = input.nextLine();
            System.out.println("Digite o prepo de custo do produto");
            precoCusto = input.nextFloat();
            System.out.println("Digite o preço de venda do produto");
            precoVenda = input.nextFloat();
            input.nextLine();
            
            if (precoCusto == precoVenda){
                System.out.println("Empate");
            } else {
                if (precoCusto > precoVenda){
                    System.out.println("Prejuízo");
                } else {
                    System.out.println("Lucro");
                }
            }
            somaCusto = somaCusto + precoCusto;
            somaVenda = somaVenda + precoVenda;
        }
        mediaCusto = somaCusto / i;
        mediaVenda = somaVenda / i;
        System.out.printf("O valor da média de custo é: %f\nO valor da média de venda é: %f", mediaCusto, mediaVenda);
    }
}
