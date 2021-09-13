package com.sofkau.crudpersona.Services;

import com.sofkau.crudpersona.domain.Persona;
import com.sofkau.crudpersona.utils.Respuesta;

import java.util.List;

public interface ServicePersona {
    List<Persona> listar();
    Persona findById(Integer id) throws Exception;
    Respuesta eliminar(Persona persona);
    Respuesta eliminarPorId(Integer id);
    Respuesta guardar(Persona persona);
    Respuesta actualizar(Persona persona);

}
