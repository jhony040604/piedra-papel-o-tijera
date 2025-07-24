import java.util.Random;
import java.util.Scanner;

/**
 * Juego de Piedra, Papel o Tijeras
 * Un clásico juego implementado en Java con estadísticas y diferentes modos
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class RockPaperScissors {
    
    // Constantes del juego
    private static final String[] OPCIONES = {"PIEDRA", "PAPEL", "TIJERAS"};
    private static final String[] EMOJIS = {"🗿", "📄", "✂️"};
    
    // Variables de estadísticas
    private static int victoriasJugador = 0;
    private static int victoriasComputadora = 0;
    private static int empates = 0;
    private static int partidasJugadas = 0;
    
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    
    public static void main(String[] args) {
        mostrarBienvenida();
        menuPrincipal();
    }
    
    /**
     * Muestra el mensaje de bienvenida
     */
    private static void mostrarBienvenida() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║     🎮 PIEDRA, PAPEL O TIJERAS 🎮  ║");
        System.out.println("║         ¡Versión Java 1.0!        ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
    }
    
    /**
     * Menú principal del juego
     */
    private static void menuPrincipal() {
        while (true) {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│           MENÚ PRINCIPAL        │");
            System.out.println("├─────────────────────────────────┤");
            System.out.println("│ 1. 🆚 Jugar una partida        │");
            System.out.println("│ 2. 🏆 Mejor de 3                │");
            System.out.println("│ 3. 📊 Ver estadísticas          │");
            System.out.println("│ 4. 📖 Reglas del juego          │");
            System.out.println("│ 5. 🔄 Reiniciar estadísticas    │");
            System.out.println("│ 6. 🚪 Salir                     │");
            System.out.println("└─────────────────────────────────┘");
            
            System.out.print("Elige una opción (1-6): ");
            
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        jugarPartida();
                        break;
                    case 2:
                        mejorDeTres();
                        break;
                    case 3:
                        mostrarEstadisticas();
                        break;
                    case 4:
                        mostrarReglas();
                        break;
                    case 5:
                        reiniciarEstadisticas();
                        break;
                    case 6:
                        System.out.println("👋 ¡Gracias por jugar! ¡Hasta la vista!");
                        return;
                    default:
                        System.out.println("❌ Opción no válida. Elige entre 1 y 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Por favor, ingresa un número válido.");
            }
            
            System.out.println(); // Línea en blanco para separar
        }
    }
    
    /**
     * Juega una partida individual
     */
    private static void jugarPartida() {
        System.out.println("\n🎯 ¡Nueva partida!");
        
        int eleccionJugador = obtenerEleccionJugador();
        int eleccionComputadora = random.nextInt(3);
        
        mostrarElecciones(eleccionJugador, eleccionComputadora);
        
        int resultado = determinarGanador(eleccionJugador, eleccionComputadora);
        mostrarResultado(resultado);
        
        actualizarEstadisticas(resultado);
        partidasJugadas++;
        
        System.out.println("Presiona ENTER para continuar...");
        scanner.nextLine();
    }
    
    /**
     * Modo mejor de 3 partidas
     */
    private static void mejorDeTres() {
        System.out.println("\n🏆 ¡MEJOR DE 3 PARTIDAS!");
        System.out.println("El primero en ganar 2 partidas es el campeón");
        
        int victoriasJugadorTorneo = 0;
        int victoriasComputadoraTorneo = 0;
        int ronda = 1;
        
        while (victoriasJugadorTorneo < 2 && victoriasComputadoraTorneo < 2) {
            System.out.println("\n" + "=".repeat(30));
            System.out.println("           RONDA " + ronda);
            System.out.println("Jugador: " + victoriasJugadorTorneo + " | Computadora: " + victoriasComputadoraTorneo);
            System.out.println("=".repeat(30));
            
            int eleccionJugador = obtenerEleccionJugador();
            int eleccionComputadora = random.nextInt(3);
            
            mostrarElecciones(eleccionJugador, eleccionComputadora);
            
            int resultado = determinarGanador(eleccionJugador, eleccionComputadora);
            
            if (resultado == 1) {
                victoriasJugadorTorneo++;
                System.out.println("🎉 ¡Ganaste esta ronda!");
            } else if (resultado == -1) {
                victoriasComputadoraTorneo++;
                System.out.println("😔 La computadora ganó esta ronda");
            } else {
                System.out.println("🤝 Empate en esta ronda");
            }
            
            actualizarEstadisticas(resultado);
            partidasJugadas++;
            ronda++;
            
            if (victoriasJugadorTorneo < 2 && victoriasComputadoraTorneo < 2) {
                System.out.println("Presiona ENTER para la siguiente ronda...");
                scanner.nextLine();
            }
        }
        
        // Mostrar ganador del torneo
        System.out.println("\n" + "🏆".repeat(20));
        if (victoriasJugadorTorneo == 2) {
            System.out.println("    ¡🎊 FELICIDADES! ¡ERES EL CAMPEÓN! 🎊");
        } else {
            System.out.println("    😞 La computadora ganó el torneo");
        }
        System.out.println("🏆".repeat(20));
        
        System.out.println("Presiona ENTER para continuar...");
        scanner.nextLine();
    }
    
    /**
     * Obtiene la elección del jugador
     */
    private static int obtenerEleccionJugador() {
        while (true) {
            System.out.println("\nElige tu opción:");
            System.out.println("1. 🗿 PIEDRA");
            System.out.println("2. 📄 PAPEL");
            System.out.println("3. ✂️ TIJERAS");
            System.out.print("Tu elección (1-3): ");
            
            try {
                int eleccion = Integer.parseInt(scanner.nextLine());
                if (eleccion >= 1 && eleccion <= 3) {
                    return eleccion - 1; // Convertir a índice 0-2
                } else {
                    System.out.println("❌ Elige 1, 2 o 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Por favor, ingresa un número válido");
            }
        }
    }
    
    /**
     * Muestra las elecciones de ambos jugadores
     */
    private static void mostrarElecciones(int jugador, int computadora) {
        System.out.println("\n" + "⚡".repeat(25));
        System.out.println("      TÚ: " + EMOJIS[jugador] + " " + OPCIONES[jugador]);
        System.out.println("COMPUTADORA: " + EMOJIS[computadora] + " " + OPCIONES[computadora]);
        System.out.println("⚡".repeat(25));
    }
    
    /**
     * Determina el ganador de la partida
     * @return 1 si gana el jugador, -1 si gana la computadora, 0 si es empate
     */
    private static int determinarGanador(int jugador, int computadora) {
        if (jugador == computadora) {
            return 0; // Empate
        }
        
        // Piedra (0) vence Tijeras (2)
        // Papel (1) vence Piedra (0)
        // Tijeras (2) vence Papel (1)
        if ((jugador == 0 && computadora == 2) ||
            (jugador == 1 && computadora == 0) ||
            (jugador == 2 && computadora == 1)) {
            return 1; // Gana jugador
        } else {
            return -1; // Gana computadora
        }
    }
    
    /**
     * Muestra el resultado de la partida
     */
    private static void mostrarResultado(int resultado) {
        switch (resultado) {
            case 1:
                System.out.println("🎉 ¡GANASTE! ¡Excelente jugada!");
                break;
            case -1:
                System.out.println("😔 Perdiste... ¡La próxima vez será!");
                break;
            case 0:
                System.out.println("🤝 ¡EMPATE! Grandes mentes piensan igual");
                break;
        }
    }
    
    /**
     * Actualiza las estadísticas del juego
     */
    private static void actualizarEstadisticas(int resultado) {
        switch (resultado) {
            case 1:
                victoriasJugador++;
                break;
            case -1:
                victoriasComputadora++;
                break;
            case 0:
                empates++;
                break;
        }
    }
    
    /**
     * Muestra las estadísticas actuales
     */
    private static void mostrarEstadisticas() {
        System.out.println("\n📊 ESTADÍSTICAS DEL JUEGO");
        System.out.println("═".repeat(30));
        System.out.println("Partidas jugadas: " + partidasJugadas);
        System.out.println("Tus victorias: " + victoriasJugador + " 🏆");
        System.out.println("Victorias de la PC: " + victoriasComputadora + " 🤖");
        System.out.println("Empates: " + empates + " 🤝");
        
        if (partidasJugadas > 0) {
            double porcentajeVictorias = (double) victoriasJugador / partidasJugadas * 100;
            System.out.printf("Tu porcentaje de victorias: %.1f%%\n", porcentajeVictorias);
            
            if (porcentajeVictorias >= 70) {
                System.out.println("🌟 ¡Eres un maestro del juego!");
            } else if (porcentajeVictorias >= 50) {
                System.out.println("👍 ¡Buen rendimiento!");
            } else {
                System.out.println("💪 ¡Sigue practicando!");
            }
        }
        
        System.out.println("Presiona ENTER para continuar...");
        scanner.nextLine();
    }
    
    /**
     * Muestra las reglas del juego
     */
    private static void mostrarReglas() {
        System.out.println("\n📖 REGLAS DEL JUEGO");
        System.out.println("═".repeat(40));
        System.out.println("🗿 PIEDRA rompe las TIJERAS");
        System.out.println("📄 PAPEL envuelve la PIEDRA");
        System.out.println("✂️ TIJERAS cortan el PAPEL");
        System.out.println("\n💡 CONSEJOS:");
        System.out.println("• No hay estrategia perfecta");
        System.out.println("• La suerte es importante");
        System.out.println("• ¡Diviértete jugando!");
        
        System.out.println("Presiona ENTER para continuar...");
        scanner.nextLine();
    }
    
    /**
     * Reinicia todas las estadísticas
     */
    private static void reiniciarEstadisticas() {
        System.out.print("¿Estás seguro de reiniciar las estadísticas? (s/n): ");
        String respuesta = scanner.nextLine().toLowerCase();
        
        if (respuesta.equals("s") || respuesta.equals("si")) {
            victoriasJugador = 0;
            victoriasComputadora = 0;
            empates = 0;
            partidasJugadas = 0;
            System.out.println("✅ Estadísticas reiniciadas correctamente");
        } else {
            System.out.println("❌ Operación cancelada");
        }
        
        System.out.println("Presiona ENTER para continuar...");
        scanner.nextLine();
    }
}