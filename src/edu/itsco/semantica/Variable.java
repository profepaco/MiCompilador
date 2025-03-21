package edu.itsco.semantica;

public class Variable {

	private String tipoDato;
	private String nombre;
	private boolean inicializada;
	
	public Variable() {
		
	}

	public Variable(String tipoDato, String nombre, boolean inicializada) {
		super();
		this.tipoDato = tipoDato;
		this.nombre = nombre;
		this.inicializada = inicializada;
	}

	public String getTipoDato() {
		return tipoDato;
	}

	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isInicializada() {
		return inicializada;
	}

	public void setInicializada(boolean inicializada) {
		this.inicializada = inicializada;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Variable) {
			Variable v = (Variable) o;
			return nombre.equals(v.getNombre());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("[%s - %s - %b]}",
				nombre, tipoDato, inicializada);
	}
}
