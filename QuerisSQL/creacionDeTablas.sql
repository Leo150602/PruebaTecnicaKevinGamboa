create database BaseDeDatosPruebaTecnica;
use BaseDeDatosPruebaTecnica;

create table Pais ( idPais int not null primary key auto_increment,
					pais char(20) not null 
);

create table Departamento ( idDepartamento int not null primary key auto_increment,
							departamento char(20) not null,
							idPais int not null,
                            foreign key (idPais) references pais(idPais)
);

create table Ciudad ( idCiudad int not null primary key auto_increment,
							ciudad char(20) not null,
							idDepartamento int not null,
                            foreign key (idDepartamento) references departamento(idDepartamento)
);

create table TipoIdentificacion ( idTipoIdentificacion int not null primary key auto_increment,
									tipoIdentificacion char(20) not null
);

create table Marca ( idMarca int not null primary key auto_increment,
					marca char(20) not null
);

create table Cliente ( idCliente int not null primary key auto_increment,
						idTipoIdentificacion int not null,
                        numeroIdentificacion int not null,
                        nombresCliente char(30) not null,
                        apellidosCliente char(30) not null,
                        fechaNacimiento date null,
                        direccion varchar(30) null,
                        idPais int not null,
                        idDepartamento int not null,
                        idCiudad int not null,
                        foreign key (idTipoIdentificacion) references tipoIdentificacion(idTipoIdentificacion),
                        foreign key (idPais) references pais(idPais),
                        foreign key (idDepartamento) references departamento(idDepartamento),
                        foreign key (idCiudad) references ciudad(idCiudad)
);

create table ClienteMarca ( idCliente int not null,
							idMarca int not null,
                            puntos int not null,
                            primary key(idCliente, idMarca),
                            foreign key(idCliente) references cliente(idCliente),
							foreign key(idMarca) references marca(idMarca)
);





                            