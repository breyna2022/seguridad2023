package pe.edu.utp.seguridad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.utp.seguridad.modelo.Autor;

/**
 *
 * @author admin
 */
@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{
    
}
