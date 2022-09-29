package cl.empresa.proyecto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="modulo")
public class Modulo {
	@Id
	private int codigoModulo;
	private String descripcion;
	private int duracionHoras;
	
	@OneToMany(mappedBy="modulo" ,fetch = FetchType.LAZY)
	private List<CursoModuloTutor> cursoModuloTutores;
	
	
}
