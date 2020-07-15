
package procesador_de_texto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;


public class Acciones implements ActionListener {
    
    private JTextPane texto;
    private String panel;
    
    private static String nombre;
    private static int estilo;
    private static int tamaño;

    public Acciones(JTextPane texto, String panel){
        
        this.texto = texto;
        this.panel = panel;
        
        Font A = texto.getFont();
        
            nombre = A.getName();
            estilo = A.getStyle();
            tamaño = A.getSize();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        JMenuItem origen = (JMenuItem)e.getSource();
        
        if(panel.equals("fuente")){
            
            nombre = origen.getText();
        }
        
        if(panel.equals("estilo")){
            
            if(origen.getText().equals("Plano")){
            
                estilo = Font.PLAIN;
            }
            
            if(origen.getText().equals("Negrita")){
            
                estilo = Font.BOLD;
            }
            
            if(origen.getText().equals("Cursiva")){
            
                estilo = Font.ITALIC;
            }
            
            if(origen.getText().equals("N+C")){
            
                estilo = Font.ITALIC + Font.BOLD;
            }
        }
        
        if(panel.equals("tamaño")){
        
            tamaño = Integer.parseInt(origen.getText());    
        }
        
        texto.setFont(new Font(nombre, estilo, tamaño));
    }
 //Fin de Clase   
}
