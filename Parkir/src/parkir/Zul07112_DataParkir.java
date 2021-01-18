package parkir;

/*import Entity.*;
import Controller.Zul07112_Controller;
import java.util.Scanner;*/
import Tampilan.Zul07112_GUI;

public class Zul07112_DataParkir {
    
    /*static Scanner input = new Scanner(System.in);
    static Zul07112_Controller control = new Zul07112_Controller();*/
    
    public static void main(String[] args) {
        Zul07112_GUI gui = new Zul07112_GUI();
    }
}
/*try{
        System.out.println(" SELAMAT DATANG !!");
        System.out.println("__________________");
        int pil;
        do{
            System.out.println("1. Daftar   ");
            System.out.println("2. View     ");
            System.out.println("3. Update   ");
            System.out.println("4. Delete   ");
            System.out.println("5. Exit     ");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            switch(pil){
                case 1 : 
                    daftar();
                break;
                case 2 :
                    view();
                break;
                case 3 : 
                    updatedata();
                break;
                case 4 : 
                    delete();
                break;
            }
        }while(pil !=5);
    }catch (Exception x){
            System.out.println("Input Salah");
    }*/
    /*static void daftar(){
        System.out.print("Nama Pelanggan    : ");
        String zul07112_nama = input.next();
        System.out.print("Input Plat Nomor  : ");
        String zul07112_plat = input.next();
        System.out.print("Input Jam Masuk   : ");
        int zul07112_masuk = input.nextInt();
        System.out.print("Input Jam Keluar  : ");
        int zul07112_keluar = input.nextInt();
        int zul07112_total = zul07112_keluar - zul07112_masuk;
        int zul07112_tarif = zul07112_total * 5000;
            System.out.println("Nama        : "+zul07112_nama);
            System.out.println("Plat Nomor  : "+zul07112_plat);
            System.out.println("Jam Masuk   : "+zul07112_masuk+"WIB");
            System.out.println("Jam Keluar  : "+zul07112_keluar+"WIB");
            System.out.println("Lama Parkir : "+zul07112_total+"JAM");
            System.out.println("Tarif Parkir:Rp."+zul07112_tarif);
            Parkir data = new Parkir(zul07112_nama,zul07112_plat);
            control.Insert(new Zul07112_Pelanggan(zul07112_masuk, zul07112_keluar, zul07112_tarif, zul07112_total, data));
    }  
    static void view(){
        for(Zul07112_Pelanggan hasil : control.View()){
        System.out.println("Nama        : "+hasil.getData().getZul07112_nama());
        System.out.println("Plat Nomor  : "+hasil.getData().getZul07112_plat());
        System.out.println("Jam Masuk   : "+hasil.getZul07112_masuk()+"WIB");
        System.out.println("Jam Keluar  : "+hasil.getZul07112_keluar()+"WIB");
        System.out.println("Lama Parkir : "+hasil.getZul07112_total()+"JAM");
        System.out.println("Tarif Parkir:Rp."+hasil.getZul07112_tarif());
        }
    }
    static void updatedata() {
        System.out.print("Masukkan data yang lama : ");
        String cari = input.next();
        System.out.print("Masukkan data yang baru : ");
        String baru = input.next();
        control.Update(cari, baru);
    }
    static void delete() {
        System.out.print("Masukkan nama : ");
        String zul07112_nama = input.next();
        System.out.print("Masukkan plat : ");
        String zul07112_plat = input.next();
        control.Delete(zul07112_nama, zul07112_plat);
    }*/