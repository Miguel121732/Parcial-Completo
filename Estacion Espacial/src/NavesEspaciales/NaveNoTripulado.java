package NavesEspaciales;

public class NaveNoTripulado implements Naves {
	
	private int velocidadMaxima;
    private int capacidadCarga;

	@Override
	public void mision() {
		
	}

	@Override
	public void viaje() {
		
	}

	@Override
	public void Agencia_espacial() {
		
	}

	@Override
	public void Tipo_de_Carga() {
		
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

}
