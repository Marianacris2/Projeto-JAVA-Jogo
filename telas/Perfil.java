/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.UIManager;
import projeto.Usuario;
import tiposDeLetras.FontManager;

/**
 *
 * @author ewert
 */
public class Perfil extends javax.swing.JFrame {

    static Usuario usuario;
    
    /**
     * Creates new form Opniao
     */
    public Perfil() {
        initComponents();
         this.setExtendedState(Perfil.MAXIMIZED_BOTH);
        
        LabelExcluirContaPressionado.setVisible(false);
        LabelCreditosPressionado.setVisible(false);
        LabelOpinarPressionado.setVisible(false);
        LabelSairPressionado.setVisible(false);
        LabelHistoricoPressionado.setVisible(false);
        LabelFinalConcluidoPressionado.setVisible(false);
        LabelAvaliarPressionado.setVisible(false);
        LabelAtualizarPressionado.setVisible(false);
        LabelJogarPressionado.setVisible(false);
        
        ExibirNome.setText(usuario.getLogin().toUpperCase());
        ExibirIdade.setText(usuario.getIdade() + "");
        ExibirGenero.setText(usuario.getGenero().toUpperCase());
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAux = new javax.swing.JLabel();
        ExibirNome = new javax.swing.JTextField();
        ExibirIdade = new javax.swing.JTextField();
        ExibirGenero = new javax.swing.JTextField();
        LabelAtualizarPressionado = new javax.swing.JLabel();
        LabelJogarPressionado = new javax.swing.JLabel();
        LabelAvaliarPressionado = new javax.swing.JLabel();
        LabelFinalConcluidoPressionado = new javax.swing.JLabel();
        LabelHistoricoPressionado = new javax.swing.JLabel();
        LabelSairPressionado = new javax.swing.JLabel();
        LabelCreditosPressionado = new javax.swing.JLabel();
        LabelExcluirContaPressionado = new javax.swing.JLabel();
        LabelOpinarPressionado = new javax.swing.JLabel();
        LabelOpinar = new javax.swing.JLabel();
        LabelPerfil = new javax.swing.JLabel();
        BotaExcluirConta = new javax.swing.JButton();
        BotaoCredito = new javax.swing.JButton();
        BotaoOpinar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        BotaoHistorico = new javax.swing.JButton();
        BotaoFinalConcluido = new javax.swing.JButton();
        BotaoAvaliarHistoria = new javax.swing.JButton();
        BotaoAtualizarDados = new javax.swing.JButton();
        BotaoJogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(LabelAux);
        LabelAux.setBounds(460, 380, 190, 30);

        ExibirNome.setEditable(false);
        ExibirNome.setBackground(new java.awt.Color(255,255,255,0)
        );
        ExibirNome.setFont(new java.awt.Font("Charlemagne Std", 0, 18)); // NOI18N
        ExibirNome.setBorder(null);
        ExibirNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ExibirNome.setOpaque(false);
        getContentPane().add(ExibirNome);
        ExibirNome.setBounds(370, 460, 360, 40);

        ExibirIdade.setEditable(false);
        ExibirIdade.setBackground(new java.awt.Color(255,255,255,0));
        ExibirIdade.setFont(new java.awt.Font("Charlemagne Std", 0, 18)); // NOI18N
        ExibirIdade.setBorder(null);
        ExibirIdade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ExibirIdade.setOpaque(false);
        getContentPane().add(ExibirIdade);
        ExibirIdade.setBounds(380, 560, 80, 40);

        ExibirGenero.setEditable(false);
        ExibirGenero.setBackground(new java.awt.Color(255,255,255,0));
        ExibirGenero.setFont(new java.awt.Font("Charlemagne Std", 0, 18)); // NOI18N
        ExibirGenero.setBorder(null);
        ExibirGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ExibirGenero.setOpaque(false);
        getContentPane().add(ExibirGenero);
        ExibirGenero.setBounds(500, 560, 230, 50);

        LabelAtualizarPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar dados botao perfil.png"))); // NOI18N
        LabelAtualizarPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelAtualizarPressionado);
        LabelAtualizarPressionado.setBounds(0, 0, 1280, 720);

        LabelJogarPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jogar botao perfil.png"))); // NOI18N
        LabelJogarPressionado.setText("jLabel1");
        LabelJogarPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelJogarPressionado);
        LabelJogarPressionado.setBounds(0, 0, 1280, 720);

        LabelAvaliarPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/avaliar historia botao perfil.png"))); // NOI18N
        LabelAvaliarPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelAvaliarPressionado);
        LabelAvaliarPressionado.setBounds(0, 0, 1280, 720);

        LabelFinalConcluidoPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/finais concluidos botao perfil.png"))); // NOI18N
        LabelFinalConcluidoPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelFinalConcluidoPressionado);
        LabelFinalConcluidoPressionado.setBounds(0, 0, 1170, 720);

        LabelHistoricoPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ver historico botao perfil.png"))); // NOI18N
        LabelHistoricoPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelHistoricoPressionado);
        LabelHistoricoPressionado.setBounds(0, 0, 1280, 720);

        LabelSairPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair botao perfil.png"))); // NOI18N
        LabelSairPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelSairPressionado);
        LabelSairPressionado.setBounds(0, 0, 770, 720);

        LabelCreditosPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/creditos botao perfil.png"))); // NOI18N
        LabelCreditosPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelCreditosPressionado);
        LabelCreditosPressionado.setBounds(0, 0, 1280, 720);

        LabelExcluirContaPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir conta botao perfil.png"))); // NOI18N
        LabelExcluirContaPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelExcluirContaPressionado);
        LabelExcluirContaPressionado.setBounds(0, 0, 1280, 720);

        LabelOpinarPressionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/opinar pressionado.png"))); // NOI18N
        LabelOpinarPressionado.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(LabelOpinarPressionado);
        LabelOpinarPressionado.setBounds(0, 120, 560, 490);

        LabelOpinar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/label opinar.png"))); // NOI18N
        getContentPane().add(LabelOpinar);
        LabelOpinar.setBounds(0, 200, 520, 330);

        LabelPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tela-de-perfil (2).gif"))); // NOI18N
        getContentPane().add(LabelPerfil);
        LabelPerfil.setBounds(0, 0, 1280, 720);

        BotaExcluirConta.setText("jButton1");
        BotaExcluirConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaExcluirContaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaExcluirContaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaExcluirContaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaExcluirContaMouseReleased(evt);
            }
        });
        BotaExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaExcluirContaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaExcluirConta);
        BotaExcluirConta.setBounds(110, 140, 120, 50);

        BotaoCredito.setText("jButton2");
        BotaoCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoCreditoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCreditoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoCreditoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoCreditoMouseReleased(evt);
            }
        });
        BotaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCredito);
        BotaoCredito.setBounds(110, 240, 120, 40);

        BotaoOpinar.setText("jButton3");
        BotaoOpinar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoOpinarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoOpinarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoOpinarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoOpinarMouseReleased(evt);
            }
        });
        BotaoOpinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOpinarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoOpinar);
        BotaoOpinar.setBounds(120, 360, 110, 30);

        BotaoSair.setText("jButton4");
        BotaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoSairMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoSairMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoSairMouseReleased(evt);
            }
        });
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(113, 450, 120, 60);

        BotaoHistorico.setText("jButton5");
        BotaoHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoHistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoHistoricoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoHistoricoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoHistoricoMouseReleased(evt);
            }
        });
        BotaoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHistoricoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoHistorico);
        BotaoHistorico.setBounds(1033, 120, 130, 80);

        BotaoFinalConcluido.setText("jButton6");
        BotaoFinalConcluido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoFinalConcluidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoFinalConcluidoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoFinalConcluidoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoFinalConcluidoMouseReleased(evt);
            }
        });
        BotaoFinalConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalConcluidoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFinalConcluido);
        BotaoFinalConcluido.setBounds(1043, 230, 120, 50);

        BotaoAvaliarHistoria.setText("jButton7");
        BotaoAvaliarHistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAvaliarHistoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAvaliarHistoriaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoAvaliarHistoriaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoAvaliarHistoriaMouseReleased(evt);
            }
        });
        BotaoAvaliarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAvaliarHistoriaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoAvaliarHistoria);
        BotaoAvaliarHistoria.setBounds(1050, 340, 100, 40);

        BotaoAtualizarDados.setText("jButton8");
        BotaoAtualizarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAtualizarDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAtualizarDadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoAtualizarDadosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoAtualizarDadosMouseReleased(evt);
            }
        });
        BotaoAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtualizarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoAtualizarDados);
        BotaoAtualizarDados.setBounds(1040, 450, 120, 50);

        BotaoJogar.setText("jButton9");
        BotaoJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoJogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoJogarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoJogarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotaoJogarMouseReleased(evt);
            }
        });
        BotaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJogarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoJogar);
        BotaoJogar.setBounds(430, 150, 420, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaExcluirContaActionPerformed
        Exclusao exclusao = new Exclusao ();
        exclusao.setUsuario(usuario);
        exclusao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaExcluirContaActionPerformed

    private void BotaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCreditoActionPerformed
       
    }//GEN-LAST:event_BotaoCreditoActionPerformed

    private void BotaoOpinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOpinarActionPerformed
        Opiniao opiniao = new Opiniao ();
        opiniao.setUsuario(usuario);
        opiniao.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotaoOpinarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        Login login = new Login ();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHistoricoActionPerformed
        Historico historico = new Historico ();
        historico.setUsuario(usuario);
        historico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoHistoricoActionPerformed

    private void BotaoFinalConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalConcluidoActionPerformed
        FinalConcluido finalconcluido = new FinalConcluido ();
        finalconcluido.setUsuario(usuario);
        finalconcluido.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoFinalConcluidoActionPerformed

    private void BotaoAvaliarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAvaliarHistoriaActionPerformed
        Avaliacao1 avaliacao1 = new Avaliacao1 ();
        avaliacao1.setUsuario(usuario);
        avaliacao1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotaoAvaliarHistoriaActionPerformed

    private void BotaoAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizarDadosActionPerformed
        Atualizar atualizar = new Atualizar();
        atualizar.setUsuario(Perfil.usuario);
        atualizar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoAtualizarDadosActionPerformed

    private void BotaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJogarActionPerformed
        SelecaoHistoria selecaohistoria = new SelecaoHistoria();
        selecaohistoria.setUsuario(usuario);
        selecaohistoria.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoJogarActionPerformed

    
    
    //animações
    
    
    
    private void BotaExcluirContaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaExcluirContaMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaExcluirContaMouseEntered

    private void BotaExcluirContaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaExcluirContaMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaExcluirContaMouseExited

    private void BotaExcluirContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaExcluirContaMousePressed
        LabelExcluirContaPressionado.setVisible(true);
    }//GEN-LAST:event_BotaExcluirContaMousePressed

    private void BotaExcluirContaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaExcluirContaMouseReleased
        LabelExcluirContaPressionado.setVisible(false);
    }//GEN-LAST:event_BotaExcluirContaMouseReleased

    private void BotaoCreditoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCreditoMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoCreditoMouseEntered

    private void BotaoCreditoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCreditoMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoCreditoMouseExited

    private void BotaoCreditoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCreditoMousePressed
        LabelCreditosPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoCreditoMousePressed

    private void BotaoCreditoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCreditoMouseReleased
        LabelCreditosPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoCreditoMouseReleased

    private void BotaoOpinarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoOpinarMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoOpinarMouseEntered

    private void BotaoOpinarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoOpinarMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoOpinarMouseExited

    private void BotaoOpinarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoOpinarMousePressed
        LabelOpinarPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoOpinarMousePressed

    private void BotaoOpinarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoOpinarMouseReleased
        LabelOpinarPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoOpinarMouseReleased

    private void BotaoSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoSairMouseEntered

    private void BotaoSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoSairMouseExited

    private void BotaoSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMousePressed
        LabelSairPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoSairMousePressed

    private void BotaoSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMouseReleased
        LabelSairPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoSairMouseReleased

    private void BotaoHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoHistoricoMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoHistoricoMouseEntered

    private void BotaoHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoHistoricoMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoHistoricoMouseExited

    private void BotaoHistoricoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoHistoricoMousePressed
        LabelHistoricoPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoHistoricoMousePressed

    private void BotaoHistoricoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoHistoricoMouseReleased
        LabelHistoricoPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoHistoricoMouseReleased

    private void BotaoFinalConcluidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFinalConcluidoMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoFinalConcluidoMouseEntered

    private void BotaoFinalConcluidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFinalConcluidoMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoFinalConcluidoMouseExited

    private void BotaoFinalConcluidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFinalConcluidoMousePressed
        LabelFinalConcluidoPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoFinalConcluidoMousePressed

    private void BotaoFinalConcluidoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFinalConcluidoMouseReleased
        LabelFinalConcluidoPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoFinalConcluidoMouseReleased

    private void BotaoAvaliarHistoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAvaliarHistoriaMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoAvaliarHistoriaMouseEntered

    private void BotaoAvaliarHistoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAvaliarHistoriaMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoAvaliarHistoriaMouseExited

    private void BotaoAvaliarHistoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAvaliarHistoriaMousePressed
        LabelAvaliarPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoAvaliarHistoriaMousePressed

    private void BotaoAvaliarHistoriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAvaliarHistoriaMouseReleased
        LabelAvaliarPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoAvaliarHistoriaMouseReleased

    private void BotaoAtualizarDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAtualizarDadosMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoAtualizarDadosMouseEntered

    private void BotaoAtualizarDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAtualizarDadosMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoAtualizarDadosMouseExited

    private void BotaoAtualizarDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAtualizarDadosMousePressed
        LabelAtualizarPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoAtualizarDadosMousePressed

    private void BotaoAtualizarDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAtualizarDadosMouseReleased
        LabelAtualizarPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoAtualizarDadosMouseReleased

    private void BotaoJogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoJogarMouseEntered
        Cursor handCursor = new Cursor (Cursor.HAND_CURSOR);
       setCursor(handCursor);
    }//GEN-LAST:event_BotaoJogarMouseEntered

    private void BotaoJogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoJogarMouseExited
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(defaultCursor);
    }//GEN-LAST:event_BotaoJogarMouseExited

    private void BotaoJogarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoJogarMousePressed
        LabelJogarPressionado.setVisible(true);
    }//GEN-LAST:event_BotaoJogarMousePressed

    private void BotaoJogarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoJogarMouseReleased
        LabelJogarPressionado.setVisible(false);
    }//GEN-LAST:event_BotaoJogarMouseReleased
    
    public void setUsuario(Usuario usuario) {
        Perfil.usuario = usuario;
        
    }
    public String getUsuarioLogin (){
        return usuario.getLogin();
    }
