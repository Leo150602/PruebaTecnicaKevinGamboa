import styled from "styled-components"
import { buscarTiposIdentificacion, buscarPaises, buscarDepartamentos, buscarCiudades } from "../utils/consumoServicios"
import { useState, useEffect } from "react";

export function SelectFormularioTiposIdentificacion(props){
    const [tiposIdentificacion, setTiposIdentificacion] = useState([]);

    useEffect(() => {
        buscarTiposIdentificacion().then((datosTiposIdentificacion) => {
            setTiposIdentificacion(datosTiposIdentificacion);
      });
    }, []);
    
    return (

        <SelectFormularioDiv>

            <select name={props.nombre} className="entrada" defaultValue="">
            <option value="" disabled hidden> Seleccione un tipo de identificacion </option>
                
            {tiposIdentificacion.map((tipoIdentificacion) => (
                <option key={tipoIdentificacion.idTipoIdentificacion} value={tipoIdentificacion.idTipoIdentificacion}>
                    {tipoIdentificacion.tipoIdentificacion}
                </option>
            ))}

            </select>

        </SelectFormularioDiv>
    )

}

export function SelectFormularioPaises(props){
    const [paises, setPaises] = useState([]);

    useEffect(() => {
      buscarPaises().then((datosPaises) => {
        setPaises(datosPaises);
      });
    }, []);
    
    return (

        <SelectFormularioDiv>

            <select name={props.nombre} id={props.id} className="entrada" defaultValue="" onChange={props.onChange}>
            <option value="" disabled hidden> Seleccione un país </option>
                
            {paises.map((pais) => (
                <option key={pais.idPais} value={pais.idPais}>
                    {pais.pais}
                </option>
            ))}

            </select>

        </SelectFormularioDiv>
    )

}


export function SelectFormularioDepartamentos(props){
    const [departamentos, setDepartamentos] = useState([]);    

    useEffect(() => {
        if (props.idPais) { 
          buscarDepartamentos(props.idPais).then((datosDepartamentos) => {
            setDepartamentos(datosDepartamentos);
          });
        } else {
          setDepartamentos([]); 
        }
      }, [props.idPais]);
    
    return (

        <SelectFormularioDiv>

            <select name={props.nombre} id={props.id} className="entrada" onChange={props.onChange} disabled={props.idPais==""} defaultValue="" >
            <option value="" disabled hidden> Seleccione un departamento </option>
                
            {departamentos.map((departamento) => (
                <option key={departamento.idDepartamento} value={departamento.idDepartamento}>
                    {departamento.departamento}
                </option>
            ))}

            </select>

        </SelectFormularioDiv>
    )

}

export function SelectFormularioCiudades(props){
    const [ciudades, setCiudades] = useState([]);    

    useEffect(() => {
        if (props.idDepartamento) { 
            buscarCiudades(props.idDepartamento).then((datosCiudades) => {
                setCiudades(datosCiudades);
          });
        } else {
            setCiudades([]); 
        }
      }, [props.idDepartamento]);
    
    return (

        <SelectFormularioDiv>

            <select name={props.nombre} id={props.id} className="entrada" disabled={props.idDepartamento==""} defaultValue="" >
            <option value="" disabled hidden> Seleccione una ciudad </option>
                
            {ciudades.map((ciudad) => (
                <option key={ciudad.idCiudad} value={ciudad.idCiudad}>
                    {ciudad.ciudad}
                </option>
            ))}

            </select>

        </SelectFormularioDiv>
    )

}
const SelectFormularioDiv = styled.div`
    
    padding: 5px;
    width: 100%;
    align-content: center;
    align-items: center;
    margin-top: 10px;

    select{
        padding: 5px;
        width: 100%;
    }

`