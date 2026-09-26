/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.registromedicoo;



import gt.edu.umg.registromedico.conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        try {
            Connection cn = Conexion.conectar();
            System.out.println("CONEXION EXITOSA CON SQL SERVER");
            cn.close();
        } catch (SQLException e) {
            System.out.println("ERROR DE CONEXION:");
            System.out.println(e.getMessage());
        }
    }
}
