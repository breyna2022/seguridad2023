
package pe.edu.utp.seguridad.service;


import java.util.List;
import pe.edu.utp.seguridad.modelo.Detalle;

/**
 *
 * @author admin
 */
public interface DetalleService {
    Detalle create(Detalle detalle);
    Detalle update(Detalle detalle);
    void delete(int id);
    Detalle read(int id);
    List<Detalle> readAll();
}
