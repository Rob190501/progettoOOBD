/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rob19
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pst;
        
        try {
            pst = conn.prepareStatement("");
            
        } catch (SQLException ex) {
            //Logger.getLogger(Mavenproject1.class.getName()).log(Level.SEVERE, null, ex);
            if(pst == null) {
                System.out.println("ciao");
            }
        }
        finally {
            
        }
    }
}
