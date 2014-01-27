/*************************************
 * Diego Salas Arce, Karen Chac�n
 * Programacion II
 * Tarea Abanico
 * 2012
 *************************************/
import java.io.*;
public class IUAbanico {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static PrintStream out = System.out; 
	public static Abanico abaniquito= new Abanico(); //Objeto abaniquito de tipo Abanico
	
        /***
         * Metodo Main
         * @param args
         * @throws IOException 
         */
	public static void main(String[] args)throws IOException {
		int opc;
		boolean noSalir = true;
		out.println(abaniquito.getfEstadoAbanico());
		String[] listaMenu={"1.  On / Off",
                                    "2.  Iluminar",
                                    "3.  Quitar Iluminaci�n",
                                    "4   Incrementar velocidad",
                                    "5.  Decrementar velocidad",
                                    "6.  Fijo / En movimiento",
                                    "7.  Informaci�n del Abanico",
                                    "8.  Salir"};

		do{
			mostrarMenu(listaMenu);
			opc = leerOpcion();
			noSalir = ejecutarAccion(opc);
		}while (noSalir);
	}
	
        /***
         * Imprime el arreglo que contiene el menú
         * @param plista 
         */
	static void mostrarMenu(String[] plista){

		out.println();

		for(int i=0;i<plista.length;i++){
			out.println(plista[i]);
		}
		out.println();
	}
	
        /***
         * Lee el teclado con la opción escogida por el usuario
         * @return
         * @throws java.io.IOException 
         */
	static int leerOpcion()throws java.io.IOException{

		int opcion;

		out.print("Seleccione su opcion: ");
		opcion = Integer.parseInt(in.readLine());
		out.println();

		return opcion;
	}
	
        /***
         * Acciones disponibles que el usuario puede escoger
         * @param popcion
         * @return
         * @throws java.io.IOException 
         */
	static boolean ejecutarAccion(int popcion)throws java.io.IOException{

		boolean noSalir = true;
		switch(popcion){

			case 1: //Encender o apagar abanico
				abaniquito.encenderApagarAbanico();
				out.println(abaniquito.getfEstadoAbanico());
				break;
		
			case 2: //Iluminar
				abaniquito.enciendeApagaIluminacion();
				out.println(abaniquito.iluminacion());
				break;
			
			case 3: //Quitar iluminaci�n
				abaniquito.enciendeApagaIluminacion();
				out.println(abaniquito.quitarIluminacion());
				break;
				
			case 4: //Incrementar velocidad
				abaniquito.incrementarVelocidad();
				out.println(abaniquito.aumentarDecreVelocidadAbanico());
				break;
			
			case 5: //Decrementar velocidad
				abaniquito.deCrementarVelocidad();
				out.println(abaniquito.aumentarDecreVelocidadAbanico());
				break;
			
			case 6: //Ajustar movimiento
				abaniquito.ajustarMovAbanico();
				out.println(abaniquito.verifMovAjusteAbanico());
				
				break;
		
			case 7: //Informaci�n del abanico
				out.println(abaniquito.toString());
				break;
			
			case 8: //Salir de la aplicacion
			
				noSalir = false;
				break;

			default: //Cualquier otro valor dado por el usuario se considera inv�lido

				out.println("Opcion invalida");
				out.println();
				break;
		}
		return noSalir;
	}

}
