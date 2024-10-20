import java.util.ArrayList;
import java.util.List;

class LibroDAOImpl implements LibroDAO {
    private List<Libro> libros = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public void agregarLibro(Libro libro) {
        libro = new Libro(contadorId++, libro.getTitulo(), libro.getAutor(), libro.getAnioPublicacion());
        libros.add(libro);
        System.out.println("Libro agregado: " + libro);
    }

    @Override
    public Libro obtenerLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    @Override
    public void actualizarLibro(Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libroActualizado.getId()) {
                libros.set(i, libroActualizado);
                System.out.println("Libro actualizado: " + libroActualizado);
                return;
            }
        }
        System.out.println("Libro no encontrado para actualizar.");
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
        System.out.println("Libro con ID " + id + " eliminado.");
    }
}

