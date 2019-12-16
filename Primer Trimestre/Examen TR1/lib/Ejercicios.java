package lib;
import lib.Leer;

public class Ejercicios {
	
	/**		[0.5 PUNTOS]
	 * Imprime el menú y devuelve la opción elegida
	 *
	 * @return opción elegida por el usuario
	 */
	public static int menu(){
		int opcion = 0;
		// Mostrar menu y pedir opcion
		return opcion;
	}

	/**		[1 PUNTO]
	 * Recibe el número de jugadores y devuelve un array relleno de nombres
	 * 
	 * @param n numero de jugadores a insertar
	 * 
	 * @return jugadores lista rellena de los jugadores [jugador1, jugador2, jugador3]
	 */
	public static String[] rellenaNombres(int n){
		String[] jugadores = new String[n];
		// Rellenar array jugadores con los nombres de los jugadores
		return jugadores;
	}
	
	/**		[1.5 PUNTOS]
	 * Recibe el array relleno de nombres y devuelve un array bidimensional
	 * de 4 filas con las estadísticas de los jugadores
	 * 
	 * @param jugadores lista de jugadores [jugador1, jugador2, jugador3]
	 * 
	 * @return 	estadisticas =	[jugador1, 		jugador2, 		jugador3	]
	 * 							[asesinatos,	asesinatos, 	asesinatos 	]
	 * 							[muertes,  		muertes,  		muertes 	]
	 * 							[asistencias,  	asistencias,	asistencias ]
	 */
	public static String[][] rellenaEstadisticas(String[] jugadores){
		String[][] estadisticas = new String[4][jugadores.length];
		// Rellenar las estadisticas de los jugadores
		return estadisticas;
	}

	/**		[1 PUNTO]
	 * Recibe un un array de nombres y los muestra en una lista numerada
	 * 
	 * @param jugadores lista de jugadores [jugador1, jugador2, jugador3]
	 */
	public static void mostrarJugadores(String[] jugadores){
		// Mostrar los jugadores en lista numerada
	}

	/**		[1 PUNTO]
	 * Recibe un array compuesto por un jugador y sus estadisticas
	 * y devuelve la calificación calculada.
	 * 
	 * @param jugador Datos de un jugador [Nombre, asesinatos, muertes, asistencias]
	 * 
	 * @return calificacion calificación del jugador
	 */
	public static char calificacionJugador(String[] jugador){
		char calificacion = '-';
		// Calcular calificacion
		return calificacion;
	}

	/**		[1 PUNTO]
	 * Recibe un array compuesto por un jugador y sus estadisticas,
	 * el índice de la estadística seleccionada y el nuevo valor a asignarle
	 * 
	 * @param jugador Datos del jugador [nombre, asesinatos, muertes, asistencias]
	 * @param estadistica 1:asesinatos, 2:muertes, 3:asistencias
	 * @param valor nuevo valor a modificar
	 * 
	 * @return jugador Datos del jugador [Nombre, asesinatos, muertes, asistencias]
	 */
	public static String[] modificarJugador(String[] jugador, int estadistica, int valor){
		// Modificar la valor del jugador del estadistica indicado
		return jugador;
	}

	/**		[1 PUNTO]
	 * Recibe la lista de jugadores y el nombre de un jugador
	 * Devuelve la posición del jugador en la lista
	 * Si no existe, devuelve -1
	 * 
	 * @param jugadores Lista de jugadores [jugador1, jugador2, jugador3]
	 * @param jugador Nombre del jugador
	 * 
	 * @return posicion Numero de la lista del jugador buscado (-1 si no existe)
	*/
	public static int buscarJugador(String[] jugadores, String jugador){
		int posicion = -1;
		return posicion;
	}

	/**		[1 PUNTO]
	 * Muestra una tabla con todos los jugadores, sus estadisticas
	 * y su calificación
	 * 
	 * @param String[][] estadisticas =	[jugador1, 		jugador2, 		jugador3	]
	 * 					 				[asesinatos,	asesinatos, 	asesinatos 	]
	 * 					 				[muertes,  		muertes,  		muertes 	]
	 * 					 				[asistencias,  	asistencias,	asistencias ]
	 */
	public static void mostrarEstadisticas(String[][] estadisticas){
		// Mostrar tabla
	}
	
	/**		[2 PUNTOS]
	 * Diseñar el programa completo usando las funciones definidas
	 * Puedes crear y usar todas las funciones propias que necesites
	 */
	public static void programaCompleto(){
		// Diseñar el programa completo usando las funciones definidas
	}
	
}
