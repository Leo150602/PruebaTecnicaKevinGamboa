import styled from "styled-components"

export function InputFormulario(props){
    return(
        <InputFormularioDiv>
            <input type={props.tipo} name={props.nombre} autoComplete="new-password" id={props.id} className="entrada" />
        </InputFormularioDiv>
    )
}
export const InputFormularioDiv = styled.div`

    padding: 5px;
    width: 100%;
    align-content: center;
    align-items: center;
    margin-top: 10px;

    input{
        padding: 5px;
        width: 100%;
        
    }

`


