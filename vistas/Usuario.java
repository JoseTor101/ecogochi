package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import perfiles.Personas;

public class Usuario extends JFrame {
    public static boolean recargar = false;
    private int i ;
    public JPanel panel = new JPanel();

    public Usuario() {

        panel.setLayout(null);

        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Perfil", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Opciones
        userView();
    }

    private void userView() {

        Personas[] persona = new Personas[100];
        persona[0] = new Personas("Ricardo", "tuki", "ricardogandica@hotmail.com");
        persona[1] = new Personas("Jose", "retuki", "correo");

        JLabel name = new JLabel("Nombre: josetor101");
        name.setBounds(30, 40, 300, 30);
        name.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(name);

        JLabel points = new JLabel();
        points.setText("Puntos: "+Personas.puntos);
        points.setBounds(30, 70, 300, 30);
        points.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(points);

        if(recargar){
            points.setText("Puntos: "+Personas.puntos);
        }
        JButton pet = new JButton("Mascota");
        pet.setBounds(50, 190, 170, 50);
        pet.setBackground(Color.decode("#dbeddc"));
        pet.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(pet);

        JButton task = new JButton("Tareas");
        task.setBounds(230, 190, 170, 50);
        task.setBackground(Color.decode("#dbeddc"));
        task.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(task);

        JButton impacto = new JButton("Impacto");
        impacto.setBounds(50, 250, 170, 50);
        impacto.setBackground(Color.decode("#dbeddc"));
        impacto.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(impacto);

        JButton noticia = new JButton("Noticias");
        noticia.setBounds(230, 250, 170, 50);
        noticia.setBackground(Color.decode("#dbeddc"));
        noticia.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(noticia);
        // Acciones

        ActionListener pet1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Mascota v1 = new Mascota();
                v1.setVisible(true);
                dispose();
            }
        };
        pet.addActionListener(pet1);

        ActionListener task1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Tareas v1 = new Tareas();
                v1.setVisible(true);
                dispose();
            }
        };
        task.addActionListener(task1);

        ActionListener impact1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Impacto v1 = new Impacto();
                v1.setVisible(true);
                dispose();
            }
        };
        impacto.addActionListener(impact1);

        ActionListener noticia1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Noticias v1 = new Noticias();
                v1.setVisible(true);
                dispose();
            }
        };
        noticia.addActionListener(noticia1);
        // Volver a la pagina inicial

    }

    public void setPe(int i) {
        this.i = i;
    }

    public int getPe() {
        return i;
    }

}
