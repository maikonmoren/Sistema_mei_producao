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
public class Material {

@Id
@GeneratedValue (strategy = GenerationType.AUTO)
private int m_id;
@Column (unique = true)
private String nome;
private String medida;
private int quantidade;
private float valor;
private float valor_desconto;
private String desconto_tipo;

    public int getM_id() {
        return m_id;
    }

    public boolean setM_id(int m_id) {
        if(m_id == 0)
            return false;
        else{
        this.m_id = m_id;
        return true ;
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome.equals(""))
            return false;
        else{
        this.nome = nome;
        return true;
        }
    }

    public String getMedida() {
        return medida;
    }

    public boolean setMedida(String medida) {
        if(medida.equals(""))
            return false;
        else{
        this.medida = medida;
        return true;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public boolean setValor(float valor) {
        if(valor == 0)
        return false;
        else{
        this.valor = valor;
        return true;
        }
    }

    public float getValor_desconto() {
        return valor_desconto;
    }

    public boolean setValor_desconto(float valor_desconto) {
          if(valor_desconto == 0)
        return false;
        else{
        this.valor_desconto = valor_desconto;
        return true;
        }
    }

    public String getDesconto_tipo() {
        return desconto_tipo;
    }

    public boolean setDesconto_tipo(String desconto_tipo) {
        if(desconto_tipo.equals("Selecione"))
            return false;
        else{
        this.desconto_tipo = desconto_tipo;
        return true;}
    }

}
