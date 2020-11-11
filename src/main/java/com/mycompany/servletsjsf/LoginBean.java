/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servletsjsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author RAVI
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {

    /**
     * Creates a new instance of LoginBean
     */
    private String nome;
    private String usuario;
    private String senha;
    
    
    public LoginBean() {
    }
    
    public void CadastraLogin(){
        
    }
    
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome=nome; }
    public String getUsuario(){ return usuario; }
    public void setUsuario(String usuario){ this.usuario=usuario; }
    public String getSenha(){ return senha; }
    public void setSenha(String senha){ this.senha=senha; }
    
}
