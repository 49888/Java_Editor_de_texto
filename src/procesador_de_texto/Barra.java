
package procesador_de_texto;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.text.*;


public class Barra {
    
    private JMenuBar Barra;
    
    private JMenu edicion; private JMenu fuente; private JMenu estilo;
    private JMenu tamaño; private JMenu color; private JMenu alineacion;

    public Barra(){

        //Barra de Menu
            Barra = new JMenuBar();

        //Elementos de la Barra
            edicion = new JMenu("Edicion");

            fuente = new JMenu("Fuente"); fuente.setIcon(new ImageIcon("Imajenes\\16x16\\fuentes.png"));

            estilo = new JMenu("Estilo");

            tamaño = new JMenu("Tamaño"); tamaño.setIcon(new ImageIcon("Imajenes\\16x16\\sizeFont.png"));

            color = new JMenu("Color"); color.setIcon(new ImageIcon("Imajenes\\24x24\\colores.png"));

            alineacion = new JMenu("Alineacion"); alineacion.setIcon(new ImageIcon("Imajenes\\16x16\\alineacion.png"));

            //Añadimos todos los Elementos a la Barra
            Barra.add(edicion); Barra.add(fuente); Barra.add(estilo); Barra.add(tamaño); Barra.add(color); Barra.add(alineacion);

        //EDICION ----------------------------------------------------------
        edicion.add( agregarEdicion("Copiar", new ImageIcon("Imajenes\\24x24\\copiar.png")) );
        edicion.add( agregarEdicion("Cortar", new ImageIcon("Imajenes\\24x24\\cortar.png")) );
        edicion.add( agregarEdicion("Pegar", new ImageIcon("Imajenes\\24x24\\pegar.png")) );

        //FUENTE -----------------------------------------------------------
        fuente.add(agregarFuente("Arial"));
        fuente.add(agregarFuente("Helvetica"));
        fuente.add(agregarFuente("Ravie"));
        fuente.add(agregarFuente("Monotype Corsiva"));
        fuente.add(agregarFuente("Monospaced"));
        fuente.add(agregarFuente("Consolas"));
        fuente.add(agregarFuente("Algerian"));
        fuente.add(agregarFuente("Century"));
        fuente.add(agregarFuente("Chiller"));

        //ESTILO ----------------------------------------------------------
        estilo.add(agregarEstilo("Negrita", new ImageIcon("Imajenes\\16x16\\negrita.png")));
        estilo.add(agregarEstilo("Cursiva", new ImageIcon("Imajenes\\16x16\\cursiva.png")));
        estilo.add(agregarEstilo("Subrayado", null));


        //TAMAÑO -----------------------------------------------------------            
        tamaño.add(agregarTamaño(12)); tamaño.add(agregarTamaño(16));
        tamaño.add(agregarTamaño(20)); tamaño.add(agregarTamaño(24));
        tamaño.add(agregarTamaño(28)); tamaño.add(agregarTamaño(32));
        tamaño.add(agregarTamaño(36)); tamaño.add(agregarTamaño(40));


        //COLOR -----------------------------------------------------------
        color.add(agregarColor("Negro", Color.BLACK, new ImageIcon("Imajenes\\16x16\\negro.png")));
        color.add(agregarColor("Azul", Color.BLUE, new ImageIcon("Imajenes\\16x16\\azul.png")));
        color.add(agregarColor("Rojo", Color.RED, new ImageIcon("Imajenes\\16x16\\rojo.png")));
        color.add(agregarColor("Celeste", Color.CYAN, new ImageIcon("Imajenes\\16x16\\celeste.png")));
        color.add(agregarColor("Verde", Color.GREEN, new ImageIcon("Imajenes\\16x16\\verde.png")));
        color.add(agregarColor("Rosa", Color.PINK, new ImageIcon("Imajenes\\16x16\\rosa.png")));

        

        //ALINEACION ------------------------------------------------------
        alineacion.add( agregarAlineacion("Izquierda", StyleConstants.ALIGN_LEFT, new ImageIcon("Imajenes\\24x24\\izquierda.png")) );
        alineacion.add( agregarAlineacion("Derecha", StyleConstants.ALIGN_RIGHT, new ImageIcon("Imajenes\\24x24\\derecha.png")) );
        alineacion.add( agregarAlineacion("Centrado", StyleConstants.ALIGN_CENTER, new ImageIcon("Imajenes\\24x24\\centrado.png")) );
        alineacion.add( agregarAlineacion("Justificado", StyleConstants.ALIGN_JUSTIFIED, new ImageIcon("Imajenes\\24x24\\justificacion.png")) );
    }
        
          
    protected JMenuItem agregarEdicion(String nombre, Icon icono){

        JMenuItem edicion = new JMenuItem(nombre, icono);

        switch(nombre){

            case "Copiar":

                edicion.addActionListener(new StyledEditorKit.CopyAction());
                break;

            case "Cortar":

                edicion.addActionListener(new StyledEditorKit.CutAction());
                break;

            case "Pegar":

                edicion.addActionListener(new StyledEditorKit.PasteAction());
                break;
        }

        return(edicion);
    }

    protected JMenuItem agregarEstilo(String nombre, Icon icono){

        JMenuItem estilo = new JMenuItem(nombre, icono);

        switch(nombre){

            case "Negrita":
                estilo.setFont(new Font("Dialog", Font.BOLD, 12));
                estilo.addActionListener(new StyledEditorKit.BoldAction());
                estilo.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
                break;

            case "Cursiva":
                estilo.setIcon(new ImageIcon("Imajenes\\16x16\\cursiva.png"));
                estilo.setFont(new Font("Dialog", Font.ITALIC, 12));
                estilo.addActionListener(new StyledEditorKit.ItalicAction());
                estilo.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));
                break;

            case "Subrayado":
                estilo.setIcon(new ImageIcon("Imajenes\\16x16\\cursiva.png"));
                estilo.setFont(new Font("Dialog", Font.ITALIC, 12));
                estilo.addActionListener(new StyledEditorKit.UnderlineAction());
                estilo.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
                break;     
        }

       return(estilo);         
    }

    protected JMenuItem agregarFuente(String nombre){

        JMenuItem fuente = new JMenuItem(nombre);

        fuente.setFont(new Font(nombre, Font.PLAIN, 18));
        fuente.addActionListener(new StyledEditorKit.FontFamilyAction("", nombre));

        return(fuente);
    }

    protected JMenuItem agregarTamaño(int size){

        JMenuItem tamaño = new JMenuItem(Integer.toString(size));

        tamaño.addActionListener(new StyledEditorKit.FontSizeAction("", size));

        return(tamaño);
    }

    protected JMenuItem agregarColor(String nombre, Color color, Icon icono){

        JMenuItem colores = new JMenuItem(nombre, icono);

        colores.addActionListener(new StyledEditorKit.ForegroundAction("", color));

        return(colores);
    }

    protected JMenuItem agregarAlineacion(String nombre, int align, Icon icono){

        JMenuItem alineacion = new JMenuItem(nombre, icono);

        alineacion.addActionListener(new StyledEditorKit.AlignmentAction("", align));

        return(alineacion);
    }
 
 

    public JMenuBar getBarra() {
        return Barra;
    }
    
 //Fin de Clase 
}
