package mx.Uriel.MenuPrincipal;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDeListas 
{
	//Para ahorrar codigo, aqui se crean los campos de texto 
	//para los JOpitionPane.showInputDialog() que se usan para mostrar
	//los menus de temperatura y monedas.
	List<String> opciones = new ArrayList<>();
	
	//Esta funcion es llamada por un Array de tipo Object para rellenar
	//los menus de MostrarVentanaTemp() y VentanaMonedas().
	public List<String> getOpciones() {
		return opciones;
	}
	
	//Crea las listas para MostrarVentanaTemp() y VentanaMonedas().
	public void listas(String texto)
	{
		opciones.add(texto);
		//System.out.println(opciones+" "+valorTem);
	}
	
	
	
}
