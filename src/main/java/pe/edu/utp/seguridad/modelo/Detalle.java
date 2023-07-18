
package pe.edu.utp.seguridad.modelo;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "detalle")
public class Detalle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="iddetalle")
    private int id;
    private String fecha_fecha_devol;
    private double mora;
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "idprestamo")
    private Prestamo prestamo;
    @ManyToOne
    @JoinColumn(name = "idlibro")
    private Libro libro;
    
}
