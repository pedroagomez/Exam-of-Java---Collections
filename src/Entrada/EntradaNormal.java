package Entrada;


public class EntradaNormal extends Entrada{

    private ZonaEntrada zona;

    public EntradaNormal( float precio, boolean disponible, ZonaEntrada zona) {
        super(precio, disponible);
        this.zona = zona;
    }

    public ZonaEntrada getZona() {
        return zona;
    }

    public void setZona(ZonaEntrada zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Entrada Normal{" +
                "zona= " + zona + "Precio = "+obtenerPrecioFinal()+super.toString();
    }

    @Override
    public String obtenerTipo() {
        return "Entrada Normal";
    }

    @Override
    public float obtenerPrecioFinal() {
        return getPrecio();
    }
}
