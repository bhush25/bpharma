/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bpharma;

/**
 *
 * @author bhush
 */
public class BPharma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");// or may be it is "org.apache.derby.jdbc.EmbeddedDriver"? Not sure. Check the correct name and put it here.
} catch(ClassNotFoundException e){
    //handle exception
}
    }
    
}
