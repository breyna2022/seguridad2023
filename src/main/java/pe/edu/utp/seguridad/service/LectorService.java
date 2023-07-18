/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.utp.seguridad.service;


import java.util.List;
import pe.edu.utp.seguridad.modelo.Lector;

/**
 *
 * @author admin
 */
public interface LectorService {
    Lector create(Lector lector);
    Lector update(Lector lector);
    void delete(int id);
    Lector read(int id);
    List<Lector> readAll();
}
