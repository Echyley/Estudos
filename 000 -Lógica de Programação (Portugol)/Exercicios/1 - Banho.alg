algoritmo "Você já tomou banho?"

var
pes, sovaco, cabelo: inteiro
banho: caractere
inicio

pes <- 0
sovaco <- 0
cabelo <- 0

repita
  escreval ("1 para sim;")
  escreval ("2 para não;")
  escreval ("3 para sair.")
  escreval ("Você já tomou banho?")
  leia (banho)
    escolha banho
      caso "1"
        Escreval ("Então responda:")
        escreval ("Já lavou os pés?")
        leia (pes)
        escreval ("O sovaco?")
        leia (sovaco)
        escreval ("E o cabelo?")
        leia (cabelo)
se (pes=sovaco+cabelo) ou (sovaco=pes+cabelo) ou (cabelo=pes+sovaco) entao
  Escreval ("É feio mentir :(")
  Escreval ("Você saiu, mas não se esqueça de tomar banho direito >:(")
  interrompa
  senao
      Escreval ("Parabéns por ter tomado banho :)")
      Escreval ("Você saiu cheiroso :D")
      interrompa
fimse
      caso "2"
      Escreval ("Então vai tomar >:(")
      interrompa
     fimescolha
ate banho = "3"
Escreval ("- Você saiu.")

fimalgoritmo