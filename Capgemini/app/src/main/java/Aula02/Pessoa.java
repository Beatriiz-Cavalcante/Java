package Aula02;

public class Pessoa {
    //Atributos
    private float peso;
    private float altura;
    
    //método construtor
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    //métodos
    public float calcularIMC(){
       float imc = peso / (altura * altura); 
       return imc;
    }
    //Metodos de acesso
    public void setPeso (float peso){
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }
    public void setAltura (float altura){
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
}
