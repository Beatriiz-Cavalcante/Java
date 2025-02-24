package aula3;

public class Principal {
    public static void main(String[] args){
        Vendedor v1 = new Vendedor();
        v1.setNome("Mirna");
        v1.setSalario(100.0f);
        v1.setCpf("71125085456");
        //v1.setDatanascimento(new Date());
        v1.setComissaoPorItem(10.0f);
        v1.setTotalItensVendidos(10);
        v1.calcularsalario();
        
        Motorista m1 = new Motorista();
        m1.setNome("Mauro");
    }
}
