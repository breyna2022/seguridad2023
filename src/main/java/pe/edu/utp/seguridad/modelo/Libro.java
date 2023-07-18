
package pe.edu.utp.seguridad.modelo;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "libro")
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idlibro")
    private int id;
    private String titulo;
    private String edicion;
    
    @ManyToOne
    @JoinColumn(name = "idautor")
    private Autor autor;
    
    @ManyToOne
    @JoinColumn(name = "ideditorial")
    private Editorial editorial;
    
    private String imagen;
    private int anos;
    
    @OneToMany
    @JoinColumn(name="idlibro")
    private List<Detalle> detalle;
    
}
