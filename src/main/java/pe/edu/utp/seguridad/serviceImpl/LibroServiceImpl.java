
package pe.edu.utp.seguridad.serviceImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.utp.seguridad.modelo.Libro;
import pe.edu.utp.seguridad.repository.LibroRepository;

/**
 *
 * @author admin
 */
@Service
public class LibroServiceImpl implements LibroService{
    @Autowired
    private LibroRepository libroRepository;
    @Override
    public Libro create(Libro autor) {
        return libroRepository.save(autor);
    }

    @Override
    public Libro update(Libro autor) {
        return libroRepository.save(autor);
    }

    @Override
    public void delete(int id) {
        libroRepository.deleteById(id);
    }

    @Override
    public Libro read(int id) {
        return libroRepository.findById(id).get();
    }

    @Override
    public List<Libro> readAll() {
        return libroRepository.findAll();
    }

    
}
