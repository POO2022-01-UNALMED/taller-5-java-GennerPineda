package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int totalAves;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		totalAves+=1;
	}
	public static int cantidadAves() {
		return totalAves;
	}
	@Override
	public String movimiento() {
		return("volar");
	}
	public static Ave crearHalcon(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		halcones+=1;
		return( new Ave(nombre, edad, "montanas", genero, "cafe glorioso"));
	}
	public static Ave crearAguila(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		aguilas+=1;
		return( new Ave(nombre, edad, "montanas", genero, "blanco y amarillo"));
		
	}
	public static void setListado(ArrayList<Ave> lis) {
		listado = lis;
	}
	public ArrayList<Ave> getListado(){
		return(listado);
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return(colorPlumas);
	}

}
