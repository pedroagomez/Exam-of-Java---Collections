import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import Entrada.*;
import Interfaz.IVentaEntradas;

public class Recital implements IVentaEntradas {
    private String nombre;
    private String fecha;
    private String lugar;
    private HashMap<String, HashSet<Entrada>>mapaRecital;

    public Recital(String nombre, String fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.mapaRecital = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    //Metodo para cargar entradas
    public void cargarEntradas(String tipo, Entrada entrada)
    {
        HashSet<Entrada> setEntrda=null;
        if(mapaRecital.containsKey(tipo))
        {
            setEntrda=mapaRecital.get(tipo);
        }
        else
        {
            setEntrda=new HashSet<>();
        }
        setEntrda.add(entrada);
        mapaRecital.put(tipo,setEntrda);
    }

    //Paso por parametro el tipo de entrada y me devuelve la cantidad de entradas vendidas
    public int cantidadEntradasPorTipo(String tipo)
    {
        int cantidad=0;
        HashSet<Entrada> conjunto= mapaRecital.get(tipo);
        if(conjunto!=null){
            Iterator<Entrada> it=conjunto.iterator();
            while(it.hasNext())
            {
                Entrada entrada= it.next();
                if(!entrada.isDisponible())
                {
                    cantidad++;
                }
            }
        }
        else
        {
            cantidad=0;
        }

        return cantidad;
    }

    //El metodo me devuelve un listado con todas las entradas disponibles
    public String listarEntradasDisponibles()
    {
        StringBuilder builder= new StringBuilder();
        Iterator<Map.Entry<String,HashSet<Entrada>>>it=mapaRecital.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,HashSet<Entrada>>conjunto=it.next();
            builder.append(conjunto.getKey()).append("\n");
            HashSet<Entrada> setEntrada=conjunto.getValue();
            Iterator<Entrada> itEntrada=setEntrada.iterator();
            while(itEntrada.hasNext())
            {
                Entrada entrada= itEntrada.next();
                if(entrada.isDisponible())
                {
                    builder.append(entrada.toString()).append("\n");
                }
            }
        }
        return builder.toString();
    }

    public String venderEntrada(String tipo)
    {
        String mensaje= "";
        boolean vendida=false;
        HashSet<Entrada> setEntradas=mapaRecital.get(tipo);
        if(setEntradas==null)
        {
            mensaje="Entrada no disponible";
        }
        else
        {
            Iterator<Entrada> it= setEntradas.iterator();
            while(it.hasNext() && vendida==false)
            {
                Entrada entrada= it.next();
                if(entrada.isDisponible())
                {
                    entrada.setDisponible(false);
                    vendida=true;
                    mensaje="Entrada vendida";
                }
            }
        }
        return mensaje;
    }

    public int totalRecaudado()
    {
        int total=0;
        Iterator<Map.Entry<String,HashSet<Entrada>>>it=mapaRecital.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,HashSet<Entrada>>conjunto=it.next();
            HashSet<Entrada> setEntrada=conjunto.getValue();
            Iterator<Entrada> iterarEntrada= setEntrada.iterator();
            while(iterarEntrada.hasNext())
            {
                Entrada entrada= iterarEntrada.next();
                if(!entrada.isDisponible())
                {
                    total+=entrada.obtenerPrecioFinal();
                }

            }
        }
        return total;
    }
}
