import { SeccionSidebar } from "../moleculas/SeccionSidebar"
import styled from "styled-components";
import Switch from "../moleculas/Switch";
import { UsarTema } from "../Context/contextTema";
export function Sidebar(){
    const { modoOscuro } = UsarTema();

    return(

        <SideBar $modoOscuro={!modoOscuro}>

        <Secciones>

            <SeccionSidebar nombre={"Registro"} ruta="/" />

            <SeccionSidebar nombre={"Clientes"} ruta="/clientes" />
     

            <Switch></Switch>

        </Secciones>


        </SideBar>

    )
}
const SideBar = styled.div`

    background-color: ${(props) => (props.$modoOscuro ? "#070816" : "#e7e7f0")};
    width: 15%;
    overflow-y: hidden;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    transition: all 0.5s;
    padding: 10px;
`

const Secciones = styled.div`

    height: auto;
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
    
    

`