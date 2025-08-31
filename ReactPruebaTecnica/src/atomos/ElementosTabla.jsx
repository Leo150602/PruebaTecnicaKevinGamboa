import styled from "styled-components"

export function Th({atributo}){

    return(
        <EstiloTh>
            {atributo}
        </EstiloTh>
    )

}
const EstiloTh = styled.th`
    
    min-width: 80px;
    border: solid black 2px;
    padding: 10px;
    margin: 0;
    width: 90px;
    background-color: rgb(223, 215, 215);
`

export function Td({valor}){

    return(

        <EstiloTd>
            <td>{valor}</td>
        </EstiloTd>

    )

}
const EstiloTd = styled.th`
    
    border: solid black 2px;
    padding: 10px;
    margin: 0;
    width: 90px;
    background-color: rgb(204, 221, 236);
`
