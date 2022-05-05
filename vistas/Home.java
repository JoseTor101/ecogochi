package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


public class Home extends JFrame{
    public JPanel panel = new JPanel();

    public Home(){
        panel.setLayout(null); 

        this.setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel); 
       
        //Imagen de fondo
        JLabel backImg = new JLabel();
        ImageIcon imgB = new ImageIcon("img/fon.png");
        backImg.setBounds(140,20,200,160);
        //Escalar la imagen
        backImg.setIcon(new ImageIcon(imgB.getImage().getScaledInstance(200, 160, Image.SCALE_SMOOTH)));
        panel.add(backImg);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Opciones
        userOptions();
    }

    private void userOptions(){
        JButton login = new JButton("Iniciar sesión");
        login.setBounds(160,190,170,50);
        login.setBackground(Color.decode("#dbeddc"));
        login.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(login);

        JButton signUp = new JButton("Registrarse");
        signUp.setBounds(160,250,170,50);
        signUp.setBackground(Color.decode("#dbeddc"));
        signUp.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(signUp);

        //Acciones 

        ActionListener loginA = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                UserVerification v1 = new UserVerification();
                v1.setVisible(true);
                dispose();
            }
        };
        login.addActionListener(loginA);

        ActionListener signA = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                Registro v1 = new Registro();
                v1.setVisible(true);
                dispose();
            }
        };
        signUp.addActionListener(signA);
    }
}
