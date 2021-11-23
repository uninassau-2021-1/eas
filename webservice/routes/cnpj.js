var express = require('express');
var router = express.Router();

var ModelCNPJ = require('../models/ModelCNPJ');

router.get('/:cnpj', function(req, res, next) {

  //utilizar no browser http://localhost:8081/cnpj/18073821920123
  //console.log(req.params.cnpj);

  var isValid = Boolean( new ModelCNPJ().validaCNPJ(req.params.cnpj) );
  if(isValid)
    res.render('index', { title: 'ERR[0000] = O CNPJ informado é válido' });
  else
    res.render('index', { title: 'ERR[1234] = O CNPJ informado está incorreto' });
});

module.exports = router;
