var express = require('express');
var router = express.Router();

var ModelCPF = require('../models/ModelCPF');

router.get('/:cpf', function(req, res, next) {

  //utilizar no browser http://localhost:8081/cpf/18073821920
  //console.log(req.params.cpf);

  var isValid = Boolean( new ModelCPF().validaCPF(req.params.cpf) );
  if(isValid)
    res.render('index', { title: 'ERR[0000] = O CPF informado é válido' });
  else
    res.render('index', { title: 'ERR[1234] = O CPF informado está incorreto' });
});

module.exports = router;
