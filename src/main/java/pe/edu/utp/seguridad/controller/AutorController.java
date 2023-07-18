package pe.edu.utp.seguridad.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.edu.utp.seguridad.modelo.Autor;
import pe.edu.utp.seguridad.serviceImpl.AutorService;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    private AutorService autorService;
    @GetMapping
    public String indexAutor(Model model, @AuthenticationPrincipal User user){
        model.addAttribute("autores", autorService.readAll());      
        return "autores/listarAutor";
    }
    @GetMapping("/add")
    public String addAutor(Model model){
        model.addAttribute("titulo", "Registrar");
        model.addAttribute("autor", new Autor());
        return "autores/addAutor";
    }
    /*
    @GetMapping("/save")
    public String saveAutor(Model model){
        model.addAttribute("titulo", "Registrar");
        model.addAttribute("autor", new Autor());
        return "autores/addAutor";
    }*/
    @PostMapping("/save")
    public String addAutor(@Valid @ModelAttribute Autor autor, BindingResult result, Model model, @RequestParam("file") MultipartFile imagen, RedirectAttributes attributes ) {  

        if(!imagen.isEmpty()){
            String ruta = "E://recursos//images//files2";

            try {
                byte[] bytesImg = imagen.getBytes();
                Path rutacompleta = Paths.get(ruta+"//"+imagen.getOriginalFilename());
                Files.write(rutacompleta, bytesImg);
                autor.setFoto(imagen.getOriginalFilename());
                autorService.create(autor);
            } catch (IOException e) {
                System.out.println("Error: "+e);
            }
        }
        return "redirect:/autor";
    }
    @GetMapping("/edit/{id}")
    public String editarAutor(@PathVariable("id") int idautor, Model model) {  
        Autor autor = autorService.read(idautor);
        model.addAttribute("titulo", "Editar");
        model.addAttribute("autor", autor);
        return "autores/addAutor";
    }
    @GetMapping("/detalle/{id}")
    public String detalleAutor(@PathVariable("id") int idautor, Model model) {
        
        Autor autor = autorService.read(idautor);
        model.addAttribute("titulo", "Detalle");
        model.addAttribute("autor", autor);
        return "autores/detalleAutor";
    }
    @GetMapping("/delete/{id}")
    public String deleteAutor(@PathVariable("id") int idautor) {  
       autorService.delete(idautor);
        return "redirect:/autor";
    }
    
}
