/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler.telas;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author maikon.rosa
 */
public class ManipulaTelas {
    public void  btn_hoverPadrao(JPanel btn){
      Color corbtn = btn.getBackground();
      Color corP = new Color(220,220,220);
      Color corR = new Color(250,250,250);
      if(corbtn.equals(corR))
          btn.setBackground(corP);
      else 
          btn.setBackground(corR);
    }
}
