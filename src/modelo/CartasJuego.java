package modelo;

public class CartasJuego {

//ATRIBUTOS DE UNA CARTA
    private String palo;
    private String valorMostrar;
    private int valorReal;

//CONSTRUCTOR
    public CartasJuego (String palo, String valorMostrar, int valorReal){
        this.palo = palo;
        this.valorMostrar = valorMostrar;
        this.valorReal = valorReal;
    }

//METODOS-   {en este caso todos los metodos de la carta son geter}

    public String getPalo(){
        return this.palo;
    }
    public String getValorMostrar(){
        return this.valorMostrar;
    }
    public int getValorReal(){
        return this.valorReal;
    }

}
