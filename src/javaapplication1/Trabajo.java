package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Trabajo {

    public static void main(String[] args) {
        
    }
    
    public static void mercurio(){
        Connection connection = null;
         
         try {
            String BD = "practica_intermodular";
            String USUARIO = "root";
            String PASS = "";
            String HOST = "localhost";

            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/"
                    + BD + "?user=" + USUARIO + "&password=" + PASS);
            
           
            String consulta = "SELECT * FROM planeta WHERE nombre = Mercurio";
            Statement stmt = connection.createStatement();

            ResultSet rset = stmt.executeQuery(consulta);
   
                String nombre = rset.getString("nombre");
                float radio = rset.getFloat("radio");
                float distancias = rset.getFloat("distancia_sol");
                float periodo = rset.getFloat("periodo_orbital");
                float temperatura = rset.getFloat("temperatura_media");
                String tipo = rset.getString("tipo");
                int satelites = rset.getInt("num_satelites");

           Planeta p = new Planeta(nombre, radio, distancias, periodo, temperatura,tipo,satelites);
           System.out.println(nombre+ radio+ distancias+periodo+ temperatura+tipo+satelites);
            
        } catch (SQLException ex) {

        }
         
    }
    
    
    
    }
