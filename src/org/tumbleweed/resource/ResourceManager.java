/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tumbleweed.resource;

import java.util.Base64;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;

/**
 *
 * @author Xavier PETIT
 */
public class ResourceManager {
    /**
     * Components
     */
    private static String RESOURCENAME="tumbleweed";
    
    /**
     * Private Methods
     */
    /**
     * 
     * @return 
     */
    private static ResourceBundle getResourceBundle() {
        ResourceBundle returnvalue = null;
        Locale currentLocale = Locale.getDefault();
        returnvalue = ResourceBundle.getBundle(RESOURCENAME, currentLocale);
        return(returnvalue);
    }
    
    /**
     * Public Methods
     */
    /**
     * 
     * @param propertyname
     * @return 
     */
    public static String getPropertyValue(String propertyname) {
        String value = "";
        ResourceBundle bundle = getResourceBundle();
        if (bundle != null) {
            value = bundle.getString(propertyname);
        }
        return(value);
    }
    
    public static ImageIcon getLogoApplication() {
        String filecontent = getPropertyValue("ApplicationLogo");
        ImageIcon returnvalue = null;
        if (!filecontent.equals("")) {
            returnvalue = new ImageIcon(Base64.getDecoder().decode(filecontent));
        }
        return(returnvalue);
    }
    
    public static String getLanguage() {
        return(getPropertyValue("Language"));
    }
   
    public static String getTemplate() {
        return(getPropertyValue("Template"));
    }
    
    public static String getPlanet() {
        return(getPropertyValue("Planet"));
    }
    
}
