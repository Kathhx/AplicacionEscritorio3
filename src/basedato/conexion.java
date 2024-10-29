/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedato;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;


public class conexion {
    Connection cn=null;
    
    public Connection conectar(){
    try {
    Class.forName("org.gjt.mm.mysql.Driver");
    cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/bacox","root","Mariposa%11");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        } 
    return cn;
    } 
}
