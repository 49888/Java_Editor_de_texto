
package procesador_de_texto;

import java.awt.Component;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.JTextComponent;


public class Archivo {
    
    private final Component componente;//Menu de Ediccion

    public Archivo(Component componente){
        
        this.componente = componente;
    }
    
    //LEE UN ARCHIVO DE TEXTO
    public void leerCadena(JTextComponent texto){
    
        JFileChooser A = new JFileChooser();
        
         A.setFileFilter(new FileNameExtensionFilter("Archivos de Texto (.txt)", "txt"));

         int res = A.showOpenDialog(componente);
        
         
        if(res == JFileChooser.APPROVE_OPTION){ 
            
            File archivo = A.getSelectedFile();

            String cadena = null;

            texto.setText("");

            try {
                FileReader stream = new FileReader(archivo);

                BufferedReader buffer = new BufferedReader(stream);

                cadena = buffer.readLine();

                while(cadena != null){

                    texto.setText(texto.getText() + cadena + "\n");

                    cadena = buffer.readLine();
                } 

                stream.close();
            } catch (IOException ex) {

                ex.printStackTrace();
            }
            
            System.out.println("Se ha abierto el Archivo: " + archivo.getName());
        }
        else {
            
            System.out.println("Ha cancelado la Operacion de Abrir");
        }
    }
    
    //CREA O ESCRIBE UN ARCHIVO DE TEXTO .TXT
    public void Escribir(JTextComponent texto){
        
        JFileChooser A = new JFileChooser();
        
         A.setFileFilter(new FileNameExtensionFilter("Archivos de Texto (.txt)", "txt"));

         int res = A.showSaveDialog(componente);
    
        
        if(res == JFileChooser.APPROVE_OPTION){
            
            File archivo = A.getSelectedFile();
        
            boolean var = false;//Sobreescribir / Agregar al final

            if(archivo.getName().contains(".txt")){

                var = consulta(texto);//El Archivo ya existe! ¿que hacer?
            }
            else{

                archivo = new File(archivo.getAbsolutePath() + ".txt");
            }
        
            try {
            
                FileWriter stream = new FileWriter(archivo, var);

                BufferedWriter buffer = new BufferedWriter(stream);

                buffer.write(texto.getText());

                buffer.flush();

                stream.close();

                texto.setText("");
            } catch (IOException ex) {

                ex.printStackTrace();
            }
            
            if(var){
            
                System.out.println("Texto agregado al final del Archivo: " + archivo.getName());
            }
            else{
            
                System.out.println("Archivo guardado como: " + archivo.getName());
            }
        }
        else{
        
            System.out.println("Ha cancelado la Operacion de Guardado");
        }    
    }
    
    //Si el Archivo a guardar ya existe, consulta que hacer: Sobreescribir o Agregar al final
    private boolean consulta(Component A){
        
        //Parametros del Cuadro de Dialogo
            String[] opciones = {"SobreEscribir", "Agregar al Final"};

            String mensaje = "El Archivo ya existe! ¿Que hacer?";

            String titulo = "Advertencia";

            int tipoMensaje = JOptionPane.WARNING_MESSAGE;
         
         int op;
        
         
        do{
            
            op = JOptionPane.showOptionDialog(A, mensaje, titulo, 0, tipoMensaje, null, opciones, null);

        }while(op == JOptionPane.CLOSED_OPTION);

        
        if(op == 1){
            
            //Agregar a continuacion...
            return(true);
        }
        
        //Sobreescribir...
        return(false);
    }

 //Fin de Clase Archivo    
}
