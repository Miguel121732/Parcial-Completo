package NavesEspaciales;

// Clase abstracta
public abstract class NaveTripulada implements Naves {
	
	
	//Atributos de una nave espacial
	private String tipo_de_nave;
	private int peso;
	private int altura;
	private int empuje;
	private int potencia;

	//Constructor
	public NaveTripulada () {
		
	}

//Metodo Getter
public String getdatos_generales () {
	
	return tipo_de_nave;
}

//Metodo setter
public void setpeso_nave(int peso) {
	
	return;
}

//Metodo Getter
public int getpeso() {
	
	return peso;
}
//Metodo Setter
public void setaltura_nave(int altura) {
	
	return;
	
}
//Metodo Getter
public int getdime_altura() {
	
	return altura;
}
//Metodo setter
public void setestablece_empuje(int empuje) {
	
	return;
	
}
//Metodo Getter
public int dime_empuje() {
	
	return empuje;
}
//Metodo Setter
public void establece_potencia(int potencia) {
	
	return;
}
//Metodo Getter
public int dime_potencia() {
	
	return potencia;
}

}