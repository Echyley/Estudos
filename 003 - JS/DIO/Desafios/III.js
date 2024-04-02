const etiqueta = 100;
const tipoPgmt = 4;

if (tipoPgmt === 1) {
    console.log (etiqueta - (etiqueta * 0.10));
}else if (tipoPgmt === 2) {
    console.log (etiqueta - (etiqueta * 0.15));
} else if (tipoPgmt === 3) {
    console.log (etiqueta);
}else {
    console.log (etiqueta + (etiqueta * 0.10));
}
