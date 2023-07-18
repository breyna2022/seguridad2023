
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
@Table(name = "prestamo")
public class Prestamo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idprestamo")
    private int id;
    private String fecha_salida;
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "idlector")
    private Lector lector;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;
    @OneToMany
    @JoinColumn(name="idprestamo")
    private List<Detalle> detalle;
}
