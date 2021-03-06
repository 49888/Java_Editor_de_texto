
package procesador_de_texto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.*;


public class Barra {
    
 //Atributos
    private JTextPane texto;//Panel de Texto principal
    
    private JMenuBar Barra;
    
    private JMenu edicion; private JMenu fuente; private JMenu estilo;
    private JMenu tamaño; private JMenu color; private JMenu alineacion;
    
 //METODOS -----------------------------------------------------------------------------------------------------
    public Barra(){}

    public Barra(JTextPane texto){
        
        this.texto = texto;

        //Barra de Menu
            Barra = new JMenuBar();

        //Elementos de la Barra
            edicion = new JMenu("Edicion"); edicion.setIcon(new ImageIcon("Iconos\\24x24\\opciones.png"));

            fuente = new JMenu("Fuente"); fuente.setIcon(new ImageIcon("Iconos\\16x16\\fuentes.png"));

            estilo = new JMenu("Estilo"); estilo.setIcon(new ImageIcon("Iconos\\24x24\\estilo.png"));

            tamaño = new JMenu("Tamaño"); tamaño.setIcon(new ImageIcon("Iconos\\16x16\\sizeFont.png"));

            color = new JMenu("Color"); color.setIcon(new ImageIcon("Iconos\\24x24\\colores.png"));

            alineacion = new JMenu("Alineacion"); alineacion.setIcon(new ImageIcon("Iconos\\16x16\\alineacion.png"));

            //Añadimos todos los Elementos a la Barra
            Barra.add(edicion); Barra.add(fuente); Barra.add(estilo); Barra.add(tamaño); Barra.add(color); Barra.add(alineacion);

        //EDICION ----------------------------------------------------------
        AbrirGuardar(edicion);
        edicion.addSeparator();
        edicion.add( Edicion("Copiar", new ImageIcon("Iconos\\24x24\\copiar.png")) );
        edicion.add( Edicion("Cortar", new ImageIcon("Iconos\\24x24\\cortar.png")) );
        edicion.add( Edicion("Pegar", new ImageIcon("Iconos\\24x24\\pegar.png")) );

        //FUENTE -----------------------------------------------------------
        fuente.add( Fuente("Arial") );
        fuente.add( Fuente("Helvetica") );
        fuente.add( Fuente("Ravie") );
        fuente.add( Fuente("Monotype Corsiva") );
        fuente.add( Fuente("Monospaced") );
        fuente.add( Fuente("Consolas") );
        fuente.add( Fuente("Algerian") );
        fuente.add( Fuente("Century") );
        fuente.add( Fuente("Chiller") );

        //ESTILO ----------------------------------------------------------
        estilo.add( Estilo("Negrita", new ImageIcon("Iconos\\16x16\\negrita.png")) );
        estilo.add( Estilo("Cursiva", new ImageIcon("Iconos\\16x16\\cursiva.png")) );
        estilo.add( Estilo("Subrayado", new ImageIcon("Iconos\\16x16\\subrayar.png")) );


        //TAMAÑO -----------------------------------------------------------            
        tamaño.add( Tamaño(12)); tamaño.add(Tamaño(16) );
        tamaño.add( Tamaño(20)); tamaño.add(Tamaño(24) );
        tamaño.add( Tamaño(28)); tamaño.add(Tamaño(32) );
        tamaño.add( Tamaño(36)); tamaño.add(Tamaño(40) );


        //COLOR -----------------------------------------------------------
        color.add( Color("Negro", Color.BLACK, new ImageIcon("Iconos\\16x16\\negro.png")) );
        color.add( Color("Azul", Color.BLUE, new ImageIcon("Iconos\\16x16\\azul.png")) );
        color.add( Color("Rojo", Color.RED, new ImageIcon("Iconos\\16x16\\rojo.png")) );
        color.add( Color("Celeste", Color.CYAN, new ImageIcon("Iconos\\16x16\\celeste.png")) );
        color.add( Color("Verde", Color.GREEN, new ImageIcon("Iconos\\16x16\\verde.png")) );
        color.add( Color("Rosa", Color.PINK, new ImageIcon("Iconos\\16x16\\rosa.png")) );
 
        
        //ALINEACION ------------------------------------------------------
        alineacion.add( Alineacion("Izquierda", StyleConstants.ALIGN_LEFT, new ImageIcon("Iconos\\24x24\\izquierda.png")) );
        alineacion.add( Alineacion("Derecha", StyleConstants.ALIGN_RIGHT, new ImageIcon("Iconos\\24x24\\derecha.png")) );
        alineacion.add( Alineacion("Centrado", StyleConstants.ALIGN_CENTER, new ImageIcon("Iconos\\24x24\\centrado.png")) );
        alineacion.add( Alineacion("Justificado", StyleConstants.ALIGN_JUSTIFIED, new ImageIcon("Iconos\\24x24\\justificacion.png")) );
    }
        
