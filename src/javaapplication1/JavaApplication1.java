/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author nihan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String charset = "UTF-8";
        File uploadFile1 = new File("C:\\Users\\nihan\\Desktop\\Untitled.png");

        utility u = new utility("https://fa-sa-801.herokuapp.com/");
        String x = u.createUser("Nihan", "nihanaaa@dip.coim", "asdasd123",
                uploadFile1,
                "Mirpur", "1", "1", "DBBL",
                "RIch boi", "zero0", "Initiator");
        System.out.println(x);
        utility uu = new utility("https://fa-sa-801.herokuapp.com/");
        String xx = u.editUser("92", "Nihan", "nihan@dip.coim", 
                uploadFile1,
                "Mirpur", "1", "1", "DBBL",
                "RIch boi", "zero0", "5vz8wX9G103AO0fY7eYZ1VeQvNRNa3");
        System.out.println(xx);
    }
}
