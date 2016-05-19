--cd c:\program files\MySql\Mysql server 5.7\bin
--mysql -u root -p
--para alterar a senha do root: SET PASSWORD FOR root@localhost=PASSWORD('NOVASENHA');

--JDBC_DRIVER = "com.mysql.jdbc.Driver";
--JDBC_URL = "jdbc:mysql://localhost:3306/databaseMySql";
--USER = "root";
--PASS = "root";

--create database db_Museu;
--use db_Museu
--show tables;
--desc <nomedatabela>;

CREATE TABLE tb_mensagem (
  id int(10) NOT NULL AUTO_INCREMENT,
  nome varchar(50) NULL,
  sobrenome varchar(50) NULL,
  email varchar(50) NULL,
  telefone varchar(50) NULL,
  mensagem varchar(500) NULL,
  PRIMARY KEY(id),
  UNIQUE KEY id (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

