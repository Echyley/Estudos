class pessoa {
    nome;
    peso;
    altura;

    constructor (nome, peso, altura){
        this.nome = nome;
        this.peso = peso;
        this. altura = altura;
    }
    calcularImc () {
        return this.peso / (this.altura*this.altura);
    }
}

const Kino = new pessoa ('Kino',48, 1.65);
console.log ('O imc de ' + Kino.nome, 'é: ' + Kino.calcularImc());
