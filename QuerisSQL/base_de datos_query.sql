create database base_de_datos_prueba_tecnica;
use base_de_datos_prueba_tecnica;


create table pais (
    id_pais int not null primary key auto_increment,
    pais char(30) not null
);

create table departamento (
    id_departamento int not null primary key auto_increment,
    departamento char(30) not null,
    id_pais int not null,
    foreign key (id_pais) references pais(id_pais)
);

create table ciudad (
    id_ciudad int not null primary key auto_increment,
    ciudad char(30) not null,
    id_departamento int not null,
    foreign key (id_departamento) references departamento(id_departamento)
);

create table tipo_identificacion (
    id_tipo_identificacion int not null primary key auto_increment,
    tipo_identificacion char(30) not null
);

create table marca (
    id_marca int not null primary key auto_increment,
    marca char(30) not null
);

create table cliente (
    id_cliente int not null primary key auto_increment,
    id_tipo_identificacion int not null,
    numero_identificacion int not null,
    nombres_cliente char(30) not null,
    apellidos_cliente char(30) not null,
    fecha_nacimiento date null,
    direccion varchar(30) null,
    id_pais int not null,
    id_departamento int not null,
    id_ciudad int not null,
    foreign key (id_tipo_identificacion) references tipo_identificacion(id_tipo_identificacion),
    foreign key (id_pais) references pais(id_pais),
    foreign key (id_departamento) references departamento(id_departamento),
    foreign key (id_ciudad) references ciudad(id_ciudad)
);

create table cliente_marca (
    id_cliente int not null,
    id_marca int not null,
    primary key (id_cliente, id_marca),
    foreign key (id_cliente) references cliente(id_cliente),
    foreign key (id_marca) references marca(id_marca)
);
DELIMITER $$
create procedure introducir_cliente(
    in entrada_id_tipo_identificacion int,
    in entrada_numero_identificacion int,
    in entrada_nombres_cliente char(30),
    in entrada_apellidos_cliente char(30),
    in entrada_fecha_nacimiento date,
    in entrada_direccion varchar(30),
    in entrada_id_pais int,
    in entrada_id_departamento int,
    in entrada_id_ciudad int
)
begin
    insert into cliente (
        id_tipo_identificacion, 
        numero_identificacion, 
        nombres_cliente, 
        apellidos_cliente, 
        fecha_nacimiento, 
        direccion, 
        id_pais, 
        id_departamento, 
        id_ciudad
    )
    values (
        entrada_id_tipo_identificacion, 
        entrada_numero_identificacion, 
        entrada_nombres_cliente, 
        entrada_apellidos_cliente, 
        entrada_fecha_nacimiento, 
        entrada_direccion, 
        entrada_id_pais, 
        entrada_id_departamento, 
        entrada_id_ciudad
    );
end$$
DELIMITER ;

DELIMITER $$
create procedure introducir_marca_por_cliente(
    in entrada_id_cliente int,
    in entrada_id_marca int
)
begin
    insert into cliente_marca (id_cliente, id_marca)
    values(entrada_id_cliente, entrada_id_marca);
end$$
DELIMITER ;

DELIMITER $$
create procedure introducir_pais(
    in entrada_pais char(30)
)
begin
    insert into pais (pais)
    values(entrada_pais);
end$$
DELIMITER ;

DELIMITER $$
create procedure introducir_departamento(
	in entrada_id_pais int,
    in entrada_departamento char(30)
    
)
begin
    insert into departamento (id_pais, departamento)
    values(entrada_id_pais, entrada_departamento);
end$$
DELIMITER ;

DELIMITER $$
create procedure introducir_ciudad(
	in entrada_id_departamento int,
    in entrada_ciudad char(30)
    
)
begin
    insert into departamento (id_departamento, ciudad)
    values(entrada_id_departamento, entrada_ciudad);
end$$
DELIMITER ;

DELIMITER $$
create procedure mostrar_todos_clientes()
begin
    select 
        c.id_cliente, 
        c.nombres_cliente, 
        c.apellidos_cliente, 
        ti.tipo_identificacion, 
        c.numero_identificacion, 
        c.fecha_nacimiento,
        c.direccion,
        p.pais,
        d.departamento,
        ciu.ciudad
    from cliente c
    inner join tipo_identificacion ti on c.id_tipo_identificacion = ti.id_tipo_identificacion
    inner join pais p on c.id_pais = p.id_pais
    inner join departamento d on c.id_departamento = d.id_departamento
    inner join ciudad ciu on c.id_ciudad = ciu.id_ciudad;
