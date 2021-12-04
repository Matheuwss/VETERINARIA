package poo_projetoFinal.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionFactory {

    //String's de conexão
    private static final String USER = "root";
    private static final String PASS = "Matheus1399";
    private static final String DATABASE = "VETERINARIA";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;

    public Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(URL,USER,PASS);
            return connection;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}