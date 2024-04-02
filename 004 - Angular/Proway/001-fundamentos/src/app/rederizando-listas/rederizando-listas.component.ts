import { Component } from '@angular/core';
import { Celular } from '../types/Celular';

@Component({
  selector: 'app-rederizando-listas',
  templateUrl: './rederizando-listas.component.html',
  styleUrls: ['./rederizando-listas.component.css']
})
export class RederizandoListasComponent {
  celulares: Celular[] = [
    { id: 1, nome: "Celular XL", descricao: "Mais forte que Nokia", esgotado: false},
    { id: 2, nome: "Celular normal", descricao: "Dá pra usar", esgotado: false},
    { id: 3, nome: "Celular mini", descricao: "Tão pequeno que não dá pra ver", esgotado: true}
  ]
}
