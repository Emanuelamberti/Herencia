package com.example.Persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaApplication {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setEdad(26);
		cliente.setNombre("Hernan");
		cliente.setTelefono(440011);
		cliente.setCredito(4567);
		
		System.out.println("El cliente es: " +
				cliente.getNombre() + ", tiene: " +
				cliente.getEdad() + " años, su telefono es: " +
				cliente.getTelefono() + ", y pide un credito de: " +
				cliente.getCredito() + " pesos."
				);
		
		Trabajador trabajador = new Trabajador();
		
		trabajador.setEdad(34);
		trabajador.setNombre("Jeremias");
		trabajador.setTelefono(478910);
		trabajador.setSalario(30000);
		
		System.out.println("El trabajador es: " +
				trabajador.getNombre() + ", tiene: " +
				trabajador.getEdad() + " años, su telefono es: " +
				trabajador.getTelefono() + ", y tiene un salario de: " +
				trabajador.getSalario() + " pesos."
				);
		
	}

}

class Persona{
	
	private int edad;
	private String nombre;
	private int telefono;
	
	public Persona() {
		
	}

	public Persona(int edad, String nombre, int telefono) {
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}

class Cliente extends Persona{
	
	private int credito;
	
	public Cliente() {
		super();
	}

	public Cliente(int edad, String nombre, int telefono, int credito) {
		super();
		this.credito = credito;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
	
}

class Trabajador extends Persona{
	
	private int salario;

	public Trabajador() {
		super();
	}
	
	public Trabajador(int edad, String nombre, int telefono, int salario) {
		super();
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
