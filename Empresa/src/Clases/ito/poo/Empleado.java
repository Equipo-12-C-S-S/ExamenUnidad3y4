package Clases.ito.poo;

public class Empleado extends Persona{

public Empleado(String nombre, String apellido, String email, long celular, int noEmpleado, String nss, float sueldo, String puesto) {
		super(nombre, apellido, email, celular);
		this.nss=nss;
		this.noEmpleado=noEmpleado;
		this.sueldo=sueldo;
		this.puesto=puesto;
	}
private String nss;
private  int noEmpleado;
private float sueldo;
private String puesto;

public String getNss() {
	return nss;
}
public void setNss(String nss) {
	this.nss = nss;
}
public int getNoEmpleado() {
	return noEmpleado;
}
public void setNoEmpleado(int noEmpeado) {
	this.noEmpleado = noEmpeado;
}
public float getSueldo() {
	return sueldo;
}
public void setSueldo(float sueldo) {
	this.sueldo = sueldo;
}
public String getPuesto() {
	return puesto;
}
public void setPuesto(String puesto) {
	this.puesto = puesto;
}
public void cambioPuesto(String puesto,float sueldo) {
	
}
@Override
public String toString() {
	return "Empleado [nss=" + nss + ", noEmpleado=" + noEmpleado + ", sueldo=" + sueldo + ", puesto=" + puesto
			+ ", Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", Email=" + getEmail()
			+ ", Celular=" + getCelular() + "]";
}
}

