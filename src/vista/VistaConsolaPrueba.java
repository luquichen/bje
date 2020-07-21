package vista;
import modelo.MazoDeCartas;
import modelo.CartasJuego;
public class VistaConsolaPrueba {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazoDeCartas  mazoJuego = new MazoDeCartas();
		
		for ( CartasJuego aux : mazoJuego.arregloMazo){
			System.out.println(aux.getPalo() +" "+ aux.getValorMostrar() +" " + aux.getValorReal());

		}

	}

}
