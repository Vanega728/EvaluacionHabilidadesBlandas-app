
import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}

class SistemaAutenticacion {
    private ArrayList<Usuario> usuarios;

    public SistemaAutenticacion() {
        usuarios = new ArrayList<>();
    }

    public void registrarUsuario(String nombreUsuario, String contrasena) {
        Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasena);
        usuarios.add(nuevoUsuario);
        System.out.println("\nRegistro exitoso. Puedes iniciar sesión ahora.\n");
    }

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                System.out.println("\nInicio de sesión exitoso.\n");
                return true;
            }
        }
        System.out.println("\nUsuario o contraseña incorrectos.\n");
        return false;
    }
}

class TestHabilidadesBlandas {
    private int puntajeLiderazgo;
    private int puntajeAdaptabilidad;
    private int puntajeResolucionProblemas;
    private int puntajeComunicacion;
    private int puntajeTrabajoEquipo;

    public void realizarTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Responde con una puntuación de 1 a 5 (1 = Muy Bajo, 5 = Muy Alto)");

        // Liderazgo
        System.out.println("\n--- Evaluación de Liderazgo ---");
        puntajeLiderazgo = sumarPuntaje(new String[]{
                "¿Te sientes cómodo liderando a otros?",
                "¿Eres capaz de motivar e inspirar a los demás?",
                "¿Tomas decisiones con confianza?",
                "¿Delegas tareas de manera efectiva?",
                "¿Eres un ejemplo positivo para los demás?"
        }, scanner);

        // Adaptabilidad
        System.out.println("\n--- Evaluación de Adaptabilidad ---");
        puntajeAdaptabilidad = sumarPuntaje(new String[]{
                "¿Te adaptas bien a los cambios?",
                "¿Mantienes la calma bajo presión?",
                "¿Eres flexible con nuevas ideas y enfoques?",
                "¿Aprendes rápidamente de nuevas situaciones?",
                "¿Manejas bien los contratiempos?"
        }, scanner);

        // Resolución de problemas
        System.out.println("\n--- Evaluación de Resolución de Problemas ---");
        puntajeResolucionProblemas = sumarPuntaje(new String[]{
                "¿Te sientes cómodo abordando problemas complejos?",
                "¿Piensas de manera crítica y analítica?",
                "¿Encuentras soluciones efectivas a los problemas?",
                "¿Tomas decisiones informadas?",
                "¿Evalúas todas las opciones antes de actuar?"
        }, scanner);

        // Comunicación
        System.out.println("\n--- Evaluación de Comunicación ---");
        puntajeComunicacion = sumarPuntaje(new String[]{
                "¿Te sientes cómodo comunicándote con los demás?",
                "¿Eres claro y conciso al expresar tus ideas?",
                "¿Escuchas activamente a los demás?",
                "¿Adaptas tu comunicación según el público?",
                "¿Puedes recibir y dar retroalimentación constructiva?"
        }, scanner);

        // Trabajo en equipo
        System.out.println("\n--- Evaluación de Trabajo en Equipo ---");
        puntajeTrabajoEquipo = sumarPuntaje(new String[]{
                "¿Te sientes cómodo colaborando con otros?",
                "¿Eres capaz de trabajar bien en un equipo?",
                "¿Contribuyes positivamente al ambiente de equipo?",
                "¿Respetas las ideas y opiniones de los demás?",
                "¿Ayudas a tus compañeros de equipo cuando lo necesitan?"
        }, scanner);
    }

    private int sumarPuntaje(String[] preguntas, Scanner scanner) {
        int puntaje = 0;
        for (String pregunta : preguntas) {
            System.out.print(pregunta + " ");
            puntaje += scanner.nextInt();
        }
        return puntaje;
    }

    public int getPuntajeLiderazgo() {
        return puntajeLiderazgo;
    }

    public int getPuntajeAdaptabilidad() {
        return puntajeAdaptabilidad;
    }

    public int getPuntajeResolucionProblemas() {
        return puntajeResolucionProblemas;
    }

    public int getPuntajeComunicacion() {
        return puntajeComunicacion;
    }

    public int getPuntajeTrabajoEquipo() {
        return puntajeTrabajoEquipo;
    }
}

