const HandleDBMSMySQL = require('../config/database/HandleDBMSMySQL');

class ModelCriarUsuario {

  constructor() {
    this._HandleDBMSMySQL = new HandleDBMSMySQL();
  }

  destroy(param=null) {
    var varToString = varObj => Object.keys(varObj)[0];
    new Error('Parâmetros incorretos para a classe: \`%s\`, parâmetro \`%s\`', this.constructor.name, varToString({param}));
  }

  postUsuario(usuario=null, senha=null, papel=null) {
    if(usuario == null || senha == null) {
        console.log("Digite novamente o usuário e senha");
        return;
    }

    var sqlInsert = `insert into eas.usuario values (null, '${usuario}', '${senha}', ${papel})`;
    var resultsJSON = this._HandleDBMSMySQL;

    return new Promise((resolve, reject) => {
      resultsJSON.queryInsert(sqlInsert, (err, results) => {
        if (err) {
          console.error(err);
          reject(err);
        } else {
          console.log(results);
          resolve(results);
        }
      });
      this._HandleDBMSMySQL.close();
    });
  }
}

module.exports = ModelCriarUsuario;
