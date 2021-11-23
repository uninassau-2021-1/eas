var express = require('express');
var router = express.Router();

var ModelCriarUsuario = require('../models/ModelCriarUsuario');

router.post('/criarUsuarioGestor', function(req, res, next) {

  console.log(req.body);

  new ModelCriarUsuario().postUsuario(req.body.usuario, req.body.senha, 1)
    .then(resultsJSON => {
      console.log(resultsJSON);
      res.send(resultsJSON);
    })
    .catch(err => console.error(err));
});

router.post('/criarUsuarioClienteFiscal', function(req, res, next) {

    console.log(req.body);

    new ModelCriarUsuario().postUsuario(req.body.usuario, req.body.senha, req.body.papel)
      .then(resultsJSON => {
        console.log(resultsJSON);
        res.send(resultsJSON);
      })
      .catch(err => console.error(err));
  });

module.exports = router;
