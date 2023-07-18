
package pe.edu.utp.seguridad.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.utp.seguridad.service.EmpleadoService;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping
    public String indexLibro(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("empleados", empleadoService.readAll());
        return "empleado/listarEmpleado";
    }
}
