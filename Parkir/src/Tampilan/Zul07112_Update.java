package Tampilan;

import Entity.*;
import Controller.*;
import Tampilan.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zul07112_Update {
    JFrame Tampilanupdate = new JFrame();
    JButton back,ok;
    JLabel update;
    JTextField textlama,textbaru;
    JLabel labellama,labelbaru;
    public Zul07112_Update(){
        Tampilanupdate.setSize(400, 500);
        Tampilanupdate.setLayout(null);
        Tampilanupdate.getContentPane().setBackground(Color.GREEN);
        
        update = new JLabel("UPDATE");
        update.setBounds(50, 10, 600, 50);
        update.setFont(new Font("Consolas",Font.BOLD,40));
        Tampilanupdate.add(update);
        
        labellama = new JLabel("Masukkan Data Lama");
        labellama.setBounds(50, 70, 150, 30);
        Tampilanupdate.add(labellama);
        textlama = new JTextField();
        textlama.setBounds(50, 100, 200, 30);
        Tampilanupdate.add(textlama);
        
        labelbaru = new JLabel("Masukkan Data Baru");
        labelbaru.setBounds(50, 130, 150, 30);
        Tampilanupdate.add(labelbaru);
        textbaru = new JTextField();
        textbaru.setBounds(50, 160, 200, 30);
        Tampilanupdate.add(textbaru);
        
        ok = new JButton("PERBARUI");
        ok.setBounds(50, 300, 100, 30);
        ok.setBackground(Color.YELLOW);
        Tampilanupdate.add(ok);
        
        back = new JButton("KEMBALI");
        back.setBounds(50, 340, 100, 30);
        back.setBackground(Color.RED);
        Tampilanupdate.add(back);
        
        Tampilanupdate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilanupdate.setVisible(true);
        Tampilanupdate.setLocationRelativeTo(null);
        
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cari = new String(textlama.getText());
                String baru = new String(textbaru.getText());
                Zul07112_Object.parkiran.update(cari, baru);
                JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Tampilanupdate.dispose();
                Zul07112_GUI men = new Zul07112_GUI();
            }
        });
    }
}