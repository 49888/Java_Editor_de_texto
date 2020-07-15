
package procesador_de_texto;

import javax.swing.*;


public class Barra extends JPanel{
    
    JMenuBar Barra;
    
    JMenu fuente;
    JMenu estilo;
    JMenu tamaño;
    
    JTextPane texto;
        
        public Barra(JTextPane texto){
            
            this.texto = texto;
            

            //Barra de Menu
            Barra = new JMenuBar();
            
            //Elementos de la Barra
            
                fuente = new JMenu("Fuente");
                estilo = new JMenu("Estilo");
                tamaño = new JMenu("Tamaño");
                
                //Añadimos todos los Elementos a la Barra
                Barra.add(fuente);
                Barra.add(estilo);
                Barra.add(tamaño);
                
            //FUENTE -----------------------------------------------------------
            
            CrearItems("fuente", "Arial");
            CrearItems("fuente", "Helvetica");
            CrearItems("fuente", "Ravie");
            CrearItems("fuente", "Consolas");
            CrearItems("fuente", "Algerian");
            CrearItems("fuente", "Century");
            CrearItems("fuente", "Chiller");
            
            //EESTILO
            CrearItems("estilo", "Plano");
            CrearItems("estilo", "Negrita");
            CrearItems("estilo", "Cursiva");
            CrearItems("estilo", "N+C");
            
                
            //TAMAÑO -----------------------------------------------------------    
            CrearItems("tamaño", "12");
            CrearItems("tamaño", "16");
            CrearItems("tamaño", "20");
            CrearItems("tamaño", "24");
            CrearItems("tamaño", "28");
            CrearItems("tamaño", "32");
            CrearItems("tamaño", "36");

            //AÑADIMOS LA BARRA AL PANEL
            this.add(Barra);
        }
        
        void CrearItems(String panel, String rotulo){
            
            JMenuItem A = new JMenuItem(rotulo);
            
            if(panel.equals("fuente")){
            
                fuente.add(A);
            }
            
            if(panel.equals("estilo")){
            
                estilo.add(A);
            }
            
            if(panel.equals("tamaño")){
            
                tamaño.add(A);
            }
            
            A.addActionListener(new Acciones(texto, panel));
        }
    
 //Fin de Clase   
}
