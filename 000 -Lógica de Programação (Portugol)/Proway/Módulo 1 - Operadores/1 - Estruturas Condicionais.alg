algoritmo "Estruturas Condicionais

var
  nota1, nota2, nota3, media: real
  
inicio
  Escreval ("Informe a nota1.")
  leia (nota1)
  Escreval ("Informe a nota2.")
  leia (nota2)
  Escreval ("Informe a nota3.")
  leia (nota3)
  media <-(nota1+nota2+nota3)/3
  Escreval ("Sua média é: ")
  Escreval (media)

se media >=70 entao
  Escreval ("Você passou!")
senao
  se media <50 entao
  Escreval ("Você Reprovou :(")
senao
  Escreval ("Você está de recuperação, ainda há esperança!")
fimse
fimse
fimalgoritmo

