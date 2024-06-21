public class Main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();

        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro("Hamlet", "Homero", 250);

        // Llama a los métodos 'mostrarDetalles' y 'actualizarPrecio' para 'libro2'
        libro2.mostrarDetalles();
        libro2.actualizarPrecio(300);
    }
}
