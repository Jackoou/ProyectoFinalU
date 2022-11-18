create database Progamming;
use Progamming;

/*
Tabla del JFrame de Switch
*/

Create Table Switch
(
id int auto_increment not null,
primary key (id),
titulo varchar (100),
fecha date,
consola varchar (30),
genero varchar (30),
formato varchar (30),
director varchar (30)
)
/*
drop table Switch
*/
INSERT INTO Switch (titulo,fecha,consola,genero,formato,director)
values
("Mario 64",'1999-12-06',"Nintendo 64","Aventura","Coleccionista","Shigeru Miyamoto"),
("Super Mario Kart",'1992-12-06',"Super Nintendo","Carreras","Coleccionista","Tadashi Sugiyama");

select * from Switch

/*
Tabla del JFrame de Xbox
*/

create table Xbox
(
id int auto_increment not null,
primary key (id),
titulo varchar (100),
fecha date,
consola varchar (30),
genero varchar (30),
formato varchar (30),
director varchar (30)
)
/*
drop table Xbox
*/
INSERT INTO Xbox (titulo,fecha,consola,genero,formato,director)
values
("Halo Combat Envoled",'2001-11-15',"Xbox","Acción","Fisico","Joseph Staten"),
("Gear of War",'2006-11-07',"Xbox 360","Acción","Fisico","Cliff Bleszinski");

select * from Xbox

/*
Tabla del JFrame Play
*/

create table Play
(
id int auto_increment not null,
primary key (id),
titulo varchar (100),
fecha date,
consola varchar (30),
genero varchar (30),
formato varchar (30),
director varchar (30)
)
/*
drop table Play
*/
INSERT INTO Play (titulo,fecha,consola,genero,formato,director)
values
("Shadow of the Colossus",'2005-10-18',"PlayStation 2","Aventura","Fisico","Fumito Ueda"),
("God Of War",'2005-03-22',"PlayStation 2","Acción","Fiscio","David Jaffe");

select * from Play