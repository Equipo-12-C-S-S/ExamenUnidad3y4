package Clases.ito.poo;

public class Administrativo extends Empleado{
	
private String depto;
public Administrativo(String nombre, String apellido, String email, long celular, int noEmpleado, String nss,
		float sueldo, String puesto, String depto) {
		super(nombre, apellido, email, celular, noEmpleado, nss, sueldo, puesto);
		this.depto=depto;
	}
public void cambiaDepto(String newDepto) {
}

public String getDepto() {
	return depto;
}

public void setDepto(String depto) {
	this.depto = depto;
}

@Override
public String toString() {
	return "Administrativo [depto=" + depto + ", Nss=" + getNss() + ", NoEmpeado=" + getNoEmpleado()
			+ ", Sueldo=" + getSueldo() + ",Puesto=" + getPuesto() + ",Nombre=" + getNombre()
			+ ",Apellido=" + getApellido() + ",Email=" + getEmail() + ",Celular=" + getCelular()
			+ "]";
}
}

