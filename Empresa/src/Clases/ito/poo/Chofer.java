package Clases.ito.poo;

import java.util.HashSet;

public class Chofer extends Empleado{
	
	private HashSet<String>rutas;
	private int noAutobus;
public Chofer(String nombre, String apellido, String email, long celular, int noEmpleado, String nss, float sueldo,
			String puesto, HashSet<String> rutas, int noAutobus) {
		super(nombre, apellido, email, celular, noEmpleado, nss, sueldo, puesto);
		this.rutas=rutas;
		this.noAutobus=noAutobus;
	}
public HashSet<String> getRutas() {
	return rutas;
}
public void setRutas(HashSet<String> rutas) {
	this.rutas = rutas;
}
public int getNoAutobus() {
	return noAutobus;
}
public void setNoAutobus(int noAutobus) {
	this.noAutobus = noAutobus;
}
public void agregaRuta(String ruta) {
	
}
public boolean eliminaRuta(String ruta) {
	return false;
}
@Override
public String toString() {
	return "Chofer [rutas=" + rutas + ", noAutobus=" + noAutobus + ", getNss()=" + getNss() + ", getNoEmpleado()="
			+ getNoEmpleado() + ", getSueldo()=" + getSueldo() + ", getPuesto()=" + getPuesto() + ", getNombre()="
			+ getNombre() + ", getApellido()=" + getApellido() + ", getEmail()=" + getEmail() + ", getCelular()="
			+ getCelular() + "]";
}
}
