// As funções podem nos ajudar a organizar e a segmentar a complexidade do nosso código.  Uma função pode ser chamada a qualquer momento, porém não dá retorno, executando somente o que foi solicitado.

function sayMyname (name) {
   return 'Seu nome é: '+ name;
}

sayMyname ('Amanda');
sayMyname ('Rodrigues');
// o return vai retornar o que vier em sequencia quando a função for chamada;
function quadrado (valor) {
    return valor * valor;
}

const quadradoDeDez = quadrado(10);

console.log(quadradoDeDez);
