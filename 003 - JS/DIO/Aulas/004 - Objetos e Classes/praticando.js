class carro{
    marca;
    cor;
    combustivelGastoKm;

    constructor (marca,cor,combustivelGastoKm){
        this.marca=marca;
        this.cor=cor;
        this.combustivelGastoKm=combustivelGastoKm;
    }

    totalGastoPercurso(distanciaKm, precoCombustivel) {
        return distanciaKm * this.combustivelGastoKm * precoCombustivel;
    }
}



const Tesla = new carro ('eletric','preto', 1/12);
console.log('Considerando a distancia e o preço do combustivel, esse é o total da viagem: ' + Tesla.totalGastoPercurso(100,5.18).toFixed(2));

