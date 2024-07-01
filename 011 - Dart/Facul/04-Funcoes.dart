void main() {
  double num1 = 60;
  double num2 = 10;

  print('Resultados das operações: ');

  soma();
  subtrair(num1, num2);
  print('Multiplicação: '.toString() + multiplica().toString());
  double divisao = divide(num1, num2);
  print('Divisão: $divisao');
}

void soma() {
  double soma = 60 + 10;
  print("Soma: $soma");
}

void subtrair(double n1, double n2) {
  double resultado = n1 - n2;
  print("Subtração: $resultado");
}

double multiplica() {
  double resultado = 60 * 10;
  return resultado;
}

double divide(double n1, double n2) {
  double resultado = n1 / n2;
  return resultado;
}