    //AGREGAR EDICION --------------------------------------------------------------------      
    protected JMenuItem Edicion(String nombre, Icon icono){

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

    //AGREGAR ESTILO ----------------------------------------------------------------------
    protected JMenuItem Estilo(String nombre, Icon icono){

        JMenuItem estilo = new JMenuItem(nombre, icono);

        switch(nombre){

            case "Negrita":
                estilo.setFont(new Font("Dialog", Font.BOLD, 12));
                estilo.addActionListener(new StyledEditorKit.BoldAction());
                estilo.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
                break;

            case "Cursiva":
                estilo.setFont(new Font("Dialog", Font.ITALIC, 12));
                estilo.addActionListener(new StyledEditorKit.ItalicAction());
                estilo.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));
                break;

            case "Subrayado":
                estilo.setFont(new Font("Dialog", Font.ITALIC, 12));
                estilo.addActionListener(new StyledEditorKit.UnderlineAction());
                estilo.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
                break;     
        }

       return(estilo);         
    }

    //AGREGAR FUENTE ----------------------------------------------------------------------
    protected JMenuItem Fuente(String nombre){

        JMenuItem fuente = new JMenuItem(nombre);

        fuente.setFont(new Font(nombre, Font.PLAIN, 18));
        fuente.addActionListener(new StyledEditorKit.FontFamilyAction("", nombre));

        return(fuente);
    }

    //AGREGAR TAMAÑO ----------------------------------------------------------------------
    protected JMenuItem Tamaño(int size){

        JMenuItem tamaño = new JMenuItem(Integer.toString(size));

        tamaño.addActionListener(new StyledEditorKit.FontSizeAction("", size));

        return(tamaño);
    }

    //AGREGAR COLOR -----------------------------------------------------------------------
    protected JMenuItem Color(String nombre, Color color, Icon icono){

        JMenuItem colores = new JMenuItem(nombre, icono);

        colores.addActionListener(new StyledEditorKit.ForegroundAction("", color));

        return(colores);
    }

    //AGREGAR ALINEACION -------------------------------------------------------------------
    protected JMenuItem Alineacion(String nombre, int align, Icon icono){

        JMenuItem alineacion = new JMenuItem(nombre, icono);

        alineacion.addActionListener(new StyledEditorKit.AlignmentAction("", align));

        return(alineacion);
    }
 
    //OBTENER BARRA ---------------------------
    public JMenuBar getBarra() {
        return Barra;
    }
    
    //OPCIONES DE GUARDADO Y LECTURA -------------------------------------------------------
    private void AbrirGuardar(JMenu menu){
        
        Archivo archivo = new Archivo(menu);
    
        JMenuItem abrir = new JMenuItem("Abrir", new ImageIcon("Iconos\\24x24\\abrir.png") );
        
        abrir.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                archivo.leerCadena(texto);
            }
        });
        
        JMenuItem guardar = new JMenuItem("Guardar", new ImageIcon("Iconos\\24x24\\guardar.png") );
        
        guardar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                archivo.Escribir(texto);
            }
        });
        
        menu.add(abrir); menu.add(guardar);
    }
    
 //Fin de Clase 
}
