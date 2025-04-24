package com.rttm.rttmestudianteservicio.UtilH2;


import com.rttm.rttmestudianteservicio.Entidad.Estudiante;
import com.rttm.rttmestudianteservicio.Repositorio.EstudianteRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudianteSeeder implements CommandLineRunner {

    private final EstudianteRepositorio estudianteRepositorio;
    public EstudianteSeeder(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
    }
    @Override
    public void run(String... args){
        if (estudianteRepositorio.count() == 0) {
            // 1 para activos y 0 para inactivos
            Estudiante estudiante4 = new Estudiante(null, "maría", "ingeniería civil", 1, 2);
            Estudiante estudiante5 = new Estudiante(null, "lucas", "derecho", 0, 6);
            Estudiante estudiante6 = new Estudiante(null, "andrea", "medicina", 1, 1);
            Estudiante estudiante7 = new Estudiante(null, "fernando", "arquitectura", 0, 3);
            Estudiante estudiante8 = new Estudiante(null, "camila", "diseño gráfico", 1, 4);
            Estudiante estudiante9 = new Estudiante(null, "sofia", "administración", 1, 5);
            Estudiante estudiante10 = new Estudiante(null, "diego", "biología", 0, 2);

            estudianteRepositorio.save(estudiante4);
            estudianteRepositorio.save(estudiante5);
            estudianteRepositorio.save(estudiante6);
            estudianteRepositorio.save(estudiante7);
            estudianteRepositorio.save(estudiante8);
            estudianteRepositorio.save(estudiante9);
            estudianteRepositorio.save(estudiante10);




            System.out.println("Datos de HLCA Estudiante insertados correctamente.");
        }else {
            System.out.println("Los HLCA Estudiantes ya existen, no se insertaron datos.");
        }
    }
}