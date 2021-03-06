package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static int totalReptiles;
	
	public Reptil(){
		listado = new ArrayList<Reptil>();
		listado.add(this);
		totalReptiles+=1;
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		 super(nombre, edad, habitat, genero);
		 this.colorEscamas = colorEscamas;
		 this.largoCola = largoCola;
		 totalReptiles+=1;
	}
	public static int cantidadReptiles() {
		return(totalReptiles);
	}
	@Override
	public String movimiento() {
		return("reptar");
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas+=1;
		return( new Reptil(nombre, edad, "humedal",genero,"verde",3));
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes+=1;
		return( new Reptil(nombre, edad, "jungla",genero,"blanco",1));
	}
	public static void setListado(ArrayList<Reptil> lis) {
		listado = lis;
	}
	public ArrayList<Reptil> getListado(){
		return(listado);
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return(colorEscamas);
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public int getLargoCola() {
		return(largoCola);
	}
}
