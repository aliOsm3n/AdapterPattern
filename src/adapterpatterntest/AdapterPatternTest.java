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

public class AdapterPatternTest {

    /**
     * @param args the command line arguments
     */
    
    private  static void  testObjectAdapter(){
    
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 =getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
    
    
    }
    
    
    
    
    
    private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        testObjectAdapter();
        //testClassAdapter();
        
        
        
        
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
     
        
        switch(i){
        case 3:
            return sockAdapter.get3volt();
            case 12:
                return sockAdapter.get12volt();
                case 120:
                  return  sockAdapter.get120volt();
                    default:
                        return sockAdapter.get120volt();
        }
        
    
    }

  
    
}
