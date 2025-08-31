import styled from "styled-components";
import { ImgMarca, NombreMarca } from "../atomos/Marca";
import { useState } from "react";

export function useListaMarcas() {
    const [escojidos, setEscojido] = useState([]);

    let agregarListaMarcas=(valor)=>{

        if(escojidos.includes(valor)){
            
            setEscojido(escojidos.filter(elemento=>elemento != valor))
            
        }else{
            
            setEscojido([...escojidos,valor])
            
        }

    }
  
    return { escojidos,  agregarListaMarcas };
}

export function Marcas(props){

    return(

        <MarcasDiv onClick={()=>props.agregarListaMarcas(props.marca)} $escojidos={props.escojidos.includes(props.marca)}>

            <ImgMarca imagen={props.imagen} />
            <NombreMarca nombre={props.nombre} />

        </MarcasDiv>

    )

}

const MarcasDiv = styled.div`
    
    &:hover{
        transform: scale(1.15);
        cursor: pointer;
    }

    label{
        color: ${(props) => (props.$escojidos?"green":"black")};
    }
    div{
        border: solid ${(props) => (props.$escojidos?"green":"black")} ${(props) => (props.$escojidos?"3px":"2px")};
    }
    
    display: flex;
    justify-content: center;
    flex-direction: column;
    gap: 5px;
    width: 100px;
    transition: all 0.5s ease;
    margin: 10px;

`