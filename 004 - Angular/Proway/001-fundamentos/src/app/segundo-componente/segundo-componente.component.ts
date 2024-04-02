import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent {
nome = "Echy";
dataNascimento = "02/08/2003";
urlImagem = "/assets/img/Hambago.jpg"

mostrarDataNascimento() {
  alert(`A data de nascimento de ${this.nome} é: ${this.dataNascimento}`)
}
}
