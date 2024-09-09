
package barbafeita.Entidades;

import java.time.LocalDate;

public class Persona {

private boolean barbero;
  private int barberoId;
  private int clienteId;
  private String cpfBarbero;
  private String nombre;
  private String tel;
  private LocalDate anivCliente;

	public Persona(boolean barbero, int barberoId, int clienteId, String cpfBarbero, String nombre, String tel, LocalDate anivCliente) {
    	this.barbero = barbero;
    	this.barberoId = barberoId;
    	this.clienteId = clienteId;
    	this.cpfBarbero = cpfBarbero;
    	this.nombre = nombre;
    	this.tel = tel;
    	this.anivCliente = anivCliente;
	}

	public boolean isBarbero() {
    	return barbero;
	}

	public void setBarbero(boolean barbero) {
    	this.barbero = barbero;
	}

	public int getBarberoId() {
    	return barberoId;
	}

	public void setBarberoId(int barberoId) {
    	this.barberoId = barberoId;
	}

	public int getClienteId() {
    	return clienteId;
	}

	public void setClienteId(int clienteId) {
    	this.clienteId = clienteId;
	}

	public String getCpfBarbero() {
    	return cpfBarbero;
	}

	public void setCpfBarbero(String cpfBarbero) {
    	this.cpfBarbero = cpfBarbero;
	}

	public String getNombre() {
    	return nombre;
	}

	public void setNombre(String nombre) {
    	this.nombre = nombre;
	}

	public String getTel() {
    	return tel;
	}

	public void setTel(String tel) {
    	this.tel = tel;
	}

	public LocalDate getAnivCliente() {
    	return anivCliente;
	}

	public void setAnivCliente(LocalDate anivCliente) {
    	this.anivCliente = anivCliente;
	}

	public void modificarBarbero(){
    	//conexión a base de datos
	}
	
    
}
