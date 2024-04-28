package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnosRepository extends JpaRepository<Alumnos,Long> {
}
