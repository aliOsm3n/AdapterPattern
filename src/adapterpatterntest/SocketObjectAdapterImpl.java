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
public class SocketObjectAdapterImpl implements SocketAdapter{
    
   //Using Composition for adapter pattern
	private Socket sock = new Socket();

    @Override
    public Volt get120volt() {
            return sock.getVolt();
    }

    @Override
    public Volt get12volt() {
        Volt v = sock.getVolt();
            return coverttovolt(v, 10);
    }

    @Override
    public Volt get3volt() {
        Volt v =sock.getVolt();
            return coverttovolt(v, 40);
    }
    
    
    private  Volt coverttovolt(Volt v ,int i){
            return new Volt(v.getVolts()/i);
    }
    
}
