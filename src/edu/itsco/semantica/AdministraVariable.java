package edu.itsco.semantica;

import java.util.ArrayList;
import java.util.List;

public class AdministraVariable {

	private List<Variable> variables;
	
	public AdministraVariable() {
		variables = new ArrayList<>();
	}
	
	public void addVariable(Variable v) 
			throws SemanticException {
		//registras las variables
		if(variables.contains(v)) {
			throw new SemanticException(
					SemanticException.VARIABLE_DECLARADA,
					v);
			//System.out.println(v);
		}
		variables.add(v);
	}
	
	public void existeVariable(Variable v) 
			throws SemanticException{
		if(!variables.contains(v)) {
			throw new SemanticException(
			     SemanticException.VARIABLE_NO_DECLARADA,
				 v );
		}
	}
	
	public void variableInicializada(Variable v) 
			throws SemanticException {
		if(v.isInicializada()==false) {
		   throw new SemanticException(
			 SemanticException.VARIABLE_NO_INICIALIZADA,
			 v);
		}
	}
	
	public Variable obtenerVariable(Variable v) {
		int index = variables.indexOf(v);
		return variables.get(index);
	}
	
	
	
	
}