//    public void setCaixaNome(Usuario usuario.getLogin()){
//        this.
//    }
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaExcluirConta;
    private javax.swing.JButton BotaoAtualizarDados;
    private javax.swing.JButton BotaoAvaliarHistoria;
    private javax.swing.JButton BotaoCredito;
    private javax.swing.JButton BotaoFinalConcluido;
    private javax.swing.JButton BotaoHistorico;
    private javax.swing.JButton BotaoJogar;
    private javax.swing.JButton BotaoOpinar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JTextField ExibirGenero;
    private javax.swing.JTextField ExibirIdade;
    private javax.swing.JTextField ExibirNome;
    private javax.swing.JLabel LabelAtualizarPressionado;
    private javax.swing.JLabel LabelAux;
    private javax.swing.JLabel LabelAvaliarPressionado;
    private javax.swing.JLabel LabelCreditosPressionado;
    private javax.swing.JLabel LabelExcluirContaPressionado;
    private javax.swing.JLabel LabelFinalConcluidoPressionado;
    private javax.swing.JLabel LabelHistoricoPressionado;
    private javax.swing.JLabel LabelJogarPressionado;
    private javax.swing.JLabel LabelOpinar;
    private javax.swing.JLabel LabelOpinarPressionado;
    private javax.swing.JLabel LabelPerfil;
    private javax.swing.JLabel LabelSairPressionado;
    // End of variables declaration//GEN-END:variables
}