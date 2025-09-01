import styled from "styled-components"

export function MensajeError({mensajeError}){

    return(

        <LabelError>{mensajeError}</LabelError>

    )

}
const LabelError = styled.label`

color: #838080;
font-size: 12px;

`