
package pe.edu.utp.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.utp.seguridad.modelo.Libro;

/**
 *
 * @author admin
 */
@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{
    
}
