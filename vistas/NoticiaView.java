package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class NoticiaView extends JFrame {
    public JPanel panel = new JPanel();

    public NoticiaView(){
        panel.setLayout(null); 

        this.setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel); 
       
        JLabel title = new JLabel("Comunidad ecoamigable", SwingConstants.CENTER);
        title.setBounds( 90,10,300,30);
        title.setFont(new Font("arial", Font.BOLD,20));
        panel.add(title); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Opciones
        openNews();
    }
    private void openNews(){

        JLabel autor= new JLabel("Pedro Sanchez", SwingConstants.CENTER);
        autor.setBounds( 100,40,300,50);
        autor.setFont(new Font("arial", Font.BOLD,14));
        panel.add(autor); 


        JLabel fecha= new JLabel("10/02/2021", SwingConstants.CENTER);
        fecha.setBounds( 100,90,300,50);
        fecha.setFont(new Font("arial", Font.BOLD,14));
        panel.add(fecha); 
 

        JTextArea tip1= new JTextArea("Todas las personas estamos interconectadas y dependemos las unas\n de las otras. Todas y todas sumamos. Todos los\n gestos suman. Todo suma, también en la defensa de nuestro\n patrimonio más ancestral: el medio \nambiente.");
        tip1.setBounds(20, 140, 420, 150);
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
