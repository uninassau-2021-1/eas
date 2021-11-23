// https://www.geradordecpf.org/
// https://www.devmedia.com.br/validar-cpf-com-javascript/23916

class ModelCNPJ {

  constructor() {
    //
  }

  validaCNPJ(cnpj){
    if (cnpj === null) {
      console.error('Parâmetro cnpj inválido: %s', cnpj);
      return false;
    }
    if (cnpj.length !== 14) {
      console.log('tamanho do cnpj nao é igual a 11');
      return false;
    }
    var _numberCNPJ = Number(cnpj);
    if(isNaN(_numberCNPJ)) {
      console.log('cnpj nao possui, apenas, numeros');
      return false;
    }
    return true;
  }
}

module.exports = ModelCNPJ;