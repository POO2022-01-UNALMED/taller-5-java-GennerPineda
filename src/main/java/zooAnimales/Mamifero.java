package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int totalMamiferos;
	
	public Mamifero(){
		listado = new ArrayList<Mamifero>();
		listado.add(this);
		totalMamiferos+=1;
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		 super(nombre, edad, habitat, genero);
		 this.pelaje = pelaje;
		 this.patas=patas;
		 listado.add(this);
		 totalMamiferos+=1;
	}
	public static int cantidadMamiferos() {
		return( totalMamiferos);
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero){
		caballos+=1;
		return( new Mamifero(nombre, edad, "pradera", genero, true, 4));
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero){
		leones+=1;
		return( new Mamifero(nombre, edad, "selva", genero, true, 4));
	}
	public static void setListado(ArrayList<Mamifero> lis) {
		listado = lis;
	}
	public ArrayList<Mamifero> getListado(){
		return(listado);
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public boolean getPelaje(){
		return(pelaje);
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getPatas(){
		return(patas);
	}
	

}
