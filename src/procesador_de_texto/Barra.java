
package procesador_de_texto;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.text.*;


public class Barra extends JPanel{
    
    JMenuBar Barra;
    
    JMenu edicion;
    JMenu fuente;
    JMenu estilo;
    JMenu tamaño;
    JMenu color;
    JMenu alineacion;
    
    JPopupMenu menuEmergente;
    JMenu fuente2;
    JMenu color2;
    JMenu tamaño2;
    JMenu alineacion2;
    
    JTextPane texto;
        
        public Barra(JTextPane texto){
            
            this.texto = texto;
            
            //Menu Emergente
                menuEmergente = new JPopupMenu("Opciones");
                fuente2 = new JMenu("Fuente");
                tamaño2 = new JMenu("Tamaño");
                color2 = new JMenu("Color");
                alineacion2 = new JMenu("Alineacion");

                texto.setComponentPopupMenu(menuEmergente);

            //Barra de Menu
            Barra = new JMenuBar();
            
            //Elementos de la Barra
            
                edicion = new JMenu("Edicion");
                
                fuente = new JMenu("Fuente");
                fuente.setIcon(new ImageIcon("Imajenes\\16x16\\fuentes.png"));
                
                estilo = new JMenu("Estilo");
                
                tamaño = new JMenu("Tamaño");
                tamaño.setIcon(new ImageIcon("Imajenes\\16x16\\sizeFont.png"));
                
                color = new JMenu("Color");
                color.setIcon(new ImageIcon("Imajenes\\24x24\\colores.png"));
                
                alineacion = new JMenu("Alineacion");
                alineacion.setIcon(new ImageIcon("Imajenes\\16x16\\alineacion.png"));
                
                //Añadimos todos los Elementos a la Barra
                Barra.add(edicion);
                Barra.add(fuente);
                Barra.add(estilo);
                Barra.add(tamaño);
                Barra.add(color);
                Barra.add(alineacion);
                
            //EDICION ----------------------------------------------------------
            CrearItems("edicion", "Copiar");
            CrearItems("edicion", "Cortar");
            CrearItems("edicion", "Pegar");    
            
            //FUENTE -----------------------------------------------------------
            CrearItems("fuente", "Arial");
            CrearItems("fuente", "Helvetica");
            CrearItems("fuente", "Ravie");
            CrearItems("fuente", "Monotype Corsiva");
            CrearItems("fuente", "Monospaced");
            CrearItems("fuente", "Consolas");
            CrearItems("fuente", "Algerian");
            CrearItems("fuente", "Century");
            CrearItems("fuente", "Chiller");
            
            menuEmergente.addSeparator();
            fuente2.setIcon(new ImageIcon("Imajenes\\16x16\\fuentes.png"));
            menuEmergente.add(fuente2);
            menuEmergente.addSeparator();
            
            //EESTILO ----------------------------------------------------------
            CrearItems("estilo", "Negrita");
            CrearItems("estilo", "Cursiva");
            
                
            //TAMAÑO -----------------------------------------------------------    
            CrearItems("tamaño", "12");
            CrearItems("tamaño", "16");
            CrearItems("tamaño", "20");
            CrearItems("tamaño", "24");
            CrearItems("tamaño", "28");
            CrearItems("tamaño", "32");
            CrearItems("tamaño", "36");
            
            menuEmergente.addSeparator();
            tamaño2.setIcon(new ImageIcon("Imajenes\\16x16\\sizeFont.png"));
            menuEmergente.add(tamaño2);
            
            //COLOR -----------------------------------------------------------
            CrearItems("color", "Negro");
            CrearItems("color", "Azul");
            CrearItems("color", "Rojo");
            CrearItems("color", "Celeste");
            CrearItems("color", "Verde");
            CrearItems("color", "Rosa");
            
            menuEmergente.addSeparator();
            color2.setIcon(new ImageIcon("Imajenes\\24x24\\colores.png"));
            menuEmergente.add(color2);
            
            //ALINEACION
            CrearItems("alineacion", "Izquierda");
            CrearItems("alineacion", "Centrado");
            CrearItems("alineacion", "Derecha");
            CrearItems("alineacion", "Justificado");
            
            menuEmergente.addSeparator();
            alineacion2.setIcon(new ImageIcon("Imajenes\\16x16\\alineacion.png"));
            menuEmergente.add(alineacion2);

            //AÑADIMOS LA BARRA AL PANEL
            this.add(Barra);
        }
        
