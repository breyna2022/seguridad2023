
package pe.edu.utp.seguridad.service;


import java.util.List;
import pe.edu.utp.seguridad.modelo.Prestamo;

/**
 *
 * @author admin
 */
public interface PrestamoService {
    Prestamo create(Prestamo prestamo);
    Prestamo update(Prestamo prestamo);
    void delete(int id);
    Prestamo read(int id);
    List<Prestamo> readAll();
}
