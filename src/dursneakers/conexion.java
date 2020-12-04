/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dursneakers;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrador
 */

public class conexion {
    private String URL = "jdbc:mysql://localhost:3306/dursneakerdb";
    private String USER = "root";
    private String PASS = ""; 
    
    public conexion(){
        this.URL = "jdbc:mysql://localhost:3306/dursneakerdb";
        this.USER = "root";
        this.PASS = ""; 
    }
    
    public conexion(String URL,String USER,String PASS){
        this.PASS = PASS;
        this.URL = URL;
        this.USER = USER;
    }
    
    public Connection getConection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL,USER,PASS);
            
        }catch(Exception e){}
        return con;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }
    
    
}
