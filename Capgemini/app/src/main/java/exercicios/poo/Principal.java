package exercicios.poo;

/*
Crie uma classe chamada invoice que possa ser utilizada por uma loja de 
suprimentos de informática para representar uma fatura de um item vendido
na loja. Uma fatura deve incluiras seguintes informações como atributos:
1- O número de itens faturados;
2- A descrição do item;
3- A quantidade comprada do item;
4- O preço unitário do item.

Sua classe deve ter um construtor que inicialize os 4 atributos.
Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço
por item não for positivo ele deve ser configurado como 0.0. Forneça um método
set e um método get para cada variável de instância.

Além disso forneça um método chamato getInvoiceAmount que calcula o valor da fatura
(isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor
como um double. Escreva um aplicativo de teste que demonstra as capacidades da
classe Invoice.
*/

public class Principal {
    public static void main(String[] args){
        Invoice inv = new Invoice(1,"Mousepad", -10, 50.0f);
        System.out.println("valor total= " + inv.getInvoiceAmount());
    }
}
