package com.rttm.rttmestudianteservicio.Repositorio;

import com.rttm.rttmestudianteservicio.Entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}
