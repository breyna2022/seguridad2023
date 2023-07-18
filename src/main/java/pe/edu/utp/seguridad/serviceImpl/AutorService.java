
package pe.edu.utp.seguridad.serviceImpl;


import java.util.List;
import pe.edu.utp.seguridad.modelo.Autor;

/**
 *
 * @author admin
 */
public interface AutorService {
    Autor create(Autor autor);
    Autor update(Autor autor);
    void delete(int id);
    Autor read(int id);
    List<Autor> readAll();
}
