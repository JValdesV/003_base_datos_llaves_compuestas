package cl.empresa.proyecto.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="curso_modulo_tutor")
@IdClass(CursoModuloTutorPK.class)
public class CursoModuloTutor {
	
	//FK CursoModuloTutor ---> Curso
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_curso")
	private Curso curso;
	
	//FK CursoModuloTutor ---> Tutor
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_tutor")
	private Tutor tutor;
	
	//FK CursoModuloTutor ---> Modulo
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_modulo")
	private Modulo modulo;

}
