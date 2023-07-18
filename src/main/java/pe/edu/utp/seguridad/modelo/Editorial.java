
package pe.edu.utp.seguridad.modelo;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "editorial")
public class Editorial implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ideditorial")
    private int id;
    private String nombre;
    private String pais;
    private boolean estado;
            
}
