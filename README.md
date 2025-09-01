# PruebaTecnicaKevinGamboa
este repositorio es exclusivo para la prueba técnica que estoy realizando para GCO, se creo el día 22 de agosto y cuenta con un back, un front y una base de datos

esta prueba tecnica fue realizada con la intencion de administrar datos de los clientes que se registren en un programa de fidelidad.

Tecnologias utilizadas:
    - FRONT -> react
    - BACK -> Spring Boot
    - BASE DE DATOS -> MySQL

la persona que descargue la prueba tecnica deberia:
    1. iniciarSecion en MySQL con su cuenta y contraseña
    2. ejecutar el query que se encuenta en la carpeta "QuerisSQL"
    3. abrir la carpeta "BackPruebaTecnica" en su entorno de desarrollo y en "application.properties" que esta en la carpeta de "resources" poner su usuario y contraseña de MySQL en los campos faltantes
    4. correr el back desde "BackPruebaTecnicaApplication" que se encuentra en el packete dentro de la carpeta "java"
    5. en una consola que este direccionada a la carpeta "ReactPruebaTecnica" ejecutar el comando "npm run dev"
    6. entrar al localHost que solicita la consola

Base De Datos:
    en la base de datos opte por manejar todos los elementos del CRUD en Procedures (procedimientos) entonces, luego de crear las tablas necesarias y bien normalizadas, cree dichos procedures para la insercion, edicion, visualizacion (consultas) y eliminacion de registros en la base de datos, mi intencion con esto era facilitar en medida el trabajo que se hace en el back, siendo que gracias a que los procedures realizann todo lo relacionado al CRUD el back solo tendria que llamarlos y darle los datos necesarios, al final del query esta una insercion de datos basicos para el funcionamieto de la pagina y 3 registros de usuario de ejemplo

Back:
    en el back como dije antes tiene la funcion de llamar los procedures de la base de datos y darle los datos necesarios siempre que estos sean llamados por el fornt, mi back esta establecido en una arquitectura por capas (modelos, repositorios, servicios, controladores), los modelos creados, varian entre los que se usan en el parametro del "JpaRepository" y los que se usan como molde para que los datos que llegan del fron encajen perfectamente con los necesarios para los procedures, veran talvez que hay una gran cantidad de cada uno en sus respectivos paquetes, pero la idea de agruparlos se me presento en un momento avanzado del proyecto y solo los repositorios tuvieron un cambio en ese sentido.

Front:
    en el fron como mencione antes use react, hice una pagina que cuenta con un sidebar para manejar que paginas se vera en las rutas y un switch que cambia, mediante los estados, los estilos que tiene la sidebar (claro y oscuro), mi proyecto cuenta con 2 rutas, la pagina de registro y una pagina de clientes, en la de registro el usuario/puede seleccionar en cual de las marcas disponibles le gustaria registrarse y luego debera llenar un formulario que tiene ciertas medidas (expresiones regulares que estan en la carpeta de utils) para que sean llenados de forma ideal, ademas de una pequeña verificacion para que no se repitan numeros de documentos con los de clientes ya registrados. En la segunda pagian (clientes) encontrar algo que es mas de administrador y es basicamente una tabla que se rellena con los registros de los usuarios y las marcas a los que estos estan registrados.

conclusiones: 
    el proyecto que realice cumple con la solicitud encargada, sin embargo tiene el proposito, en cuanto a el back y los procedures almacenados, de manejar los elementos del crud por completo, siguiendo la estructura de las rutas, se podrian añadir otras en las que sea posible implementar los otros elementos faltantes (Update y Delete) que por el tiempo establecido para la prueba no me fue posible ralizar y tambien se recomienda la organizacion y agrupacion de todos los archivos que se encuentran el los paquetes del back para una arquitectura en capas mucho mas limpia  