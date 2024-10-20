public class GestionLibros {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        // Agregar libros
        libroDAO.agregarLibro(new Libro(0, "Cien años de soledad", "Gabriel García Márquez", 1967));
        libroDAO.agregarLibro(new Libro(0, "1984", "George Orwell", 1949));

        // Obtener y mostrar todos los libros
        System.out.println("Todos los libros:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }

        // Obtener un libro específico
        Libro libro = libroDAO.obtenerLibro(1);
        System.out.println("Libro con ID 1: " + libro);

        // Actualizar un libro
        libroDAO.actualizarLibro(new Libro(1, "Cien años de soledad", "Gabriel García Márquez", 1970));

        // Eliminar un libro
        libroDAO.eliminarLibro(2);

        // Mostrar todos los libros después de la eliminación
        System.out.println("Libros después de la eliminación:");
        for (Libro l : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(l);
        }
    }
}

