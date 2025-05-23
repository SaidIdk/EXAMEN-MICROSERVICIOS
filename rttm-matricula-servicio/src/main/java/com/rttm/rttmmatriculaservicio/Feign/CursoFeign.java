package com.rttm.rttmmatriculaservicio.Feign;

import com.rttm.rttmmatriculaservicio.Dto.CursoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="hlca-curso-servicio", path = "/cursos")
public interface CursoFeign {
    @GetMapping("/{id}")
    public ResponseEntity<CursoDto> buscarCurso(@PathVariable Long id);
}
