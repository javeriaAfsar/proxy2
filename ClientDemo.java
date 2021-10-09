/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectionProxy2;

/**
 *
 * @author JAVERIA
 */
public class ClientDemo {
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
           // internet.connectTo("subexpert.com");
            internet.connectTo("SUBDEMO.COM");
            internet.connectTo("abc.com");
            internet.connectTo("TUTORIAl");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