end$$
DELIMITER ;

DELIMITER $$
create procedure mostrar_marcas_por_cliente(
    in entrada_id_cliente int
)
begin
    select 
        m.id_marca,
        m.marca
    from marca m
    inner join cliente_marca cm on cm.id_marca = m.id_marca
    where cm.id_cliente = entrada_id_cliente;
end$$
DELIMITER ;

DELIMITER $$
create procedure actualizar_cliente(
    in entrada_id_cliente int,
    in entrada_id_tipo_identificacion int,
    in entrada_numero_identificacion int,
    in entrada_nombres_cliente varchar(30),
    in entrada_apellidos_cliente varchar(30),
    in entrada_fecha_nacimiento date,
    in entrada_direccion varchar(30),
    in entrada_id_pais int,
    in entrada_id_departamento int,
    in entrada_id_ciudad int
)
begin
    update cliente
    set id_tipo_identificacion = entrada_id_tipo_identificacion,
        numero_identificacion = entrada_numero_identificacion,
        nombres_cliente = entrada_nombres_cliente,
        apellidos_cliente = entrada_apellidos_cliente,
        fecha_nacimiento = entrada_fecha_nacimiento,
        direccion = entrada_direccion,
        id_pais = entrada_id_pais,
        id_departamento = entrada_id_departamento,
        id_ciudad = entrada_id_ciudad
    where entrada_id_cliente = id_cliente;
end$$
DELIMITER ;

DELIMITER $$
create procedure eliminar_marca_por_cliente(
    in entrada_id_cliente int,
    in entrada_id_marca int
)
begin
    delete from cliente_marca
    where id_cliente = entrada_id_cliente 
      and id_marca = entrada_id_marca;
end$$
DELIMITER ;

DELIMITER $$
create procedure eliminar_cliente(
    in entrada_id_cliente int
)
begin
    delete from cliente_marca
    where id_cliente = entrada_id_cliente;

    delete from cliente
    where id_cliente = entrada_id_cliente;
end$$
DELIMITER ;

DELIMITER $$
create procedure mostrar_paises()
begin
    select id_pais, pais 
    from pais;
end$$
DELIMITER ;

DELIMITER $$
create procedure mostrar_departamentos(
    in entrada_id_pais int
)
begin
    select id_departamento,
           departamento 
    from departamento 
    where id_pais = entrada_id_pais;
end$$
DELIMITER ;

DELIMITER $$
create procedure mostrar_ciudades(
    in entrada_id_departamento int
)
begin
    select id_ciudad,
           ciudad 
    from ciudad
    where id_departamento = entrada_id_departamento;
end$$
DELIMITER ;

DELIMITER $$
create procedure mostrar_tipo_identificacion()
begin
    select id_tipo_identificacion,
           tipo_identificacion 
    from tipo_identificacion;
end$$
DELIMITER ;


-- Tabla tipo_identificacion
INSERT INTO tipo_identificacion (id_tipo_identificacion, tipo_identificacion) VALUES
(1, 'Cédula de Ciudadanía'),
(2, 'Tarjeta de Identidad'),
(3, 'Pasaporte'),
(4, 'Cédula de Extranjería');


INSERT INTO pais (id_pais, pais) VALUES
(1, 'Colombia'),
(2, 'México'),
(3, 'Argentina'),
(4, 'España');

-- Tabla departamentos
INSERT INTO departamento (id_departamento, departamento, id_pais) VALUES
-- Colombia
(1, 'Cundinamarca', 1),
(2, 'Antioquia', 1),
(3, 'Valle del Cauca', 1),
(4, 'Santander', 1),
(5, 'Bolívar', 1),
(6, 'Atlántico', 1),
-- México
(7, 'Jalisco', 2),
(8, 'Nuevo León', 2),
(9, 'Ciudad de México', 2),
(10, 'Puebla', 2),
(11, 'Yucatán', 2),
(12, 'Chiapas', 2),
-- Argentina
(13, 'Buenos Aires', 3),
(14, 'Córdoba', 3),
(15, 'Santa Fe', 3),
(16, 'Mendoza', 3),
(17, 'Tucumán', 3),
(18, 'Salta', 3),
-- España
(19, 'Madrid', 4),
(20, 'Cataluña', 4),
(21, 'Andalucía', 4),
(22, 'Valencia', 4),
(23, 'Galicia', 4),
(24, 'País Vasco', 4);

