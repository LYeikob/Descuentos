/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Scanner;
/**
 *
 * @author l_ryu_000
 */
public class Vent  extends JFrame implements ActionListener{

public JLabel etiqueta,etiquet,etique,etiqu,total;
public JTextField texto,texto2,texto3,texto4,texto5;
public JTextField text,text2,text3,text4,text5;
public  JButton B,B2,B3,B4,B5;
double a,b,c,d,e,f;
public Vent(){    
    super ("Ventana");
   Scanner L=new Scanner (System.in);
 this.getContentPane().setBackground(Color.CYAN);
    setSize(700, 500);
   
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
Container panel = getContentPane();
   etiqueta = new JLabel ("ingresa 5 productos");
    etiqueta.setBounds(10, 10, 200, 15);
    
   etiquet = new JLabel ("precio");
    etiquet.setBounds(325, 10, 200, 15);
     etique = new JLabel ("Aplica descuento");
    etique.setBounds(450, 10, 200, 15);
  
  etiqu = new JLabel ("total");
    etiquet.setBounds(450, 270, 100, 15);
    
    /////////////campos/////////////////////////
      texto = new JTextField();
    texto.setBounds(10, 50, 300, 30);
  
     texto2 = new JTextField();
    texto2.setBounds(10, 100, 300, 30);
  
 texto3 = new JTextField();
    texto3.setBounds(10, 150, 300, 30);
  //obj3.setText3(c);
 texto4 = new JTextField();
    texto4.setBounds(10, 200, 300, 30);
  //obj4.setText4(e);
  texto5 = new JTextField();
    texto5.setBounds(10,250, 300, 30);
   // obj5.setText5(e);
    /////////////////Cuadros precio///////////////
    text = new JTextField();
    text.setBounds(320, 50, 30, 30);
  
    text2 = new JTextField();
    text2.setBounds(320, 100, 30, 30);
  
     text3 = new JTextField();
    text3.setBounds(320, 150, 30, 30);
  
     text4 = new JTextField();
    text4.setBounds(320, 200, 30, 30);
  
     text5 = new JTextField();
    text5.setBounds(320,250, 30, 30);    
    ////////////////////////botones///////////////////////
    B = new JButton ("20%");
    B.setBounds(460, 45, 70, 30);
     B2 = new JButton ("30%");
    B2.setBounds(460, 95, 70, 30);
     B3 = new JButton ("40%");
    B3.setBounds(460, 145, 70, 30);
     B4 = new JButton ("Sin descuento");
    B4.setBounds(430, 195, 120, 30);
    ///////////////////////////total//////////////////
    total = new JLabel();
    total.setBounds(500, 260, 50, 35);
   
////////////////////campos/////////////////////////////
    add(etiqueta);
        add(texto);
              add(texto2);
                    add(texto3);
                          add(texto4);
                                add(texto5);
        ///////////////precio//////////////////////////
    add(etiquet);
        add(text);
              add(text2);
                    add(text3);
                          add(text4);
                                add(text5);
    /////////////////////////descuento////////////////
add(etique);    
add(B);
add(B2);
add(B3);
add(B4);
///////////////////total//////////////////////
add(etiqu);
add(total);
        ////////////////////////////////////////////////
        B.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        setVisible(true);
}
    public void actionPerformed(ActionEvent e) {
         ope p= new ope();
        if (e.getSource() == B) { 
            
   Double s=p.desc(Double.parseDouble(text.getText()),Double.parseDouble(text2.getText()),Double.parseDouble(text3.getText()),Double.parseDouble(text4.getText()),Double.parseDouble(text5.getText()));
   String x="";
   total.setText(s.toString());
    
        }    
        if (e.getSource()==B2){
   Double s=p.desc2(Double.parseDouble(text.getText()),Double.parseDouble(text2.getText()),Double.parseDouble(text3.getText()),Double.parseDouble(text4.getText()),Double.parseDouble(text5.getText()));
   String x="";
   total.setText(s.toString());         
        }
        if (e.getSource()==B3){
   Double s=p.desc3(Double.parseDouble(text.getText()),Double.parseDouble(text2.getText()),Double.parseDouble(text3.getText()),Double.parseDouble(text4.getText()),Double.parseDouble(text5.getText()));
   String x="";
   total.setText(s.toString());         
        }
        if (e.getSource()==B4){
   Double s=p.sindesc4(Double.parseDouble(text.getText()),Double.parseDouble(text2.getText()),Double.parseDouble(text3.getText()),Double.parseDouble(text4.getText()),Double.parseDouble(text5.getText()));
   String x="";
   total.setText(s.toString());         
        }
        
}  public static void main(String[] args) {
        // TODO code application logic here
    Vent u= new Vent();
    }}
