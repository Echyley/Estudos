//A forma mais simples de declarar um objeto no JS é abrindo colchetes "{}". Agrupa valores dentro da chave. É uma coleção de dados!

const pessoa = {
    nome: 'Amanda',
    idade: 19,

    descrever: function() {
        console.log (`Meu nome é ${this.nome} e tenho ${this.idade} anos.`)
    }
};

pessoa.descrever();

//-------------------------------
// Uma classe determina um conjunto de objetos que se assemelham. Define o que deve ser o objeto.

class pessoas {
    nome;
    idade;
    anoDeNascimento;

    //O constructor declara uma instância que é uma ocorrencia do objeto.

constructor(nome,idade) {
    this.nome = nome;
    this.idade = idade;
    this.anoDeNascimento = 2022 - idade;
}

    descrever (){
        console.log (`Meu nome é ${this.nome} e tenho ${this.idade} anos.`)
    }
}

const Kino = new pessoas ('Kino', 16);

const Hermes = new pessoas ('Hermes');

console.log(Kino);

//-----------------------------

class pessoas {
    nome;
    idade;
    anoDeNascimento;

constructor(nome,idade,anoDeNascimento) {
    this.nome = nome;
    this.idade = idade;
    this.anoDeNascimento = 2022 - idade;
}

    descrever (){
        console.log (`Meu nome é ${this.nome} e tenho ${this.idade} anos.`)
    }
}

function compararPessoas (p1,p2) {
    if (p1.idade > p2.idade) {
        console.log (`${p1.nome} é mais velho(a) que ${p2.nome}`);
    } else if (p2.idade > p1.idade) {
        console.log (`${p2.nome} é mais velho(a) que ${p1.nome}`);
    } else {
        console.log (`${p1.nome} e ${p2.nome} tem a mesma idade`);
    }
}

const 

