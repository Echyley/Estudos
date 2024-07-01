void main() {
  int resultado;

  print('Tabuado do 6: ');
  print(' ');

  print('Com loop for: ');
  for (int numero = 1; numero < 11; numero++) {
    resultado = numero * 6;
    print('$numero x 6 = $resultado');
  }
  print(' ');

  print('Com loop while: ');
  int num = 1;
  while (num < 11) {
    resultado = num * 6;
    print('$num x 6 = $resultado');
    num++;
  }
}
