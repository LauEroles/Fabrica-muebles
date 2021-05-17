package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public abstract class FabricaDeMuebles {
	// TODO A completar
	private ArrayList<Mueble> mueblesFabricados;
	private String nombre;

	public FabricaDeMuebles(String nombre) {
		// TODO A completar
		this.nombre=nombre;
		mueblesFabricados= new ArrayList<Mueble>();
		
	}

	
	public String getNombre() {
		return nombre;
	}


	public ArrayList<Mueble> getMuebles() {
		return this.mueblesFabricados;
	}


	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		// TODO A completar
		return retorno;
	}

	public boolean seHaFabricado(String modelo) {
		boolean seHaFabricado = false;
		// TODO A completar
		return seHaFabricado;
	}
}
