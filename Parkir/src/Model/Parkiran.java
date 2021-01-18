package Model;

import Entity.Zul07112_Pelanggan;
import java.util.ArrayList;

public class Parkiran implements Zul07112_Interfaces{
    public ArrayList <Zul07112_Pelanggan> dataPelanggan;
    
    public Parkiran(){
        this.dataPelanggan = new ArrayList<>();
    }
    
    public void insert (Zul07112_Pelanggan pelanggan){
        dataPelanggan.add(pelanggan);
    }
    
    public ArrayList<Zul07112_Pelanggan>view(){
        return dataPelanggan;
    }
    
    public ArrayList<Zul07112_Pelanggan>getArrPelanggan(){
        return dataPelanggan;
    }
    
    @Override
    public void update(String update, String baru){
        
        for(int i=0; i<dataPelanggan.size(); i++){
            if(update.equals(dataPelanggan.get(i).getData().getZul07112_nama())){
                dataPelanggan.get(i).getData().setZul07112_nama(baru);
            }
        }
    }
    
    @Override
    public void delete(String zul07112_nama,String zul07112_plat){
        for(int i=0; i<dataPelanggan.size(); i++){
            if(dataPelanggan.get(i).getData().getZul07112_nama().equals(zul07112_nama) && dataPelanggan.get(i).getData().getZul07112_plat().equals(zul07112_plat)){
            dataPelanggan.remove(i);
            }
        }
    }
}