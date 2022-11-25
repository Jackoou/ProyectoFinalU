create database Progamming;
use Progamming;

/*
Tabla del JFrame de Switch
*/

Create Table Switch
(
titulo varchar (100) primary key  not null,
fecha varchar (10) not null,
consola varchar (30) not null,
genero varchar (30) not null,
formato varchar (30) not null,
director varchar (30) not null
)
/*
drop table Switch
*/
INSERT INTO Switch (titulo,fecha,consola,genero,formato,director)
values
("Mario 64","06/12/1999","Nintendo 64","Aventuras","Coleccionista","Shigeru Miyamoto"),
("Super Mario Kart","06/12/1992","Super Nintendo","Carreras","Coleccionista","Tadashi Sugiyama");

select * from Switch

/*
Tabla del JFrame de Xbox
*/

create table Xbox
(
titulo varchar (100) primary key not null,
fecha varchar (10) not null,
consola varchar (30) not null,
genero varchar (30) not null,
formato varchar (30) not null,
director varchar (30) not null
)
/*
drop table Xbox
*/
INSERT INTO Xbox (titulo,fecha,consola,genero,formato,director)
values
("Halo Combat Envoled","15/11/2001","Xbox","Acción","Fisico","Joseph Staten"),
("Gear of War","07/11/2006","Xbox 360","Acción","Fisico","Cliff Bleszinski");


select * from Xbox

/*
Tabla del JFrame Play
*/

create table Play
(
titulo varchar (100) primary key  not null,
fecha varchar(20) not null,
consola varchar (30) not null,
genero varchar (30) not null,
formato varchar (30) not null,
director varchar (30) not null
)
/*
drop table Play
*/
INSERT INTO Play (titulo,fecha,consola,genero,formato,director)
values
("Shadow of the Colossus","18/10/2005","PlayStation 2","Aventuras","Fisico","Fumito Ueda"),
("God Of War","22/03/2005","PlayStation 2","Acción","Fiscio","David Jaffe");

select * from Play



