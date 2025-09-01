import styled from "styled-components"
import { MensajeError } from "../atomos/MensajeError"

export function DivError({mensajeError, error, nombre}){

    let esError = error.includes(nombre)
    return(

        <ContenedorError className={esError?"incorrecto":"correcto"}>

            <MensajeError mensajeError={mensajeError}/>

        </ContenedorError>

    )

}
const ContenedorError = styled.div`
    

    width: 100%;
    position: relative;

`