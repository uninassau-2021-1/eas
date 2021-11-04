const fs = require('fs');
const mysql = require('mysql');

class HandleDBMSMySQL {

    constructor() {
        var envFile = JSON.parse(fs.readFileSync('./config/server/env.json', 'utf8','r'));

        if (envFile) {
            var host      = envFile.host;
            var database  = envFile.database;
            var user      = envFile.user;
            var password  = envFile.password;
            var port      = envFile.port;

            this.connection = mysql.createConnection({
                    host: host,
                    database: database,
                    user: user,
                    password: password,
                    port: port
                });

            this.connection.connect(function(error){
                if(!!error) {
                    console.log(error);
                } else {
                    console.log('Connected..!');
                }
            });
        }
    }

    queryInsert(sqlInsert) {
        console.log('chegou aqui ' + sqlInsert);
        this.connection.query(sqlInsert);
    }
}

module.exports = HandleDBMSMySQL;