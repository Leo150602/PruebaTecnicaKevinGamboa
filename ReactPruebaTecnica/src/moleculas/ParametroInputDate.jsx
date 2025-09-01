import styled from "styled-components"
import { TituloFormulario } from "../atomos/tituloFormulario"
import { InputDateFormulario } from "../atomos/InputDateFormulario"
import { DivError } from "./DivError"

export function ParametroInputDate(props){

    return(

        <ParametroInputDateDiv>
        
            <TituloFormulario nombreTitulo={props.nombreTitulo}/>
            <InputDateFormulario nombre={props.nombre} id={props.nombre} />
            <DivError mensajeError={props.mensajeError} error={props.error} nombre={props.nombre}/>
        
        </ParametroInputDateDiv>

    )

}
const ParametroInputDateDiv = styled.div`
    
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