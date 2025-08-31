import styled from "styled-components";
import { UsarTema } from "../Context/contextTema";
export function Titulo({titulo}){
    const { modoOscuro } = UsarTema();

    return(
        <AtomoTitulo $modoOscuro={!modoOscuro}>
            <h4>{titulo}</h4>
        </AtomoTitulo>

    )

}
const AtomoTitulo = styled.div`

    color: ${(props)=>(props.$modoOscuro?"white":"black")};
    text-align: center;
    width: 100%;
    transition: all 0.5s;
h4{
    letter-spacing: 3px ;
    font-weight: 600;
    user-select: none;
}
`