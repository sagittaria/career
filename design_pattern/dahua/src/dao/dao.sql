drop database daoLearning;
create database daoLearning;
use daoLearning;

create table CustomerTbl
(
id int not null AUTO_INCREMENT,
name varchar(255),
email varchar(255),
primary key (id)
);

insert into CustomerTbl(id,name,email) values(1,'甲姓名','a@b.c');
insert into CustomerTbl(id,name,email) values(2,'乙姓名','d@e.f');
insert into CustomerTbl(id,name,email) values(3,'丙姓名','g@h.i');
insert into CustomerTbl(id,name,email) values(4,'丁姓名','j@k.l');