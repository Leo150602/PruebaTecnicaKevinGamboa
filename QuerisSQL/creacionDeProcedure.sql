use BaseDeDatosPruebaTecnica;

DELIMITER $$
create procedure introducirCliente( in entradaTipoIdentificacion int,
									in entradaNumeroIdentificacion int,
                                    in entradaNombresCliente char(30),
                                    in entradaApellidosCliente char(30),
                                    in entradaFechaNacimiento date,
                                    in entradaDireccion varchar(30),
                                    in entradaPais int,
                                    in entradaDepartamento int,
                                    in entradaCiudad int)
begin

	insert into cliente (idTipoIdentificacion, numeroIdentificacion, nombresCliente, apellidosCliente, fechaNacimiento, direccion, idPais, idDepartamento, idCiudad)
    values ( entradaTipoIdentificacion, entradaNumeroIdentificacion, entradaNombresCliente, entradaApellidosCliente, entradaFechaNacimiento, entradaDireccion, entradaPais, entradaDepartamento, entradaCiudad );

end$$

DELIMITER ;

DELIMITER $$
create procedure introducirMarcaPorCliente( in clienteId int,
											in marcaId int)
begin

	insert into clientemarca (idCliente, idMarca)
	values(clienteId, marcaId);

end$$

DELIMITER ;

DELIMITER $$
create procedure mostrarTodosClientes()
begin

	select c.idCliente, 
    c.nombresCliente, 
    c.apellidosCliente, 
    ti.tipoIdentificacion, 
    c.numeroIdentificacion, 
    c.fechaNacimiento,
    c.direccion,
    p.pais,
    d.departamento,
    ciu.ciudad
    from cliente c
    inner join tipoIdentificacion ti on c.idTipoIdentificacion = ti.idTipoIdentificacion
    inner join pais p on c.idPais = p.idPais
    inner join departamento d on c.idDepartamento = d.idDepartamento
    inner join ciudad ciu on c.idCiudad = ciu.idCiudad;

end$$

DELIMITER ;

DELIMITER $$
create procedure mostrarMarcaPorCliente( in ClienteID int )
begin

	select m.idMarca,
    m.marca
	from marca m
	inner join clientemarca cm on cm.idMarca = m.idMarca
	where ClienteID = cm.idCliente;

end$$

DELIMITER ;

DELIMITER $$
create procedure actualizarCliente(
    in entradaIdCliente int,
    in entradaTipoIdentificacion int,
    in entradaNumeroIdentificacion int,
    in entradaNombresCliente char(30),
    in entradaApellidosCliente char(30),
    in entradaFechaNacimiento date,
    in entradaDireccion varchar(30),
    in entradaPais int,
    in entradaDepartamento int,
    in entradaCiudad int
)
begin

    update cliente
    set idTipoIdentificacion = entradaTipoIdentificacion,
        numeroIdentificacion = entradaNumeroIdentificacion,
        nombresCliente = entradaNombresCliente,
        apellidosCliente = entradaApellidosCliente,
        fechaNacimiento = entradaFechaNacimiento,
        direccion = entradaDireccion,
        idPais = entradaPais,
        idDepartamento = entradaDepartamento,
        idCiudad = entradaCiudad
    where idCliente = entradaIdCliente;

end$$

DELIMITER ;

DELIMITER $$
create procedure eliminarMarcaPorCliente( in clienteId int,
											in marcaId int)
begin

	delete from clientemarca
	where idCliente = clienteId and idMarca = marcaId;

end$$

DELIMITER ;

DELIMITER $$
create procedure eliminarCliente( in clienteId int )
begin

	delete from cliente
    where idCliente = clienteId;
    
    delete from clientemarca
    where idCliente = clienteId;

end$$

DELIMITER ;

DELIMITER $$
create procedure mostrarPaises()
begin

	select idPais, pais from pais;

end$$

DELIMITER ;

DELIMITER $$
create procedure mostrarDepartamentos(in paisId int)
begin

	select idDepartamento,
    departamento 
    from departamento 
    where idPais = paisId;

end$$

DELIMITER ;

DELIMITER $$
create procedure mostrarCiudades(in departamentoId int)
begin

	select idCiudad,
    ciudad 
    from ciudad
    where idDepartamento = departamentoId;

end$$

DELIMITER ;

DELIMITER $$
create procedure mostrarTipoIdentificacion(in tipoIdentificacionId int)
begin

	select idTipoIdentificacion,
    tipoIdentificacion 
    from tipoindentificacion
    where idTipoIdentificacion = tipoIdentificacionId;

end$$

DELIMITER ;
