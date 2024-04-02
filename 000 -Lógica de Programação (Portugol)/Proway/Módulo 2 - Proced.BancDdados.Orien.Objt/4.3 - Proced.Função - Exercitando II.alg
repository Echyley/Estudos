<<<<<<< HEAD
<<<<<<< HEAD
algoritmo "Proced.Função - Exercitando II"
//Método para organizar variáveis. Processa de acordo com dados de entrada.

//Método que processa com resposta em retorno.
var
opcaomenu: literal
clientes : vetor[1..5] de literal

procedimento mostrarmenu()
inicio
   Escreval ("1 - Cadastrar")
   Escreval ("2 - Pesquisar")
   Escreval ("3 - Excluir")
   Escreval ("4 - Sair")
   leia (opcaomenu)
fimprocedimento

procedimento cadastrar()
var
i:inteiro
inicio
   para i de 1 ate 5 faca
      se clientes[i] = "" entao
         Escreval ("Informe o nome de cadastro.")
         leia(clientes[i])
      fimse
   fimpara
fimprocedimento

procedimento pesquisar()
var
i, indicesucesso:inteiro
nomeapesquisar: literal
inicio
Escreval ("Informe o nome a pesquisar.")
leia (nomeapesquisar)
indicesucesso <- -1

   para i de 1 ate 5 faca
      se clientes[i] = nomeapesquisar entao
      indicesucesso <-i
         interrompa
      fimse
   fimpara
   se indicesucesso = -1 entao
      Escreval ("Cliente não encontrado :(")
   senao
      Escreval ("Cliente encontrado na posição: ", indicesucesso)
   fimse
fimprocedimento

procedimento excluir()
var
indiceexclusao:inteiro
inicio
Escreval ("Informe o indice a excluir (nas posições 1, 2, 3, 4 ou 5)")
leia (indiceexclusao)

   se (indiceexclusao > 5) ou (indiceexclusao < 1) entao
      Escreval ("Indice inválido :(")
   senao
      clientes [indiceexclusao] <- ""
   fimse
fimprocedimento

inicio
repita
   mostrarmenu()
   escolha opcaomenu
      caso "1"
         cadastrar()
      caso "2"
         Pesquisar()
      caso "3"
         excluir()
      outrocaso
        se opcaomenu >= 5 entao
        Escreval ("Opcão inválida :(")
        fimse
   fimescolha
ate opcaomenu = "4"
Escreval ("Você saiu...")
      
fimalgoritmo


=======
algoritmo "Proced.Função - Exercitando II"
//Método para organizar variáveis. Processa de acordo com dados de entrada.

//Método que processa com resposta em retorno.
var
opcaomenu: literal
clientes : vetor[1..5] de literal

procedimento mostrarmenu()
inicio
   Escreval ("1 - Cadastrar")
   Escreval ("2 - Pesquisar")
   Escreval ("3 - Excluir")
   Escreval ("4 - Sair")
   leia (opcaomenu)
fimprocedimento

procedimento cadastrar()
var
i:inteiro
inicio
   para i de 1 ate 5 faca
      se clientes[i] = "" entao
         Escreval ("Informe o nome de cadastro.")
         leia(clientes[i])
      fimse
   fimpara
fimprocedimento

procedimento pesquisar()
var
i, indicesucesso:inteiro
nomeapesquisar: literal
inicio
Escreval ("Informe o nome a pesquisar.")
leia (nomeapesquisar)
indicesucesso <- -1

   para i de 1 ate 5 faca
      se clientes[i] = nomeapesquisar entao
      indicesucesso <-i
         interrompa
      fimse
   fimpara
   se indicesucesso = -1 entao
      Escreval ("Cliente não encontrado :(")
   senao
      Escreval ("Cliente encontrado na posição: ", indicesucesso)
   fimse
fimprocedimento

procedimento excluir()
var
indiceexclusao:inteiro
inicio
Escreval ("Informe o indice a excluir (nas posições 1, 2, 3, 4 ou 5)")
leia (indiceexclusao)

   se (indiceexclusao > 5) ou (indiceexclusao < 1) entao
      Escreval ("Indice inválido :(")
   senao
      clientes [indiceexclusao] <- ""
   fimse
fimprocedimento

inicio
repita
   mostrarmenu()
   escolha opcaomenu
      caso "1"
         cadastrar()
      caso "2"
         Pesquisar()
      caso "3"
         excluir()
      outrocaso
        se opcaomenu >= 5 entao
        Escreval ("Opcão inválida :(")
        fimse
   fimescolha
ate opcaomenu = "4"
Escreval ("Você saiu...")
      
fimalgoritmo


>>>>>>> c0d2189e076aab68af073ee55219ee639f9a5db6
=======
algoritmo "Proced.Função - Exercitando II"
//Método para organizar variáveis. Processa de acordo com dados de entrada.

//Método que processa com resposta em retorno.
var
opcaomenu: literal
clientes : vetor[1..5] de literal

procedimento mostrarmenu()
inicio
   Escreval ("1 - Cadastrar")
   Escreval ("2 - Pesquisar")
   Escreval ("3 - Excluir")
   Escreval ("4 - Sair")
   leia (opcaomenu)
fimprocedimento

procedimento cadastrar()
var
i:inteiro
inicio
   para i de 1 ate 5 faca
      se clientes[i] = "" entao
         Escreval ("Informe o nome de cadastro.")
         leia(clientes[i])
      fimse
   fimpara
fimprocedimento

procedimento pesquisar()
var
i, indicesucesso:inteiro
nomeapesquisar: literal
inicio
Escreval ("Informe o nome a pesquisar.")
leia (nomeapesquisar)
indicesucesso <- -1

   para i de 1 ate 5 faca
      se clientes[i] = nomeapesquisar entao
      indicesucesso <-i
         interrompa
      fimse
   fimpara
   se indicesucesso = -1 entao
      Escreval ("Cliente não encontrado :(")
   senao
      Escreval ("Cliente encontrado na posição: ", indicesucesso)
   fimse
fimprocedimento

procedimento excluir()
var
indiceexclusao:inteiro
inicio
Escreval ("Informe o indice a excluir (nas posições 1, 2, 3, 4 ou 5)")
leia (indiceexclusao)

   se (indiceexclusao > 5) ou (indiceexclusao < 1) entao
      Escreval ("Indice inválido :(")
   senao
      clientes [indiceexclusao] <- ""
   fimse
fimprocedimento

inicio
repita
   mostrarmenu()
   escolha opcaomenu
      caso "1"
         cadastrar()
      caso "2"
         Pesquisar()
      caso "3"
         excluir()
      outrocaso
        se opcaomenu >= 5 entao
        Escreval ("Opcão inválida :(")
        fimse
   fimescolha
ate opcaomenu = "4"
Escreval ("Você saiu...")
      
fimalgoritmo


>>>>>>> deebbbfb64118bec7d3f89ae9d216116d04f9b27
