package edu.itsco.generador;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneradorCodigo {
	
	private PrintWriter writer;
	
	public GeneradorCodigo() {
		try {
			writer = new PrintWriter("salida.vb");
		}catch(FileNotFoundException fex) {
			System.err.println(fex.getMessage());
		}
	}
	
	public GeneradorCodigo(String path) {
		try {
			writer = new PrintWriter("salida.vb");
		}catch(FileNotFoundException fex) {
			System.err.println(fex.getMessage());
		}
	}
	
	public void creaCabecera() {
		writer.println("Imports System");
		writer.println("Module Program");
		writer.println("Sub Main(args as String)");
	}
	
	public void declaraVariable(String tipo, 
			String id) {
		String declaracion = 
			String.format("dim %s as %s", id, tipo);
		writer.print(declaracion);
	}
	
	public void saltoDeLinea() {
		writer.println("");
	}
	
	public void escribeToken(String token) {
		writer.print(token);
	}
	
	public void escribeInstruccion(String instruccion) {
		writer.print(instruccion);
	}
	
	public void concatena() {
		writer.print(" & ");
	}
	
	public void generaLeer(String tipo, String id) {
		String readLine = "Console.ReadLine()";
		writer.print(String.format("%s = ", id));
		if(tipo.equals("integer")) {
			writer.print("Integer.parse(");
			writer.print(readLine);
			writer.print(")");
		}else if(tipo.equals("decimal")) {
			writer.print("Decimal.parse(");
			writer.print(readLine);
			writer.print(")");
		}else {
			writer.print(readLine);
		}
		saltoDeLinea();
	}
	
	public void cerrarPrograma() {
		writer.println("End Sub");
		writer.println("End Module");
		//cerrando el archivo
		writer.close();
	}
}
