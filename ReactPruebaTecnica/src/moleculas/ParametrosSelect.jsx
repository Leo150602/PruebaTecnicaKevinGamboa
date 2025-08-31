import styled from "styled-components";
import { SelectFormularioTiposIdentificacion, SelectFormularioDepartamentos, SelectFormularioPaises, SelectFormularioCiudades } from "../atomos/selectFormulario";
import { TituloFormulario } from "../atomos/tituloFormulario";
import { DivError } from "./DivError"

export function ParametroSelectTipoIdentificacion(props){

    return(

        <ParametroSelectDiv>
            <TituloFormulario nombreTitulo={props.nombreTitulo}  />
            <SelectFormularioTiposIdentificacion nombre={props.nombre}  />
            <DivError mensajeError={props.mensajeError} error={props.error} nombre={props.nombre}/>
        
        </ParametroSelectDiv>

    )


}

export function ParametroSelectPaises(props){

    return(

        <ParametroSelectDiv>
            <TituloFormulario nombreTitulo={props.nombreTitulo}  />
            <SelectFormularioPaises nombre={props.nombre} placeHolder={props.placeHolder} onChange={props.onChange} />
            <DivError mensajeError={props.mensajeError} error={props.error} nombre={props.nombre}/>
        
        </ParametroSelectDiv>

    )


}

export function ParametroSelectDepartamentos(props){

    return(

        <ParametroSelectDiv>
            <TituloFormulario nombreTitulo={props.nombreTitulo}  />
            <SelectFormularioDepartamentos nombre={props.nombre} id={props.nombre} placeHolder={props.placeHolder} idPais={props.idPais} onChange={props.onChange} />
            <DivError mensajeError={props.mensajeError} error={props.error} nombre={props.nombre}/>

        </ParametroSelectDiv>

    )


}
export function ParametroSelectCiudades(props){

    return(

        <ParametroSelectDiv>
            <TituloFormulario nombreTitulo={props.nombreTitulo}  />
            <SelectFormularioCiudades nombre={props.nombre} id={props.nombre} placeHolder={props.placeHolder} idDepartamento={props.idDepartamento} />
            <DivError mensajeError={props.mensajeError} error={props.error} nombre={props.nombre}/>

        </ParametroSelectDiv>

    )

}
const ParametroSelectDiv = styled.div`
    
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
