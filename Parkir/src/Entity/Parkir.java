package Entity;

public class Parkir extends Zul07112_ParkiranEntity {
    public Parkir (String zul07112_nama,String zul07112_plat){
        super (zul07112_nama, zul07112_plat);
    }
    @Override
    public String getZul07112_nama(){
        return zul07112_nama;
    }
    @Override
    public void setZul07112_nama(String zul07112_nama){
        this.zul07112_nama = zul07112_nama;
    }
    @Override
    public String getZul07112_plat(){
        return zul07112_plat;
    }
    @Override
    public void setZul07112_plat(String zul07112_plat){
        this.zul07112_plat = zul07112_plat;
    }
}
