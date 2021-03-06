/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import projeto.JogoDao;
import projeto.Usuario;

/**
 *
 * @author ewert
 */
public class Exclusao extends javax.swing.JFrame {

    private Usuario usuario;

    /**
     * Creates new form Exclusão
     */
    public Exclusao() {
        initComponents();
         this.setExtendedState(Exclusao.MAXIMIZED_BOTH);
        LabelSimPressionado.setVisible(false);
        LabelNaoPressionado.setVisible(false);
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNaoPressionado = new javax.swing.JLabel();
        LabelSimPressionado = new javax.swing.JLabel();
        LabelExclusao = new javax.swing.JLabel();
        BotaoSim = new javax.swing.JButton();
        BotaoNao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LabelNaoPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao nao tela exclusao.png"))); // NOI18N
        LabelNaoPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelNaoPressionado);
        LabelNaoPressionado.setBounds(0, 0, 1280, 720);

        LabelSimPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao sim tela exclusao.png"))); // NOI18N
        LabelSimPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelSimPressionado);
        LabelSimPressionado.setBounds(0, 0, 1200, 720);

        LabelExclusao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tela-de-exclusão.gif"))); // NOI18N
        getContentPane().add(LabelExclusao);
        LabelExclusao.setBounds(0, 0, 1280, 720);

        BotaoSim.setText("jButton1");
        BotaoSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoSimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoSimMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoSimMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoSimMouseReleased(evt);
            }
        });
        BotaoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSimActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSim);
        BotaoSim.setBounds(270, 600, 290, 100);

        BotaoNao.setText("jButton2");
        BotaoNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoNaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoNaoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoNaoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoNaoMouseReleased(evt);
            }
        });
        BotaoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNaoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoNao);
        BotaoNao.setBounds(740, 600, 290, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSimActionPerformed
        JogoDao jDao = new JogoDao();
       jDao.excluir(usuario.getId());
       JOptionPane.showMessageDialog(this,"Excluido com sucesso.");
       Login login = new Login();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoSimActionPerformed

    private void BotaoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNaoActionPerformed
        Perfil perfil = new Perfil ();
        perfil.setUsuario(usuario);
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoNaoActionPerformed

    private void BotaoSimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSimMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
       
    }//GEN-LAST:event_BotaoSimMouseEntered

    private void BotaoSimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSimMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoSimMouseExited

    private void BotaoSimMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSimMousePressed
        LabelSimPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoSimMousePressed

    private void BotaoSimMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSimMouseReleased
        LabelSimPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoSimMouseReleased

    private void BotaoNaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNaoMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoNaoMouseEntered

    private void BotaoNaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNaoMouseExited
      Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoNaoMouseExited

    private void BotaoNaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNaoMousePressed
        LabelNaoPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoNaoMousePressed

    private void BotaoNaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNaoMouseReleased
        LabelNaoPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoNaoMouseReleased

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoNao;
    private javax.swing.JButton BotaoSim;
    private javax.swing.JLabel LabelExclusao;
    private javax.swing.JLabel LabelNaoPressionado;
    private javax.swing.JLabel LabelSimPressionado;
    // End of variables declaration//GEN-END:variables
}
