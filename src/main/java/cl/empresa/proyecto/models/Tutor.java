package cl.empresa.proyecto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tutor")

public class Tutor {

	@Id
	private int codigoTutor;
	private String rut;
	private String nombre;
	private String apellido_pat;
	private String apellido_mat;
	private String direccion;
	private String cargo;
	private int sueldoHora;
	
	@OneToMany(mappedBy="tutor",fetch = FetchType.LAZY)
	private List<CursoModuloTutor> cursoModuloTutores;
 	
}
