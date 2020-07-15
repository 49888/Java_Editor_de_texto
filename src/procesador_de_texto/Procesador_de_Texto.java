
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
            
            setLayout(new BorderLayout(15, 10));
            
            panelTexto = new JTextPane();
            
            Barra barra = new Barra(panelTexto);
            
            this.add(barra, BorderLayout.NORTH);
            this.add(panelTexto, BorderLayout.CENTER);
  
        }
    
     //Fin de Clase Panel
    }
    
 //Fin de Clase   
}
