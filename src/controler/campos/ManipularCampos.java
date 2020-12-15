/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler.campos;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author maikon.rosa
 */
public class ManipularCampos {
        public void JtextFieldErro(JTextField textField, JLabel jlabel,boolean valid){
                if(valid == false){
                textField.setBorder(new LineBorder(Color.red));
                jlabel.setText("X");
                }else{
                textField.setBorder(new LineBorder(new Color(51,204,0)));
                jlabel.setText("");
                }
        }
        public void JpassFielErro (JPasswordField textField, JLabel jlabel,boolean valid){
                if(valid == false){
                textField.setBorder(new LineBorder(Color.red));
                jlabel.setText("X");
                }else{
                textField.setBorder(new LineBorder(new Color(51,204,0)));
                jlabel.setText("");
                }
        }
        public void JComboBoxErro (JComboBox textField, JLabel jlabel,boolean valid){
               if(valid == false){
                textField.setBorder(new LineBorder(Color.red));
                jlabel.setText("X");
                }else{
                textField.setBorder(new LineBorder(new Color(51,204,0)));
                jlabel.setText("");
                }
        }
}
