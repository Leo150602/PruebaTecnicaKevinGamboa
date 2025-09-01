import styled from "styled-components"
import { buscarMarcasPorCliente } from "../utils/consumoServicios"
import { useEffect, useState } from "react";


export function Th({atributo}){

    return(
        <EstiloTh>
            {atributo}
        </EstiloTh>
    )

}
const EstiloTh = styled.th`
    
    
    border: solid black 2px;
    padding: 10px;
    margin: 0;
    min-width: 100px;
    background-color: rgb(223, 215, 215);
`

export function Td({valor}){

    return(

        <EstiloTd>
            {valor}
        </EstiloTd>

    )

}
const EstiloTd = styled.td`
    
    border: solid black 2px;
    padding: 10px;
    margin: 0;
    width: auto;
    background-color: rgb(204, 221, 236);
`

export function TdMarcas({idCliente}){

    const [listaMarcas, setListaMarcas] = useState([]);

    useEffect(() => {
        const obtenerMarcas = async () => {
      
            const marcas = await buscarMarcasPorCliente(idCliente);
            setListaMarcas(marcas)
      
        };

      obtenerMarcas();
  
    }, [idCliente])

    return(

        <EstiloMarca>
            <ul>
            {listaMarcas.map((marca, index) => (
                <li key={index}>{marca.marca}</li>
            ))}
            </ul>
        </EstiloMarca>

    )

}
const EstiloMarca = styled.td`
    
    border: solid black 2px;
    padding: 10px;
    margin: 0;
    min-width: 200px;
    background-color: rgb(33, 83, 124);
    color: white;
`