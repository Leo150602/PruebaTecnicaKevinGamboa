import styled from "styled-components"
import { CuerpoTabla, Encabezado } from "../moleculas/PartesTabla"

export function Clientes(){
    return(

        <ClientesDiv>
            <h1>clientes</h1>

            <div className="contenido">
                <table>
                    <Encabezado/>
                    <CuerpoTabla/>

                </table>
            </div>
            
        </ClientesDiv>

    )
}
const ClientesDiv = styled.div`
    
    h1{
        top: auto;
        position: sticky;
        left: 50%;
        transform: translateX(-50%);
        width: 150px;
        text-align: center;
        background-color: white;

    }
    background-color: white;
    width: 80%;
    height: 90vh;
    overflow-y: auto;
    border: solid black 2px;
    padding: 20px;
    text-align: center;
    align-items: center;
    
`