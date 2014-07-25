
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Daniel Gerendas 13158
 * @Alejandro Diaz 13082
 * @Edgar Chamo 13083
 * @since 25/07/2014
 * Codigo tomado de internet
 * link: http://codigoprogramacion.com/cursos/java/130-manejo-de-archivos-en-java-escribir-en-un-archivo-de-texto-txt.html#.U9Jgs_l5P51
 * Partes alteradas del código original para adptarlo a nuestras necesidades
 */
public class Main {
    private static File f;
    private static Random random;
    public static void main(String[] args){
        f = new File("datos.txt");
        random=new Random();

        //Escritura
        try{
        FileWriter w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        PrintWriter wr = new PrintWriter(bw);
        String val="";
        for(int i=0; i<2000; i++){
            val=random.nextInt(2001)+"\n";
            wr.write(val);//escribimos en el archivo el numero
           
        }
        
        
        wr.close();
        bw.close();
        }catch(IOException e){};
    }
}

