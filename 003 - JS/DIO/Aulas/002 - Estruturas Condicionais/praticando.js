const valorEtanol = 8.5;
const valorGasosa = 5.5;
const kmPorLitros = 10;
const distancia = 100;
const tipoCombustivel = "gasosa";

const litrosConsumidos = distancia / kmPorLitros;

if (tipoCombustivel === 'Etanol') {
    const total = litrosConsumidos * valorEtanol;
    console.log('Seu valor gasto foi: ', total.toFixed(2));
} else {
    const total = litrosConsumidos * valorGasosa;
    console.log('Seu valor gasto foi: ', total.toFixed(2));
}


