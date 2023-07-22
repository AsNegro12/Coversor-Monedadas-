package mx.Uriel.ConvesorDeDivisas;

import java.util.ArrayList;
import java.util.List;

public class ListasConversiones 
{
	
	List<String> opciones = new ArrayList<>();
	
	public List<String> getOpciones() {
		return opciones;
	}
	
	public List<String> setOpciones(List<String> opciones) {
		return opciones;
	}
	public void listas(String moneda)
	{
		opciones.add(moneda);
		//System.out.println(opciones+" "+valorTem);
	}
	
	
	
}
