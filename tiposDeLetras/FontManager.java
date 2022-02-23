/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposDeLetras;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ewert
 */
public class FontManager {
    public Font carregarFont (String pCaminhoFonte, int tipoFonte, int tamanhoFonte){
        Font minhaFont = null;
        try{
            JOptionPane.showMessageDialog(null, "foi");
           minhaFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(pCaminhoFonte)).deriveFont(tipoFonte, tamanhoFonte);
        }catch(IOException ex){
            ex.printStackTrace();
        }catch (FontFormatException ex){
            ex.printStackTrace();
        }
            
        return minhaFont;
    }
}
