var express = require('express');
var router = express.Router();

var moment = require('moment');
var os = require('os');
var ip = require('ip');

var ModelAccess = require('../models/ModelAccess');

/* GET home page. */
router.get('/', function(req, res, next) {

  var timestamp = moment().format('YYYY-MM-DD HH:mm:ss');
  var hostname = os.hostname();
  var ipv4 = ip.address('private', "ipv4");
  console.log(timestamp);
  console.log(hostname);
  console.log(JSON.stringify(ipv4));

  var _ModelAccess = new ModelAccess();
  _ModelAccess.postAccess(timestamp, hostname, ipv4);

  res.render('index', { title: 'Express' });
});

module.exports = router;