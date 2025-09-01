
import { InputFormularioDiv } from "./inputFormulario"
export function InputDateFormulario(props){

    return (

        <InputFormularioDiv>

            <input type="date" name={props.nombre} autoComplete="new-password" id={props.id} className="entrada" />
        
        </InputFormularioDiv>

    )

}
