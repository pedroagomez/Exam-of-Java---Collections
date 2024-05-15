package Entrada;

import java.util.Objects;

public abstract class Entrada {
    private int id;
    private static int idStatic=0;

    private float precio;
    private boolean disponible;

    public Entrada(float precio, boolean disponible) {
        this.id = idStatic++;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract String obtenerTipo();
    public abstract float obtenerPrecioFinal();

    @Override
    public String toString() {
        return "Entrada " +
                "id=" + id +
                ", disponible=" + disponible +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
      boolean esIgual=false;
      if(o!=null)
      {
          if(o instanceof Entrada)
          {
              Entrada entrada=(Entrada)o;
              if(entrada.getId()==getId())
              {
                  esIgual=true;
              }
          }
      }
      return esIgual;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
