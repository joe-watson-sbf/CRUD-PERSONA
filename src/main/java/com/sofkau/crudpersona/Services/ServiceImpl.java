package com.sofkau.crudpersona.Services;

import com.sofkau.crudpersona.domain.Persona;
import com.sofkau.crudpersona.repository.PersonaRepository;
import com.sofkau.crudpersona.utils.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ServicePersona {

    @Autowired
    private PersonaRepository repository;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) repository.findAll();
    }

    @Override
    public Persona findById(Integer id) throws Exception {
        Persona persona = repository.findById(id).orElse(null);
        if(persona!=null) {
            return persona;
        }
        throw new Exception("No existe persona con el ID: " + id);
    }

    @Override
    public Respuesta eliminar(Persona persona) {
        if (repository.existsById(persona.getId())){
            repository.delete(persona);
            return new Respuesta("Registro borrado exitosamente!!!");
        }
        return new Respuesta("No existe ningun registro con los datos ingresados!!!");
    }

    @Override
    public Respuesta eliminarPorId(Integer id) {
        if (repository.findById(id).isPresent()){
            repository.deleteById(id);
            return new Respuesta("Registro borrado exitosamente!!!");
        }
        return new Respuesta("No existe persona registrodo con el id " + id);
    }

    @Override
    public Respuesta guardar(Persona persona) {
        repository.save(persona);
        return new Respuesta("Se ha registrado exitosamente!!!");
    }

    @Override
    public Respuesta actualizar(Persona persona) {
        if (repository.findById(persona.getId()).isPresent()){
            repository.save(persona);
            return new Respuesta("Se ha actualizodo exitosamente!!!");
        }
        return new Respuesta("No existe un usuario con el id " + persona.getId());

    }
}
