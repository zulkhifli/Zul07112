package Tampilan;

import Entity.*;
import Controller.*;
import Tampilan.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Zul07112_View {
    JFrame Tampilanview = new JFrame();
    JButton back;
    JLabel view;
    String vw[] = {"Nama","Plat","Jam Masuk","Jam Keluar","Tarif","Total"};
    DefaultTableModel mod = new DefaultTableModel(vw, 0);
    JScrollPane scrol = new JScrollPane();
    JTable tabel = new JTable(mod);
    public Zul07112_View(){
        Tampilanview.setSize(600, 550);
        Tampilanview.setLayout(null);
        Tampilanview.getContentPane().setBackground(Color.GREEN);
        
        view = new JLabel("Data Pelanggan");
        view.setBounds(50, 10, 600, 50);
        view.setFont(new Font("Consolas",Font.BOLD,40));
        Tampilanview.add(view);
        
        for(int i=0; i<Zul07112_Object.parkiran.view().size(); i++){
            String zul07112_nama = Zul07112_Object.parkiran.view().get(i).getData().getZul07112_nama();
            String zul07112_plat = Zul07112_Object.parkiran.view().get(i).getData().getZul07112_plat();
            int zul07112_masuk = Zul07112_Object.parkiran.view().get(i).getZul07112_masuk();
            int zul07112_keluar = Zul07112_Object.parkiran.view().get(i).getZul07112_keluar();
            int zul07112_tarif = Zul07112_Object.parkiran.view().get(i).getZul07112_tarif();
            int zul07112_total = Zul07112_Object.parkiran.view().get(i).getZul07112_total();
            Object[] object = {zul07112_nama,zul07112_plat,zul07112_masuk,zul07112_keluar,zul07112_tarif,zul07112_total};
            mod.addRow(object);
        }
        scrol.setViewportView(tabel);
        scrol.setBounds(50, 60, 450, 300);
        tabel.setModel(mod);
        Tampilanview.add(scrol);
        
        back = new JButton("KEMBALI");
        back.setBounds(50, 420, 120, 30);
        back.setBackground(Color.RED);
        Tampilanview.add(back);
        
        Tampilanview.setVisible(true);
        Tampilanview.setLocationRelativeTo(null);
        Tampilanview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Tampilanview.dispose();
                Zul07112_GUI men = new Zul07112_GUI();
            }
        });
    }
}