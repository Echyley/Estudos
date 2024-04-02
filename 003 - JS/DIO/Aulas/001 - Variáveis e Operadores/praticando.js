const valorCombustivel = 5.79;
const kmPorLitros = 12;
let distancia = 1580;

const lConsumidos = distancia / kmPorLitros;
const valorGasto = lConsumidos * valorCombustivel;

console.log ('O valor total da sua viagem é: ', valorGasto.toFixed(2));

//O toFixed converte o valor da variável para o valor de casa que determinarmos.