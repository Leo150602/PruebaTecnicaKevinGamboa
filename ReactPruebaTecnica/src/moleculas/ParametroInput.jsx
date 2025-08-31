import { TituloFormulario } from "../atomos/tituloFormulario"
import { InputFormulario } from "../atomos/inputFormulario"
import styled from "styled-components"
import { DivError } from "./DivError"

export function ParametroInput(props){

    return(

        <ParametroInputDiv>
        
            <TituloFormulario nombreTitulo={props.nombreTitulo}/>
            <InputFormulario tipo={props.tipo} nombre={props.nombre} id={props.nombre} />
            <DivError mensajeError={props.mensajeError} error={props.error} nombre={props.nombre}/>
        
        </ParametroInputDiv>

    )

}

const ParametroInputDiv = styled.div`

    display: grid;
    grid-template-columns: 50% 1fr;
    margin-bottom: 10px;
    

    .correcto{

    display: none;
    

    }

    .incorrecto{

    display: block;
    grid-column: 2;

    }
    

`


