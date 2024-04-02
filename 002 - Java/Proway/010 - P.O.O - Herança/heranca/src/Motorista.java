/*"extends" vai atribuir valores de outro item (ou classe) para outra. */
public class Motorista extends Funcionario {
   
    private int totalPorViagem;
    private float comissaoPorViagem;

    /*Utilizamos "super()" quando queremos pegar um valor da classe superior, nesse caso o Vendedor quer pegar algo de Funcionario. */
    public Motorista() {
        super();
    }

    /**
     * @return int return the totalPorViagem
     */
    public int getTotalPorViagem() {
        return totalPorViagem;
    }

    /**
     * @param totalPorViagem the totalPorViagem to set
     */
    public void setTotalPorViagem(int totalPorViagem) {
        this.totalPorViagem = totalPorViagem;
    }

    /**
     * @return float return the comissaoPorViagem
     */
    public float getComissaoPorViagem() {
        return comissaoPorViagem;
    }

    /**
     * @param comissaoPorViagem the comissaoPorViagem to set
     */
    public void setComissaoPorViagem(float comissaoPorViagem) {
        this.comissaoPorViagem = comissaoPorViagem;
    }

    public void setTotalItensVendidos(int i) {
    }

}