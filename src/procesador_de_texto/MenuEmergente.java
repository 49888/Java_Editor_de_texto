
package procesador_de_texto;

import java.awt.Color;
import javax.swing.*;
import javax.swing.text.*;

public class MenuEmergente extends Barra {
    
    JPopupMenu Menu;

    public MenuEmergente() {
        
        Menu = new JPopupMenu();
        
        //EDICION ------------------------------------------------------------------------------------------
        Icono = this.getClass().getResource("Iconos/24x24/copiar.png");
        Menu.add( Edicion("Copiar", new ImageIcon(Icono)) );
        
        Icono = this.getClass().getResource("Iconos/24x24/cortar.png");
        Menu.add( Edicion("Cortar", new ImageIcon(Icono)) );
        
        Icono = this.getClass().getResource("Iconos/24x24/pegar.png");
        Menu.add( Edicion("Pegar", new ImageIcon(Icono)) );
        
        Menu.addSeparator();//-------
        
        //ESTILO -------------------------------------------------------------------------------------------
        
        Icono = this.getClass().getResource("Iconos/16x16/negrita.png");
        Menu.add( Estilo("Negrita", new ImageIcon(Icono)) );
        
        Icono = this.getClass().getResource("Iconos/16x16/cursiva.png");
        Menu.add( Estilo("Cursiva", new ImageIcon(Icono)) );
        
        Icono = this.getClass().getResource("Iconos/16x16/subrayar.png");
        Menu.add( Estilo("Subrayado", new ImageIcon(Icono)) );
        
        Menu.addSeparator();//-------
        
        //FUENTE -------------------------------------------------------------------------------------------
        Icono = this.getClass().getResource("Iconos/16x16/fuentes.png");
        JMenu fuente = new JMenu("Fuente"); fuente.setIcon(new ImageIcon(Icono));
        
            fuente.add( Fuente("Arial") ); fuente.add( Fuente("Helvetica") );
            fuente.add( Fuente("Ravie") ); fuente.add( Fuente("Monotype Corsiva") );
            fuente.add( Fuente("Monospaced") ); fuente.add( Fuente("Consolas") );
            fuente.add( Fuente("Algerian") ); fuente.add( Fuente("Century") );
            fuente.add( Fuente("Chiller") );
        
        Menu.add(fuente);
        
        
        //TAMAÑO -------------------------------------------------------------------------------------------
        Icono = this.getClass().getResource("Iconos/16x16/sizeFont.png");
        JMenu tamaño = new JMenu("Tamaño"); tamaño.setIcon(new ImageIcon(Icono));
        
            tamaño.add(Tamaño(12)); tamaño.add(Tamaño(16));
            tamaño.add(Tamaño(20)); tamaño.add(Tamaño(24));
            tamaño.add(Tamaño(28)); tamaño.add(Tamaño(32));
            tamaño.add(Tamaño(36)); tamaño.add(Tamaño(40));
        
        Menu.add(tamaño);    
            

        //ALINEACION ---------------------------------------------------------------------------------------
        Icono = this.getClass().getResource("Iconos/16x16/alineacion.png");
        JMenu Align = new JMenu("Alineacion"); Align.setIcon(new ImageIcon(Icono));
        
            Icono = this.getClass().getResource("Iconos/24x24/izquierda.png");
            Align.add( Alineacion("Izquierda", StyleConstants.ALIGN_LEFT, new ImageIcon(Icono)) );
            
            Icono = this.getClass().getResource("Iconos/24x24/derecha.png");
            Align.add( Alineacion("Derecha", StyleConstants.ALIGN_RIGHT, new ImageIcon(Icono)) );
            
            Icono = this.getClass().getResource("Iconos/24x24/centrado.png");
            Align.add( Alineacion("Centrado", StyleConstants.ALIGN_CENTER, new ImageIcon(Icono)) );
            
            Icono = this.getClass().getResource("Iconos/24x24/justificacion.png");
            Align.add( Alineacion("Justificado", StyleConstants.ALIGN_JUSTIFIED, new ImageIcon(Icono)) );

        Menu.add(Align);
        

        //COLOR --------------------------------------------------------------------------------------------
        Icono = this.getClass().getResource("Iconos/24x24/colores.png");
        JMenu color = new JMenu("Color"); color.setIcon(new ImageIcon(Icono));
        
            Icono = this.getClass().getResource("Iconos/16x16/negro.png");
            color.add(Color("Negro", Color.BLACK, new ImageIcon(Icono)));
            
            Icono = this.getClass().getResource("Iconos/16x16/azul.png");
            color.add(Color("Azul", Color.BLUE, new ImageIcon(Icono)));
            
            Icono = this.getClass().getResource("Iconos/16x16/rojo.png");
            color.add(Color("Rojo", Color.RED, new ImageIcon(Icono)));
            
            Icono = this.getClass().getResource("Iconos/16x16/celeste.png");
            color.add(Color("Celeste", Color.CYAN, new ImageIcon(Icono)));
            
            Icono = this.getClass().getResource("Iconos/16x16/verde.png");
            color.add(Color("Verde", Color.GREEN, new ImageIcon(Icono)));
            
            Icono = this.getClass().getResource("Iconos/16x16/rosa.png");
            color.add(Color("Rosa", Color.PINK, new ImageIcon(Icono)));

        Menu.add(color);  
        
     //Fin Metodo Constructor
    }

    //BARRA
    public JPopupMenu getMenu() {
        return Menu;
    }
    
 //Fin de Clase MenuEmergente
}
