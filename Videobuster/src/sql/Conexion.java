
package sql;
import java.sql.*;
public class Conexion {
     public static Connection getConexion() {
        Connection connection = null;
        try {
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           //String driverClassName = "oracle.jdbc.driver.OracleDriver()";
           String driverUrl="jdbc:oracle:thin:@LFD-AM-01-04.aws.smartcloud.cl:1521:XE";
           //Class.forName(driverClassName);
           //Cambiar pass por la de su equipo o sólo deje las comillas en blanco
           connection = DriverManager.getConnection(driverUrl, "usuario04","usuario04");
            System.out.println("Conexion exitosa");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}