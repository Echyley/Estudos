algoritmo "Vetores ou Arrays"
//É como um baú capaz de armazenar e executar em apenas uma variável várias outras,
//quantas quiser ou precisar.
var
vetornomes: vetor[1..5] de inteiro
vetoridades: vetor[1..5] de inteiro
i: inteiro
inicio

para i de 1 ate 5 faca
  escreval ("Informe seu nome")
  leia(vetornomes [i])
  escreval ("Informe sua idade")
  leia(vetoridades [i])
  escreval ("Nomes registrados: " + vetornomes)
  escreval ("Idade registrada: " + vetoridades)
fimpara

fimalgoritmo
