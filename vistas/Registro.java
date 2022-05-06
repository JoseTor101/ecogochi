package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

import perfiles.Personas;
import vistas.UserVerification;

public class Registro extends JFrame {
    public JPanel panel = new JPanel();

    public Registro() {
        panel.setLayout(null);

        this.setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("REGISTRARSE", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Opciones
        userSignUp();
    }

    private void userSignUp() {

        JTextField name = new JTextField("Nombre de usuario");
        name.setBounds(110, 50, 250, 30);
        // System.out.println("Ingresado: "+text1.getText());
        panel.add(name);

        JTextField password = new JTextField("Contraseña");
        password.setBounds(110, 90, 250, 30);
        // System.out.println("Ingresado: "+text1.getText());
        panel.add(password);

        JTextField mail = new JTextField("Correo");
        mail.setBounds(110, 130, 250, 30);
        // System.out.println("Ingresado: "+text1.getText());
        panel.add(mail);

        JButton send = new JButton("Enviar");
        send.setBounds(160, 190, 170, 50);
        send.setBackground(Color.decode("#dbeddc"));
        send.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(send);

        // Acciones

        JButton log = new JButton();
        log.setBounds(5, 5, 15, 15);
        ImageIcon house = new ImageIcon("img/home.png");
        log.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(log);

        // Verificar que no estén vacios los campos
        // Volver a la pagina inicial
            ActionListener log1 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    // String nombre = name.getText().trim();
                    // String correo = mail.getText().trim();
                    // String contraseña = password.getText().trim();
                    // Personas[] persona = new Personas[100];
                    // persona[3] = new Personas(nombre, contraseña, correo);

                    Home v1 = new Home();
                    v1.setVisible(true);
                    dispose();

                }
            };
            log.addActionListener(log1);
            ActionListener send1 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {

                    Usuario v1 = new Usuario();
                    v1.setVisible(true);
                    dispose();

                }
            };
            send.addActionListener(send1);
        
    }

}
