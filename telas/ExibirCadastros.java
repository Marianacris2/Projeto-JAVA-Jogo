/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import projeto.JogoDao;

/**
 *
 * @author ewert
 */
public class ExibirCadastros extends javax.swing.JFrame {

    /**
     * Creates new form ExibirCadastros
     */
    public ExibirCadastros() {
        initComponents();
        this.setExtendedState(ExibirCadastros.MAXIMIZED_BOTH);
        
        
        
        JogoDao jDao = new JogoDao ();
        CadastrosShow.setText("\n"+"\n");

         
        for (int i = 0; i< jDao.listarUsuarios().size(); i++){
          CadastrosShow.setText(CadastrosShow.getText()+ jDao.listarUsuarios().get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelReturn = new javax.swing.JLabel();
        CadastrosShow = new javax.swing.JTextArea();
        LabelCadastro = new javax.swing.JLabel();
        BotaoReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LabelReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaCadastroPressionada.png"))); // NOI18N
        getContentPane().add(LabelReturn);
        LabelReturn.setBounds(1130, -630, 110, 760);

        CadastrosShow.setEditable(false);
        CadastrosShow.setBackground(new java.awt.Color(255,255,255,0)
        );
        CadastrosShow.setColumns(20);
        CadastrosShow.setFont(new java.awt.Font("Charlemagne Std", 0, 18)); // NOI18N
        CadastrosShow.setForeground(new java.awt.Color(255, 255, 255));
        CadastrosShow.setRows(5);
        CadastrosShow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        CadastrosShow.setOpaque(false);
        getContentPane().add(CadastrosShow);
        CadastrosShow.setBounds(140, 210, 1000, 420);

        LabelCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela-visualizar-cadastros.png"))); // NOI18N
        getContentPane().add(LabelCadastro);
        LabelCadastro.setBounds(0, 0, 1280, 720);

        BotaoReturn.setText("jButton1");
        BotaoReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoReturnActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoReturn);
        BotaoReturn.setBounds(1150, 30, 70, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoReturnActionPerformed
        Mestre mestre = new Mestre ();
        mestre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoReturnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoReturn;
    private javax.swing.JTextArea CadastrosShow;
    private javax.swing.JLabel LabelCadastro;
    private javax.swing.JLabel LabelReturn;
    // End of variables declaration//GEN-END:variables
}
