<<<<<<< HEAD
<<<<<<< HEAD
algoritmo "Proced.Função - Exercitando I"
//Método para organizar variáveis. Processa de acordo com dados de entrada.

//Método que processa com resposta em retorno.
var
lado1, lado2, lado3: inteiro
procedimento lerdados()
inicio
escreval ("Lado 1: ")
leia (lado1)
escreval ("Lado 2: ")
leia (lado2)
escreval ("Lado 3: ")
leia (lado3)
fimprocedimento

funcao ehtriangulo():logico
inicio
   se (lado1>lado2+lado3) ou (lado2>lado1+lado3) ou (lado3>lado1+lado2) entao
      retorne falso
   senao
      retorne verdadeiro
fimfuncao

funcao verificartipotriangulo(): literal
inicio
   se (lado1=lado2) e (lado2=lado3) entao
      retorne "Equilatero, é triagulo :D"
   senao
   se (lado1=lado2) ou (lado2=lado3) ou (lado1=lado3) entao
      retorne "Isósceles, Triangulo com apenas duas medidas iguais!
   senao
      retorne "Escaleno, não é triangulo :("
   fimse
   fimse
fimfuncao
inicio
lerdados()
   se ehtriangulo() entao
      escreval (verificartipotriangulo())
   senao
      escreval ("Não é triangulo")
   fimse
fimalgoritmo


=======
algoritmo "Proced.Função - Exercitando I"
//Método para organizar variáveis. Processa de acordo com dados de entrada.

//Método que processa com resposta em retorno.
var
lado1, lado2, lado3: inteiro
procedimento lerdados()
inicio
escreval ("Lado 1: ")
leia (lado1)
escreval ("Lado 2: ")
leia (lado2)
escreval ("Lado 3: ")
leia (lado3)
fimprocedimento

funcao ehtriangulo():logico
inicio
   se (lado1>lado2+lado3) ou (lado2>lado1+lado3) ou (lado3>lado1+lado2) entao
      retorne falso
   senao
      retorne verdadeiro
fimfuncao

funcao verificartipotriangulo(): literal
inicio
   se (lado1=lado2) e (lado2=lado3) entao
      retorne "Equilatero, é triagulo :D"
   senao
   se (lado1=lado2) ou (lado2=lado3) ou (lado1=lado3) entao
      retorne "Isósceles, Triangulo com apenas duas medidas iguais!
   senao
      retorne "Escaleno, não é triangulo :("
   fimse
   fimse
fimfuncao
inicio
lerdados()
   se ehtriangulo() entao
      escreval (verificartipotriangulo())
   senao
      escreval ("Não é triangulo")
   fimse
fimalgoritmo


>>>>>>> c0d2189e076aab68af073ee55219ee639f9a5db6
=======
algoritmo "Proced.Função - Exercitando I"
//Método para organizar variáveis. Processa de acordo com dados de entrada.

//Método que processa com resposta em retorno.
var
lado1, lado2, lado3: inteiro
procedimento lerdados()
inicio
escreval ("Lado 1: ")
leia (lado1)
escreval ("Lado 2: ")
leia (lado2)
escreval ("Lado 3: ")
leia (lado3)
fimprocedimento

funcao ehtriangulo():logico
inicio
   se (lado1>lado2+lado3) ou (lado2>lado1+lado3) ou (lado3>lado1+lado2) entao
      retorne falso
   senao
      retorne verdadeiro
fimfuncao

funcao verificartipotriangulo(): literal
inicio
   se (lado1=lado2) e (lado2=lado3) entao
      retorne "Equilatero, é triagulo :D"
   senao
   se (lado1=lado2) ou (lado2=lado3) ou (lado1=lado3) entao
      retorne "Isósceles, Triangulo com apenas duas medidas iguais!
   senao
      retorne "Escaleno, não é triangulo :("
   fimse
   fimse
fimfuncao
inicio
lerdados()
   se ehtriangulo() entao
      escreval (verificartipotriangulo())
   senao
      escreval ("Não é triangulo")
   fimse
fimalgoritmo


>>>>>>> deebbbfb64118bec7d3f89ae9d216116d04f9b27
