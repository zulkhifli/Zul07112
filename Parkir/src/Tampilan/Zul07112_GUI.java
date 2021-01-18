package Tampilan;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zul07112_GUI {
    JFrame Tampilanawal = new JFrame();
    JLabel top;
    JTextField tpilih;
    JButton binput,bview,bupdate,bdelete;
    public Zul07112_GUI(){
        Tampilanawal.setSize(550, 400);
        Tampilanawal.setLayout(null);
        Tampilanawal.getContentPane().setBackground(Color.GREEN);
        top = new JLabel("PARKIR MOBIL MENTARI");
        top.setBounds(50, 50, 600, 50);
        top.setFont(new Font("Consolas",Font.BOLD,40));
        Tampilanawal.add(top);
        
        binput = new JButton("1. Daftar ");
        binput.setBounds(220, 120, 100, 30);
        binput.setBackground(Color.YELLOW);
        Tampilanawal.add(binput);
        
        bview = new JButton("2. View ");
        bview.setBounds(220, 170, 100, 30);
        bview.setBackground(Color.YELLOW);
        Tampilanawal.add(bview);
        
        bupdate = new JButton("3. Update ");
        bupdate.setBounds(220, 220, 100, 30);
        bupdate.setBackground(Color.YELLOW);
        Tampilanawal.add(bupdate);
        
        bdelete = new JButton("4. Delete ");
        bdelete.setBounds(220, 270, 100, 30);
        bdelete.setBackground(Color.YELLOW);
        Tampilanawal.add(bdelete);
        
        Tampilanawal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilanawal.setVisible(true);
        Tampilanawal.setLocationRelativeTo(null);
        
        binput.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Zul07112_Daftar GUIdaftar = new Zul07112_Daftar();
                Tampilanawal.dispose();
            }
        });
        bview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Zul07112_View GUIview = new Zul07112_View();
                Tampilanawal.dispose();
            }
        });
        bupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Zul07112_Update GUIupdate = new Zul07112_Update();
                Tampilanawal.dispose();
            }
        });
        bdelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Zul07112_Delete GUIdelete = new Zul07112_Delete();
                Tampilanawal.dispose();
            }
        });
    }
}