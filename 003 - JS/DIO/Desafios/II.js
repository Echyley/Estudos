const peso = 55;
const altura = 1.65;
//Math.pow pode calcular ao cubo
imc = peso / Math.pow(altura, 2);

console.log ('Seu imc é: ', imc.toFixed(2));

if (imc < 18.5) {
    console.log ('Você está abaixo do peso :C')
} else if (imc >= 18.5 && imc < 25) {
    console.log ('Graças a Deus, pelo menos você é normal :D')
} else if (imc >= 25 && imc < 30) { 
    console.log ('Acima do peso...')
} else if (imc >= 30 && imc < 40) {
    console.log ('Gordinho(a) ,_,')
} else {
    console.log ('Gordão >:C')
}