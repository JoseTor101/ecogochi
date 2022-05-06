package vistas;

import java.awt.event.*;
import java.lang.reflect.GenericArrayType;
import java.awt.*;
import javax.swing.*;
import perfiles.Personas;

public class UserVerification extends JFrame {

    public JPanel panel = new JPanel();

    public UserVerification() {
        panel.setLayout(null);

        this.setSize(500, 250);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Inicie sesión", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Opciones
        login();
    }

    private void login() {

        int x = 2;
        Personas[] persona = new Personas[100];
        persona[0] = new Personas("Ricardo", "tuki", "ricardogandica@hotmail.com");
        persona[1] = new Personas("Jose", "retuki", "correo");

        JTextField mail = new JTextField("correo");
        mail.setBounds(110, 50, 250, 30);
        // System.out.println("Ingresado: "+text1.getText());
        panel.add(mail);

        JTextField password = new JTextField("contraseña");
        password.setBounds(110, 90, 250, 30);
        // System.out.println("Ingresado: "+text1.getText());
        panel.add(password);

        JButton send = new JButton("Enviar");
        send.setBounds(160, 150, 170, 50);
        send.setBackground(Color.decode("#dbeddc"));
        send.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(send);

        // Acciones
            ActionListener signA = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Usuario v1 = new Usuario();
                    v1.setVisible(true);
                    dispose();
                }
            };
            send.addActionListener(signA);

        
        JButton home = new JButton();
        home.setBounds(5, 5, 15, 15);
        ImageIcon house = new ImageIcon("img/home.png");
        home.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(home);

        ActionListener goHome = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Home v1 = new Home();
                v1.setVisible(true);
                dispose();
            }
        };
        home.addActionListener(goHome);

        // Verificar que no estén vacios los campos
        // Ir a Usuario.java

    }

}
