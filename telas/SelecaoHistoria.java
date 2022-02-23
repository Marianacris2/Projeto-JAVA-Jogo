/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import projeto.Usuario;

/**
 *
 * @author ewert
 */
public class SelecaoHistoria extends javax.swing.JFrame {

    private Usuario usuario;

    /**
     * Creates new form SelecaoHistoria
     */
    public SelecaoHistoria() {
        initComponents();
         this.setExtendedState(SelecaoHistoria.MAXIMIZED_BOTH);
        LabelVerSinopse.setVisible(false);
        LabelSetaPressionado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelVerSinopse = new javax.swing.JLabel();
        LabelSetaPressionado = new javax.swing.JLabel();
        LabelSelecionarHistoria = new javax.swing.JLabel();
        BotaoEspaco = new javax.swing.JButton();
        BotaoFarol = new javax.swing.JButton();
        BotaoBar = new javax.swing.JButton();
        BotaoReturn = new javax.swing.JButton();
        BotaoVerSinopse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LabelVerSinopse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao ver sinopse.png"))); // NOI18N
        LabelVerSinopse.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelVerSinopse);
        LabelVerSinopse.setBounds(0, 0, 1280, 720);

        LabelSetaPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/setinha seleção de histórias.png"))); // NOI18N
        LabelSetaPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelSetaPressionado);
        LabelSetaPressionado.setBounds(0, 0, 1280, 720);

        LabelSelecionarHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tela-seleção-de-histórias.gif"))); // NOI18N
        getContentPane().add(LabelSelecionarHistoria);
        LabelSelecionarHistoria.setBounds(0, 0, 1280, 720);

        BotaoEspaco.setText("jButton3");
        BotaoEspaco.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        BotaoEspaco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoEspacoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoEspacoMouseExited(evt);
            }
        });
        BotaoEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEspacoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEspaco);
        BotaoEspaco.setBounds(900, 200, 250, 410);

        BotaoFarol.setText("jButton2");
        BotaoFarol.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        BotaoFarol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoFarolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoFarolMouseExited(evt);
            }
        });
        BotaoFarol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFarolActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFarol);
        BotaoFarol.setBounds(500, 220, 260, 410);

        BotaoBar.setText("jButton1");
        BotaoBar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        BotaoBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoBarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoBarMouseExited(evt);
            }
        });
        BotaoBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBar);
        BotaoBar.setBounds(120, 220, 260, 410);

        BotaoReturn.setText("jButton1");
        BotaoReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoReturnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoReturnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoReturnMouseReleased(evt);
            }
        });
        BotaoReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoReturnActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoReturn);
        BotaoReturn.setBounds(20, 650, 60, 50);

        BotaoVerSinopse.setText("jButton1");
        BotaoVerSinopse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoVerSinopseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoVerSinopseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoVerSinopseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoVerSinopseMouseReleased(evt);
            }
        });
        BotaoVerSinopse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerSinopseActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerSinopse);
        BotaoVerSinopse.setBounds(440, 650, 410, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBarActionPerformed
        JOptionPane.showMessageDialog(this, "Infelizmente este jogo não possui essa historia ainda, pois estamos desenvolvendo... Jogue as outras");
    }//GEN-LAST:event_BotaoBarActionPerformed

    private void BotaoEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEspacoActionPerformed
        JogoEspaco espaco = new JogoEspaco ();
        espaco.setVisible(true);
        espaco.setUsuario(usuario);
        this.dispose();
    }//GEN-LAST:event_BotaoEspacoActionPerformed

    private void BotaoFarolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFarolActionPerformed
        JogoFarol farol = new JogoFarol ();
        farol.setVisible(true);
        farol.setUsuario(usuario);
        this.dispose();
    }//GEN-LAST:event_BotaoFarolActionPerformed

    private void BotaoReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoReturnActionPerformed
        Perfil perfil = new Perfil ();
        perfil.setUsuario(usuario);
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoReturnActionPerformed

    private void BotaoVerSinopseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerSinopseActionPerformed
        Sinopse sinopse = new Sinopse ();
        sinopse.setUsuario(usuario);
        sinopse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoVerSinopseActionPerformed

    
    // animações 
    
    
    private void BotaoEspacoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEspacoMouseEntered
         Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoEspacoMouseEntered

    private void BotaoEspacoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEspacoMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoEspacoMouseExited

    private void BotaoFarolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFarolMouseEntered
         Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoFarolMouseEntered

    private void BotaoFarolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFarolMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoFarolMouseExited

    private void BotaoBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoBarMouseEntered
         Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoBarMouseEntered

    private void BotaoBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoBarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoBarMouseExited

    private void BotaoReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoReturnMouseEntered
         Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoReturnMouseEntered

    private void BotaoReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoReturnMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoReturnMouseExited

    private void BotaoReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoReturnMousePressed
        LabelSetaPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoReturnMousePressed

    private void BotaoReturnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoReturnMouseReleased
        LabelSetaPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoReturnMouseReleased

    private void BotaoVerSinopseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVerSinopseMouseEntered
         Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoVerSinopseMouseEntered

    private void BotaoVerSinopseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVerSinopseMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoVerSinopseMouseExited

    private void BotaoVerSinopseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVerSinopseMousePressed
        LabelVerSinopse.setVisible(true);
    }//GEN-LAST:event_BotaoVerSinopseMousePressed

    private void BotaoVerSinopseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVerSinopseMouseReleased
        LabelVerSinopse.setVisible(false);
    }//GEN-LAST:event_BotaoVerSinopseMouseReleased
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBar;
    private javax.swing.JButton BotaoEspaco;
    private javax.swing.JButton BotaoFarol;
    private javax.swing.JButton BotaoReturn;
    private javax.swing.JButton BotaoVerSinopse;
    private javax.swing.JLabel LabelSelecionarHistoria;
    private javax.swing.JLabel LabelSetaPressionado;
    private javax.swing.JLabel LabelVerSinopse;
    // End of variables declaration//GEN-END:variables
}