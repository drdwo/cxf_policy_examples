
package org.sopware.services.demo.whiteboard;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Dec 22 08:56:13 CET 2010
 * Generated source version: 2.3.1
 * 
 */

@WebFault(name = "ElementNotFoundFault", targetNamespace = "http://services.sopware.org/demo/Whiteboard")
public class ReadFaultMsg extends Exception {
    public static final long serialVersionUID = 20101222085613L;
    
    private java.lang.String elementNotFoundFault;

    public ReadFaultMsg() {
        super();
    }
    
    public ReadFaultMsg(String message) {
        super(message);
    }
    
    public ReadFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadFaultMsg(String message, java.lang.String elementNotFoundFault) {
        super(message);
        this.elementNotFoundFault = elementNotFoundFault;
    }

    public ReadFaultMsg(String message, java.lang.String elementNotFoundFault, Throwable cause) {
        super(message, cause);
        this.elementNotFoundFault = elementNotFoundFault;
    }

    public java.lang.String getFaultInfo() {
        return this.elementNotFoundFault;
    }
}
