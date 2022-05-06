package vistas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cuidar extends JFrame {
    public static JPanel panel = new JPanel();

    public Cuidar(){
        panel.setLayout(null);
        this.setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel); 
       
        JLabel title = new JLabel("Oso de anteojos", SwingConstants.CENTER);
        title.setBounds( 90,10,300,30);
        title.setFont(new Font("arial", Font.BOLD,20));
        panel.add(title); 
        //Opciones
        petCare();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void petCare(){

        JLabel picture = new JLabel();
        ImageIcon img = new ImageIcon("img/ante.png");
        picture.setBounds(130,30,250,200);
        picture.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)));
        panel.add(picture);
        
        JLabel health= new JLabel("Salud:"+Mascota.salud+"%", SwingConstants.CENTER);
        health.setBounds( 50,250,80,20);
        health.setFont(new Font("arial", Font.BOLD,14));
        health.setOpaque(true);
        panel.add(health); 
        
        if (Mascota.salud <= 25) {
            health.setBackground(Color.RED);
        } else if(Mascota.salud > 25 && Mascota.salud <= 70){
            health.setBackground(Color.YELLOW);
        } else{
            health.setBackground(Color.GREEN);
        }

        JButton buttonHealth = new JButton();
        buttonHealth.setBounds(50,275,  80,80);
        //button2.setOpaque(true); si no se puede cambiar el color de fondo
        ImageIcon ima =  new ImageIcon("img/health.png");
        buttonHealth.setIcon(new ImageIcon(ima.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(buttonHealth);
        
        JLabel hunger= new JLabel("Hambre:"+Mascota.hambre+"%", SwingConstants.CENTER);
        hunger.setBounds( 195,250,100,20);
        hunger.setFont(new Font("arial", Font.BOLD,14));
        hunger.setOpaque(true);
        panel.add(hunger); 

        if (Mascota.hambre <= 25) {
            hunger.setBackground(Color.RED);
        } else if(Mascota.hambre > 25 && Mascota.hambre <= 70){
            hunger.setBackground(Color.YELLOW);
        } else{
            hunger.setBackground(Color.GREEN);
        }

        JButton buttonHunger = new JButton();
        buttonHunger.setBounds(200,275,  80,80);
        //button2.setOpaque(true); si no se puede cambiar el color de fondo
        ImageIcon imah =  new ImageIcon("img/hunger.jpg");
        buttonHunger.setIcon(new ImageIcon(imah.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(buttonHunger);
        
        JLabel sleep= new JLabel("Sueño:"+Mascota.sueno+"%", SwingConstants.CENTER);
        sleep.setBounds( 370,250,90,20);
        sleep.setFont(new Font("arial", Font.BOLD,14));
        sleep.setOpaque(true);
        panel.add(sleep); 

        JButton buttonSleep = new JButton();
        buttonSleep.setBounds(360,275,  90,80);
        ImageIcon imaS =  new ImageIcon("img/sleep.png");
        buttonSleep.setIcon(new ImageIcon(imaS.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(buttonSleep);
        
        if (Mascota.sueno<= 25) {
            sleep.setBackground(Color.RED);
        } else if(Mascota.sueno > 25 && Mascota.sueno<= 70){
            sleep.setBackground(Color.YELLOW);
        } else{
            sleep.setBackground(Color.GREEN);
        }

        JButton home = new JButton();
        home.setBounds(5,5,15,15);
        ImageIcon house =  new ImageIcon("img/home.png");
        home.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(home);
        
        
        ActionListener health1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                if (Mascota.salud <95) {
                    Mascota.salud += 5;
                } 
                health.setText("Salud: "+Mascota.salud+"%");
            }
        };
        buttonHealth.addActionListener(health1);

        ActionListener hunger1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                if (Mascota.hambre <100) {
                    Mascota.hambre += 5;
                } 
                hunger.setText("Hambre:"+Mascota.hambre+"%");
            }
        };
        buttonHunger.addActionListener(hunger1);

        ActionListener sleep1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                if (Mascota.sueno<96) {
                    Mascota.sueno += 4;
                } 
                sleep.setText("Sueño:"+Mascota.sueno+"%");
            }
        };
        buttonSleep.addActionListener(sleep1);

        ActionListener goHome = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                dispose();
                Usuario v1 = new Usuario();
                v1.setVisible(true);
                
            }
        };
        home.addActionListener(goHome);


    }
    

}