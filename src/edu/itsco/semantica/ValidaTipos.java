package edu.itsco.semantica;

import edu.itsco.CompiladorConstants;
import edu.itsco.Token;

public class ValidaTipos {

	public static void tiposNoCoinciden(
			String tipo1, String tipo2, int linea,
			int columna) 
					throws SemanticException{
		tipo2 = tipo2.replace("\"", "");
		//System.out.println(tipo1+"-"+tipo2);
		if(!tipo1.equals(tipo2)) {
			throw new SemanticException(
				SemanticException.TIPOS_NO_COINCIDEN,
				linea, columna);
		}
	}
	
	public static void validaOperador(
			String tipo,
			String operador,
			int linea, 
			int columna) throws SemanticException{
		String tipo2 = CompiladorConstants.tokenImage[
		               CompiladorConstants.STRING]
		            		   .replace("\"", "");
		String operadorSuma = CompiladorConstants.tokenImage[
		               CompiladorConstants.SUMA]
		            		   .replace("\"","");
		if(tipo.equals(tipo2) &&
			(!operador.equals(operadorSuma)
					&&!operador.equals("==")
					&&!operador.equals("!="))) {
			throw new SemanticException(
					SemanticException.OPERADOR_NO_VALIDO,
					linea, columna);
		}
	}
}
