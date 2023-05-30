/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomundial.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyectomundial.util.BasedeDatos;
import static proyectomundial.util.BasedeDatos.ejecutarSQL;

/**
 *
 * @author LAB205BPC02
 */
public class SesionDAO {

    public SesionDAO() {
        BasedeDatos.conectar();
    }
    
    public boolean Validar(String usuariop, String contraseñap) {
        String sql = "select * from poo.users u ";
        String usuario = "";
        String contraseña = "";
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            
            if(result.next()) {
                usuario = result.getString("username");
                contraseña = result.getString("password");
            }
            
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error Contando PromedioGoles");
        }
        
        boolean comprobador;
        
        if(usuariop.equals(usuario) && contraseñap.equals(contraseña)) {
            comprobador = true;
        } else {
            comprobador = false;
        }
        
        return comprobador;
    }
    
}
