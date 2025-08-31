import styled from "styled-components";
import { ImgMarca, NombreMarca } from "../atomos/Marca";
import { useState } from "react";

export function useListaMarcas() {
    const [escojido, setEscojido] = useState([]);

    let agregarLista=(valor)=>{

        if(escojido.includes(valor)){
            
            setEscojido(escojido.filter(elemento=>elemento != valor))
            
        }else{
            
            setEscojido([...escojido,valor])
            
        }

    }
  
    return { escojido,  agregarLista };
}

export function Marcas(props){

    return(

        <MarcasDiv onClick={()=>props.agregarLista(props.marca)} $escojido={props.escojido.includes(props.marca)}>

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
        color: ${(props) => (props.$escojido?"green":"black")};
    }
    div{
        border: solid ${(props) => (props.$escojido?"green":"black")} ${(props) => (props.$escojido?"3px":"2px")};
    }
    
    display: flex;
    justify-content: center;
    flex-direction: column;
    gap: 5px;
    width: 100px;
    transition: all 0.5s ease;
    margin: 10px;

`