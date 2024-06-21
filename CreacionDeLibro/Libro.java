public class Libro{
    // Atributos
    String titulo;
    String autor;
    double precio;

    // Constructor sin parámetros
    public Libro() {
        // Inicializa los atributos con valores por defecto
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, double precio) {
        // Inicializa los atributos con los valores dados
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        // Implementa este método para mostrar los detalles del libro
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // Implementa este método para actualizar el precio del libro
        this.precio = nuevoPrecio;
        System.out.println("Precio actualizado a: $" + this.precio);
    }
}