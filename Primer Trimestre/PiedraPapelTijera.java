import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opt, elec, intent; //Variables opcion de lista principal, elección de mano y numero de intentos modo personalizado
        int human = 0; //Marcador jugador
        int machine = 0; //Marcador maquina
        int random = (int) (Math.random() * 3) + 1;
        boolean finish = false;
        System.out.println("\n ************************************************ \n * Bienvenido al juego de Piedra Papel o Tijera * \n ************************************************ \n Elija una de las siguientes opciones del juego: \n         1. One shot \n         2. Clasico \n         3. Personalizado \n         0. Salir");
        opt = entrada.nextInt();
        switch (opt) {
        case 1: //Modo One Shot
            System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");
            System.out.print("\n Elija una opción: ");
            elec = entrada.nextInt();
            switch(elec){
                case 1: //piedra
                    if(random == 1){
                        System.out.println(" La maquina saco PIEDRA");
                        System.out.println(" Hay un empate");
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                    if(random == 2){
                        System.out.println(" La maquina saco PAPEL");
                        System.out.println(" Gana la máquina");
                        machine++;
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                    if(random == 3){
                        System.out.println(" La maquina saco TIJERAS");
                        System.out.println(" Gana el jugador");
                        human++;
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                break;
                case 2: //papel
                    if(random == 1){
                        System.out.println(" La maquina saco PIEDRA");
                        System.out.println(" Gana el jugador");
                        human++;
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                    if(random == 2){
                        System.out.println(" La maquina saco PAPEL");
                        System.out.println(" Hay un empate");
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                    if(random == 3){
                        System.out.println(" La maquina saco TIJERAS");
                        System.out.println(" Gana la máquina");
                        machine++;
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                break;
                case 3: //tijeras
                    if(random == 1){
                        System.out.println(" La maquina saco PIEDRA");
                        System.out.println(" Gana la máquina");
                        machine++;
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                    if(random == 2){
                        System.out.println(" La maquina saco PAPEL");
                        System.out.println(" Gana el jugador");
                        human++;
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                    if(random == 3){
                        System.out.println(" La maquina saco TIJERAS");
                        System.out.println(" Hay un empate");
                        System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                    }
                break;
                default:
                System.out.println("Introduce una opción válida.");
            }
            if (human > machine) {
                System.out.println(" El jugador gana la partida");
            } else if (machine > human) {
                System.out.println(" La maquina gana la partida");
            } else {
                System.out.println(" La partida finaliza con un empate");
            }
        break;
        case 2: //Modo clasico
            for (int i = 0; i < 3; i ++) {
                System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");
                System.out.print("\n Elija una opción: ");
                elec = entrada.nextInt();
                switch(elec){
                    case 1: //piedra
                        if(random == 1){
                            System.out.println(" La maquina saco PIEDRA");
                            System.out.println(" Hay un empate");
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 2){
                            System.out.println(" La maquina saco PAPEL");
                            System.out.println(" Gana la máquina");
                            machine++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 3){
                            System.out.println(" La maquina saco TIJERAS");
                            System.out.println(" Gana el jugador");
                            human++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                    break;
                    case 2: //papel
                        if(random == 1){
                            System.out.println(" La maquina saco PIEDRA");
                            System.out.println(" Gana el jugador");
                            human++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 2){
                            System.out.println(" La maquina saco PAPEL");
                            System.out.println(" Hay un empate");
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 3){
                            System.out.println(" La maquina saco TIJERAS");
                            System.out.println(" Gana la máquina");
                            machine++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                    break;
                    case 3: //tijeras
                        if(random == 1){
                            System.out.println(" La maquina saco PIEDRA");
                            System.out.println(" Gana la máquina");
                            machine++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 2){
                            System.out.println(" La maquina saco PAPEL");
                            System.out.println(" Gana el jugador");
                            human++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 3){
                            System.out.println(" La maquina saco TIJERAS");
                            System.out.println(" Hay un empate");
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                    break;
                    default:
                    System.out.println("Introduce una opción válida.");
                }
            }
            if (human > machine) {
                System.out.println(" El jugador gana la partida");
            } else if (machine > human) {
                System.out.println(" La maquina gana la partida");
            } else {
                System.out.println(" La partida finaliza con un empate");
            }
        break;
        case 3: //Modo personalizado
            System.out.print("Introduce el número de rondas: ");
            intent = entrada.nextInt();
            for (int i = 0; i < intent; i ++) {
                System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");
                System.out.print("\n Elija una opción: ");
                elec = entrada.nextInt();
                switch(elec){
                    case 1: //piedra
                        if(random == 1){
                            System.out.println(" La maquina saco PIEDRA");
                            System.out.println(" Hay un empate");
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 2){
                            System.out.println(" La maquina saco PAPEL");
                            System.out.println(" Gana la máquina");
                            machine++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 3){
                            System.out.println(" La maquina saco TIJERAS");
                            System.out.println(" Gana el jugador");
                            human++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                    break;
                    case 2: //papel
                        if(random == 1){
                            System.out.println(" La maquina saco PIEDRA");
                            System.out.println(" Gana el jugador");
                            human++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 2){
                            System.out.println(" La maquina saco PAPEL");
                            System.out.println(" Hay un empate");
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 3){
                            System.out.println(" La maquina saco TIJERAS");
                            System.out.println(" Gana la máquina");
                            machine++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                    break;
                    case 3: //tijeras
                        if(random == 1){
                            System.out.println(" La maquina saco PIEDRA");
                            System.out.println(" Gana la máquina");
                            machine++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 2){
                            System.out.println(" La maquina saco PAPEL");
                            System.out.println(" Gana el jugador");
                            human++;
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                        if(random == 3){
                            System.out.println(" La maquina saco TIJERAS");
                            System.out.println(" Hay un empate");
                            System.out.println(" El marcador va " + human + " puntos para el jugador y " + machine + " puntos para la maquina");
                        }
                    break;
                    default:
                    System.out.println("Introduce una opción válida.");
                }
            }
            if (human > machine) {
                System.out.println(" El jugador gana la partida");
            } else if (machine > human) {
                System.out.println(" La maquina gana la partida");
            } else {
                System.out.println(" La partida finaliza con un empate");
            }
        break;
        case 0: //Salir del programa
            System.out.println("Saliendo del programa");
        break;
        default:
        System.out.println("Introduce una opción válida.");
        }

    }
}