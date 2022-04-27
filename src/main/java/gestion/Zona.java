package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public int cantidadAnimales() {
		return(animales.toArray().length);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre(){
		return(nombre);
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public Zoologico getZoo(){
		return(zoo);
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	public ArrayList<Animal> getAnimales(){
		return(animales);
	}
}
