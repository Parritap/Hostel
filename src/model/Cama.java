package model;

public class Cama {
    private String id;
    private TipoGeneric tipoCama;
    private boolean estado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoGeneric getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(TipoGeneric tipoCama) {
        this.tipoCama = tipoCama;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