        void CrearItems(String panel, String rotulo){
            
            JMenuItem A = new JMenuItem(rotulo);
            JMenuItem B = new JMenuItem(rotulo);//MenuEmergente

            //EDICION -------------------------------------------------------------------------------
            if(panel.equals("edicion")){
                
                edicion.add(A);
 
                if(rotulo.equals("Copiar")){
                    
                    A.setIcon(new ImageIcon("Imajenes\\24x24\\copiar.png"));
                    A.addActionListener(new StyledEditorKit.CopyAction());
                    
                    B.setIcon(new ImageIcon("Imajenes\\24x24\\copiar.png"));
                    B.addActionListener(new StyledEditorKit.CopyAction());
                }
                
                if(rotulo.equals("Cortar")){
                    
                    A.setIcon(new ImageIcon("Imajenes\\24x24\\cortar.png"));
                    A.addActionListener(new StyledEditorKit.CutAction());
                    
                    B.setIcon(new ImageIcon("Imajenes\\24x24\\cortar.png"));
                    B.addActionListener(new StyledEditorKit.CutAction());
                }
                
                if(rotulo.equals("Pegar")){
                    
                    A.setIcon(new ImageIcon("Imajenes\\24x24\\pegar.png"));
                    A.addActionListener(new StyledEditorKit.PasteAction());
                    
                    B.setIcon(new ImageIcon("Imajenes\\24x24\\pegar.png"));
                    B.addActionListener(new StyledEditorKit.PasteAction());
                }
                
                menuEmergente.add(B);
            }
            
            
            //FUENTE ---------------------------------------------------------------------------------
            if(panel.equals("fuente")){
            
                fuente.add(A);
                fuente2.add(B);
                
                A.setFont(new Font(rotulo, Font.PLAIN, 18));
                A.addActionListener(new StyledEditorKit.FontFamilyAction("", rotulo));
                
                B.setFont(new Font(rotulo, Font.PLAIN, 18));
                B.addActionListener(new StyledEditorKit.FontFamilyAction("", rotulo)); 
            }
            
            //ESTILO ---------------------------------------------------------------------------------
            if(panel.equals("estilo")){

                estilo.add(A);
                  
                if(rotulo.equals("Negrita")){
                    
                    A.setIcon(new ImageIcon("Imajenes\\16x16\\negrita.png"));
                    A.setFont(new Font("Dialog", Font.BOLD, 12));
                    A.addActionListener(new StyledEditorKit.BoldAction());
                    
                    A.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
                    
                    B.setIcon(new ImageIcon("Imajenes\\16x16\\negrita.png"));
                    B.setFont(new Font("Dialog", Font.BOLD, 12));
                    B.addActionListener(new StyledEditorKit.BoldAction());
                    B.setToolTipText("Ctrl - B");
                }
                
                if(rotulo.equals("Cursiva")){
                    
                    A.setIcon(new ImageIcon("Imajenes\\16x16\\cursiva.png"));
                    A.setFont(new Font("Dialog", Font.ITALIC, 12));
                    A.addActionListener(new StyledEditorKit.ItalicAction());

                    A.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));
                    
                    B.setIcon(new ImageIcon("Imajenes\\16x16\\cursiva.png"));
                    B.setFont(new Font("Dialog", Font.ITALIC, 12));
                    B.addActionListener(new StyledEditorKit.ItalicAction());
                    B.setToolTipText("Ctrl - I");
                }
                
                menuEmergente.add(B);
            }
            
            //TAMAÑO ---------------------------------------------------------------------------------
            if(panel.equals("tamaño")){
            
                tamaño.add(A);
                tamaño2.add(B);
                
                A.addActionListener(new StyledEditorKit.FontSizeAction("", Integer.parseInt(rotulo)));
                B.addActionListener(new StyledEditorKit.FontSizeAction("", Integer.parseInt(rotulo)));
            }
            
            //COLOR ----------------------------------------------------------------------------------
            if(panel.equals("color")){
            
                color.add(A);
                color2.add(B);
                
                Color color = Color.black;
                
                switch(rotulo){
                
                    case "Rojo":
                        A.setIcon(new ImageIcon("Imajenes\\16x16\\rojo.png"));
                        B.setIcon(new ImageIcon("Imajenes\\16x16\\rojo.png"));
                        color = Color.RED; break;
                                        
                    case "Azul":
                        A.setIcon(new ImageIcon("Imajenes\\16x16\\azul.png"));
                        B.setIcon(new ImageIcon("Imajenes\\16x16\\azul.png"));
                        color = Color.BLUE; break;
                        
                    case "Celeste":
                        A.setIcon(new ImageIcon("Imajenes\\16x16\\celeste.png"));
                        B.setIcon(new ImageIcon("Imajenes\\16x16\\celeste.png"));
                        color = Color.CYAN; break;
                        
                    case "Negro":
                        A.setIcon(new ImageIcon("Imajenes\\16x16\\negro.png"));
                        B.setIcon(new ImageIcon("Imajenes\\16x16\\negro.png"));
                        color = Color.BLACK; break;
                        
                    case "Verde":
                        A.setIcon(new ImageIcon("Imajenes\\16x16\\verde.png"));
                        B.setIcon(new ImageIcon("Imajenes\\16x16\\verde.png"));
                        color = Color.GREEN; break;
                        
                    case "Rosa":
                        A.setIcon(new ImageIcon("Imajenes\\16x16\\rosa.png"));
                        B.setIcon(new ImageIcon("Imajenes\\16x16\\rosa.png"));
                        color = Color.PINK; break;
                }
                
                A.addActionListener(new StyledEditorKit.ForegroundAction("", color));
                B.addActionListener(new StyledEditorKit.ForegroundAction("", color));
            }
            
            
            //ALINEACION
            if(panel.equals("alineacion")){
            
                alineacion.add(A);
                alineacion2.add(B);
                
                int C = StyleConstants.ALIGN_LEFT;
                
                switch(rotulo){
                    
                    case "Centrado":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\centrado.png"));
                        B.setIcon(new ImageIcon("Imajenes\\24x24\\centrado.png"));
                        C = StyleConstants.ALIGN_CENTER; break;
                        
                    case "Izquierda":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\izquierda.png"));
                        B.setIcon(new ImageIcon("Imajenes\\24x24\\izquierda.png"));
                        C = StyleConstants.ALIGN_LEFT; break;
                        
                    case "Derecha":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\derecha.png"));
                        B.setIcon(new ImageIcon("Imajenes\\24x24\\derecha.png"));
                        C = StyleConstants.ALIGN_RIGHT; break;
                        
                    case "Justificado":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\justificacion.png"));
                        B.setIcon(new ImageIcon("Imajenes\\24x24\\justificacion.png"));
                        C = StyleConstants.ALIGN_JUSTIFIED; break;
                }
                
                A.addActionListener(new StyledEditorKit.AlignmentAction("", C));
                B.addActionListener(new StyledEditorKit.AlignmentAction("", C));
            }
            
            
        }
    
 //Fin de Clase   
}
