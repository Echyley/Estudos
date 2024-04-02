<<<<<<< HEAD
<<<<<<< HEAD
algoritmo "Enquanto - Exercitando"
//O operador Enquanto ou "while" pode calcular determinada situação
//automaticamente em loop, se não houver uma saída o while continuará
//infinitamente.
var
qtdentrevistados, maisnovo, maisvelho, idadeinformada: inteiro

porcentmenoridade, mediaidade, menoridade, qtdmenoridade, somaidade: real

inicio
maisnovo <- 9999
maisvelho <- 0
qtdentrevistados <- 0
enquanto qtdentrevistados < 5 faca
   escreval ("Favor, informe sua idade")
   leia (idadeinformada)
   
   se idadeinformada > maisvelho entao
   maisvelho <- idadeinformada
   fimse
   se idadeinformada < maisnovo entao
   maisnovo <- idadeinformada
   fimse
   se idadeinformada < 18 entao
   qtdmenoridade <- qtdmenoridade + 1
   fimse
somaidade <- somaidade + idadeinformada
qtdentrevistados <- qtdentrevistados + 1
fimenquanto

escreval ("Mais novo ", maisnovo)
Escreval ("Mais velho ", maisvelho)
porcentmenoridade <- (qtdmenoridade / 5) * 100
Escreval ("Porcentagem menor idade ", porcentmenoridade, "%")

mediaidade <- somaidade / 5
escreval ("Media idade ", mediaidade)
   

fimalgoritmo

=======
algoritmo "Enquanto - Exercitando"
//O operador Enquanto ou "while" pode calcular determinada situação
//automaticamente em loop, se não houver uma saída o while continuará
//infinitamente.
var
qtdentrevistados, maisnovo, maisvelho, idadeinformada: inteiro

porcentmenoridade, mediaidade, menoridade, qtdmenoridade, somaidade: real

inicio
maisnovo <- 9999
maisvelho <- 0
qtdentrevistados <- 0
enquanto qtdentrevistados < 5 faca
   escreval ("Favor, informe sua idade")
   leia (idadeinformada)
   
   se idadeinformada > maisvelho entao
   maisvelho <- idadeinformada
   fimse
   se idadeinformada < maisnovo entao
   maisnovo <- idadeinformada
   fimse
   se idadeinformada < 18 entao
   qtdmenoridade <- qtdmenoridade + 1
   fimse
somaidade <- somaidade + idadeinformada
qtdentrevistados <- qtdentrevistados + 1
fimenquanto

escreval ("Mais novo ", maisnovo)
Escreval ("Mais velho ", maisvelho)
porcentmenoridade <- (qtdmenoridade / 5) * 100
Escreval ("Porcentagem menor idade ", porcentmenoridade, "%")

mediaidade <- somaidade / 5
escreval ("Media idade ", mediaidade)
   

fimalgoritmo

>>>>>>> c0d2189e076aab68af073ee55219ee639f9a5db6
=======
algoritmo "Enquanto - Exercitando"
//O operador Enquanto ou "while" pode calcular determinada situação
//automaticamente em loop, se não houver uma saída o while continuará
//infinitamente.
var
qtdentrevistados, maisnovo, maisvelho, idadeinformada: inteiro

porcentmenoridade, mediaidade, menoridade, qtdmenoridade, somaidade: real

inicio
maisnovo <- 9999
maisvelho <- 0
qtdentrevistados <- 0
enquanto qtdentrevistados < 5 faca
   escreval ("Favor, informe sua idade")
   leia (idadeinformada)
   
   se idadeinformada > maisvelho entao
   maisvelho <- idadeinformada
   fimse
   se idadeinformada < maisnovo entao
   maisnovo <- idadeinformada
   fimse
   se idadeinformada < 18 entao
   qtdmenoridade <- qtdmenoridade + 1
   fimse
somaidade <- somaidade + idadeinformada
qtdentrevistados <- qtdentrevistados + 1
fimenquanto

escreval ("Mais novo ", maisnovo)
Escreval ("Mais velho ", maisvelho)
porcentmenoridade <- (qtdmenoridade / 5) * 100
Escreval ("Porcentagem menor idade ", porcentmenoridade, "%")

mediaidade <- somaidade / 5
escreval ("Media idade ", mediaidade)
   

fimalgoritmo

>>>>>>> deebbbfb64118bec7d3f89ae9d216116d04f9b27
