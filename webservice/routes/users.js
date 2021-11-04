var express = require('express');
var router = express.Router();
const HandleDBMSMySQL = require('../config/database/HandleDBMSMySQL');

/* GET users listing. */
router.get('/', function(req, res, next) {
  
  res.send('respond with a resource');

  var connection = HandleDBMSMySQL.createConnection();
  connection.query("select * from employees.departments where dept_no < 'd005' order by dept_no", function (err, departamentos) {
    if (err) throw err;

    departamentos.forEach(departamento => {
      console.log("Dept_no: " + departamento.dept_no + " | " + "Dept_name: " + departamento.dept_name); //criar classe Pessoa
    });
  });
});

module.exports = router;
