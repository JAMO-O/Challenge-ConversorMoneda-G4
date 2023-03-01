package visual;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.event.*;

public class Select2 extends JFrame implements ActionListener, ItemListener  {

    private JComboBox select;
    private JButton boton1;
    private JButton boton2;
    private JLabel label1;
    public static String texto="";
   

    public Select2(String selectTexto1,String selectTexto2, String selectTexto3, String selectTexto4,String selectTexto5,String label){    
        setLayout(null);  
        label1= new JLabel(label);
        label1.setBounds(60,10,250,10);
        add(label1);

        select= new JComboBox();
        select.setBounds(75,50,180,20);
        add(select);
        select.addItem("Selecciona");
        select.addItem(selectTexto1);
        select.addItem(selectTexto2);
        select.addItem(selectTexto3);
        select.addItem(selectTexto4);
        select.addItem(selectTexto5);
        select.addItemListener(this);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(60,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("regresar");
        boton2.setBounds(180,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==select){
            texto = select.getSelectedItem().toString();
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1 ){
            if(texto == "mx a dolar"){
               Input formulario3 = new Input("mx a dolar");
                formulario3.setBounds(0,0,400,300);
                formulario3.setVisible(true);
                formulario3.setResizable(false);
                formulario3.setLocationRelativeTo(null); 
                this.setVisible(false);
            }
            if(texto == "mx a euros"){
                Input formulario2 = new Input("mx a euros");
                formulario2.setBounds(0,0,400,300);
                formulario2.setVisible(true);
                formulario2.setResizable(false);
                formulario2.setLocationRelativeTo(null);
                this.setVisible(false);
             }
           if(texto == "mx a libras esterlinas"){
            Input formulario = new Input("mx a libras esterlinas");
            formulario.setBounds(0,0,400,300);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.setVisible(false);
            }

            if(texto == "mx a yen japones"){
                Input formulario = new Input("mx a yen japones");
                formulario.setBounds(0,0,400,300);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.setVisible(false);
                }

            if(texto == "mx a won sul-coreano"){
                Input formulario = new Input("mx a won sur-coreano");
                formulario.setBounds(0,0,400,300);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.setVisible(false);
            }

            if(texto == "dolar a mx"){
                Input formulario = new Input("dolar a mx");
                formulario.setBounds(0,0,400,300);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.setVisible(false);
            }
            if(texto == "euros a mx"){
                Input formulario2 = new Input("euros a mx");
                formulario2.setBounds(0,0,400,300);
                formulario2.setVisible(true);
                formulario2.setResizable(false);
                formulario2.setLocationRelativeTo(null);
                this.setVisible(false);
             }
           if(texto == "libras esterlinas a mx"){
            Input formulario = new Input("libras esterlinas a mx");
            formulario.setBounds(0,0,400,300);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.setVisible(false);
            }

            if(texto == "yen japones a mx"){
                Input formulario = new Input("yen japones a mx");
                formulario.setBounds(0,0,400,300);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.setVisible(false);
                }

            if(texto == "won sul-coreano a mx"){
                Input formulario = new Input("won sur-coreano a mx");
                formulario.setBounds(0,0,400,300);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
        if(e.getSource() == boton2 ){
            Select formulario1= new Select("conversion de mx a monedas","conversion de monedas a mx","millas por hora a km/h","km/h a millas por hora");

            formulario1.setBounds(0,0,350,200);
            formulario1.setVisible(true);
            formulario1.setResizable(false);
            formulario1.setLocationRelativeTo(null); 
            this.setVisible(false);
         

        }
        
    }

}
