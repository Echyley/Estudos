<<<<<<< HEAD
<<<<<<< HEAD
algoritmo "Matrizes"
//Tipo de vetor de alta dimensão.
var
cinema: vetor [1..10, 1..10] de literal
i,j,fila,poltrona: inteiro
opcao: literal
inicio

para i de 1 ate 10 faca
para j de 1 ate 10 faca
   cinema [i,j] <- "0"
fimpara
fimpara

repita
  Escreval ("1 - Reservar")
  Escreval ("2 - Layout")
  Escreval ("3 - sair")
  leia (opcao)
     Escolha opcao
        caso "1"
           Escreval ("Qual fila?")
           leia (fila)
           Escreval ("Qual poltrona?")
           Leia (poltrona)
              se cinema [fila, poltrona] = "0" entao
                 cinema [fila, poltrona] <- "X"
              senao
                 Escreval ("Poltrona ocupada :(")
              fimse
        Caso "2"
           para i de 1 ate 10 faca
              para j de 1 ate 10 faca
                 Escreval (" ", cinema [i,j], " ")
              fimpara
                 Escreval (" ")
           fimpara
     fimescolha
ate opcao = "3"
fimalgoritmo


=======
algoritmo "Matrizes"
//Tipo de vetor de alta dimensão.
var
cinema: vetor [1..10, 1..10] de literal
i,j,fila,poltrona: inteiro
opcao: literal
inicio

para i de 1 ate 10 faca
para j de 1 ate 10 faca
   cinema [i,j] <- "0"
fimpara
fimpara

repita
  Escreval ("1 - Reservar")
  Escreval ("2 - Layout")
  Escreval ("3 - sair")
  leia (opcao)
     Escolha opcao
        caso "1"
           Escreval ("Qual fila?")
           leia (fila)
           Escreval ("Qual poltrona?")
           Leia (poltrona)
              se cinema [fila, poltrona] = "0" entao
                 cinema [fila, poltrona] <- "X"
              senao
                 Escreval ("Poltrona ocupada :(")
              fimse
        Caso "2"
           para i de 1 ate 10 faca
              para j de 1 ate 10 faca
                 Escreval (" ", cinema [i,j], " ")
              fimpara
                 Escreval (" ")
           fimpara
     fimescolha
ate opcao = "3"
fimalgoritmo


>>>>>>> c0d2189e076aab68af073ee55219ee639f9a5db6
=======
algoritmo "Matrizes"
//Tipo de vetor de alta dimensão.
var
cinema: vetor [1..10, 1..10] de literal
i,j,fila,poltrona: inteiro
opcao: literal
inicio

para i de 1 ate 10 faca
para j de 1 ate 10 faca
   cinema [i,j] <- "0"
fimpara
fimpara

repita
  Escreval ("1 - Reservar")
  Escreval ("2 - Layout")
  Escreval ("3 - sair")
  leia (opcao)
     Escolha opcao
        caso "1"
           Escreval ("Qual fila?")
           leia (fila)
           Escreval ("Qual poltrona?")
           Leia (poltrona)
              se cinema [fila, poltrona] = "0" entao
                 cinema [fila, poltrona] <- "X"
              senao
                 Escreval ("Poltrona ocupada :(")
              fimse
        Caso "2"
           para i de 1 ate 10 faca
              para j de 1 ate 10 faca
                 Escreval (" ", cinema [i,j], " ")
              fimpara
                 Escreval (" ")
           fimpara
     fimescolha
ate opcao = "3"
fimalgoritmo


>>>>>>> deebbbfb64118bec7d3f89ae9d216116d04f9b27
