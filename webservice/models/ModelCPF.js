// https://www.geradordecpf.org/
// https://www.devmedia.com.br/validar-cpf-com-javascript/23916

class ModelCPF {

  constructor() {
    //
  }

  validaCPF(cpf){
    if (cpf === null) {
      console.error('Parâmetro cpf inválido: %s', cpf);
      return false;
    }
    if (cpf.length !== 11) {
      console.log('tamanho do cpf nao é igual a 11');
      return false;
    }
    var _numberCPF = Number(cpf);
    if(isNaN(_numberCPF)) {
      console.log('cpf nao possui, apenas, numeros');
      return false;
    }

    //declare explicitly a string variable
    var _strCPF = String(_numberCPF);

    // Passo 1, pega os dígitos da 1ª a 9ª posição e multiplica pelo decremento de 10 até 2
    var j = 10;
    var passo1 = 0;
    for (var i=0; i<9; i++) {
      console.log('Posição: %s, valor: %s, dec %s, passo 1: %s', i, _strCPF[i], j, (_strCPF[i]*j) );
      passo1 = passo1 + (_strCPF[i]*j);
      j--;
    }
    console.log('Saída do passo 1: %s', passo1);

    // Passo 2, multiplica o passo 1 por 10 e divide por 11
    var passo2 = parseInt( ( passo1 * 10 ) / 11 ); // Inteiro
    console.log('Saída do passo 2: %s', passo2);
    // Passo 3, pega o resto da divisão, se for 10 ou 11, o DV1=0
    var passo3 = parseInt( ( passo1 * 10 ) % 11 ); // Inteiro
    console.log('Resto da divisão: %s', passo3 );
    if (passo3 === 10 || passo3 === 11 ) { var DV1 = 0; } else { var DV1 = passo3; }
    if (passo3 !== DV1 ) { 
      console.error('O CPF \'%s\' informado é inválido.', _strCPF); 
      return false;
    }

    console.log('DV1: %s', DV1);

    // Passo 4, pega os dígitos da 1ª a 10ª posição e multiplica pelo decremento de 11 até 2
    var j = 11;
    var passo4 = 0;
    for (var i=0; i<10; i++) {
      console.log('Posição: %s, valor: %s, dec %s, passo 4: %s', i, _strCPF[i], j, (_strCPF[i]*j) );
      passo4 = passo4 + (_strCPF[i]*j);
      j--;
    }
    console.log('Saída do passo 4: %s', passo4);

    // Passo 5, multiplica o passo 4 por 10 e divide por 11
    var passo5 = parseInt( ( passo4 * 10 ) / 11 ); // Inteiro
    console.log('Saída do passo 5: %s', passo5);
    // Passo 6, pega o resto da divisão, se for 10 ou 11, o DV1=0
    var passo6 = parseInt( ( passo4 * 10 ) % 11 ); // Inteiro
    console.log('Resto da divisão: %s', passo6 );
    if (passo6 === 10 || passo6 === 11 ) { var DV2 = 0; } else { var DV2 = passo6; }
    if (passo6 !== DV2 ) {
       console.error('O CPF \'%s\' informado é inválido.', _strCPF); 
       return false;
    }

    console.log('DV2: %s', DV2);

    if ( passo3 === DV1 || passo6 === DV2 ) {
      console.log('O CPF \'%s\' informado é válido.', _strCPF);
      return true;
    }
  }
}

module.exports = ModelCPF;

// var cpf = new ModelCPF();
// cpf.validaCPF(03124198484); // válido
// cpf.validaCPF(12345678900); // inválido
// cpf.validaCPF(11111111100); // inválido