/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author Paula
 */
public class Perro implements Animal {
	private String nombre, raza;
	private int edad;
    /**
     * Constructor parametrizaodo completo 
     * @param nombre Nombre del perro
     * @param raza Raza del perro 
     * @param edad Edad del perro 
     */
	public Perro(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
        
        /**
         * Set del atributo nombre
         * @param nombre 
         */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
        /**
         * Set del atributo raza
         * @param raza 
         */
	public void setRaza(String raza) {
		this.raza = raza;
	}
        
        /**
         * Set del atributo edad
         * @param edad 
         */
	public void setEdad(int edad) {
		this.edad = edad;
	}

        /**
         * Get del atributo nombre
         * @return nombre del perro
         */
	public String getNombre() {
		return nombre;
	}
        
        /**
         * Get del atributo raza
         * @return raza del perro
         */
	public String getRaza() {
		return raza;
	}
        
        /**
         * Get del atributo edad
         * @return edad del perro
         */
	public int getEdad() {
		return edad;
	}

        /**
         * To string de la clase
         * @return Un String con los atributos de la clase
         */
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}

        /**
         * Metodo del la interface Animales Implementada
         */
	@Override
	public void desplazamiento() {
		System.out.println("Me desplazo corriendo, saltando y andando");

	}

        /**
         * Metodo del la interface Animales Implementada
         */
	@Override
	public void sonido() {
		System.out.println("Ladro y gruño");

	}

        /**
         * Metodo del la interface Animales Implementada
         */
	@Override
	public void comida() {
		System.out.println("Como de todo pero prefiero la carne");

	}
	


}

