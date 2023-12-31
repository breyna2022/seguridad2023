
package pe.edu.utp.seguridad.controller;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.edu.utp.seguridad.modelo.Editorial;
import pe.edu.utp.seguridad.serviceImpl.EditorialService;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/editorial")
public class EditorialController {
    @Autowired
    private EditorialService editorialService;
    
    @GetMapping
    public String indexEditorial(Model model, @AuthenticationPrincipal User user){
        model.addAttribute("editoriales", editorialService.readAll());
        return "editoriales/listarEditorial";
    }
    @GetMapping("/add")
    public String addEditorial(Model model){
        model.addAttribute("titulo", "Registrar");
        model.addAttribute("editorial", new Editorial());
        return "editoriales/addEditorial";
    }
    @GetMapping("/save")
    public String saveEditorial(Model model){
        model.addAttribute("titulo", "Registrar");
        model.addAttribute("editorial", new Editorial());
        return "editorial/addEditorial";
    }
    @PostMapping("/save")
    public String addEditorial(@Valid @ModelAttribute Editorial editorial, BindingResult result, Model model, RedirectAttributes attributes ) {  
        editorialService.create(editorial);
        return "redirect:/editorial";
    }
    @GetMapping("/edit/{id}")
    public String editarEditorial(@PathVariable("id") int ideditorial, Model model) {  
        Editorial editorial = editorialService.read(ideditorial);
        model.addAttribute("titulo", "Editar");
        model.addAttribute("editorial", editorial);
        return "editoriales/addEditorial";
    }
    @GetMapping("/detalle/{id}")
    public String detalleEditorial(@PathVariable("id") int ideditorial, Model model) {
        
        Editorial editorial = editorialService.read(ideditorial);
        model.addAttribute("titulo", "Detalle");
        model.addAttribute("autor", editorial);
        return "autores/detalleEditorial";
    }
    @GetMapping("/delete/{id}")
    public String deleteEditorial(@PathVariable("id") int ideditorial) {  
       editorialService.delete(ideditorial);
        return "redirect:/editorial";
    }
    
}
