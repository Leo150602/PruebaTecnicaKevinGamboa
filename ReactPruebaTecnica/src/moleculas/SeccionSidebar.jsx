import { Titulo } from "../atomos/titulo";
import styled from "styled-components";
import { UsarTema } from "../Context/contextTema";
import { Link } from "react-router-dom";
export function SeccionSidebar(props){
    const { modoOscuro } = UsarTema();
    return(

        <Div $modoOscuro={!modoOscuro}>

            
            <Link to={props.ruta}><Titulo titulo={props.nombre}></Titulo> </Link>
        
        </Div>

    )
}
const Div = styled.div`

    background-color: ${(props)=>(props.$modoOscuro?"#070816" : "#e7e7f0")};
    text-align: center;
    align-items: center;
    display: flex;
    width: 100%;
    height: auto;
    margin: 10px 0;
    transition: all 0.5s;
    
    flex: 1;
    &:hover{
       cursor: pointer; 
    } 

  a{
    border: solid ${(props)=>(props.$modoOscuro?"gray":"black")} 2px;
    border-radius: 10px;
    width: 100%;
    display: flex;
    text-align: center;
    align-items: center;
    justify-content: center;
    text-decoration: none;  
    }


`

