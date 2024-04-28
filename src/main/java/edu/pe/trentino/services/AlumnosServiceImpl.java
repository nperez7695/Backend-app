package edu.pe.trentino.services;

import edu.pe.trentino.dto.AlumnosDto;
import edu.pe.trentino.entidad.Alumnos;
import edu.pe.trentino.repository.AlumnosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AlumnosServiceImpl implements AlumnosService {

    private final AlumnosRepository alumnosRepository;

    @Override
    public void cretaeAlumno(AlumnosDto alumnosDto) {
        //Instanciar el objeto
        Alumnos addAlumnos = new Alumnos();
        addAlumnos.setNombres(alumnosDto.getNombres());
        addAlumnos.setApellidos(alumnosDto.getApellidos());
        alumnosRepository.save(addAlumnos);
    }

    @Override
    public List<Alumnos> obtenerAlumnos() {
        return alumnosRepository.findAll();
    }

    @Override
    public Optional<Alumnos> obtenerAlumnoId(Long id) {
        return alumnosRepository.findById(id);
    }
}
