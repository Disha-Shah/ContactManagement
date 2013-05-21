/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import mail.SendEmail;

/**
 *
 * @author satyam
 */
@ManagedBean(name="bean1")
@RequestScoped
public class textManagedBean {

    String email;
    
    /**
     * Creates a new instance of textManagedBean
     */
    public textManagedBean() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
    
    public void sendContent()
    {
        System.out.print(email);
       SendEmail se = new SendEmail(email);
        
    }
}
