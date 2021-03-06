
package org.sopware.services.demo.whiteboard;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Dec 22 08:46:48 CET 2010
 * Generated source version: 2.3.1
 * 
 */
 
public class Whiteboard_Localhost_Server{

    protected Whiteboard_Localhost_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new WhiteboardImpl();
        String address = "http://localhost:9088/soap/WhiteboardProvider/";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new Whiteboard_Localhost_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(15 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
