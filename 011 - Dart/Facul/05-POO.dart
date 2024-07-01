import 'dart:io';

class Aluno {
  String nome;
  List<double> notas;

  Aluno(this.nome, this.notas);

  double calcularMedia() {
    if (notas.isEmpty) {
      return 0.0;
    }
    var soma = notas.reduce((a, b) => a + b);
    return soma / notas.length;
  }
}

void main() {
  // Pedindo ao usuário para inserir as notas do aluno
  stdout.write('Digite o nome do aluno: ');
  String nomeAluno = stdin.readLineSync()!;

  stdout.write(
      'Digite as notas do aluno separadas por espaço (ex: 8.5 7.0 9.0): ');
  String notasInput = stdin.readLineSync()!;

  // Convertendo as notas de String para List<double>
  List<double> notas =
      notasInput.split(' ').map((e) => double.parse(e)).toList();

  // Criando objeto Aluno com os dados fornecidos pelo usuário
  var aluno = Aluno(nomeAluno, notas);

  // Calculando e exibindo a média do aluno
  var media = aluno.calcularMedia();
  print('${aluno.nome}: Média = ${media.toStringAsFixed(2)}');
}
