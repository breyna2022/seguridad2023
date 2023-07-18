/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.utp.seguridad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utp.seguridad.modelo.Lector;

/**
 *
 * @author admin
 */
public interface LectorRepository extends JpaRepository<Lector, Integer>{
    
}
