package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int totalAnfibios;
	
	public Anfibio(){
		listado.add(this);
		totalAnfibios+=1;
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		 super(nombre, edad, habitat, genero);
		 this.colorPiel = colorPiel;
		 this.venenoso = venenoso;
		 listado.add(this);
		 totalAnfibios+=1;
	}
	public static int cantidadAnfibios() {
		return(totalAnfibios);
	}
	@Override
	public String movimiento() {
		return("saltar");
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas+=1;
		return( new Anfibio(nombre, edad, "selva", genero, "rojo", true));
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras+=1;
		return( new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false));
	}
	public static void setListado(ArrayList<Anfibio> lis) {
		listado = lis;
	}
	public ArrayList<Anfibio> getListado(){
		return(listado);
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setLargoCola(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public boolean getLargoCola() {
		return venenoso;
	}

}
