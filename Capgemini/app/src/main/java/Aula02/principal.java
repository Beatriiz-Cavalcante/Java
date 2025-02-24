package Aula02;
import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o peso de uma pessoa");
        p1.peso = input.nextFloat();
        System.out.println("Digite a altura da pessoa");
        p1.altura = input.nextFloat();
        System.out.println("IMC = " + p1.calcularIMC());
    }
}
