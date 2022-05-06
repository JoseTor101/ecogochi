package vistas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class Mascota extends JFrame {
    public static int salud = 100;
    public static int sueno = 100;
    public static int hambre= 100;
    public static String riesgo = "vulnerable";

    public JPanel panel = new JPanel();

    public Mascota(){
        panel.setLayout(null);
        this.setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel); 
       
        JLabel title = new JLabel("Mascota", SwingConstants.CENTER);
        title.setBounds( 90,10,300,30);
        title.setFont(new Font("arial", Font.BOLD,20));
        panel.add(title); 

        //Opciones
        petView();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void petView(){

        JLabel picture = new JLabel();
        ImageIcon img = new ImageIcon("img/ante.png");
        picture.setBounds(30,30,250,200);
        picture.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)));
        panel.add(picture);
        
        JLabel health= new JLabel("Salud: "+salud+"%", SwingConstants.CENTER);
        health.setBounds( 300,60,100,30);
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

        JLabel hunger= new JLabel("Hambre: "+hambre+"%", SwingConstants.CENTER);
        hunger.setBounds( 300,100,100,30);
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

        JLabel sleep= new JLabel("Sueño: "+sueno+"%", SwingConstants.CENTER);
        sleep.setBounds( 300,140,100,30);
        sleep.setFont(new Font("arial", Font.BOLD,14));
        sleep.setOpaque(true);
        panel.add(sleep); 

        if (Mascota.sueno<= 25) {
            sleep.setBackground(Color.RED);
        } else if(Mascota.sueno > 25 && Mascota.sueno<= 70){
            sleep.setBackground(Color.YELLOW);
        } else{
            sleep.setBackground(Color.GREEN);
        }


        JLabel risk= new JLabel("Nivel de riesgo: "+riesgo, SwingConstants.CENTER);
        risk.setBounds( 140,240,200,20);
        risk.setFont(new Font("arial", Font.BOLD,14));
        risk.setForeground(Color.orange);
        panel.add(risk); 

        JButton takeCare = new JButton("Cuidar");
        takeCare.setBounds(50,270,170,50);
        takeCare.setBackground(Color.decode("#ffa0bd"));
        takeCare.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(takeCare);

        JButton unlock = new JButton("Desbloquear");
        unlock.setBounds(240,270,170,50);
        unlock.setBackground(Color.decode("#dbeddc"));
        unlock.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(unlock);

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

        ActionListener takeCareG = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                Cuidar v1 = new Cuidar();
                v1.setVisible(true);
                dispose();
            }
        };
        takeCare.addActionListener(takeCareG);

        ActionListener unlock1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                Desbloquear v1 = new Desbloquear();
                v1.setVisible(true);
                dispose();
            }
        };
        unlock.addActionListener(unlock1);
        
        Timer timer = new Timer();
        TimerTask t1 = new TimerTask() {
            public void run(){
                if(salud != 0){
                    salud -= 1;
                } 
                if(hambre != 0){
                    hambre -= 5;
                } 
                if(sueno != 0){
                    sueno -= 2;
                } 
                sleep.setText("Sueño: "+sueno+"%");
                health.setText("Salud: "+salud+"%");
                hunger.setText("Hambre: "+hambre+"%");
            }
        };
        timer.schedule(t1, 0, 10000);
    }
    
    

}