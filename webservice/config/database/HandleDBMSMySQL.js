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
        console.log('queryInsert em HandleDBMSMySQL: ' + sqlInsert);
        this.connection.query(sqlInsert);
    }

    
    close() {
        console.log('fechando a conexão com o banco');
        return new Promise((resolve, reject) => {
        this.connection.end(err => {
            if (err) {
            console.error(err);
            reject(err);
            } else {
            resolve();
            }
        });
        });
    }
}

module.exports = HandleDBMSMySQL;