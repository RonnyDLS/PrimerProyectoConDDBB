
package ConexionDDBB;
import java.sql.*;
public class StatementDDBB {
    
    Statement st;
    
    public Statement myStatement(Connection conexion){
        
        try{
             st = conexion.createStatement();
        }catch(SQLException e){
            System.out.println("Error en la conexion de Statement!!");
        }
        return st;
    } 
}
