package edu.pe.trentino.services;

import edu.pe.trentino.dto.AlumnosDto;
import edu.pe.trentino.entidad.Alumnos;

import java.util.List;
import java.util.Optional;

public interface AlumnosService {
    void cretaeAlumno(AlumnosDto alumnosDto);
    List<Alumnos> obtenerAlumnos();

    Optional<Alumnos> obtenerAlumnoId(Long id);
}
