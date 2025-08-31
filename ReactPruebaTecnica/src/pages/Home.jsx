import styled from "styled-components"
import { ParametroInput } from "../moleculas/ParametroInput"
import { ParametroSelectTipoIdentificacion, ParametroSelectPaises, ParametroSelectDepartamentos, ParametroSelectCiudades } from "../moleculas/ParametrosSelect"
import { ParametroInputDate } from "../moleculas/ParametroInputDate"
import { ValidarFormulario } from "../utils/validarFormulario"
import { Marcas, useListaMarcas } from "../moleculas/Marcas"
import americanino from "../assets/americanino.png"
import americanEagle from  "../assets/americanEagle.png"
import chevignon from "../assets/chevignon.png"
import esprit from "../assets/esprit.png"
import nafNaf from "../assets/nafNaf.png"
import rifle from "../assets/rifle.png"
import { useState } from "react";

export function Home(){

    const {escojidos, agregarListaMarcas } = useListaMarcas()
    const [idPais, setIdPais] = useState("");
    const [idDepartamento, setIdDepartamento] = useState("");
    const [error, seterror] = useState([]);


    return(
        <PaginaInicio>

            <h1>Bienvenido a GCO</h1>
           
            <p>Conjunto de empresas del sector textil con representación, y/o producción y comercialización para Colombia de las marcas Chevignon, Naf Naf, Americanino, Esprit, Rifle, American Eagle, MNG.</p>

            <h2>¿en cuales empresas te gustaria registrarte?</h2>
            <div className="empresas">

                <Marcas imagen={americanino} nombre="Americanino" marca="1" escojidos={escojidos} agregarListaMarcas={agregarListaMarcas} />
                <Marcas imagen={americanEagle} nombre="American Eagle" marca="2" escojidos={escojidos} agregarListaMarcas={agregarListaMarcas} />
                <Marcas imagen={chevignon} nombre="Chevignon" marca="3" escojidos={escojidos} agregarListaMarcas={agregarListaMarcas} />
                <Marcas imagen={esprit} nombre="Esprit" marca="4" escojidos={escojidos} agregarListaMarcas={agregarListaMarcas} />
                <Marcas imagen={nafNaf} nombre="Naf Naf" marca="5" escojidos={escojidos} agregarListaMarcas={agregarListaMarcas} />
                <Marcas imagen={rifle} nombre="Rifle" marca="6" escojidos={escojidos} agregarListaMarcas={agregarListaMarcas} />
                

            </div>
            <div className="formularioDiv" style={{ display: escojidos.length === 0 ? "none" : "block" }}>
                <h1>Datos De Inscripcion</h1>
                <form >
                        
                    <div className="formulario" >

                        <ParametroInput nombreTitulo="Nombres Cliente" tipo="text" nombre="nombresCliente" mensajeError="el nombre solo puede contener letras" error={error} />
                        <ParametroInput nombreTitulo="Apellidos Cliente" tipo="text" nombre="apellidosCliente" mensajeError="el nombre solo puede contener letras" error={error} />
                        <ParametroSelectTipoIdentificacion nombreTitulo="Tipo Identificación" nombre="tipoIdentificacion" mensajeError="seleccione un tipo de identificacion" error={error} />
                        <ParametroInput nombreTitulo="Número Identificación" tipo="number" nombre="numeroIdentificacion" mensajeError="el numero de identificacion ya esta registrado, escoja otro" error={error} />
                        <ParametroInputDate nombreTitulo="Fecha Nacimiento" nombre="fechaNacimiento" mensajeError="seleccione una fecha de nacimiento" error={error} />
                        <ParametroInput nombreTitulo="Dirección" tipo="text" nombre="direccion" mensajeError="la direccion no es valida" error={error} />   
                        <ParametroSelectPaises nombreTitulo="País" nombre="pais" onChange={(e) => setIdPais(e.target.value)} mensajeError="seleccione un pais" error={error} />
                        <ParametroSelectDepartamentos nombreTitulo="Departamento" nombre="departamento" idPais={idPais} onChange={(e) => setIdDepartamento(e.target.value)} mensajeError="seleccione un departamento" error={error}/>
                        <ParametroSelectCiudades nombreTitulo="Ciudad" nombre="ciudad" idDepartamento={idDepartamento} mensajeError="seleccione una ciudad" error={error} />
                        
                    </div>
                    <ValidarFormulario escojidos={escojidos} envioErrores={(errores=>seterror(errores))}/>
                </form>
            </div>
            

        </PaginaInicio>
    )

}

const PaginaInicio = styled.div`

    background-color: white;
    width: 83%;
    height: 90vh;
    overflow-y: auto;
    border: solid black 2px;
    padding: 20px;
    text-align: center;
    align-items: center;
    
    
    .formularioDiv{
        width: 100%;
        display: block;
        
    }

    .empresas{
        width: 90%;
        border: solid black 1px;
        height: auto;
        margin: calc(5% - 20px);
        padding: 20px;
        display: flex;
        flex-wrap: wrap;
        justify-content:flex-start;
        gap: 20px;
        
    }

    h1{
        width: 100%;
    }

    form{
        width: 100%;
       button{
        margin-top: 10px;
            text-align: center;
            padding: 10px;
            background-color: #7697f3;
        } 

        .noPasa{
            border:solid red 2px;
            background-color:#ff7474;
        }
    }
    .formulario{
       
        padding-right: 10%;
        gap: 20px 40px; 
        width: 80%;
        max-width: 700px;
        margin-top: 20px;

        input,select{
            padding: 5px;
            width: 100%;
        }
        
    }

`