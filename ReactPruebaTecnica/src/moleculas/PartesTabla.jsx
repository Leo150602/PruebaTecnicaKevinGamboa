import { Th , Td, TdMarcas} from "../atomos/ElementosTabla";
import { buscarClientes } from "../utils/consumoServicios";
import { useState, useEffect } from "react";

export function Encabezado(){

    return(

        <thead>
            <tr>

                <Th atributo="MARCAS" />
                <Th atributo="ID" />
                <Th atributo="NOMBRES" />
                <Th atributo="APELLIDOS" />
                <Th atributo="TIPO DE IDENTIFICACION" />
                <Th atributo="NUMERO DE IDENTIFICACION" />
                <Th atributo="FECHA DE NACIMIENTO" />
                <Th atributo="PAIS" />
                <Th atributo="DEPARTAMENTO" />
                <Th atributo="CIUDAD" />
                <Th atributo="DIRECCION" />
                

            </tr>
        </thead>
        

    )

}

export function CuerpoTabla() {
    const [clientes, setClientes] = useState([]);

    useEffect(() => {
        const fetchClientes = async () => {
            const lista = await buscarClientes();
            setClientes(lista);
        };
        fetchClientes();
    }, []);

    return (
        <tbody>

            
            {clientes.sort((a, b) => a.idCliente - b.idCliente).map(cliente => (
                <tr key={cliente.idCliente}>
                    <TdMarcas idCliente={cliente.idCliente}/>
                    <Td valor={cliente.idCliente} />
                    <Td valor={cliente.nombresCliente} />
                    <Td valor={cliente.apellidosCliente} />
                    <Td valor={cliente.tipoIdentificacion} />
                    <Td valor={cliente.numeroIdentificacion} />
                    <Td valor={cliente.fechaNacimiento} />
                    <Td valor={cliente.pais} />
                    <Td valor={cliente.departamento} />
                    <Td valor={cliente.ciudad} />
                    <Td valor={cliente.direccion} />
                </tr>
            ))}
        </tbody>
    );
}