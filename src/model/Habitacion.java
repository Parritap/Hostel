package model;

import java.util.ArrayList;

public class Habitacion {
   private ArrayList<Cama> listaCamas;
   private String id;
   private boolean camaExtra;
   private boolean estado;
   private TipoGeneric tipoHabitacion;

   public ArrayList<Cama> getListaCamas() {
      return listaCamas;
   }

   public void setListaCamas(ArrayList<Cama> listaCamas) {
      this.listaCamas = listaCamas;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public boolean isCamaExtra() {
      return camaExtra;
   }

   public void setCamaExtra(boolean camaExtra) {
      this.camaExtra = camaExtra;
   }

   public boolean isEstado() {
      return estado;
   }

   public void setEstado(boolean estado) {
      this.estado = estado;
   }

   public TipoGeneric getTipoHabitacion() {
      return tipoHabitacion;
   }

   public void setTipoHabitacion(TipoGeneric tipoHabitacion) {
      this.tipoHabitacion = tipoHabitacion;
   }
}

