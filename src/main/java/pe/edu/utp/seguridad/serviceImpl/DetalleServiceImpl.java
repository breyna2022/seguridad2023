
package pe.edu.utp.seguridad.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.utp.seguridad.modelo.Detalle;
import pe.edu.utp.seguridad.repository.DetalleRepository;
import pe.edu.utp.seguridad.service.DetalleService;

/**
 *
 * @author admin
 */
@Service
public class DetalleServiceImpl implements DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;
    @Override
    public Detalle create(Detalle detalle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Detalle update(Detalle detalle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Detalle read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Detalle> readAll() {
        return detalleRepository.findAll();
    }
    
}
