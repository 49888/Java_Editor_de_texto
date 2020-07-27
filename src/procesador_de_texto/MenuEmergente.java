
package procesador_de_texto;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.text.StyleConstants;


public class MenuEmergente extends Barra {
    
    JPopupMenu Menu;

    public MenuEmergente() {
        
        Menu = new JPopupMenu();
        
        Menu.add( agregarEdicion("Copiar", new ImageIcon("Imajenes\\24x24\\copiar.png")) );
        Menu.add( agregarEdicion("Cortar", new ImageIcon("Imajenes\\24x24\\cortar.png")) );
        Menu.add( agregarEdicion("Pegar", new ImageIcon("Imajenes\\24x24\\pegar.png")) );
        
        Menu.addSeparator();//------------------------------------------------------------------------------
        
        JMenu fuente = new JMenu("Fuente"); fuente.setIcon(new ImageIcon("Imajenes\\16x16\\fuentes.png"));
        
            fuente.add(agregarFuente("Arial")); fuente.add(agregarFuente("Helvetica"));
            fuente.add(agregarFuente("Ravie")); fuente.add(agregarFuente("Monotype Corsiva"));
            fuente.add(agregarFuente("Monospaced")); fuente.add(agregarFuente("Consolas"));
            fuente.add(agregarFuente("Algerian")); fuente.add(agregarFuente("Century"));
            fuente.add(agregarFuente("Chiller"));
        
        Menu.add(fuente);
        
        JMenu tamaño = new JMenu("Tamaño"); tamaño.setIcon(new ImageIcon("Imajenes\\16x16\\sizeFont.png"));
        
            tamaño.add(agregarTamaño(12)); tamaño.add(agregarTamaño(16));
            tamaño.add(agregarTamaño(20)); tamaño.add(agregarTamaño(24));
            tamaño.add(agregarTamaño(28)); tamaño.add(agregarTamaño(32));
            tamaño.add(agregarTamaño(36)); tamaño.add(agregarTamaño(40));
        
        Menu.add(tamaño);    
            
        Menu.addSeparator();//------------------------------------------------------------------------------
        

        JMenu color = new JMenu("Color"); color.setIcon(new ImageIcon("Imajenes\\24x24\\colores.png"));
        
            color.add(agregarColor("Negro", Color.BLACK, new ImageIcon("Imajenes\\16x16\\negro.png")));
            color.add(agregarColor("Azul", Color.BLUE, new ImageIcon("Imajenes\\16x16\\azul.png")));
            color.add(agregarColor("Rojo", Color.RED, new ImageIcon("Imajenes\\16x16\\rojo.png")));
            color.add(agregarColor("Celeste", Color.CYAN, new ImageIcon("Imajenes\\16x16\\celeste.png")));
            color.add(agregarColor("Verde", Color.GREEN, new ImageIcon("Imajenes\\16x16\\verde.png")));
            color.add(agregarColor("Rosa", Color.PINK, new ImageIcon("Imajenes\\16x16\\rosa.png")));

        Menu.add(color);    
            
        JMenu alineacion = new JMenu("Alineacion"); alineacion.setIcon(new ImageIcon("Imajenes\\16x16\\alineacion.png"));
        
            alineacion.add( agregarAlineacion("Izquierda", StyleConstants.ALIGN_LEFT, new ImageIcon("Imajenes\\24x24\\izquierda.png")) );
            alineacion.add( agregarAlineacion("Derecha", StyleConstants.ALIGN_RIGHT, new ImageIcon("Imajenes\\24x24\\derecha.png")) );
            alineacion.add( agregarAlineacion("Centrado", StyleConstants.ALIGN_CENTER, new ImageIcon("Imajenes\\24x24\\centrado.png")) );
            alineacion.add( agregarAlineacion("Justificado", StyleConstants.ALIGN_JUSTIFIED, new ImageIcon("Imajenes\\24x24\\justificacion.png")) );
        
            
        Menu.add(alineacion);
    }

    public JPopupMenu getMenu() {
        return Menu;
    }
    
 //Fin de Clase MenuEmergente
}
