package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Impacto extends JFrame {
    public JPanel panel = new JPanel();

    public  Impacto(){
        panel.setLayout(null); 

        this.setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel); 
       
        JLabel title = new JLabel("Impacto", SwingConstants.CENTER);
        title.setBounds( 90,10,300,30);
        title.setFont(new Font("arial", Font.BOLD,20));
        panel.add(title); 

        //Opciones
        userImpact();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void userImpact(){

        JLabel water= new JLabel("Agua ahorrada aprox.", SwingConstants.CENTER);
        water.setBounds( 10,40,300,50);
        water.setFont(new Font("arial", Font.BOLD,14));
        water.setOpaque(true);
        water.setBackground(Color.decode("#dbeddc"));
        panel.add(water); 

        JLabel waterC= new JLabel("20 Litros", SwingConstants.CENTER);
        waterC.setBounds( 335,40,140,50);
        waterC.setFont(new Font("arial", Font.BOLD,14));
        waterC.setOpaque(true);
        waterC.setBackground(Color.decode("#0096d2"));
        panel.add(waterC); 
        

        JLabel elect= new JLabel("Energía ahorrada aprox.", SwingConstants.CENTER);
        elect.setBounds( 10,100,300,50);
        elect.setFont(new Font("arial", Font.BOLD,14));
        elect.setOpaque(true);
        elect.setBackground(Color.decode("#dbeddc"));
        panel.add(elect); 

        JLabel electC= new JLabel("5 kWh", SwingConstants.CENTER);
        electC.setBounds( 335,100,140,50);
        electC.setFont(new Font("arial", Font.BOLD,14));
        electC.setOpaque(true);
        electC.setBackground(Color.decode("#0096d2"));
        panel.add(electC); 
        
        JLabel tip= new JLabel("Consejo", SwingConstants.CENTER);
        tip.setBounds( 5,160,100,30);
        tip.setFont(new Font("arial", Font.BOLD,14));
        tip.setForeground(Color.green);
        panel.add(tip); 

        //Metodo random para imprimir un consejo diferente cada vez
        JTextArea tip1= new JTextArea("Todas las personas estamos interconectadas y dependemos\n las unas de las otras. Todas y todas sumamos.\n Todos los gestos suman. Todo suma, también en la\n defensa de nuestro patrimonio más ancestral:\n el medio ambiente.");
        tip1.setBounds(20, 200, 400, 150);
        tip1.setEditable(false);
        panel.add(tip1);
        //Acciones 

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

        //Volver a la pagina inicial

    }

}
