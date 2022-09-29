package cl.empresa.proyecto.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="curso")

public class Curso {

	@Id
	private String codigoCurso;
	private Date fechaInicio;
	private Date fechaTermino;
	
	@OneToMany(mappedBy="curso",fetch = FetchType.LAZY)
	private List<CursoModuloTutor> cursoModuloTutores;
	
	
	
}
