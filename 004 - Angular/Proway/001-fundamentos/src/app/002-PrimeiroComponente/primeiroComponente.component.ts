import { Component } from "@angular/core";

@Component({
    //nome do component
    selector:"app-primeiroComponente",
    //Aplicação html do component
    template: "<h2>Primeiro Componente</h2>",
    //Estilo do component
    styles: ["h2 {color: red; }"]
})

export class PrimeiroComponenteComponent{}