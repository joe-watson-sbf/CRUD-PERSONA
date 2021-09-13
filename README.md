# CRUD PERSONA
[@SOFKA UNIVERSITY](https://www.sofka.com.co/es/sofka-university/)

Clonar el repositorio y luego acceder a la domumentación:
**[API DOCUMENTACIÓN](http://localhost:8080/v2/api-docs)** 

**Swagger**: http://localhost:8080/swagger-ui.html


- PROJECT INFO: 

**Build**:  
        
  - Con Marven
  - Java 11
  - Database : H2
  - Hibernate


**Como Funciona ?**

Es una aplicacion que responde a todos las funcionalidades de un CRUD basico

    
- **CREATE** :

Permite a Registrar Persona

  - *REQUEST :* POST
  - *EndPoint :* http://localhost:8080/api/persona
  - *Json format :*

          {
            "name":"Hollman", 
            "edad": 24
          }
    
    - **Retorno :**

           {
               "respuesta": "Se ha registrado exitosamente!!!"
           }

- **READ**:

 Tener acceso para ver todos los registros

- *REQUEST :* GET
- *EndPoint :* http://localhost:8080/api/persona
- *Retorna una lista:*

      [
        {
          "id":1
          "name":"Hollman", 
          "edad": 24
        },
        {
          "id":2
          "name":"David Castro", 
          "edad": 18
        },
        {
          "id":3
          "name":"Oscar Lopera", 
          "edad": 27
        }
      ]


  Tener acceso para ver un solo registro con un el id

- *REQUEST :* GET
- *EndPoint :* http://localhost:8080/api/persona/{id}
- *Retorna una persona si existe:*

      {
         "id":1,
         "name":"Joe Watson SBF",
         "edad": 40
      }

- *Retorna una respuesta si no existe:*
    
      {
        "respuesta": "No existe persona con el ID: {id}"
      }


**UPDATE**


- *REQUEST :* PUT
- *EndPoint :* http://localhost:8080/api/persona
- *Json format :*

        {
          "id":1
          "name":"Joe Watson SBF", 
          "edad": 40
        }
  **Si encuentra el registro, retorna:**      
  
      {
        "respuesta": "Se ha actualizodo exitosamente!!!"
      }
  **Si no lo encuentra, retorna:**

      {
        "respuesta": "No existe un usuario con el id {id}"
      }

**DELETE**:


- *REQUEST :* DELETE

Hay dos formas de eliminar un registro:
- *EndPoint 1 :* http://localhost:8080/api/persona
- *Json format :*

        {
          "id":1
          "name":"Joe Watson SBF", 
          "edad": 40
        }

  **Si encuentra el registro, retorna:**

      {
        "respuesta": "Registro borrado exitosamente!!!"
      }

- *EndPoint 2 :* http://localhost:8080/api/persona/{id}

  **Si no lo encuentra, retorna:**

      {
        "respuesta": "No existe persona registrodo con el id {id}"
      }





[@SOFKA UNIVERSITY](https://www.sofka.com.co/es/sofka-university/)
