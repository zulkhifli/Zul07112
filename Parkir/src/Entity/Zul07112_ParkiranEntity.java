package Entity;

public abstract class Zul07112_ParkiranEntity {
    protected String zul07112_nama,zul07112_plat;

    public Zul07112_ParkiranEntity(String zul07112_nama, String zul07112_plat) {
        this.zul07112_nama = zul07112_nama;
        this.zul07112_plat = zul07112_plat;
    }
    public void setZul07112_nama(String zul07112_nama) {
        this.zul07112_nama = zul07112_nama;
    }
    public String getZul07112_nama(){
        return zul07112_nama;
    }
    public void setZul07112_plat(String zul07112_plat) {
        this.zul07112_plat = zul07112_plat;
    }
    public String getZul07112_plat(){
        return zul07112_plat;
    }
}