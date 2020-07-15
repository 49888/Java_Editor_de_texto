
package procesador_de_texto;

import javax.swing.*;


public class Barra extends JPanel{
    
    JMenuBar Barra;
        
        public Barra(){

            //Barra de Menu
            Barra = new JMenuBar();
            
            //Elementos de la Barra
            
                JMenu fuente = new JMenu("Fuente");
                JMenu estilo = new JMenu("Estilo");
                JMenu tamaño = new JMenu("Tamaño");
                
                //Añadimos todos los Elementos a la Barra
                Barra.add(fuente);
                Barra.add(estilo);
                Barra.add(tamaño);
                
            
            //FUENTE ------------------------------------------------------------
            
                JMenuItem helvetica = new JMenuItem("Hevetica");
                JMenuItem arial = new JMenuItem("Arial");
                JMenuItem consolas = new JMenuItem("Consolas");
                JMenuItem ravie = new JMenuItem("Ravie");
                
                //Añadimos los Elementos
                
                    fuente.add(helvetica);
                    fuente.add(arial);
                    fuente.add(consolas);
                    fuente.add(ravie);
                
                
            //ESTILO -----------------------------------------------------------
            
                JMenuItem plano = new JMenuItem("Plano");
                JMenuItem negrita = new JMenuItem("Negrita");
                JMenuItem cursiva = new JMenuItem("Cursiva");
                
                    
                //Añadimos los Elementos
                    estilo.add(plano);
                    estilo.add(negrita);
                    estilo.add(cursiva);
                

            //TAMAÑO -----------------------------------------------------
            
                JMenuItem T12 = new JMenuItem("12");
                JMenuItem T16 = new JMenuItem("16");
                JMenuItem T20 = new JMenuItem("20");
                JMenuItem T24 = new JMenuItem("24");
                
                //Añadimos los Elementos
                
                    tamaño.add(T12);
                    tamaño.add(T16);
                    tamaño.add(T20);
                    tamaño.add(T24);
       
            //AÑADIMOS LA BARRA AL PANEL
            this.add(Barra);
        }
    
 //Fin de Clase   
}
