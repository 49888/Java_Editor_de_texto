
package procesador_de_texto;

import javax.swing.*;
import java.awt.*;

public class Procesador_de_Texto {

  
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400);
            
            this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Añadimos el Panel
                Panel panel = new Panel();

                this.add(panel);
                
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    //PANEL PRINCIPAL--------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{
        
        JTextPane panelTexto;
        
        public Panel(){
            
            //Definimos el Layout
            setLayout(new BorderLayout(15, 10));
            
            //Definimos Los Componentes
                panelTexto = new JTextPane();

                JScrollPane panelScroll = new JScrollPane(panelTexto);

                Barra barra = new Barra(panelTexto);
            
            //Añadimos los Componentes al Panel Principal
                this.add(barra, BorderLayout.NORTH);
                this.add(panelScroll, BorderLayout.CENTER);
  
        }
    
     //Fin de Clase Panel
    }
    
 //Fin de Clase   
}
