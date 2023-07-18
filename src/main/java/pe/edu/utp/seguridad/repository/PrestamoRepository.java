
package pe.edu.utp.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utp.seguridad.modelo.Prestamo;

/**
 *
 * @author admin
 */
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{
    
}