class ConsejosHabilidades {

    public void mostrarConsejos(int puntaje, String habilidad) {
        System.out.println("\n--- Consejos para mejorar en " + habilidad + " ---");
        if (puntaje <= 15) {
            switch (habilidad) {
                case "Liderazgo":
                    System.out.println("- Trabaja en tu confianza al tomar decisiones.");
                    System.out.println("- Aprende técnicas de motivación y delegación.");
                    System.out.println("- Sé un ejemplo positivo.");
                    break;
                case "Adaptabilidad":
                    System.out.println("- Trabaja en mantener la calma bajo presión.");
                    System.out.println("- Sé abierto a nuevas ideas y cambios.");
                    System.out.println("- Aprende de cada situación nueva.");
                    break;
                case "Resolución de Problemas":
                    System.out.println("- Mejora tus habilidades de pensamiento crítico.");
                    System.out.println("- Practica la evaluación de opciones antes de actuar.");
                    System.out.println("- Trabaja en encontrar soluciones efectivas.");
                    break;
                case "Comunicación":
                    System.out.println("- Practica la escucha activa.");
                    System.out.println("- Trabaja en ser claro y conciso al expresarte.");
                    System.out.println("- Acepta y da retroalimentación constructiva.");
                    break;
                case "Trabajo en Equipo":
                    System.out.println("- Participa más en actividades de equipo.");
                    System.out.println("- Aprende a valorar las opiniones de los demás.");
                    System.out.println("- Colabora y apoya a tus compañeros.");
                    break;
            }
        } else {
            System.out.println("¡Excelente trabajo! Mantén tus buenos hábitos y sigue mejorando.");
        }
    }
}

public class EvaluacionHabilidadesBlandas {
    private static void limpiarPantalla() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public static void main(String[] args) {
        SistemaAutenticacion sistema = new SistemaAutenticacion();
        TestHabilidadesBlandas test = new TestHabilidadesBlandas();
        ConsejosHabilidades consejos = new ConsejosHabilidades();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            limpiarPantalla();
            System.out.println("=== Bienvenido al Sistema de Evaluación de Habilidades Blandas ===\n");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("\nSelecciona una opción: ");
            int opcion = scanner.nextInt();
            limpiarPantalla();

            switch (opcion) {
                case 1:
                    System.out.println("=== Registro de Nuevo Usuario ===\n");
                    System.out.print("Nombre de usuario: ");
                    String usuario = scanner.next();
                    System.out.print("Contraseña: ");
                    String contrasena = scanner.next();
                    sistema.registrarUsuario(usuario, contrasena);
                    break;

                case 2:
                    System.out.println("=== Inicio de Sesión ===\n");
                    System.out.print("Nombre de usuario: ");
                    usuario = scanner.next();
                    System.out.print("Contraseña: ");
                    contrasena = scanner.next();
                    limpiarPantalla();

                    if (sistema.iniciarSesion(usuario, contrasena)) {
                        System.out.println("=== Test de Habilidades Blandas ===\n");
                        test.realizarTest();
                        consejos.mostrarConsejos(test.getPuntajeLiderazgo(), "Liderazgo");
                        consejos.mostrarConsejos(test.getPuntajeAdaptabilidad(), "Adaptabilidad");
                        consejos.mostrarConsejos(test.getPuntajeResolucionProblemas(), "Resolución de Problemas");
                        consejos.mostrarConsejos(test.getPuntajeComunicacion(), "Comunicación");
                        consejos.mostrarConsejos(test.getPuntajeTrabajoEquipo(), "Trabajo en Equipo");

                        System.out.println("\nPresiona cualquier tecla y Enter para regresar al menú principal.");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.println("\nGracias por usar el sistema. ¡Hasta luego!");
                    salir = true;
                    break;

                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.\n");
            }
        } while (!salir);
    }
}