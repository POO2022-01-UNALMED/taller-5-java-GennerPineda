package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int totalPeces;
	
	public Pez(){
		listado = new ArrayList<Pez>();
		listado.add(this);
		totalPeces+=1;
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		 super(nombre, edad, habitat, genero);
		 this.colorEscamas = colorEscamas;
		 this.cantidadAletas = cantidadAletas;	 
		 totalPeces+=1;
	}
	public static int cantidadPeces() {
		return(totalPeces);
	}
	@Override
	public String movimiento() {
		return("nadar");
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones+=1;
		return( new Pez( nombre, edad, "oceano",genero, "rojo", 6));
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos+=1;
		return( new Pez( nombre, edad, "oceano",genero, "gris", 6));
	}
	public static void setListado(ArrayList<Pez> lis) {
		listado = lis;
	}
	public ArrayList<Pez> getListado(){
		return listado;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return(colorEscamas);
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
}
