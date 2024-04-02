/*"extends" vai atribuir valores de outro item (ou classe) para outra. */
public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;
    
/*Utilizamos "super()" quando queremos pegar um valor da classe superior, nesse caso o Vendedor quer pegar algo de Funcionario. */
    public Vendedor() {
        super();
    }

    public float calcularSalario() {
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
     }
     

    /**
     * @return int return the totalItensVendidos
     */
    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    /**
     * @param totalItensVendidos the totalItensVendidos to set
     */
    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    /**
     * @return float return the comissaoPorItem
     */
    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    /**
     * @param comissaoPorItem the comissaoPorItem to set
     */
    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }

}

   