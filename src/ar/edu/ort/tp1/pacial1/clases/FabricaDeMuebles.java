package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles {
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
		if (m!=null){
			System.out.println(" Fabricando el mueble: ");
			m.mostrar();
			retorno= mueblesFabricados.add(m);
		}
		return retorno;
	}

	public boolean seHaFabricado(String modelo) {
		boolean fabricado = false;
		// TODO A completar

		int i=0;
		while(!fabricado && i<mueblesFabricados.size() ){
			Mueble aux= mueblesFabricados.get(i);
			if(aux.modeloCorrecto(modelo)){
				fabricado=true;
			}
			else i++;
		}
		return fabricado;
	}
	
	public void mostrar(){
		System.out.println("Fabrica de muebles: " + nombre); 
		int sillas=0;
		int mesas=0;
		int sillones=0;
		float ventasTotales=0;
		
		for( Mueble mueble: mueblesFabricados){
			if(mueble instanceof Silla){
				sillas++;
			}else if (mueble instanceof Mesa){
				mesas++;
			}else {
				sillones++;
			}
			
		ventasTotales+=mueble.calcularPrecioCosto();
		}
		System.out.println("Se han fabricado: " + sillas + " sillas "+ mesas+ " mesas " + sillones + " sillones "); 
		System.out.println("La venta total fue :  "+ ventasTotales);
	}
}



