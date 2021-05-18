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

	//TODO A completar
	public abstract float calcularPrecioCosto();
	
	public float calcularPrecioVenta() {
		float costo= calcularPrecioCosto();
		
		return this.porcentajeGanancia * costo/100 +costo;
		
	
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}
	
	
	
	
	@Override
	public void mostrar(){
		System.out.println("Mueble tipo: " + getClass().getSimpleName() +  " - Modelo " + this.modelo  + " Precio Venta: " + calcularPrecioVenta());
		
	}


	
}
