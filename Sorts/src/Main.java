
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Main {
    
      private static String[] lista;
      private static int[] listaInt;
      public static void main(String [] arg) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
 
      //Comienza código tomado de internet
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\Daniel\\Documents\\Daniel pers\\U\\Segundo año\\Segundo Semestre\\Estructuras de Datos\\Hojas de Trabajo\\Hoja 3\\HDT3\\FileGenerator\\datos.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         int ind=0;
         while((linea=br.readLine())!=null){
            lista[ind]=linea;
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
      int dat;
      for(int i=0; i<lista.length; i++){
          dat=Integer.parseInt(lista[i]);
          listaInt[i]=dat;
      }
      
      
      
    }
      
      
}
