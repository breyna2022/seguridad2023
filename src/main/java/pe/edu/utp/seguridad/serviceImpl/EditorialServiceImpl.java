
package pe.edu.utp.seguridad.serviceImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.utp.seguridad.modelo.Editorial;
import pe.edu.utp.seguridad.repository.EditorialRepository;

/**
 *
 * @author admin
 */
@Service
public class EditorialServiceImpl implements EditorialService {
    @Autowired
    private EditorialRepository editorialRepository;
    @Override
    public Editorial create(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public Editorial update(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public void delete(int id) {
        editorialRepository.deleteById(id);
    }

    @Override
    public Editorial read(int id) {
        return editorialRepository.findById(id).get();
    }

    @Override
    public List<Editorial> readAll() {
        return editorialRepository.findAll();
    }
    
}
