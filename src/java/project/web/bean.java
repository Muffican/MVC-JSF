/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ma149_000
 */
@ManagedBean(name = "userBean")
@SessionScoped
public class bean implements Serializable {

    /**
     * Creates a new instance of bean
     */
    private String name;
    private String Pass;
    public boolean logged = false;
    
    public bean() {
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    public String action(){
        logged = true;
        return "Confirmation.xhtml?faces-redirect=true";
    }
}
