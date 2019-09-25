package edu.pucmm.spc.estudianteservices.repositorios;

import edu.pucmm.spc.estudianteservices.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource(path = "estudiante", collectionResourceRel = "estudiante")
public interface EstudianteRepo extends JpaRepository<Estudiante, Integer> {
}
