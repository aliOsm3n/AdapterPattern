/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adapterpatterntest;

/**
 *
 * @author Ali Othman
 */
public class Socket {
    
   // Volt v =new Volt(120);
    
    public Volt getVolt(){
    return new Volt(120); 
    }
    
    
}
