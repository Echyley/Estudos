public class Pessoa {
    /* Atributos da classe */
    /*private deixa o modificador de acesso como privado!*/
    public float peso;
    public float altura;
    public float setPeso;
    public float setaltura;

    /* Método */
    /* Método construtor
     *       👇*/
    public Pessoa (float peso, float altura) {
        /*O "this." acessa um atributo */
        this.peso = peso;
        this.altura = altura;
    }

    /* Método de acesso 👇 */
    public float calcularImc() {
        float imc = peso / (altura * altura);
        return imc;
    }

    /*Métodos acessores */
    public void setPeso (float peso) {
        this.peso = peso;
    }

    public float getPeso () {
        return peso;
    }

    public void setAltura (float altura) {
        this.altura = altura;
    }

    public float getAltura () {
        return altura;
    }
}
