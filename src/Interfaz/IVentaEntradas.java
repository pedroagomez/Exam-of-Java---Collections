package Interfaz;

import Entrada.Entrada;

public interface IVentaEntradas {

    void cargarEntradas(String tipo, Entrada entrada);
    int cantidadEntradasPorTipo(String tipo);
    String listarEntradasDisponibles();
    String venderEntrada(String tipo);


}
