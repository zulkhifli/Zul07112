package Entity;

public class Zul07112_Pelanggan {
    private int zul07112_masuk;
    private int zul07112_keluar;
    private int zul07112_total;
    private int zul07112_tarif;
    private Parkir data;
    
    public Zul07112_Pelanggan(int zul07112_masuk,int zul07112_keluar,int zul07112_total,int zul07112_tarif,Parkir data){
    
            this.zul07112_masuk = zul07112_masuk;
            this.zul07112_keluar = zul07112_keluar;
            this.zul07112_total = zul07112_total;
            this.zul07112_tarif = zul07112_tarif;
            this.data = data;
        }
    public Zul07112_Pelanggan(){
    }
    public void setZul07112_masuk(int zul07112_masuk) {
        this.zul07112_masuk = zul07112_masuk;
    }
    public int getZul07112_masuk(){
        return zul07112_masuk;
    }
    public void setZul07112_keluar(int zul07112_keluar) {
        this.zul07112_keluar = zul07112_keluar;
    }
    public int getZul07112_keluar(){
        return zul07112_keluar;
    }
    public void setZul07112_total(int zul07112_total) {
        this.zul07112_total = zul07112_total;
    }
    public int getZul07112_total(){
        return zul07112_total;
    }
    public void setZul07112_tarif(int zul07112_tarif) {
        this.zul07112_tarif = zul07112_tarif;
    }
    public int getZul07112_tarif(){
        return zul07112_tarif;
    }
    public void setData(Parkir data){
        this.data = data;
    }
    public Parkir getData(){
        return data;
    }
}