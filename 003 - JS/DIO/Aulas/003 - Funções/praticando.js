//Praticando!
function sayMyname (name) {
    return 'Seu nome é: '+ name;
 }
 
 sayMyname ('Amanda');

function calcularIdade (idade) {
    if (idade >= 18) {
        console.log (sayMyname ('Amanda ') + 'e você é maior de idade :D')
    }else {
        console.log (sayMyname ('Amanda ') + 'e você é menor de idade ,_,')
    }
}

calcularIdade (19);
//-------------------------------
