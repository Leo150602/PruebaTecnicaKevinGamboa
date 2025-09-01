import styled from "styled-components"

export function ImgMarca({imagen}){

    return(

        <DivMarca>

            <img src={imagen}/>

        </DivMarca>

    )

}
const DivMarca = styled.div`
    
    display :flex ;
    width: 100px;
    height: 100px;
    border: solid black 2px;
    align-items: center;
    justify-content: center;
    padding: 5px;

    img{
        width: auto;
        height: auto;
        max-width: 100%;
        max-height: 100%;
    }
`

export function NombreMarca({nombre}){

    return(

        <NombreMarcaDiv>

            {nombre}

        </NombreMarcaDiv>

    )

}
const NombreMarcaDiv = styled.label`
    
    width: 100px;
    height: 30px;
    text-align: center;
    justify-content: center;

`