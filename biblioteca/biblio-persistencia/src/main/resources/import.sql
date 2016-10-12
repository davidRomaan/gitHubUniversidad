insert into editorial(codigo,nombre) values('1','Santillana');

insert into autor(codigo,nombre) values('1','JK Rowling');
insert into autor(codigo,nombre) values('2','JR Tolkien');
insert into autor(codigo,nombre) values('3','GR Martin');

insert into libro(codigo,nombre,autor,editorial,ejemplares) values('1','El retorno del rey',		'2','1',6);
insert into libro(codigo,nombre,autor,editorial,ejemplares) values('2','Las dos torres',			'2','1',1);
insert into libro(codigo,nombre,autor,editorial,ejemplares) values('3','La comunidad del anillo',	'2','1',4);

insert into libro(codigo,nombre,autor,editorial,ejemplares) values('4','Juego de tronos',		'3','1',6);
insert into libro(codigo,nombre,autor,editorial,ejemplares) values('5','Choque de reyes',		'3','1',1);
insert into libro(codigo,nombre,autor,editorial,ejemplares) values('6','Tormenta de espadas',	'3','1',4);

insert into libro(codigo,nombre,autor,editorial,ejemplares) values('7','La pieda filosofal',	'1','1',6);
insert into libro(codigo,nombre,autor,editorial,ejemplares) values('8','La camara secreta',	'1','1',1);
insert into libro(codigo,nombre,autor,editorial,ejemplares) values('9','La orden del fenix',	'1','1',4);

insert into usuario(nombre,cedula) values('Claudia','1234');
insert into usuario(nombre,cedula) values('Gladys','4321');
insert into usuario(nombre,cedula) values('Juan','5678');
insert into usuario(nombre,cedula) values('Camilo','9876');


insert into prestamo(libro,usuario,fecha,entregado) values('1','1234','2016-10-1',0);
insert into prestamo(libro,usuario,fecha,entregado) values('4','1234','2016-10-1',0);
insert into prestamo(libro,usuario,fecha,entregado) values('7','1234','2016-10-1',0);
insert into prestamo(libro,usuario,fecha,entregado) values('1','1234','2016-11-1',1);
insert into prestamo(libro,usuario,fecha,entregado) values('4','1234','2016-2-1',1);
insert into prestamo(libro,usuario,fecha,entregado) values('7','1234','2016-3-1',1);

insert into prestamo(libro,usuario,fecha,entregado) values('7','4321','2016-10-1',0);




