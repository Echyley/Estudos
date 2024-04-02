//Nunllish Coalescing Operator - Operador para lidar com valores nulos

const idade = 20;

document.body.innerText = 'Sua idade é: ' + (idade ?? 'Tem não');

//Objetos

const user = {
  nome: 'Kino',
  idade: 20,
  address: {
    street: 'Yey',
    number: 785,
  },
};

document.body.innerText = ('name' in user)

document.body.innerText = Object.keys(user)

document.body.innerText = Object.values(user)

document.body.innerText = JSON.stringify(Object.values(user))

document.body.innerText = JSON.stringify(Object.entries(user))

//Desestruturação - Remover informação especifica de objeto para uma variavel a par

const { address } = user

document.body.innerText = JSON.stringify({address})



