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
@Entity
public class Pessoa {

@Id
@GeneratedValue (strategy = GenerationType.AUTO)
private int p_id;
private String p_nome;
@Column (unique=true)
private String p_cpf;
@Column (unique=true)
private String p_email;
@Column (unique = true)
private String u_nome;
private int u_funcao;
private String u_senha;


    public int getP_id() {
        return p_id;
    }

    public boolean setP_id(int p_id) {
        if(p_id == 0)
            return false;
        else {
        this.p_id = p_id;
        return true;
        }
    }

    public String getP_nome() {
        return p_nome;
    }

    public boolean setP_nome(String p_nome) {
            if(p_nome.equals(""))
                return false;
            else{
        this.p_nome = p_nome;
        return true;
    }
    }
    public String getP_cpf() {
        return(p_cpf.substring(0, 3) + "." + p_cpf.substring(3, 6) + "." +
            p_cpf.substring(6, 9) + "-" + p_cpf.substring(9, 11));
    }

    public boolean setP_cpf(String p_cpf) {
      String cpf="";
        if(p_cpf.equals(""))
            return false;
        else{
            System.out.println("Separando letras");
            for(int i = 0;i<p_cpf.length();i++){
              if(p_cpf.charAt(i)!='.' || p_cpf.charAt(i)!='-'){
                  cpf=cpf+p_cpf.charAt(i);
              }
            }
            System.out.println(cpf);
        if(cpf.length()!=11){
            return false;
        } else{
            System.out.println("Validando cpf");
       char dig10, dig11;
        int sm, i, r, num, peso;
        try {
    
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {

            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else 
                dig10 = (char)(r + 48); 

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else 
                dig11 = (char)(r + 48);

            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))){
                this.p_cpf = p_cpf;
                return true;
            }
            else
                return false;
               
                } catch (InputMismatchException erro) {
                return(false);
            }
        } 
        
    }
    }

    public String getP_email() {
        return p_email;
    }

    public boolean setP_email(String p_email) {
        if(p_email.equals(""))
           return false;
       else{
         if(p_email.indexOf('@')<1){
             return false;
         }else{
         this.p_email = p_email;
         return true;
         }    
       }
    }

    public String getU_nome() {
        return u_nome;
    }

    public boolean setU_nome(String u_nome) {
        if(u_nome.equals(""))
            return false;
        else{
        this.u_nome = u_nome;
        return true;
                }
        }

    public int getU_funcao() {
       
        return u_funcao;
    }

    public boolean setU_funcao(int u_funcao) {
        if(u_funcao == 0)
            return false;
        else{
        this.u_funcao = u_funcao;
        return true;
        }
    }

    public String getU_senha() {
        return u_senha;
    }

    public boolean setU_senhaAdmin(String u_senha) {
        if(u_senha.equals("")){
        return false ;
        }else{
        try{ 
          String sha1 = null;
          MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
          msdDigest.update(u_senha.getBytes("UTF-8"), 0, u_senha.length());
          sha1 = DatatypeConverter.printHexBinary(msdDigest.digest());
          this.u_senha = sha1;
          return true;
    }catch(Exception e){
        return false;
    }
        }
    }
        public boolean setU_senhausu(String u_senha, String c_senha) {
            if(!u_senha.equals(c_senha) && u_senha.equals(""))
                return false;
            else{
            try{
          String sha1 = null;
          MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
          msdDigest.update(u_senha.getBytes("UTF-8"), 0, u_senha.length());
          sha1 = DatatypeConverter.printHexBinary(msdDigest.digest());
          this.u_senha = sha1;
          return true;
         }catch(Exception e){
        return false;
    }
            }

    }



   
    
}
