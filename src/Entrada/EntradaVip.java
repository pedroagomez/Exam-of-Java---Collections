package Entrada;

public class EntradaVip extends Entrada{
    private String beneficio;
    private static float precioExtra=0.5f;

    public EntradaVip( float precio, boolean disponible, String beneficio) {
        super(precio, disponible);
        this.beneficio = beneficio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public static float getPrecioExtra() {
        return precioExtra;
    }

    public static void setPrecioExtra(float precioExtra) {
        EntradaVip.precioExtra = precioExtra;
    }

    @Override
    public String toString() {
        return "EntradaVip{" +
                "beneficio='" + beneficio+ "Precio = "+obtenerPrecioFinal()+super.toString();
    }

    @Override
    public String obtenerTipo() {
        return "Entrada Vip";
    }

    @Override
    public float obtenerPrecioFinal() {
        return super.getPrecio()+(getPrecio()*precioExtra);
    }
}
