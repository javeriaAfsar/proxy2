/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectionProxy2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAVERIA
 */
public class ProxyInternet implements Internet {
   private Internet internet = new RealInternet();
    private static List<String> bannedSites;
      
    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
       @Override
    public void connectTo(String serverhost) throws Exception
    {
        internet.connectTo(serverhost);
    
         
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }
        else{
        
           System.out.println("Access granted");
        }
        
       
    } 
    
    
}
