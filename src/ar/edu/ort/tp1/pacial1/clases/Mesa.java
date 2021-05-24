package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipoMesa;
	//TODO A completar

	public Mesa(String modelo, float costoBase, float porcentajeGanancia,long largo,long ancho, TipoMesa tipoMesa){
	super(modelo, costoBase, porcentajeGanancia);
	this.largo=largo;
	this.ancho= ancho;
	this.tipoMesa=tipoMesa;
	
	}

	public float getCoeficienteSuperficie() {
		return COEFICIENTE_SUPERFICIE;
	}

	public long getLargo() {
		return largo;
	}

	public long getAncho() {
		return ancho;
	}

	public TipoMesa getTipoMesa() {
		return tipoMesa;
	}

	@Override
	public float calcularPrecioCosto() {
		// TODO Apéndice de método generado automáticamente
		//(costo base * multiplicador del tipo de mesa + 0.2 * largo * ancho)
		float costoBase=super.getCostoBase();
		float multiplicadorValor=this.getTipoMesa().getMultiplicadorValor();
		
		
		return costoBase*multiplicadorValor+ this.getCoeficienteSuperficie() * this.getSuperficie();
	}
	
	private float getSuperficie(){
		return this.getLargo()*this.getAncho();
	}
}
