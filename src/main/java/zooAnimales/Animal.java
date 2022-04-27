package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal(String nombre, int edad, String habitat, String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales += 1;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return("Mamiferos: "+Mamifero.cantidadMamiferos()+
				"\nAves: "+Ave.cantidadAves()+
				"\nReptiles: "+Reptil.cantidadReptiles()+
				"\nPeces: "+Pez.cantidadPeces()+
				"\nAnfibios: "+Anfibio.cantidadAnfibios());
				
	}
	@Override
	public String toString(){
		if(this.zona.toArray().length==0) {
			return ("Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero);
		}
		else {
			return ("Mi nombre es "+this.nombre+" tengo una edad de "+this.edad+" habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona);
		}
	}
	public void setTotalAnimales(int num) {
		totalAnimales = num;
	}
	public static int getTotalAnimales(){
		return(totalAnimales);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre(){
		return(nombre);
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad(){
		return(edad);
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getHabitat(){
		return(habitat);
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero(){
		return(genero);
	}
	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	public ArrayList<Zona> getZona(){
		return zona;
	}
}
