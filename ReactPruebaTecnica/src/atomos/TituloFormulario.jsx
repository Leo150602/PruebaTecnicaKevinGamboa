import styled from "styled-components"

export function TituloFormulario({nombreTitulo}){
    return (

        <TituloFormularioDiv>

            <label htmlFor="">{nombreTitulo}:</label>

        </TituloFormularioDiv>

    )
}

const TituloFormularioDiv=styled.div`

    width: 100%;
    font-weight: bold;
    text-align: right;
    align-content: center;
    
    label{

        margin-right: 10px;

    }

`


