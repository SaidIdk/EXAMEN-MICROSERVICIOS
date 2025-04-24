package com.rttm.rttmcursoservicio.Servicio;

import com.rttm.rttmcursoservicio.Entidad.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoServicio {

    List<Curso> Listar();
    Optional<Curso> Buscar(Long id);
    Curso Guardar(Curso curso);
    Curso Modificar(Long id, Curso curso);
    void Eliminar(Long id);

}
