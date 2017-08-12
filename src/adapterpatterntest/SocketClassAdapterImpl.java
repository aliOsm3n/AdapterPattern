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
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

    @Override
    public Volt get120volt() {
        return getVolt();
    }

    @Override
    public Volt get12volt() {
        Volt v =getVolt();
        return converttovolt(v, 10);
    }

    @Override
    public Volt get3volt() {
        Volt v =getVolt();
        return converttovolt(v, 40);
    }
    
    
     
    private  Volt converttovolt(Volt v,int i ){
        return new  Volt(v.getVolts()/i);
    
    }
    
    
}
