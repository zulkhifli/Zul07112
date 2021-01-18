package Tampilan;

import Entity.*;
import Controller.*;
import Tampilan.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zul07112_Delete {
    JFrame Tampilandelete = new JFrame();
    JButton back,hapus;
    JLabel delete;
    JTextField textnama,textplat;
    JLabel labelnama,labelplat;
    public Zul07112_Delete(){
        Tampilandelete.setSize(400, 500);
        Tampilandelete.setLayout(null);
        Tampilandelete.getContentPane().setBackground(Color.RED);
        
        delete = new JLabel("DELETE");
        delete.setBounds(50, 10, 600, 50);
        delete.setFont(new Font("Consolas",Font.BOLD,40));
        Tampilandelete.add(delete);
        
        labelnama = new JLabel("Masukkan Nama");
        labelnama.setBounds(50, 70, 100, 30);
        Tampilandelete.add(labelnama);
        textnama = new JTextField();
        textnama.setBounds(50, 100, 200, 30);
        Tampilandelete.add(textnama);
        
        labelplat = new JLabel("Masukkan Plat");
        labelplat.setBounds(50, 130, 100, 30);
        Tampilandelete.add(labelplat);
        textplat = new JTextField();
        textplat.setBounds(50, 160, 200, 30);
        Tampilandelete.add(textplat);
        
        hapus = new JButton("HAPUS");
        hapus.setBounds(50, 300, 100, 30);
        hapus.setBackground(Color.WHITE);
        Tampilandelete.add(hapus);
        
        back = new JButton("KEMBALI");
        back.setBounds(50, 340, 100, 30);
        back.setBackground(Color.WHITE);
        Tampilandelete.add(back);
        
        Tampilandelete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilandelete.setVisible(true);
        Tampilandelete.setLocationRelativeTo(null);
        
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String zul07112_nama = textnama.getText();
                String zul07112_plat = textplat.getText();
                Zul07112_Object.parkiran.delete(zul07112_nama, zul07112_plat);
                JOptionPane.showMessageDialog(null, "Berhasil","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Tampilandelete.dispose();
                Zul07112_GUI men = new Zul07112_GUI();
            }
        });
    }
}