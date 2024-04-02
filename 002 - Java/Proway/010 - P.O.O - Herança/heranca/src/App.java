import java.util.Date;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Echy");
        v.setSalario(1600.0f);
        v.setCpf("15647890189");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor junto com a comissão é: " + v.calcularSalario());

        Motorista m = new Motorista();
        m.setNome("Kino");
        m.setSalario(1500.0f);
        m.setCpf("47892501989");
        m.setDataNascimento(new Date());
        m.setComissaoPorViagem(10.0f);
        m.setTotalPorViagem(10);

        System.out.println("O salário do motorista junto com a comissão é: " + v.calcularSalario());

    }
}