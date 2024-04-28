package edu.pe.trentino.controllers;

import edu.pe.trentino.dto.AlumnosDto;
import edu.pe.trentino.dto.AuthorDto;
import edu.pe.trentino.entidad.Alumnos;
import edu.pe.trentino.services.AlumnosServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AlumnosController {
    private final AlumnosServiceImpl alumnosService;

    @GetMapping("/alumnos")
    public ResponseEntity<?> obtenerAlumnos() {
        List<Alumnos> alumnos = alumnosService.obtenerAlumnos();
        return ResponseEntity.ok(alumnos);
    }

    @PostMapping("/alumnos")
    public ResponseEntity<?> saveAuthor(@RequestBody AlumnosDto alumnosDto) {
        alumnosService.cretaeAlumno(alumnosDto);
        return ResponseEntity.ok(Collections.singletonMap("message", "Se guardo"));
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity<?> obtenerAlumnoId(@PathVariable("id") Long id) {
        Optional<Alumnos> alumnos = alumnosService.obtenerAlumnoId(id);
        return ResponseEntity.ok(alumnos);
    }
}
