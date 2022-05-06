package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import perfiles.Personas;



public class Tareas extends JFrame {
    public JPanel panel = new JPanel();

    public Tareas(){
        panel.setLayout(null); 

        this.setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel); 
       
        JLabel title = new JLabel("Tareas", SwingConstants.CENTER);
        title.setBounds( 90,10,300,30);
        title.setFont(new Font("arial", Font.BOLD,20));
        panel.add(title); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Opciones
        task();
    }
    private void task(){

        JLabel water= new JLabel("Tarea 1- Cerrar las llaves de agua", SwingConstants.CENTER);
        water.setBounds( 10,40,300,50);
        water.setFont(new Font("arial", Font.BOLD,14));
        water.setOpaque(true);
        water.setBackground(Color.decode("#dbeddc"));
        panel.add(water); 
        
        JButton waterB = new JButton("Hacer");
        waterB.setBounds(335,40,140,50);
        waterB.setBackground(Color.green);
        waterB.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(waterB);

        JLabel elect= new JLabel("Tarea 2- Apagar las luces", SwingConstants.CENTER);
        elect.setBounds( 10,100,300,50);
        elect.setFont(new Font("arial", Font.BOLD,14));
        elect.setOpaque(true);
        elect.setBackground(Color.decode("#dbeddc"));
        panel.add(elect); 

        JButton electB = new JButton("Hacer");
        electB.setBounds(335,100,140,50);
        electB.setBackground(Color.green);
        electB.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(electB);
        
        JLabel food= new JLabel("Tarea 3- Come más saludablemente", SwingConstants.CENTER);
        food.setBounds( 10,160,300,50);
        food.setFont(new Font("arial", Font.BOLD,14));
        food.setOpaque(true);
        food.setBackground(Color.decode("#dbeddc"));
        panel.add(food); 

        JButton foodB = new JButton("Hacer");
        foodB.setBounds(335,160,140,50);
        foodB.setBackground(Color.green);
        foodB.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(foodB);
         

        //Acciones 

        JButton home = new JButton();
        home.setBounds(5,5,15,15);
        ImageIcon house =  new ImageIcon("img/home.png");
        home.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(home);
        
                ActionListener point1 = new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae){ 
                        Personas.puntos += 5;
                        Usuario.recargar = true;
                        Usuario v1 = new Usuario();
                        v1.setVisible(true);
                        dispose();
                    }
                };
                waterB.addActionListener(point1);
                ActionListener goHome = new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae){ 
                        Usuario v1 = new Usuario();
                        v1.setVisible(true);
                        dispose();
                    }
                };
                home.addActionListener(goHome);

        //Volver a la pagina inicial

    }

}
