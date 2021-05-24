package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	//TODO A completar

	private int cantCuerpos;
	private TelaSillon telaSillon;
	
	public Sillon (String modelo, float costoBase, float porcentajeGanancia,int cantCuerpos, TelaSillon telaSillon){
		super(modelo, costoBase, porcentajeGanancia);
		this.cantCuerpos=cantCuerpos;
		this.telaSillon=telaSillon;
		
	}

	public int getCantCuerpos() {
		return cantCuerpos;
	}

	public TelaSillon getTelaSillon() {
		return telaSillon;
	}

	@Override
	public float calcularPrecioCosto() {
		//(costo base * cantidad de cuerpos *   adicional por tela)
		// TODO Apéndice de método generado automáticamente
		float costoBase= super.getCostoBase();
		
		
		return costoBase * this.cantCuerpos* this.getTelaSillon().getPorcentaje();
	}


	
}
