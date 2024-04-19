
package ConexionDDBB;

import java.sql.*;

public class ConexionDDBB {
    private String url= "jdbc:mysql://localhost:3306/EducaApp";
    private String usuario = "root";
    private String contrasenia = "ronny01";
    
    private Connection ConexionDDBB;
    
    public Connection conexion(){
        try{
            ConexionDDBB = DriverManager.getConnection(url, usuario, contrasenia);
        }catch(SQLException e){
            System.out.println("No conecta la DDBB, error:"+e);
        }
        return ConexionDDBB;
    }
}