-- Tabla ciudades
INSERT INTO ciudad (id_ciudad, ciudad, id_departamento) VALUES
-- Colombia
(1, 'Bogotá', 1),
(2, 'Soacha', 1),
(3, 'Chía', 1),
(4, 'Medellín', 2),
(5, 'Envigado', 2),
(6, 'Rionegro', 2),
(7, 'Cali', 3),
(8, 'Palmira', 3),
(9, 'Buenaventura', 3),
(10, 'Bucaramanga', 4),
(11, 'Floridablanca', 4),
(12, 'Girón', 4),
(13, 'Cartagena', 5),
(14, 'Magangué', 5),
(15, 'Turbaná', 5),
(16, 'Barranquilla', 6),
(17, 'Soledad', 6),
(18, 'Malambo', 6),
-- México
(19, 'Guadalajara', 7),
(20, 'Zapopan', 7),
(21, 'Tlaquepaque', 7),
(22, 'Monterrey', 8),
(23, 'San Nicolás', 8),
(24, 'Guadalupe', 8),
(25, 'Ciudad de México', 9),
(26, 'Coyoacán', 9),
(27, 'Tlalpan', 9),
(28, 'Puebla', 10),
(29, 'Tehuacán', 10),
(30, 'Atlixco', 10),
(31, 'Mérida', 11),
(32, 'Valladolid', 11),
(33, 'Tizimín', 11),
(34, 'Tuxtla Gutiérrez', 12),
(35, 'San Cristóbal', 12),
(36, 'Comitán', 12),
-- Argentina
(37, 'La Plata', 13),
(38, 'Mar del Plata', 13),
(39, 'Bahía Blanca', 13),
(40, 'Córdoba', 14),
(41, 'Villa Carlos Paz', 14),
(42, 'Río Cuarto', 14),
(43, 'Rosario', 15),
(44, 'Santa Fe', 15),
(45, 'Rafaela', 15),
(46, 'Mendoza', 16),
(47, 'San Rafael', 16),
(48, 'Godoy Cruz', 16),
(49, 'San Miguel de Tucumán', 17),
(50, 'Tafí Viejo', 17),
(51, 'Concepción', 17),
(52, 'Salta', 18),
(53, 'Orán', 18),
(54, 'Cafayate', 18),
-- España
(55, 'Madrid', 19),
(56, 'Alcalá de Henares', 19),
(57, 'Getafe', 19),
(58, 'Barcelona', 20),
(59, 'Girona', 20),
(60, 'Tarragona', 20),
(61, 'Sevilla', 21),
(62, 'Málaga', 21),
(63, 'Granada', 21),
(64, 'Valencia', 22),
(65, 'Alicante', 22),
(66, 'Castellón', 22),
(67, 'Santiago de Compostela', 23),
(68, 'A Coruña', 23),
(69, 'Vigo', 23),
(70, 'Bilbao', 24),
(71, 'San Sebastián', 24),
(72, 'Vitoria-Gasteiz', 24);

INSERT INTO marca (marca) VALUES
('Americanino'),
('American Eagle'),
('Chevignon'),
('Esprit'),
('Naf Naf'),
('Rifle');


-- Insertar clientes
CALL introducir_cliente(1, 12345678, 'Ejemplo1', 'Apellido1', '1990-01-01', 'Calle 1 #1-1', 1, 1, 1);
CALL introducir_cliente(2, 87654321, 'Ejemplo2', 'Apellido2', '1992-02-02', 'Calle 2 #2-2', 2, 7, 19);
CALL introducir_cliente(3, 11223344, 'Ejemplo3', 'Apellido3', '1994-03-03', 'Calle 3 #3-3', 1, 2, 4);

-- Asociar marcas a los clientes
-- Ejemplo1
CALL introducir_marca_por_cliente(1, 1);
CALL introducir_marca_por_cliente(1, 2);
CALL introducir_marca_por_cliente(1, 3);

-- Ejemplo2
CALL introducir_marca_por_cliente(2, 4);
CALL introducir_marca_por_cliente(2, 5);
CALL introducir_marca_por_cliente(2, 6);

-- Ejemplo3
CALL introducir_marca_por_cliente(3, 1);
CALL introducir_marca_por_cliente(3, 3);
CALL introducir_marca_por_cliente(3, 5);