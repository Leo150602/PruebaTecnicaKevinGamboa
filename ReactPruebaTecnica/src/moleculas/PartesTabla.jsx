import { Th } from "../atomos/ElementosTabla";

export function Encabezado(){

    return(

        <thead>
            <tr>

                <Th atributo="ID" />
                <Th atributo="NOMBRES" />
                <Th atributo="APELLIDOS" />
                <Th atributo="TIPO DE IDENTIFICACION" />
                <Th atributo="NUMERO DE IDENTIFICACION" />
                <Th atributo="FECHA DE NACIMIENTO" />
                <Th atributo="PAIS" />
                <Th atributo="DEPARTAMENTO" />
                <Th atributo="CIUDAD" />
                <Th atributo="DIRECCION" />

            </tr>
        </thead>
        

    )

}

export function cuerpoTabla(){

    return(

        <tbody>

            

        </tbody>

    )

}

