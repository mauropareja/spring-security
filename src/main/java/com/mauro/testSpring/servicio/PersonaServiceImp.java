package com.mauro.testSpring.servicio;

import com.mauro.testSpring.dao.PersonaDao;
import com.mauro.testSpring.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService {

    @Autowired
    private PersonaDao personaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listaPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }
    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
       return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
}
