void main() {
  double nota1 = 4.0;
  double nota2 = 5.6;
  double nota3 = 3.0;
  double nota4 = 2.6;

  double media = (nota1 + nota2 + nota3 + nota4) / 4;

  if (media >= 6) {
    print(media);
    print('Aprovado!!');
  } else {
    print(media);
    print('Reprovado :(');
  }

  print(media >= 7 ? 'Aprovado!!' : 'Reprovado :(');
}
