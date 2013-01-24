package com.site.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class MessagesController {

    public static void addInfo(ActionEvent actionEvent, String message, String details) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message, details));  
    }  
  
    public static void addWarn(ActionEvent actionEvent, String message, String details) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, message, details));  
    }  
  
    public static void addError(ActionEvent actionEvent, String message, String details) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, details));  
    }  
  
    public static void addFatal(ActionEvent actionEvent, String message, String details) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, message, details));  
    }  
    
}
