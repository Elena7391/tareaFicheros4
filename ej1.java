package ejDatos4;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {
	
	/**
	 * Ejercicio de Ficheros Binarios 1
	 * @author Elena
	 * @version 1.0
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Introduccion del fichero
		 * @author Elena
		 * @param fichero=String, fich=File, f1=FileOutputStream
		 */
		System.out.println("Escribe el fichero donde se guardarán los alumnos (con su ruta):");
		String fichero=sc.nextLine();
		
		File fich=new File(fichero);
		
		/**
		 * Inicio de las variables y al terminar el try se cierran automáticamente
		 * @author Elena
		 * @param FileOutputStream, OutputStreamWriter y BufferedWriter para la escritura
		 */
		try (FileOutputStream f1 = new FileOutputStream(fich);
			OutputStreamWriter f1Datos=new OutputStreamWriter(f1);
			BufferedWriter bw=new BufferedWriter(f1Datos)) {
			/**
			 * Inicialización de variables de escritura en ficheros binarios
			 * @author Elena
			 * @param f1Datos=DataOutputStream
			 */

			for(int cont=0; cont<2;cont++) {
				/**
				 * Introducción de datos de los alumnos
				 * @param nia=int, nombre, apellidos, ciclo, curso, grupo=String, anio, mes, dia int para pasar a Localdate
				 * @param gen= String, genero= Char
				 */
				System.out.println("Escribe el NIA del alumno "+(cont+1)+": ");
				int nia =sc.nextInt();
				System.out.println("Escribe el nombre del alumno "+(cont+1)+": ");
				String nombre=sc.next();
				System.out.println("Escribe los apellidos del alumno "+(cont+1)+": ");
				String apellidos=sc.next();
				System.out.println("Escribe el género del alumno "+(cont+1)+": ");
				sc.nextLine();
				String gen=sc.nextLine();
				char genero=gen.charAt(0);
				System.out.println("Escribe el año de nacimiento del alumno "+(cont+1)+": ");
				int anio=sc.nextInt();
				System.out.println("Escribe el mes de nacimiento del alumno "+(cont+1)+": ");
				int mes=sc.nextInt();
				System.out.println("Escribe el día de nacimiento del alumno "+(cont+1)+": ");
				int dia=sc.nextInt();
				System.out.println("Escribe el ciclo del alumno "+(cont+1)+": ");
				String ciclo=sc.next();
				System.out.println("Escribe el curso del alumno "+(cont+1)+": ");
				String curso=sc.next();
				System.out.println("Escribe el grupo del alumno "+(cont+1)+": ");
				String grupo=sc.next();
				
				
				/**
				 * Escritura de datos en fichero
				 * @author Elena
				 * @param bw.write para la escritura en binario
				 */
				bw.write("******************\n");
				bw.write("Alumno: "+nombre+" "+apellidos+":\n");
				bw.write("NIA: "+nia+"\t Género: "+genero+"\t Fecha de nacimiento: "+LocalDate.of(anio,mes,dia)+"\n");
				bw.write("Curso: "+curso+"\t Ciclo: "+ciclo+"\t Grupo: "+grupo+"\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
