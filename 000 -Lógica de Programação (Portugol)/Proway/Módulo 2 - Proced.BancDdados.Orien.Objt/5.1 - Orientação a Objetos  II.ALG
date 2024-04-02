<<<<<<< HEAD
<<<<<<< HEAD
Algoritmo "Orientação a objetos"

tipo
CadastroCliente = registro

nome: caractere
rg: caractere
idade: inteiro

fimregistro

Var
clientes: vetor [1..3] de cadastroCliente
opcao: caracter
i:inteiro
rgpesquisa: caracter
Inicio
repita
  escreval ("1 - Cadastrar")
  escreval ("2 - Pesquisar")
  escreval ("3 - Sair")
  leia(opcao)

   se opcao = "1" entao
      para i de 1 ate 3 faca
         se clientes[i].nome = "" entao
            escreval ("Cal seu nome?")
              leia (clientes[i].nome)
            escreval ("Cal seu rg?")
              leia (clientes[i].rg)
            escreval ("Cal sua idade?")
              leia (clientes[i].idade)
         interrompa
         fimse
   fimse
       fimpara
   senao
      se opcao = "2"  entao
         esvreval ("Digite o rg: ")
           leia(rgpesquisa)
       para de i de 1 ate 3 faca
          se clientes[i].rg = rgpesquisa entao
             escreval (clientes[i].nome,"Você Achou :D")
       interrompa
       fimpara
          fimse
      fimse
   fimse
ate opcao = "3"
=======
Algoritmo "Orientação a objetos"

tipo
CadastroCliente = registro

nome: caractere
rg: caractere
idade: inteiro

fimregistro

Var
clientes: vetor [1..3] de cadastroCliente
opcao: caracter
i:inteiro
rgpesquisa: caracter
Inicio
repita
  escreval ("1 - Cadastrar")
  escreval ("2 - Pesquisar")
  escreval ("3 - Sair")
  leia(opcao)

   se opcao = "1" entao
      para i de 1 ate 3 faca
         se clientes[i].nome = "" entao
            escreval ("Cal seu nome?")
              leia (clientes[i].nome)
            escreval ("Cal seu rg?")
              leia (clientes[i].rg)
            escreval ("Cal sua idade?")
              leia (clientes[i].idade)
         interrompa
         fimse
   fimse
       fimpara
   senao
      se opcao = "2"  entao
         esvreval ("Digite o rg: ")
           leia(rgpesquisa)
       para de i de 1 ate 3 faca
          se clientes[i].rg = rgpesquisa entao
             escreval (clientes[i].nome,"Você Achou :D")
       interrompa
       fimpara
          fimse
      fimse
   fimse
ate opcao = "3"
>>>>>>> c0d2189e076aab68af073ee55219ee639f9a5db6
=======
Algoritmo "Orientação a objetos"

tipo
CadastroCliente = registro

nome: caractere
rg: caractere
idade: inteiro

fimregistro

Var
clientes: vetor [1..3] de cadastroCliente
opcao: caracter
i:inteiro
rgpesquisa: caracter
Inicio
repita
  escreval ("1 - Cadastrar")
  escreval ("2 - Pesquisar")
  escreval ("3 - Sair")
  leia(opcao)

   se opcao = "1" entao
      para i de 1 ate 3 faca
         se clientes[i].nome = "" entao
            escreval ("Cal seu nome?")
              leia (clientes[i].nome)
            escreval ("Cal seu rg?")
              leia (clientes[i].rg)
            escreval ("Cal sua idade?")
              leia (clientes[i].idade)
         interrompa
         fimse
   fimse
       fimpara
   senao
      se opcao = "2"  entao
         esvreval ("Digite o rg: ")
           leia(rgpesquisa)
       para de i de 1 ate 3 faca
          se clientes[i].rg = rgpesquisa entao
             escreval (clientes[i].nome,"Você Achou :D")
       interrompa
       fimpara
          fimse
      fimse
   fimse
ate opcao = "3"
>>>>>>> deebbbfb64118bec7d3f89ae9d216116d04f9b27
Fimalgoritmo