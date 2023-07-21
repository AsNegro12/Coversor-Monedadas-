package mx.Uriel.ConvesorDeDivisas;

import java.util.ArrayList;
import java.util.List;

public class ListasConversiones 
{
	
	int valorTem;
	List<String> opciones = new ArrayList<>();
	
	public List<String> getOpciones() {
		return opciones;
	}

	public void listas(int valor, String moneda)
	{
		this.valorTem = valor;
		opciones.add(moneda);
		//System.out.println(opciones +" "+valorTem);
	}
	
	
}
