
package procesador_de_texto;

import java.awt.Color;
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
    
    
    JTextPane texto;
        
        public Barra(JTextPane texto){
            
            this.texto = texto;
            
            

            //Barra de Menu
            Barra = new JMenuBar();
            
            //Elementos de la Barra
            
                edicion = new JMenu("Edicion");
                fuente = new JMenu("Fuente");
                estilo = new JMenu("Estilo");
                tamaño = new JMenu("Tamaño");
                color = new JMenu("Color");
                alineacion = new JMenu("Alineacion");
                
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
            
            //COLOR -----------------------------------------------------------
            CrearItems("color", "Negro");
            CrearItems("color", "Azul");
            CrearItems("color", "Rojo");
            CrearItems("color", "Celeste");
            CrearItems("color", "Verde");
            CrearItems("color", "Rosa");
            
            //ALINEACION
            CrearItems("alineacion", "Izquierda");
            CrearItems("alineacion", "Centrado");
            CrearItems("alineacion", "Derecha");
            CrearItems("alineacion", "Justificado");
            

            //AÑADIMOS LA BARRA AL PANEL
            this.add(Barra);
        }
        
        void CrearItems(String panel, String rotulo){
            
            JMenuItem A = new JMenuItem(rotulo);
            
            //EDICION
            if(panel.equals("edicion")){
                
                edicion.add(A);
            
                if(rotulo.equals("Copiar")){
                
                    A.addActionListener(new StyledEditorKit.CopyAction());
                }
                
                if(rotulo.equals("Cortar")){
                    
                    A.addActionListener(new StyledEditorKit.CutAction());
                }
                
                if(rotulo.equals("Pegar")){
                
                    A.addActionListener(new StyledEditorKit.PasteAction());
                }
            
            }
            
            
            //FUENTE
            if(panel.equals("fuente")){
            
                fuente.add(A);
                
                A.addActionListener(new StyledEditorKit.FontFamilyAction("", rotulo));
            }
            
            //ESTILO
            if(panel.equals("estilo")){

                estilo.add(A);
                
                if(rotulo.equals("Negrita")){
                
                    A.addActionListener(new StyledEditorKit.BoldAction());
                }
                
                if(rotulo.equals("Cursiva")){
                
                    A.addActionListener(new StyledEditorKit.ItalicAction());
                }    
            }
            
            //TAMAÑO
            if(panel.equals("tamaño")){
            
                tamaño.add(A);
                
                A.addActionListener(new StyledEditorKit.FontSizeAction("", Integer.parseInt(rotulo)));
            }
            
            //COLOR
            if(panel.equals("color")){
            
                color.add(A);
                
                Color B = Color.black;
                
                switch(rotulo){
                
                    case "Rojo":
                        B = Color.RED; break;
                                        
                    case "Azul":
                        B = Color.BLUE; break;
                        
                    case "Celeste":
                        B = Color.CYAN; break;
                        
                    case "Negro":
                        B = Color.BLACK; break;
                        
                    case "Verde":
                        B = Color.GREEN; break;
                        
                    case "Rosa":
                        B = Color.PINK; break;
                }
                
                A.addActionListener(new StyledEditorKit.ForegroundAction("", B));
            }
            
            
            //ALINEACION
            if(panel.equals("alineacion")){
            
                alineacion.add(A);
                int C = StyleConstants.ALIGN_LEFT;
                
                switch(rotulo){
                    
                    case "Centrado":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\centrado.png"));
                        C = StyleConstants.ALIGN_CENTER; break;
                        
                    case "Izquierda":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\izquierda.png"));
                        C = StyleConstants.ALIGN_LEFT; break;
                        
                    case "Derecha":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\derecha.png"));
                        C = StyleConstants.ALIGN_RIGHT; break;
                        
                    case "Justificado":
                        A.setIcon(new ImageIcon("Imajenes\\24x24\\justificacion.png"));
                        C = StyleConstants.ALIGN_JUSTIFIED; break;
                }
                
                A.addActionListener(new StyledEditorKit.AlignmentAction("", C));
            }
            
            
        }
    
 //Fin de Clase   
}
