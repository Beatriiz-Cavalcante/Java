package Aula02;
import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa(70.0f , 1.70f );
        System.out.println("Digite o peso de uma pessoa");
        p1.setPeso(input.nextFloat());
        System.out.println("Digite a altura da pessoa");
        p1.setAltura(input.nextFloat()); 
        System.out.println("IMC = " + p1.calcularIMC());
    }
}
