//Condicional é quando precisamos saber se um valor é verdadeiro ou falso

const n1 = 234;
const divisao = (n1 % 2) === 0;
console.log (divisao);

if (n1 === 0) {
    console.log('ox');
} else if (divisao) {
    console.log ('Par :D');
} else {
    console.log ('Impar :C')
}
