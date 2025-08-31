import { buscarClientes, registrarCliente } from "./consumoServicios";
import { useListaMarcas } from "../moleculas/Marcas";
import { useState, useEffect} from "react";
import { ExpresionesRegulares } from "./ExpresionesRegulares";


export function ValidarFormulario({escojido, envioErrores}){

    const [validado, setValidado] = useState([])

    let agregarLista = (nombre) => {
        setValidado((prevValidado) => {
            if (!prevValidado.includes(nombre)) {
                return [...prevValidado, nombre];
            }
            return prevValidado;
        });
    };
    
    let sacarLista = (nombre) => {
        setValidado((prevValidado) => prevValidado.filter((elemento) => elemento !== nombre));
    };
    

    const validar= async()=>{
        const entradas = document.getElementsByClassName("entrada")
        const numeroID = document.getElementById("numeroIdentificacion")
    
        const datos = await buscarClientes()
        let copia = []
        datos.forEach(dato=>console.log(dato));
        copia = [...datos]
        


        Array.from(entradas).forEach(entrada=>{
         

            if (ExpresionesRegulares[entrada.name].test(entrada.value)) {
               
                entrada.className ="entrada"
                sacarLista(entrada.name)

            }else{

                agregarLista(entrada.name)
                entrada.className ="noPasa entrada"
            

            }

        })
        
        Array.from(entradas).forEach(entrada => {    
            if (entrada.id == "numeroIdentificacion") {
                copia.forEach(dato=>{

                    if (dato.numeroIdentificacion == numeroID.value.trim() ) {
                        console.log("no se pudo");
                        agregarLista(entrada.name)
                    }
                })
            }           
        }); 
    }

    useEffect(() => {

        console.log(validado);
        
        envioErrores(validado)
        if(validado.length==0 && escojido!=0){

            const entradas = document.getElementsByClassName("entrada")

            const entradasNumericas =["pais", "departamento","tipoIdentificacion","ciudad"]
            let datosCliente = {}
            Array.from(entradas).forEach(entrada => {
                
                if (entradasNumericas.includes(entrada.name)) {
                    datosCliente[entrada.name] = parseFloat(entrada.value)
                }else datosCliente[entrada.name] = entrada.value
                
            });

            console.log(datosCliente);
            
            let datosListos = JSON.stringify(datosCliente)

            registrarCliente(datosListos).then(function (respuesta){
                
            })

            Swal.fire({
                title: "Drag me!",
                icon: "success",
                draggable: true
            })

        }}
        ,[validado])

    return(
        <button onClick={validar} type="button">Enviar</button>
    )
}
