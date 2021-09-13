package com.sofkau.crudpersona.controller;

import com.sofkau.crudpersona.Services.ServicePersona;
import com.sofkau.crudpersona.domain.Persona;
import com.sofkau.crudpersona.utils.Exceptions.BusinessException;
import com.sofkau.crudpersona.utils.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author JOSEPH WATZSON
 * @since 10/09/2021
 * @Description:  La clase que que recibe
 * */

@RestController
@RequestMapping("api/persona")
public class Controller {
    @Autowired
    private ServicePersona service;

    @GetMapping()
    public ResponseEntity<List<Persona>> getAll(){
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Integer id) throws Exception {
        try{
            return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(new Respuesta(ex.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public Respuesta save(@RequestBody Persona persona){
        return service.guardar(persona);
    }

    @PutMapping()
    public Respuesta update(@RequestBody Persona persona){
        return service.actualizar(persona);
    }

    @DeleteMapping()
    public Respuesta delete(@RequestBody Persona persona){
        return service.eliminar(persona);
    }

    @DeleteMapping("/{id}")
    public Respuesta deleteById(@PathVariable Integer id){
        return service.eliminarPorId(id);
    }

}
