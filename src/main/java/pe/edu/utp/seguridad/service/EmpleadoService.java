
package pe.edu.utp.seguridad.service;


import java.util.List;
import pe.edu.utp.seguridad.modelo.Empleado;

/**
 *
 * @author admin
 */
public interface EmpleadoService {
    Empleado create(Empleado empleado);
    Empleado update(Empleado empleado);
    void delete(int id);
    Empleado read(int id);
    List<Empleado> readAll();
}
