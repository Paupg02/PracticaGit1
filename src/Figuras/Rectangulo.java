/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Usuario
 */
public class Rectangulo implements Figura {
	
	private double base, altura;
	String nombre;
	
        /**
         * Constructor parametrizado completo
         * @param nombre 
         * @param base
         * @param altura 
         */
	public Rectangulo(String nombre, double base, double altura) {
		this.nombre=nombre;
		this.base=base;
		this.altura=altura;
	}
	
        /**
         * Constructor por defecto
         */
	public Rectangulo() {
		nombre="RECTANGULO POR DEFECTO";
		base=1;
		altura=1;
	}
        
	/**
         * Set del atributo nombre
         * @param nombre 
         */
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
        /**
         * Set del atributo base
         * @param base 
         */
	public void setBase(double base) {
		this.base = base;
	}

/**
         * Set del atributo altura
         * @param altura 
         */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	 /**
         * Get del atributo nombre
         * @return nombre del rectangulo
         */
	public String getNombre() {
		return nombre;
	}
	
        /**
         * Get del atributo base
         * @return base del rectangulo
         */
	public double getBase() {
		return base;
	}

        /**
         * Get del atributo altura
         * @return altura del rectangulo
         */
	public double getAltura() {
		return altura;
	}
	
        /**
         * To String con los atributos de la clase y algunos metodos
         * @return 
         */
	@Override
	public String toString() {
		return "NOMBRE DE LA FIGURA: "+nombre+"\nBASE= "+base+"\nALTURA= "+altura+"\nAREA= "+calculoArea()+"\nPERIMETRO= "+calculoPerimetro()+"\n\n";
	}
	
        /**
         * calcula el perimetro
         * @return double del perimetro del rectangulo
         */
	@Override
	public double calculoPerimetro() {
		return 2*(base+altura);

	}

        /**
         * calcula el area 
         * @return doble del area del rectangulo
         */
	@Override
	public double calculoArea() {
		return base*altura;

	}

	

	


	

}

