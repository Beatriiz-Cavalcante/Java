package exercicios.poo;

public class Invoice {
    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        setCodigoItem(codigoItem);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            this.quantidade = 0;
        }else {
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0){
            this.precoUnitario = 0;
        }else{
            this.precoUnitario = precoUnitario;
        }
    }
    
    public double getInvoiceAmount(){
        return (quantidade * precoUnitario);
    } 
}
