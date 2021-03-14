

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanzi
 */
public class Traffiapp {
    
    public static void main(String[] args) throws InvalidKeySpecException, NoSuchAlgorithmException {
        
     DBConnection.getConn();
     DBConnection.creatingTable();
     
     
     
     
    }
}
