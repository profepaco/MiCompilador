package edu.itsco.semantica;

public class SemanticException extends Exception{

	public static final int VARIABLE_DECLARADA = 10;
	public static final int VARIABLE_NO_DECLARADA = 20;
	public static final int VARIABLE_NO_INICIALIZADA = 30;
	public static final int TIPOS_NO_COINCIDEN = 40;
	public static final int OPERADOR_NO_VALIDO = 50;
	
	public SemanticException(int causa, 
							int linea, 
							int columna) {
		super(getMessage(causa, linea, columna));
	}
	
	public SemanticException(int causa, Variable v) {
		super(getMessage(causa, v));
	}
	
	public static String getMessage(
			int causa, Variable v) {
		String msg = "";
		switch(causa) {
		   case VARIABLE_DECLARADA: 
				msg = String.format(
					"La variable: %s ya esta declarada"
					, v.getNombre());
				break;
		   case VARIABLE_NO_DECLARADA:
			   msg = String.format(
					"La variable: %s, no esta declarada"   
					, v.getNombre());
			   break;
		   case VARIABLE_NO_INICIALIZADA:
			   msg = String.format(
				  "La variable: %s, no esta inicializada"
					   , v.getNombre());
		}
		return msg;
	}
	
	public static String getMessage(int causa, 
			int linea, int columna) {
		String msg = "";
		if(causa == TIPOS_NO_COINCIDEN) {
		  msg = String.format(
			"Error(%d, %d): Los tipos de datos no coinciden",
			linea, columna);
		}else if(causa == OPERADOR_NO_VALIDO) {
		  msg = String.format(
		    "Error(%d, %d): El operador no se puede utilizar con cadenas",
		    linea, columna);
		}
		return msg;
	}
}
