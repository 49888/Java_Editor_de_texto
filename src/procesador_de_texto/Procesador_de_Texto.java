
package procesador_de_texto;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Procesador_de_Texto {

  
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(500, 400); this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            this.setTitle("Editor de Texto: 1812");
            
            cambiarIcono();
            
            //Añadimos el Panel
                Panel panel = new Panel();

                this.add(panel);
                
            this.setVisible(true);  
        }
        
        //CAMCIAR EL ICONO ------------------
        void cambiarIcono(){
    
            //File ruta = new File();
            URL ruta = this.getClass().getResource("Iconos/64x64/texto2.png");
            
            Image icono = null;

            try {
                icono = ImageIO.read(ruta);
                setIconImage(icono);

            } catch (IOException ex) {

                ex.getMessage();
            }
        }
        
     //Fin de Clase Ventana
    }
    
    //PANEL PRINCIPAL--------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{
        
        JTextPane panelTexto;
        
        public Panel(){
            
            //Definimos el Layout
                setLayout(new BorderLayout(15, 10));
            
            //PANEL DE TEXTO
                panelTexto = new JTextPane();

                JScrollPane panelScroll = new JScrollPane(panelTexto);
                
                this.add(panelScroll, BorderLayout.CENTER);

            //BARRA DE OPCIONES
                Barra barra = new Barra();
                
                JPanel panelBarra = new JPanel();
                
                panelBarra.add(barra.getBarra());
                
                this.add(panelBarra, BorderLayout.NORTH);
               
            //MENU EMERGENTE
                MenuEmergente Menu = new MenuEmergente();
   
                panelTexto.setComponentPopupMenu(Menu.getMenu());
        }
    
     //Fin de Clase Panel
    }
    
 //Fin de Clase   
}
