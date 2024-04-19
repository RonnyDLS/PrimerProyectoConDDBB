
package ConexionDDBB;
import java.sql.*;
public class ResultSetDDBB {
    
    ResultSet rs;
    
    public ResultSet myResultSetQuery(Statement mySt, String myQuery){
        try{
            rs = mySt.executeQuery(myQuery);
            System.out.println("Conexion de ResultSet exitosa!!");
        }catch(SQLException e){
            System.out.println("Error en la conexion de ResultSet!!");
        }
        return rs;
    }
    
    public void myResultSetUpdate(Statement mySt, String myQuery){
        try{
            mySt.executeUpdate(myQuery);
            System.out.println("Update exitoso!!");
        }catch(SQLException e){
            System.out.println("Error en el Update!!, error"+e);
        }
    }
}
