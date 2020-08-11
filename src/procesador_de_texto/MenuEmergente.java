
package procesador_de_texto;

import java.awt.Color;
import javax.swing.*;
import javax.swing.text.*;

public class MenuEmergente extends Barra {
    
    JPopupMenu Menu;

    public MenuEmergente(){
        
        Menu = new JPopupMenu();
        
        //EDICION ------------------------------------------------------------------------------------------
        Menu.add( Edicion("Copiar", new ImageIcon("Iconos\\24x24\\copiar.png")) );
        Menu.add( Edicion("Cortar", new ImageIcon("Iconos\\24x24\\cortar.png")) );
        Menu.add( Edicion("Pegar", new ImageIcon("Iconos\\24x24\\pegar.png")) );
        
        Menu.addSeparator();//-------
        
        //ESTILO -------------------------------------------------------------------------------------------
        Menu.add( Estilo("Negrita", new ImageIcon("Iconos\\16x16\\negrita.png")) );
        Menu.add( Estilo("Cursiva", new ImageIcon("Iconos\\16x16\\cursiva.png")) );
        Menu.add( Estilo("Subrayado", new ImageIcon("Iconos\\16x16\\subrayar.png")) );
        
        Menu.addSeparator();//-------
        
        //FUENTE -------------------------------------------------------------------------------------------
        JMenu fuente = new JMenu("Fuente"); fuente.setIcon(new ImageIcon("Iconos\\16x16\\fuentes.png"));
        
            fuente.add( Fuente("Arial") ); fuente.add( Fuente("Helvetica") );
            fuente.add( Fuente("Ravie") ); fuente.add( Fuente("Monotype Corsiva") );
            fuente.add( Fuente("Monospaced") ); fuente.add( Fuente("Consolas") );
            fuente.add( Fuente("Algerian") ); fuente.add( Fuente("Century") );
            fuente.add( Fuente("Chiller") );
        
        Menu.add(fuente);
        
        
        //TAMAÑO -------------------------------------------------------------------------------------------
        JMenu tamaño = new JMenu("Tamaño"); tamaño.setIcon(new ImageIcon("Iconos\\16x16\\sizeFont.png"));
        
            tamaño.add(Tamaño(12)); tamaño.add(Tamaño(16));
            tamaño.add(Tamaño(20)); tamaño.add(Tamaño(24));
            tamaño.add(Tamaño(28)); tamaño.add(Tamaño(32));
            tamaño.add(Tamaño(36)); tamaño.add(Tamaño(40));
        
        Menu.add(tamaño);    
            

        //ALINEACION ---------------------------------------------------------------------------------------
        JMenu Align = new JMenu("Alineacion"); Align.setIcon(new ImageIcon("Iconos\\16x16\\alineacion.png"));
        
            Align.add( Alineacion("Izquierda", StyleConstants.ALIGN_LEFT, new ImageIcon("Iconos\\24x24\\izquierda.png")) );
            Align.add( Alineacion("Derecha", StyleConstants.ALIGN_RIGHT, new ImageIcon("Iconos\\24x24\\derecha.png")) );
            Align.add( Alineacion("Centrado", StyleConstants.ALIGN_CENTER, new ImageIcon("Iconos\\24x24\\centrado.png")) );
            Align.add( Alineacion("Justificado", StyleConstants.ALIGN_JUSTIFIED, new ImageIcon("Iconos\\24x24\\justificacion.png")) );

        Menu.add(Align);
        

        //COLOR --------------------------------------------------------------------------------------------
        JMenu color = new JMenu("Color"); color.setIcon(new ImageIcon("Iconos\\24x24\\colores.png"));
        
            color.add(Color("Negro", Color.BLACK, new ImageIcon("Iconos\\16x16\\negro.png")));
            color.add(Color("Azul", Color.BLUE, new ImageIcon("Iconos\\16x16\\azul.png")));
            color.add(Color("Rojo", Color.RED, new ImageIcon("Iconos\\16x16\\rojo.png")));
            color.add(Color("Celeste", Color.CYAN, new ImageIcon("Iconos\\16x16\\celeste.png")));
            color.add(Color("Verde", Color.GREEN, new ImageIcon("Iconos\\16x16\\verde.png")));
            color.add(Color("Rosa", Color.PINK, new ImageIcon("Iconos\\16x16\\rosa.png")));

        Menu.add(color);  
        
     //Fin Metodo Constructor
    }

    //BARRA
    public JPopupMenu getMenu() {
        return Menu;
    }
    
 //Fin de Clase MenuEmergente
}
