package com.rttm.rttmmatriculaservicio.Repositorio;

import com.rttm.rttmmatriculaservicio.Entidad.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepositorio extends JpaRepository<Matricula, Long> {
}
