/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.registromedico.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL =
        "jdbc:sqlserver://localhost:1433;"
        + "databaseName=RegistroMedicoDB;"
        + "encrypt=true;"
        + "trustServerCertificate=true;";
    private static final String USUARIO = "app_java";
    private static final String PASSWORD = "Java2026*Demo";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}
