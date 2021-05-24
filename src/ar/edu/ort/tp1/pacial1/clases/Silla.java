package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla materialSilla;
	//TODO A completar
	
	public Silla (String modelo, float costoBase, float porcentajeGanancia,long alto, MaterialSilla materialSilla){
		super(modelo, costoBase, porcentajeGanancia);
		this.alto=alto;
		this.materialSilla= materialSilla;
	}

	public static int getCoeficienteSilla() {
		return COEFICIENTE_SILLA;
	}

	public long getAlto() {
		return alto;
	}
	

	public MaterialSilla getMaterialSilla() {
		return materialSilla;
	}

	@Override
	public float calcularPrecioCosto() {
		//(costo base + multiplicador del material * alto)
		// TODO Apéndice de método generado automáticamente
		
		float costoBase= super.getCostoBase();
		float multiplicadorMaterial= this.getMaterialSilla().getMultiplicadorValor();
		return costoBase + multiplicadorMaterial*this.alto;
	}
	
	

}
