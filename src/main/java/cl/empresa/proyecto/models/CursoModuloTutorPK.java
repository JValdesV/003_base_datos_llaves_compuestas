package cl.empresa.proyecto.models;

import java.io.Serializable;
import java.util.Objects;

public class CursoModuloTutorPK implements Serializable{

	private String curso;
	private int modulo;
	private int tutor;
	
	public CursoModuloTutorPK() {
	}

	public CursoModuloTutorPK(String curso, int modulo, int tutor) {
		this.curso = curso;
		this.modulo = modulo;
		this.tutor = tutor;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(curso, modulo, tutor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursoModuloTutorPK other = (CursoModuloTutorPK) obj;
		return Objects.equals(curso, other.curso) && modulo == other.modulo && tutor == other.tutor;
	}
	
	
	
}
