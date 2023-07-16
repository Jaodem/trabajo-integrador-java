package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
    
    /*static permite usar Clase.metodo 
	 * AdministradorDeConexiones.getConnection()
	 * sin necesidad  de instanciar un objeto
	*/
    public static Connection getConnection() {
        String hosts = "127.0.0.1"; // localhost
        String port = "3306";
        String password = "root";
        String username = "root";

        // Driver de conexión a la base de datos
        String driverClassName = "com.mysql.cj.jdbc.Driver";

        // Nombre de la base de datos
		String dbName = "23049-db";
		
		// No va a explicar TRY CATCH, sólo lo vamos a utilizar
		Connection connection;
		try {
			Class.forName(driverClassName);
			
			String url = "jdbc:mysql://" + hosts + ":" + port + "/" + dbName + "?allowPublicKeyRetrieval=true&serverTimeZone=UTC&useSSL=false";
			
			connection = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			connection = null;
		}
		
		return connection;
    }
    
}
