package Aula02;

public class Pessoa {
    //Atributos
    float peso;
    float altura;
    //métodos
    public float calcularIMC(){
       float imc = peso / (altura * altura); 
       return imc;
    }
}
