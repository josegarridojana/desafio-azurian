# Spring Boot Desafio azurian

Detalle:

> [Desafio azurian: Build APIs](http://localhost:8088/desafio-azurian/)

> [Desafio azurian: Build Rest APIs Actuator](http://localhost:8088/desafio-azurian/actuator/health)

> [Desafio azurian: Build Rest APIs Swagger]( http://localhost:8088/desafio-azurian/swagger-ui.htm)



 
En esta prueba, crearemos un ejemplo de API CRUD de Spring Boot Rest con Maven que usa Spring Data JPA para interactuar con la base de datos H2 en memoria. 

Pasos:

- Configurar Spring Data, JPA, Hibernate para trabajar con la base de datos
- Definir modelos de datos, interfaces de repositorio y services
- Definir Patron de diseño MVC en API RestFull
- Crear Spring Rest Controller para procesar solicitudes HTTP
- Se Usa Spring Data JPA para interactuar con H2 Database
- Uso de lombook
- No es necesario scrip de bd ya que se genera automatico

CURL
> 
Para Agregar Registros:
	
	curl --location 'http://localhost:8088/desafio-azurian/usuarios' \
--header 'Content-Type: application/json' \
--data-raw ' {
        "name": "Juan Rodriguez2",
        "email": "juan@rodriguez2.org",
        "password": "hunter2882",
        "isActive": true
    }'

Para Listar Registros:

	curl --location 'http://localhost:8088/desafio-azurian/usuarios'

Front-end
> 

Más práctica:
>

Manejo de excepciones:
>

Otras bases de datos:
>

Seguridad:
>

Fullstack:
> 

Ejecute tanto el back-end como el front-end en un solo lugar:
> 


Se deja collection de postman:
> 

## Run Spring Boot application in Maven
```
mvn spring-boot:run
```

## Run Spring Boot application IDE Eclipse
```
run as run
run configurations
create manager and run configurations

spring-boot:run
```

## Run Spring Boot application java
```
java -jar nombreJar.jar
```

# Desafío Java azurian

Desarrolle una aplicación que exponga una API RESTful de creación de usuarios

Todos los endpoints deben aceptar y retornar solamente JSON, inclusive al para los mensajes de error.

Todos los mensajes deben seguir el formato:

```json
  {"mensaje": "mensaje de error"}
```

## Listado
* Ese endpoint entregara un listado de objetos "usuarios", respetando el siguiente formato:
```json
    [
		{
			"name": "Juan Rodriguez",
			"email": "juan@rodriguez.org",
			"password": "hunter2",
			"isActive": true,
			"created": "2024-04-17T22:36:27.507+00:00",
			"modified": "2024-04-17T22:36:27.507+00:00",
			"lastLogin": "2024-04-17T22:36:27.507+00:00"
		}
	]
```
## Registro
* Ese endpoint deberá recibir un usuario con los campos "nombre", "correo", "contraseña", más un listado de objetos "teléfono", respetando el siguiente formato:
```json
    {
        "name": "Juan Rodriguez",
        "email": "juan@rodriguez.org",
        "password": "hunter2",
		"isActive": true,
        "created": "2024-04-17T22:36:27.507+00:00",
        "modified": "2024-04-17T22:36:27.507+00:00",
        "lastLogin": "2024-04-17T22:36:27.507+00:00"
    }
```
* Responder el código de status HTTP adecuado
* En caso de éxito, retorne el usuario y los siguientes campos:
   * `id`: id del usuario
   * `created`: fecha de creación del usuario
   * `modified`: fecha de la última actualización de usuario
   * `last_login`: del último ingreso (en caso de nuevo usuario, va a coincidir con la fecha de creación)
   * `isactive: Indica si el usuario sigue habilitado dentro del sistema.



## Requisitos
* Plazo: Hasta el viernes 16 de abril, si tienes algún inconveniente con el tiempo comunicate con nosotros
* Banco de datos en memoria, como HSQLDB o H2..
* Proceso de build via Gradle o Maven..
* Persistencia con JPA. Ejemplo: EclipseLink, Hibernate u OpenJPA.
* Framework SpringBoot..
* Java 8+
* Entrega en un repositorio público (github o bitbucket).
* Readme explicando cómo probarlo.
* Pruebas unitarias
* Swagger
* Utilización de Patrones de Diseño y buenas practicas
