package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	//TODO A completar
	
	public Silla (String modelo, float costoBase, float porcentajeGanancia,long alto){
		super(modelo, costoBase, porcentajeGanancia);
		this.alto=alto;
	}

	public static int getCoeficienteSilla() {
		return COEFICIENTE_SILLA;
	}

	public long getAlto() {
		return alto;
	}

	@Override
	public float calcularPrecioCosto() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}


}
