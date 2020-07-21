package modelo;



public class MazoDeCartas {
//ATRIBUTOS 
    public CartasJuego[] arregloMazo;
    private String [] palos ={"DIAMANTE", "TREBOL", "PICA","CORAZON"};
    private String[] valoresFigura = {"AS","2","3","4","5","6","7","8","9","10","J","K","Q"};





//CONSTRUCTOR {se encarga de generar un maso en conjunto con la clase cartas}
    public MazoDeCartas(){
        arregloMazo = new CartasJuego[4*13];                                     //-> tamaño del arreglo de catas
        int  indiceDelMazo = 0;
        int valorRealPorPalo = 0;

        for (String indicePalos : palos){
            valorRealPorPalo =1;
            for (String indiceValorFigura : valoresFigura){
                arregloMazo[indiceDelMazo++] = new CartasJuego(indicePalos, indiceValorFigura, valorRealPorPalo ++);
            }
        }
    }



    
}
