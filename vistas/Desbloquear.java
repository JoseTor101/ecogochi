package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import perfiles.*;

public class Desbloquear extends JFrame {

    private int i;
    public JPanel panel = new JPanel();

    public Desbloquear() {

        panel.setLayout(null);

        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Desbloquear", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Opciones
        userView();
    }

    private void userView() {

        JButton pet1 = new JButton();
        pet1.setBounds(50, 50, 170, 50);
        pet1.setBackground(Color.decode("#dbeddc"));
        pet1.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet1i =  new ImageIcon("img/puma.png");
        pet1.setIcon(new ImageIcon(pet1i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet1);

        JButton pet2 = new JButton();
        pet2.setBounds(230, 50, 170, 50);
        pet2.setBackground(Color.decode("#dbeddc"));
        pet2.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet2i =  new ImageIcon("img/perezoso.png");
        pet2.setIcon(new ImageIcon(pet2i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet2);

        JButton pet3 = new JButton();
        pet3.setBounds(50, 110, 170, 50);
        pet3.setBackground(Color.decode("#dbeddc"));
        pet3.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet3i =  new ImageIcon("img/tigre.png");
        pet3.setIcon(new ImageIcon(pet3i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet3);

        JButton pet4 = new JButton();
        pet4.setBounds(230, 110, 170, 50);
        pet4.setBackground(Color.decode("#dbeddc"));
        pet4.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet4i =  new ImageIcon("img/tortuga.png");
        pet4.setIcon(new ImageIcon(pet4i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet4);

        JButton pet5 = new JButton();
        pet5.setBounds(50, 170, 170, 50);
        pet5.setBackground(Color.decode("#dbeddc"));
        pet5.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet5i =  new ImageIcon("img/polar.png");
        pet5.setIcon(new ImageIcon(pet5i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet5);

        JButton pet6 = new JButton();
        pet6.setBounds(230, 170, 170, 50);
        pet6.setBackground(Color.decode("#dbeddc"));
        pet6.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet6i =  new ImageIcon("img/panda.png");
        pet6.setIcon(new ImageIcon(pet6i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet6);

       
        JButton pet7 = new JButton();
        pet7.setBounds(50, 230, 170, 50);
        pet7.setBackground(Color.decode("#dbeddc"));
        pet7.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet7i =  new ImageIcon("img/axolot.png");
        pet7.setIcon(new ImageIcon(pet7i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet7);

        JButton pet8 = new JButton();
        pet8.setBounds(230, 230, 170, 50);
        pet8.setBackground(Color.decode("#dbeddc"));
        pet8.setFont(new Font("arial", Font.BOLD, 17));
        ImageIcon pet8i =  new ImageIcon("img/elefante.png");
        pet8.setIcon(new ImageIcon(pet8i.getImage().getScaledInstance(170, 50, Image.SCALE_SMOOTH)));
        panel.add(pet8);
        // Acciones

        // ActionListener pet1 = new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent ae) {
        //         Mascota v1 = new Mascota();
        //         v1.setVisible(true);
        //         dispose();
        //     }
        // };
        // pet.addActionListener(pet1);

        JButton home = new JButton();
        home.setBounds(5,5,15,15);
        ImageIcon house =  new ImageIcon("img/home.png");
        home.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(home);
        
                ActionListener goHome = new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae){ 
                        Usuario v1 = new Usuario();
                        v1.setVisible(true);
                        dispose();
                    }
                };
                home.addActionListener(goHome);
    }

    public void setPe(int i) {
        this.i = i;
    }

    public int getPe() {
        return i;
    }

}
