package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {
	//TODO A completar
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		//TODO A completar
		this.modelo=modelo;
		this.costoBase= costoBase;
		this.porcentajeGanancia=porcentajeGanancia;
	}

	//TODO A completar Métodos Faltantes
	
	
	public float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public float calcularPrecioVenta() {
		
		return costoBase;
		//TODO A completar
	
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}
	
	@Override
	public void mostrar(){
		System.out.println(toString());
		
	}


	
}
