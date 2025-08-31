import {Routes,Route} from "react-router-dom"
import { Home } from "../pages/Home"
import styled from "styled-components"
import { Clientes } from "../pages/Clientes"
export function MyRoutes(){
    return(
        <Paginas>

            <Routes>

                <Route path="" element={<Home/>} />
                <Route path="/Clientes" element={<Clientes/>} />
                <Route path="/Paises" element={<Home/>} />

            </Routes>
            
        </Paginas>
    )
}
const Paginas = styled.div`
    
    margin: 0;
    padding: 0;
    display: flex;
    width: 85%;
    height: 100%;
    align-items: center;
    justify-content: center;
    
    Routes{
        height: 100%;
        align-items: center;
        justify-content: center;
    }

`