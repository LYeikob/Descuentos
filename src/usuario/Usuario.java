/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author l_ryu_000
 */
public class Usuario  extends JFrame implements ActionListener{
JButton B;
JTextField texto;
JPasswordField tex;
public Usuario(){    
    
    
super ("Usuario");
   setSize(300, 400);
   
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JLabel etiqueta = new JLabel ("Nombre");
    etiqueta.setBounds(120, 10, 60, 10);
    texto = new JTextField();
    texto.setBounds(50, 50, 200, 30);
    
     JLabel eti = new JLabel ("passwork");
    eti.setBounds(120, 120, 60, 20);
     tex = new JPasswordField("");
    tex.setBounds(50, 170, 200, 30);

    B=new JButton("entrar");
    B.setBounds(50, 240, 200, 30);

    
    add(eti);
    add(tex);
    add(etiqueta);
        add(texto);
        add(B);
        B.addActionListener(this);
        setVisible(true);
}

    public void actionPerformed(ActionEvent e) {
if(e.getSource()==B) {
if(texto.getText().equals("x_y_z_w")&&tex.getText().equals("1234"));{
    Vent v= new Vent();
    v.setVisible(true);
}}else {
            JOptionPane.showMessageDialog(null, "ERROR_MESSAGE", //Mensaje\
                    "Tercer parametro: T\'edtulo de la ventana", //T\'edtulo\
                    JOptionPane.WARNING_MESSAGE);    
 

 }
    }
      
    public static void main(String[] args) {
    Usuario u= new Usuario();
    }

   
}
    

