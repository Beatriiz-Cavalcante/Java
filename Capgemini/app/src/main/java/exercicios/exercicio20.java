package exercicios;

/*
A concessionária de veículos "Carango velho" está vendendo seus veículos com 
desconto. Faça um algorítmo que calcule e exiba o valor do desconto e o valor a
ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo
com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá 
perguntar se deseja continuar calculando o desconto até que a resposta seja "NÃO"
Informar o total de carros com o ano até 2000 e o total geral.
*/
import java.util.Scanner; 
public class exercicio20 {
    public static void main(String[] args){
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        char desejaRepetir = 's';
        float desconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        Scanner input = new Scanner(System.in);
        while (desejaRepetir == 's' || desejaRepetir == 'S' ){
            System.out.println("Digite o ano de fabricação do veículo");
            anoFabricacao = input.nextInt();
            System.out.println("\ndigite o valor do veículo");
            valorCarro = input.nextFloat();
            if(anoFabricacao <=200){
                desconto = 0.12f;
            } else {
                desconto = 0.07f;
                 totalCarrosSemiNovos++;
            }
            totalCarros++;
            valorDesconto = valorCarro * desconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.printf("\nO valor do desconto foi de: %f", valorDesconto);
            System.out.printf("\nO valor final é: %f", valorPagar);
            System.out.println("\nDeseja fazer mais cadastros?\n-S\nN");
            desejaRepetir = input.next().charAt(0);
        }
        System.out.printf("Total de carros semi novos: %d", totalCarrosSemiNovos);
        System.out.printf("Total de carros: %d", totalCarros);
    }    
}
