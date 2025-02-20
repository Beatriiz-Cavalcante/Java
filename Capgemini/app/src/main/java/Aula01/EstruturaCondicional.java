
package Aula01;


public class EstruturaCondicional {
    public static void main(String[] args) {
        //sintaxe condicional if
        int media = 7;
        if(media >= 7){
            System.out.println("Aprovado por média");
        } else {
            System.out.println("Recuperação");
        }
        //sintaxe condicional switch
        int codigoProduto = 2;
        switch(codigoProduto){
            case 1:
                System.out.println("Código inativo");
                break;
            case 2:
                System.out.println("Corresponde a chocolate");
                break;
            default:
                System.out.println("Código não existe");
        }
    }
}
