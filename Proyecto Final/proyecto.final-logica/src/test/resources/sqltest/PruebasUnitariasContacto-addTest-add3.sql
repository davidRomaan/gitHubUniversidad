insert into db_proyectofinalpruebas.t_departamento(ID_CIUDAD,NOMBRE)values(1,'Quindio')
insert into db_proyectofinalpruebas.t_ciudad(ID_CIUDAD,NOMBRE,ID_DEPARTAMENTO)values(1,'Armenia',1)
insert into db_proyectofinalpruebas.t_sectorlaboral(ID_SECTOR,NOMBRE_SECTOR)values(1,'sector industrial')
INSERT INTO `db_proyectofinalpruebas`.`t_empresa` (`ID_EMPRESA`, `DIRECCION_EMPRESA`,
`NIT_EMPRESA`, `PAIS_EMPRESA`, `RAZON_SOCIAL_EMPRESA`, `TELEFONO_EMPRESA`, `TIPO`,
`WEB_EMPRESA`, `ID_CIUDAD`, `ID_SECTOR`) VALUES ('1', 'por ahi', '23', 'colombia',
'claro', '234423', 'PRIVADA', 'DFHSH', '1', '1');

