import java.util.Date;

public class Funcionario {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;
    

    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param string the cpf to set
     */
    public void setCpf(String string) {
        this.cpf = string;
    }

    /**
     * @return String return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param date the dataNascimento to set
     */
    public void setDataNascimento(Date date) {
        this.dataNascimento = date;
    }

    /**
     * @return String return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param f the salario to set
     */
    public void setSalario(float f) {
        this.salario = f;
    }

}