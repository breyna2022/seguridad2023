
package pe.edu.utp.seguridad.serviceImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.utp.seguridad.modelo.Lector;
import pe.edu.utp.seguridad.repository.LectorRepository;
import pe.edu.utp.seguridad.service.LectorService;

/**
 *
 * @author admin
 */
@Service
public class LectorServiceImpl implements LectorService {
    @Autowired
    private LectorRepository lectorRepository;
    @Override
    public Lector create(Lector lector) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Lector update(Lector lector) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Lector read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Lector> readAll() {
        return lectorRepository.findAll();
    }
    
}
