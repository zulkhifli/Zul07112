package Controller;

import Entity.Zul07112_Pelanggan;
import Model.Parkiran;
import java.util.ArrayList;

public class Zul07112_Controller {
    public Zul07112_Controller(){
    }
    public void Insert(Zul07112_Pelanggan pelanggan){
        Zul07112_Object.parkiran.insert(pelanggan);
    }
    public void Delete(String zul07112_nama,String zul07112_plat){
        Zul07112_Object.parkiran.delete(zul07112_nama, zul07112_plat);
    }
    public void Update(String zul07112_update,String baru){
        Zul07112_Object.parkiran.update(zul07112_update, baru);
    }
    public ArrayList<Zul07112_Pelanggan> View(){
        return Zul07112_Object.parkiran.dataPelanggan;
    }
    public ArrayList<Zul07112_Pelanggan> getData(){
        return Zul07112_Object.parkiran.getArrPelanggan();
    }
}