export async function registrarCliente(datosFormulario) {
    let url="http://localhost:8443/clientes/introducir"

    let peticion ={
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body:datosFormulario
    }

    let respuesta = await fetch(url,peticion)
    return await respuesta.text()
}

export async function buscarClientes() {
    let url= `http://localhost:8443/todosClientes`

    let respuesta = await fetch(url,{
        method: "GET",
        headers: {
            'Content-Type': 'application/json'
        }
    })

    let datos = await respuesta.json()
    let orden = ["idCliente","nombresCliente","apellidosCliente","tipoIdentificacion","numeroIdentificacion","fechaNacimiento","pais","departamento","ciudad","direccion"]
    let datosOrdenados = datos.map(cliente =>
        Object.fromEntries(orden.map(llave => [llave, cliente[llave]]))
    )
    return datosOrdenados
}

export async function buscarTiposIdentificacion() {
    let url= `http://localhost:8443/tipoIdentificacion`

    let respuesta = await fetch(url,{
        method: "GET",
        headers: {
            'Content-Type': 'application/json'
        }
    })
    let datos = await respuesta.json()
    return datos
    
}

export async function buscarPaises() {
    let url= `http://localhost:8443/paises`

    let respuesta = await fetch(url,{
        method: "GET",
        headers: {
            'Content-Type': 'application/json'
        }
    })
    let datos = await respuesta.json()
    return datos
    
}

export async function buscarDepartamentos(idPais) {
    let url= `http://localhost:8443/departamentos/${idPais}`

    let respuesta = await fetch(url,{
        method: "GET",
        headers: {
            'Content-Type': 'application/json'
        }
    })
    let datos = await respuesta.json()
    return datos
    
}

export async function buscarCiudades(idDepartamento) {
    let url= `http://localhost:8443/ciudades/${idDepartamento}`

    let respuesta = await fetch(url,{
        method: "GET",
        headers: {
            'Content-Type': 'application/json'
        }
    })
    let datos = await respuesta.json()
    return datos
    
}

export async function registrarClientesMarca(datosFormulario) {
    let url="http://localhost:8443/marca/introducir"

    let peticion ={
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body:datosFormulario
    }

    let respuesta = await fetch(url,peticion)
    return await respuesta.text()
}

export async function buscarMarcasPorCliente(clienteId) {
    let url= `http://localhost:8443/marcaPorCliente/${clienteId}`

    let respuesta = await fetch(url,{
        method: "GET",
        headers: {
            'Content-Type': 'application/json'
        }
    })
    let datos = await respuesta.json()
    return datos
    
}

export async function introducirPais(datosFormulario) {
    let url="http://localhost:8443/pais/introducir"

    let peticion ={
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body:datosFormulario
    }

    let respuesta = await fetch(url,peticion)
    return await respuesta.text()
}

export async function introducirDepartamento(datosFormulario) {
    let url="http://localhost:8443/departamento/introducir"

    let peticion ={
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body:datosFormulario
    }

    let respuesta = await fetch(url,peticion)
    return await respuesta.text()
}

export async function introducirCiudad(datosFormulario) {
    let url="http://localhost:8443/ciudad/introducir"

    let peticion ={
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body:datosFormulario
    }

    let respuesta = await fetch(url,peticion)
    return await respuesta.text()
}