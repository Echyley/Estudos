function calcularMedia() {
    var nota1 = parseFloat(document.getElementById("nota1").value);
    var nota2 = parseFloat(document.getElementById("nota2").value);
    var nota3 = parseFloat(document.getElementById("nota3").value);

    if (isNaN(nota1) || isNaN(nota2) || isNaN(nota3)) {
        document.getElementById("resultado").innerHTML = "Por favor, preencha todas as notas corretamente.";
        return;
    }

    var media = (nota1 + nota2 + nota3) / 3;

    document.getElementById("resultado").innerHTML = "Sua média é: " + media.toFixed(0);

    var comentario;

    if (media >= 60) {
        comentario = "Você passou!";
    } else {
        if (media < 50) {
            comentario = "Você Reprovou :(";
        } else {
            comentario = "Você está em recuperação. Ainda há esperança!";
        }
    }

    document.getElementById("resultado").innerHTML = "Sua média é: " + media.toFixed(2) + "<br>" + comentario;
}