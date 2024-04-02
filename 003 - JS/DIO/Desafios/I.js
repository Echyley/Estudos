const nota1 = 1;
const nota2 = 2;
const nota3 = 1;

const media = (nota1 + nota2 + nota3);

console.log ('Sua média é: ',media);

if (media < 5) {
    console.log ('Reprovado :C')
} else if (media >= 5 && media <= 7) {
    console.log ('Recuperação ,_,');
} else {
    console.log ('Passou :D');
}