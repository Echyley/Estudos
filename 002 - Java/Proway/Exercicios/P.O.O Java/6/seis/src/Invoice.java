public class Invoice {
    private int idItem;
    private String descricao;
    private int qtdComprada;
    private float valor;

    public Invoice(int idItem, String descricao, int qtdComprada, float valor) {
        this.setIdItem(idItem);
        this.setDescricao(descricao);
        this.setQtdComprada(qtdComprada);
        this.setValor(valor);
    }

    private void setValor(float valor) {
    }

    private void setQtdComprada(int qtdComprada) {
    }

    public double getInvoiceAmount() {
        return qtdComprada * valor;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getDescricao() {
        return descricao;
    }
   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    public void getQtdComprada() {
        if (qtdComprada < 0) {
            this.qtdComprada = 0;

        } else {
            this.qtdComprada = qtdComprada;
        }

    }
   
    public void getValor() {
        if (valor < 0) {
            this.valor = (float) 0.0;
        } else {
            this.valor = valor;
        }
    }

}