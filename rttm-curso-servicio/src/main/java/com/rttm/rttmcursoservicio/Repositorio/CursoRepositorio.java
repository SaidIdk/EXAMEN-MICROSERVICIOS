package com.rttm.rttmcursoservicio.Repositorio;

import com.rttm.rttmcursoservicio.Entidad.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CursoRepositorio extends JpaRepository<Curso, Long> {
}
