/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.security.MessageDigest;
import java.util.InputMismatchException;
import javax.persistence.*;
import javax.xml.bind.DatatypeConverter;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author maikon.rosa
 */
public class Fornecedor {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int f_id;
    private int tipo_loja;
    @Column (unique = true)
    private String link;
    @Column (unique = true)
    private String numero;
    @Column (unique = true)
    private String email;

    public int getF_id() {
        return f_id;
    }

    public boolean setF_id(int f_id) {
        if(f_id == 0)
            return false;
        else{
        this.f_id = f_id;
        return true;
        }
    }

    public int getTipo_loja() {
        return tipo_loja;
    }

    public boolean setTipo_loja(int tipo_loja) {
       if(tipo_loja == 0)
           return false;
       else{
        this.tipo_loja = tipo_loja;
        return true ;
       }
    }

    public String getLink() {
        return link;
    }

    public boolean setLink(String link) {
        if(link.equals(""))
           return false;
        else{
        this.link = link;
        return true ;
        }
    }

    public String getNumero() {
        return numero;
    }

    public boolean setNumero(String numero) {
      String numerocerto = numero.replaceAll("-", "").replace("(", "").replace(")","") ;
        try{
          if(numerocerto.length() > 11 || numerocerto.length() < 10){
           return false;
          }
        int n = Integer.valueOf(numerocerto);
        this.numero = numero;
        return true;
    }catch(NumberFormatException e){
    return false;
    }

}
    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
             if(email.equals(""))
           return false;
       else{
         if(email.indexOf('@')<1){
             return false;
         }else{
         this.email = email;
         return true;
         }    
       }
    }
    
    
}
