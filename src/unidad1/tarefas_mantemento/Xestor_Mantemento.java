package unidad1.tarefas_mantemento;

import java.util.ArrayList;
import java.util.Scanner;

public class Xestor_Mantemento {
    static ArrayList<String> pendientes = new ArrayList<String>();
    static ArrayList<String> en_revision = new ArrayList<String>();
    static ArrayList<String> completadas = new ArrayList<String>();
    static final int max_tareas = 50;
    static Scanner teclado = new Scanner(System.in);

    static void main() {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerNumero();

            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    revisarTarea();
                    break;
                case 3:
                    completarTarea();
                    break;
                case 4:
                    listarTareas();
                    break;
                case 5:
                    buscarPorDescripcion();
                    break;
                case 6:
                    filtrarPorUsuario();
                    break;
                case 7:
                    mostrarResumen();
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    static void mostrarMenu() {
        System.out.println("Gestor de Tareas de Mantenimiento Informático");
        System.out.println("-------------------------------------------");
        System.out.println("\t1. Agrega nueva tarea");
        System.out.println("\t2. Revisar tarea");
        System.out.println("\t3. Completar tarea");
        System.out.println("\t4. Listar tareas");
        System.out.println("\t5. Buscar tarea por descripción");
        System.out.println("\t6. Filtrar tareas por usuario");
        System.out.println("\t7. Resumen");
        System.out.println("\t0. SALIR");
        System.out.println();
        System.out.print("Selecciona una opción: ");
    }

    static int leerNumero() {
        String texto = teclado.nextLine();
        if (texto.isEmpty() || texto.length() > 9) {
            return -1;
        }

        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isDigit(texto.charAt(i))) {
                return -1;
            }
        }
        return Integer.parseInt(texto);
    }

    static String formatearDescripcion(String texto) {
        texto = texto.trim().toLowerCase();
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }

    static String formatearNombre(String texto) {
        String[] palabras = texto.trim().toLowerCase().split(" ");
        String resultado = "";
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                resultado = resultado + palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1) + " ";
            }
        }
        return resultado.trim();
    }

    static String crearTarea(String descripcion, String usuario, String estado, String responsable) {
        return descripcion + " | Solicitada por: " + usuario + " | Estado: " + estado + " | Responsable: " + responsable;
    }

    static String obtenerUsuario(String tarea) {
        String[] partes = tarea.split(" \\| ");
        return partes[1].replace("Solicitada por: ", "");
    }

    static String obtenerDescripcion(String tarea) {
        String[] partes = tarea.split(" \\| ");
        return partes[0];
    }

    static String obtenerResponsable(String tarea) {
        String[] partes = tarea.split(" \\| ");
        return partes[3].replace("Responsable: ", "");
    }

    static String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        String texto = teclado.nextLine().trim();

        if (texto.isEmpty()) {
            System.out.println("Error. El texto no puede estar vacío.");
            return null;
        }

        if (texto.contains("|")) {
            System.out.println("Error. No se puede utilizar el carácter '|'.");
            return null;
        }
        return texto;
    }

    static void agregarTarea() {
        int total = pendientes.size() + en_revision.size() + completadas.size();
        if (total >= max_tareas) {
            System.out.println("Error. No hay espacio para más tareas de mantenimiento.");
            return;
        }

        String descripcion = pedirTexto("Descripcion de tarea: ");
        if (descripcion == null) {
            return;
        }

        String usuario = pedirTexto("Usuario que la solicita: ");
        if (usuario == null) {
            return;
        }

        String tarea = crearTarea(formatearDescripcion(descripcion), formatearNombre(usuario), "Pendiente", "Ninguno");
        pendientes.add(tarea);
        System.out.println("Tarea agregada con éxito.");
    }

    static void listarTareas() {
        mostrarLista("Pendientes",  pendientes);
        mostrarLista("En revisión",  en_revision);
        mostrarLista("Completadas",  completadas);
    }

    static void mostrarLista(String titulo, ArrayList<String> lista) {
        System.out.println();
        System.out.println(titulo);
        if (lista.isEmpty()) {
            System.out.println("(ninguna)");
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }

    static void revisarTarea() {
        int numero;
        if (pendientes.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
            return;
        }
        mostrarLista("Pendientes", pendientes);
        System.out.print("Número de la tarea a revisar: ");
        numero = leerNumero();

        if (numero < 1 || numero > pendientes.size()) {
            System.out.println("Error. Esa tarea no existe.");
            return;
        }

        String responsable = pedirTexto("Responsable: ");

        if (responsable == null) {
            return;
        }

        String antigua = pendientes.remove(numero - 1);
        String nueva = crearTarea(obtenerDescripcion(antigua), obtenerUsuario(antigua), "En revisión", formatearNombre(responsable));
        en_revision.add(nueva);
        System.out.println("Tarea movida a 'En revisión'.");
    }

    static void completarTarea() {
        int numero;
        String antigua, nueva;
        if (en_revision.isEmpty()) {
            System.out.println("No hay tareas en revisión.");
            return;
        }

        mostrarLista("En revisión", en_revision);
        System.out.println("Número de la tarea a completar: ");
        numero = leerNumero();

        if (numero < 1 || numero > en_revision.size()) {
            System.out.println("Error. Esa tarea no existe.");
            return;
        }

        antigua = en_revision.remove(numero - 1);
        nueva = crearTarea(obtenerDescripcion(antigua), obtenerUsuario(antigua), "Completada", obtenerResponsable(antigua));
        completadas.add(nueva);
        System.out.println("Tarea completada.");
    }

    static int buscarEnLista(ArrayList<String> lista, String clave) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            String tarea = lista.get(i);
            if (obtenerDescripcion(tarea).toLowerCase().contains(clave)) {
                System.out.println(tarea);
                contador++;
            }
        }
        return contador;
    }

    static void buscarPorDescripcion() {
        int encontradas = 0;
        String clave = pedirTexto("Palabra clave: ");
        if (clave == null) {
            return;
        }
        clave = clave.toLowerCase();
        encontradas = encontradas + buscarEnLista(pendientes, clave);
        encontradas = encontradas + buscarEnLista(en_revision, clave);
        encontradas = encontradas + buscarEnLista(completadas, clave);

        if (encontradas == 0) {
            System.out.println("No se encontró ninguna tarea.");
        }
    }

    static void filtrarPorUsuario() {
        int encontradas = 0;
        String usuario = pedirTexto("Usuario: ");
        if (usuario == null) {
            return;
        }
        usuario = formatearNombre(usuario);
        encontradas = encontradas + filtrarEnLista(pendientes, usuario);
        encontradas = encontradas + filtrarEnLista(en_revision, usuario);
        encontradas = encontradas + filtrarEnLista(completadas, usuario);

        if (encontradas == 0) {
            System.out.println("Ese usuario no ha solicitado ninguna tarea.");
        }
    }

    static int filtrarEnLista(ArrayList<String> lista, String usuario) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            String tarea = lista.get(i);
            if (obtenerUsuario(tarea).equals(usuario)) {
                System.out.println(tarea);
                contador++;
            }
        }
        return contador;
    }

    static void mostrarResumen() {
        int total = pendientes.size() + en_revision.size() + completadas.size();
        System.out.println();

        System.out.println("Total de tareas: " + total);
        System.out.println("Pendientes: " + pendientes.size());
        System.out.println("En revision: " + en_revision.size());
        System.out.println("Completadas: " + completadas.size());
    }
}