/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.sun.glass.events.KeyEvent;
import javax.swing.text.LabelView;
import projeto.Usuario;

/**
 *
 * @author ewert
 */
public class JogoFarol extends javax.swing.JFrame {

    private Usuario usuario;

    /**
     * Creates new form JogoFarol
     */
    public JogoFarol() {
        initComponents();
            this.setExtendedState(Avaliacao1.MAXIMIZED_BOTH);
            
            TextoPoema.setVisible(false);
            
            B1PerguntaNao.setVisible(false);
            B1PerguntaSim.setVisible(false);
            BAbrirCaminho.setVisible(false);
            BAbrirCaminhoOqueEstaAcontecendo.setVisible(false);
            BAtenderRadio.setVisible(false);
            BBuscarAjuda.setVisible(false);
            BContinuar1Paragrafo.setVisible(true);
            BContinuar2Paragrafo.setVisible(false);
            BContinuarAnuncioDePecas.setVisible(false);
            BContinuarAnuncioDePecas2.setVisible(false);
            BContinuarAtenderRadio.setVisible(false);
            BContinuarChegandoNaVila.setVisible(false);
            BContinuarChegouNoVilarejo.setVisible(false);
            BContinuarDePeNoLocal.setVisible(false);
            BContinuarDesligouORadio.setVisible(false);
            BContinuarDormiu.setVisible(false);
            BContinuarEntediadoDescansarColuna.setVisible(false);
            BContinuarEnterrar.setVisible(false);
            BContinuarEntrandoNaCasa.setVisible(false);
            BContinuarFalarAVerdade.setVisible(false);
            BContinuarFarolEraOnde.setVisible(false);
            BContinuarFarolSemTempestade.setVisible(false);
            BContinuarFarolTempestade.setVisible(false);
            BContinuarIgnorar.setVisible(false);
            BContinuarMeiaHoraDepois.setVisible(false);
            BContinuarMentir.setVisible(false);
            BContinuarMorteCoelho.setVisible(false);
            BContinuarNemMesmoNoFarol.setVisible(false);
            BContinuarOlhandoParaORadio.setVisible(false);
            BContinuarOutrosParagrafos.setVisible(false);
            BContinuarPerguntarCrianca.setVisible(false);
            BContinuar1Paragrafo.setVisible(true);
            BContinuarPoemaTemp.setVisible(false);
            BContinuarPreSucicidio.setVisible(false);
            BContinuarPronunciarse.setVisible(false);
            BContinuarRepetiaVariosOutros.setVisible(false);
            BContinuarSaindoDoFarol.setVisible(false);
            BContinuarSegundoNao.setVisible(false);
            BContinuarTentandoFugir.setVisible(false);
            BContinuarTremAtropela.setVisible(false);
            BDesligarRadio.setVisible(false);
            B2Paragrafo.setVisible(false);
            BDormir.setVisible(false);
            BEnterrarCoelho.setVisible(false);
            BEscreverPoema.setVisible(false);
            BFalarAVerdade.setVisible(false);
            BFecharCaderno.setVisible(false);
            BFicarAcordado.setVisible(false);
            BFicarNoFarol.setVisible(false);
            BMentir.setVisible(false);
            BPerguntarOQueAconteceu.setVisible(false);
            BPrimeiroNao.setVisible(false);
            BProcurarPessoas.setVisible(false);
            BRepetiaVariosOutrosDias2.setVisible(false);
            BSimPrimeiro.setVisible(false);
            BSalvarTexto.setVisible(false);
            BTentarEsquentala.setVisible(false);
            BVoltarParaMenu.setVisible(false);
            BVoltarParaTrem.setVisible(false);
            DormirOuFicarAcordado.setVisible(false);
           
            Label1Paragrafo.setVisible(true);
            Label1Pergunta.setVisible(false);
            Label2Paragrafo.setVisible(false);
            Label34Paragrafo.setVisible(false);
            LabelAnunciodePecas.setVisible(false);
            LabelAtenderRadio.setVisible(false);
            LabelAtenderouDesligar.setVisible(false);
            LabelBuscarAjudaOuEsquentar.setVisible(false);
            LabelChegounoVilarejo.setVisible(false);
            LabelChegandoNaVila.setVisible(false);
            LabelDePeNoLocal.setVisible(false);
            LabelDescansaColuna.setVisible(false);
            LabelDesligarRadio.setVisible(false);
            LabelDormiu.setVisible(false);
            LabelEnterraouVoltar.setVisible(false);
            LabelEnterrar.setVisible(false);
            LabelEntrandoNaCasa.setVisible(false);
            LabelEscreverPoema.setVisible(false);
            DormirOuFicarAcordado.setVisible(false);
            LabelFalarAVerdade.setVisible(false);
            LabelFarolSemTempestade.setVisible(false);
            LabelFarolTempestade.setVisible(false);
            LabelFarolTempestadeNoite.setVisible(false);
            LabelFicarAcordado.setVisible(false);
            LabelFicarFarolAteAmanhecer.setVisible(false);
            LabelFimAjudaNoPoema.setVisible(false);
            LabelFimSemAjudaPoema.setVisible(false);
            LabelFimSemLenha1.setVisible(false);
            LabelFimSemLenha2.setVisible(false);
            LabelFimSemLenha3.setVisible(false);
            LabelFimSemLenha4.setVisible(false);
            LabelFimSuicido.setVisible(false);
            LabelIgnorar.setVisible(false);
            LabelMeiaHoraDepois.setVisible(false);
            LabelMentir.setVisible(false);
            LabelMentirOuFalarAVerdade.setVisible(false);
            LabelMorteDoCoelho.setVisible(false);
            LabelNaoEnterrar.setVisible(false);
            LabelNemMesmoNoFarol.setVisible(false);
            LabelOFarolEraOnde.setVisible(false);
            LabelOlhandoParaORadio.setVisible(false);
            LabelOqueEstaAcontecendoAqui.setVisible(false);
            LabelPerguntarACrianca.setVisible(false);
            LabelPerguntarOuAbrir.setVisible(false);
            LabelPoemaTempestade.setVisible(false);
            LabelPreSucidio.setVisible(false);
            LabelPrimeiroNao.setVisible(false);
            LabelPronunciarSe.setVisible(false);
            LabelRepetiaSeVariosOutrosDias.setVisible(false);
            LabelSaindoDoFarol.setVisible(false);
            LabelSegundoNao.setVisible(false);
            LabelTentandoFugirDaRealidade.setVisible(false);
            LabelTremAtropelaCoelho.setVisible(false);
            
            
            
            
                 
            
            
            

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPoema = new javax.swing.JTextArea();
        LabelBuscarAjudaOuEsquentar = new javax.swing.JLabel();
        LabelFimSuicido = new javax.swing.JLabel();
        LabelFimSemAjudaPoema = new javax.swing.JLabel();
        LabelFimAjudaNoPoema = new javax.swing.JLabel();
        LabelEscreverPoema = new javax.swing.JLabel();
        LabelDescansaColuna = new javax.swing.JLabel();
        LabelDesligarRadio = new javax.swing.JLabel();
        LabelChegounoVilarejo = new javax.swing.JLabel();
        LabelAtenderouDesligar = new javax.swing.JLabel();
        LabelAnunciodePecas = new javax.swing.JLabel();
        LabelAtenderRadio = new javax.swing.JLabel();
        LabelEnterraouVoltar = new javax.swing.JLabel();
        LabelDePeNoLocal = new javax.swing.JLabel();
        LabelTremAtropelaCoelho = new javax.swing.JLabel();
        Label1Pergunta = new javax.swing.JLabel();
        Label34Paragrafo = new javax.swing.JLabel();
        Label2Paragrafo = new javax.swing.JLabel();
        Label1Paragrafo = new javax.swing.JLabel();
        LabelFalarAVerdade = new javax.swing.JLabel();
        LabelIgnorar = new javax.swing.JLabel();
        LabelMeiaHoraDepois = new javax.swing.JLabel();
        LabelMentirOuFalarAVerdade = new javax.swing.JLabel();
        LabelMentir = new javax.swing.JLabel();
        LabelMorteDoCoelho = new javax.swing.JLabel();
        LabelNemMesmoNoFarol = new javax.swing.JLabel();
        LabelOFarolEraOnde = new javax.swing.JLabel();
        LabelOlhandoParaORadio = new javax.swing.JLabel();
        LabelPreSucidio = new javax.swing.JLabel();
        LabelPoemaTempestade = new javax.swing.JLabel();
        LabelPronunciarSe = new javax.swing.JLabel();
        LabelRepetiaSeVariosOutrosDias = new javax.swing.JLabel();
        LabelTentandoFugirDaRealidade = new javax.swing.JLabel();
        DormirOuFicarAcordado = new javax.swing.JLabel();
        LabelDormiu = new javax.swing.JLabel();
        LabelFarolTempestadeNoite = new javax.swing.JLabel();
        LabelEntrandoNaCasa = new javax.swing.JLabel();
        LabelFimSemLenha1 = new javax.swing.JLabel();
        LabelFimSemLenha2 = new javax.swing.JLabel();
        LabelFimSemLenha3 = new javax.swing.JLabel();
        LabelFimSemLenha4 = new javax.swing.JLabel();
        LabelFarolSemTempestade = new javax.swing.JLabel();
        LabelFarolTempestade = new javax.swing.JLabel();
        LabelFicarAcordado = new javax.swing.JLabel();
        LabelFicarFarolAteAmanhecer = new javax.swing.JLabel();
        LabelOqueEstaAcontecendoAqui = new javax.swing.JLabel();
        LabelPerguntarACrianca = new javax.swing.JLabel();
        LabelPerguntarOuAbrir = new javax.swing.JLabel();
        LabelChegandoNaVila = new javax.swing.JLabel();
        LabelPrimeiroNao = new javax.swing.JLabel();
        LabelEnterrar = new javax.swing.JLabel();
        LabelNaoEnterrar = new javax.swing.JLabel();
        LabelSaindoDoFarol = new javax.swing.JLabel();
        LabelSegundoNao = new javax.swing.JLabel();
        BContinuarEnterrar = new javax.swing.JButton();
        B1PerguntaNao = new javax.swing.JButton();
        BContinuarAnuncioDePecas = new javax.swing.JButton();
        B2Paragrafo = new javax.swing.JButton();
        BAtenderRadio = new javax.swing.JButton();
        BDesligarRadio = new javax.swing.JButton();
        BContinuarAtenderRadio = new javax.swing.JButton();
        BContinuarChegouNoVilarejo = new javax.swing.JButton();
        BContinuarDePeNoLocal = new javax.swing.JButton();
        BContinuarDesligouORadio = new javax.swing.JButton();
        BContinuarEntediadoDescansarColuna = new javax.swing.JButton();
        BEnterrarCoelho = new javax.swing.JButton();
        BVoltarParaTrem = new javax.swing.JButton();
        BEscreverPoema = new javax.swing.JButton();
        BFecharCaderno = new javax.swing.JButton();
        BContinuarFalarAVerdade = new javax.swing.JButton();
        BVoltarParaMenu = new javax.swing.JButton();
        BContinuarIgnorar = new javax.swing.JButton();
        BContinuarMeiaHoraDepois = new javax.swing.JButton();
        BContinuarMentir = new javax.swing.JButton();
        BMentir = new javax.swing.JButton();
        BFalarAVerdade = new javax.swing.JButton();
        BContinuarMorteCoelho = new javax.swing.JButton();
        BContinuarNemMesmoNoFarol = new javax.swing.JButton();
        BContinuarFarolEraOnde = new javax.swing.JButton();
        BContinuarOlhandoParaORadio = new javax.swing.JButton();
        BContinuarPoemaTemp = new javax.swing.JButton();
        BContinuarPreSucicidio = new javax.swing.JButton();
        BContinuarPronunciarse = new javax.swing.JButton();
        BContinuarRepetiaVariosOutros = new javax.swing.JButton();
        BContinuarTentandoFugir = new javax.swing.JButton();
        BContinuarTremAtropela = new javax.swing.JButton();
        BContinuar1Paragrafo = new javax.swing.JButton();
        B1PerguntaSim = new javax.swing.JButton();
        BContinuar2Paragrafo = new javax.swing.JButton();
        BContinuarOutrosParagrafos = new javax.swing.JButton();
        BBuscarAjuda = new javax.swing.JButton();
        BTentarEsquentala = new javax.swing.JButton();
        BContinuarChegandoNaVila = new javax.swing.JButton();
        BDormir = new javax.swing.JButton();
        BFicarAcordado = new javax.swing.JButton();
        BContinuarDormiu = new javax.swing.JButton();
        BContinuarEntrandoNaCasa = new javax.swing.JButton();
        BContinuarFarolSemTempestade = new javax.swing.JButton();
        BContinuarFarolTempestade = new javax.swing.JButton();
        BFicarNoFarol = new javax.swing.JButton();
        BProcurarPessoas = new javax.swing.JButton();
        BPerguntarOQueAconteceu = new javax.swing.JButton();
        BAbrirCaminho = new javax.swing.JButton();
        BAbrirCaminhoOqueEstaAcontecendo = new javax.swing.JButton();
        BContinuarPerguntarCrianca = new javax.swing.JButton();
        BSimPrimeiro = new javax.swing.JButton();
        BPrimeiroNao = new javax.swing.JButton();
        BContinuarSaindoDoFarol = new javax.swing.JButton();
        BContinuarSegundoNao = new javax.swing.JButton();
        BSalvarTexto = new javax.swing.JButton();
        BRepetiaVariosOutrosDias2 = new javax.swing.JButton();
        BContinuarAnuncioDePecas2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TextoPoema.setBackground(new java.awt.Color(255,255,255,0));
        TextoPoema.setColumns(20);
        TextoPoema.setRows(5);
        TextoPoema.setBorder(null);
        TextoPoema.setOpaque(false);
        getContentPane().add(TextoPoema);
        TextoPoema.setBounds(40, 60, 1070, 320);

        LabelBuscarAjudaOuEsquentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Buscar-ajuda-ou-esquentar.gif"))); // NOI18N
        getContentPane().add(LabelBuscarAjudaOuEsquentar);
        LabelBuscarAjudaOuEsquentar.setBounds(10, 0, 1280, 720);

        LabelFimSuicido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/FIM-SUICIDIO.gif"))); // NOI18N
        getContentPane().add(LabelFimSuicido);
        LabelFimSuicido.setBounds(0, -190, 2010, 1100);

        LabelFimSemAjudaPoema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/FIM-SEM-AJUDA-POEMA.gif"))); // NOI18N
        getContentPane().add(LabelFimSemAjudaPoema);
        LabelFimSemAjudaPoema.setBounds(0, 0, 1280, 720);

        LabelFimAjudaNoPoema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/FIM-AJUDA-NO-POEMA.gif"))); // NOI18N
        getContentPane().add(LabelFimAjudaNoPoema);
        LabelFimAjudaNoPoema.setBounds(0, 0, 1280, 720);

        LabelEscreverPoema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Escrever-poema_1.gif"))); // NOI18N
        getContentPane().add(LabelEscreverPoema);
        LabelEscreverPoema.setBounds(0, 0, 1280, 720);

        LabelDescansaColuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Entediado-descansar-coluna.gif"))); // NOI18N
        getContentPane().add(LabelDescansaColuna);
        LabelDescansaColuna.setBounds(0, 0, 1280, 720);

        LabelDesligarRadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Desligou-o-radio.gif"))); // NOI18N
        getContentPane().add(LabelDesligarRadio);
        LabelDesligarRadio.setBounds(0, 0, 1280, 720);

        LabelChegounoVilarejo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Chegou-no-vilarejo.gif"))); // NOI18N
        getContentPane().add(LabelChegounoVilarejo);
        LabelChegounoVilarejo.setBounds(0, 0, 1280, 720);

        LabelAtenderouDesligar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Atender-o-desligar.gif"))); // NOI18N
        getContentPane().add(LabelAtenderouDesligar);
        LabelAtenderouDesligar.setBounds(0, 0, 1280, 720);

        LabelAnunciodePecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Anuncio-de-peças.gif"))); // NOI18N
        getContentPane().add(LabelAnunciodePecas);
        LabelAnunciodePecas.setBounds(0, 0, 1280, 720);

        LabelAtenderRadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Atender-o-radio.gif"))); // NOI18N
        getContentPane().add(LabelAtenderRadio);
        LabelAtenderRadio.setBounds(0, 0, 1280, 720);

        LabelEnterraouVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Enterrar-ou-voltar.gif"))); // NOI18N
        getContentPane().add(LabelEnterraouVoltar);
        LabelEnterraouVoltar.setBounds(0, 0, 1280, 710);

        LabelDePeNoLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/De-pé-no-local.gif"))); // NOI18N
        LabelDePeNoLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LabelDePeNoLocalKeyPressed(evt);
            }
        });
        getContentPane().add(LabelDePeNoLocal);
        LabelDePeNoLocal.setBounds(0, 0, 1280, 710);

        LabelTremAtropelaCoelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Trem-atropela-coelho.gif"))); // NOI18N
        getContentPane().add(LabelTremAtropelaCoelho);
        LabelTremAtropelaCoelho.setBounds(0, 0, 1280, 710);

        Label1Pergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/inicio/1°-pergunta.gif"))); // NOI18N
        getContentPane().add(Label1Pergunta);
        Label1Pergunta.setBounds(0, 0, 1280, 710);

        Label34Paragrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/inicio/3-4-paragrafos.gif"))); // NOI18N
        Label34Paragrafo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Label34ParagrafoKeyPressed(evt);
            }
        });
        getContentPane().add(Label34Paragrafo);
        Label34Paragrafo.setBounds(0, 0, 1280, 720);

        Label2Paragrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/inicio/2°-paragrafo_1.gif"))); // NOI18N
        Label2Paragrafo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Label2ParagrafoKeyPressed(evt);
            }
        });
        getContentPane().add(Label2Paragrafo);
        Label2Paragrafo.setBounds(0, 0, 1318, 710);

        Label1Paragrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/inicio/1°-Paragrafo.gif"))); // NOI18N
        Label1Paragrafo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Label1ParagrafoKeyPressed(evt);
            }
        });
        getContentPane().add(Label1Paragrafo);
        Label1Paragrafo.setBounds(0, 10, 1280, 700);

        LabelFalarAVerdade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Falar-a-verdade.gif"))); // NOI18N
        getContentPane().add(LabelFalarAVerdade);
        LabelFalarAVerdade.setBounds(4, 4, 1280, 710);

        LabelIgnorar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/IGNORAR.gif"))); // NOI18N
        getContentPane().add(LabelIgnorar);
        LabelIgnorar.setBounds(4, 4, 1280, 710);

        LabelMeiaHoraDepois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Meia-hora-depois.gif"))); // NOI18N
        getContentPane().add(LabelMeiaHoraDepois);
        LabelMeiaHoraDepois.setBounds(4, 4, 1280, 710);

        LabelMentirOuFalarAVerdade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Mentir-ou-falar-a-verdade.gif"))); // NOI18N
        getContentPane().add(LabelMentirOuFalarAVerdade);
        LabelMentirOuFalarAVerdade.setBounds(4, 4, 1280, 710);

        LabelMentir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Mentir.gif"))); // NOI18N
        getContentPane().add(LabelMentir);
        LabelMentir.setBounds(4, 4, 1280, 710);

        LabelMorteDoCoelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Morte-do-coelho.gif"))); // NOI18N
        getContentPane().add(LabelMorteDoCoelho);
        LabelMorteDoCoelho.setBounds(4, 4, 1280, 710);

        LabelNemMesmoNoFarol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Nem-mesmo-no-farol-tempestade-2.gif"))); // NOI18N
        getContentPane().add(LabelNemMesmoNoFarol);
        LabelNemMesmoNoFarol.setBounds(4, 4, 1280, 710);

        LabelOFarolEraOnde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/O-farol-era-onde-tempestade.gif"))); // NOI18N
        getContentPane().add(LabelOFarolEraOnde);
        LabelOFarolEraOnde.setBounds(4, 4, 1280, 710);

        LabelOlhandoParaORadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Olhando-para-o-radio.gif"))); // NOI18N
        getContentPane().add(LabelOlhandoParaORadio);
        LabelOlhandoParaORadio.setBounds(4, 4, 1280, 710);

        LabelPreSucidio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/PRE-SUICIDIO.gif"))); // NOI18N
        getContentPane().add(LabelPreSucidio);
        LabelPreSucidio.setBounds(-2, -30, 1420, 740);

        LabelPoemaTempestade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Poema-tempestade-4.gif"))); // NOI18N
        getContentPane().add(LabelPoemaTempestade);
        LabelPoemaTempestade.setBounds(4, 4, 1280, 710);

        LabelPronunciarSe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Pronunciar-se.gif"))); // NOI18N
        LabelPronunciarSe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LabelPronunciarSeKeyPressed(evt);
            }
        });
        getContentPane().add(LabelPronunciarSe);
        LabelPronunciarSe.setBounds(4, 4, 1280, 710);

        LabelRepetiaSeVariosOutrosDias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Repetia-se-varios-outros-dias.gif"))); // NOI18N
        getContentPane().add(LabelRepetiaSeVariosOutrosDias);
        LabelRepetiaSeVariosOutrosDias.setBounds(4, 4, 1280, 710);

        LabelTentandoFugirDaRealidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/Tentando-fugir-da-realidade-tempestade.gif"))); // NOI18N
        getContentPane().add(LabelTentandoFugirDaRealidade);
        LabelTentandoFugirDaRealidade.setBounds(-2, 0, 1400, 720);

        DormirOuFicarAcordado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Dormir-ou-ficar-acordado.gif"))); // NOI18N
        getContentPane().add(DormirOuFicarAcordado);
        DormirOuFicarAcordado.setBounds(4, 4, 1280, 710);

        LabelDormiu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Dormiu.gif"))); // NOI18N
        getContentPane().add(LabelDormiu);
        LabelDormiu.setBounds(4, 4, 1280, 710);

        LabelFarolTempestadeNoite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/farol tempestade noite.png"))); // NOI18N
        getContentPane().add(LabelFarolTempestadeNoite);
        LabelFarolTempestadeNoite.setBounds(4, 4, 1280, 710);

        LabelEntrandoNaCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Entrando-na-casa.gif"))); // NOI18N
        getContentPane().add(LabelEntrandoNaCasa);
        LabelEntrandoNaCasa.setBounds(4, 4, 1280, 710);

        LabelFimSemLenha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/FIM-SEM-LENHA-1-_GRAVADOS-EM-CONSCIENCIA_.gif"))); // NOI18N
        getContentPane().add(LabelFimSemLenha1);
        LabelFimSemLenha1.setBounds(4, 4, 1280, 710);

        LabelFimSemLenha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/FIM-SEM-LENHA-2-_COVARDIA-E-INDECISÃO_.gif"))); // NOI18N
        getContentPane().add(LabelFimSemLenha2);
        LabelFimSemLenha2.setBounds(4, 4, 1280, 710);

        LabelFimSemLenha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/FIM-SEM-LENHA-3-_DEVORADO-CALOR_.gif"))); // NOI18N
        getContentPane().add(LabelFimSemLenha3);
        LabelFimSemLenha3.setBounds(4, 4, 1280, 710);

        LabelFimSemLenha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/FIM-SEM-LENHA-4-_ME-DESCULPE_.gif"))); // NOI18N
        getContentPane().add(LabelFimSemLenha4);
        LabelFimSemLenha4.setBounds(4, 4, 1280, 710);

        LabelFarolSemTempestade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Farol-sem-tempestade.gif"))); // NOI18N
        getContentPane().add(LabelFarolSemTempestade);
        LabelFarolSemTempestade.setBounds(4, 4, 1280, 710);

        LabelFarolTempestade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Farol-tempestade-1.gif"))); // NOI18N
        getContentPane().add(LabelFarolTempestade);
        LabelFarolTempestade.setBounds(4, 4, 1280, 710);

        LabelFicarAcordado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Ficar-acordado.gif"))); // NOI18N
        getContentPane().add(LabelFicarAcordado);
        LabelFicarAcordado.setBounds(4, 4, 1280, 710);

        LabelFicarFarolAteAmanhecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Ficar-farol-ate-amanhecer.gif"))); // NOI18N
        getContentPane().add(LabelFicarFarolAteAmanhecer);
        LabelFicarFarolAteAmanhecer.setBounds(4, -6, 1280, 720);

        LabelOqueEstaAcontecendoAqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/O-que-esta-acontecendo-aqui.gif"))); // NOI18N
        LabelOqueEstaAcontecendoAqui.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LabelOqueEstaAcontecendoAquiAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(LabelOqueEstaAcontecendoAqui);
        LabelOqueEstaAcontecendoAqui.setBounds(4, 4, 1280, 710);

        LabelPerguntarACrianca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Perguntar-a-criança.gif"))); // NOI18N
        getContentPane().add(LabelPerguntarACrianca);
        LabelPerguntarACrianca.setBounds(4, 4, 1280, 710);

        LabelPerguntarOuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Perguntar-ou-abrir-caminho.gif"))); // NOI18N
        getContentPane().add(LabelPerguntarOuAbrir);
        LabelPerguntarOuAbrir.setBounds(4, 4, 1280, 710);

        LabelChegandoNaVila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Chegando-na-vila.Chegando-na-vila.Chegando-na-vila.gif"))); // NOI18N
        getContentPane().add(LabelChegandoNaVila);
        LabelChegandoNaVila.setBounds(0, 0, 1280, 720);

        LabelPrimeiroNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Primeiro-não.gif"))); // NOI18N
        getContentPane().add(LabelPrimeiroNao);
        LabelPrimeiroNao.setBounds(4, 4, 1280, 710);

        LabelEnterrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/realizar-enterro.gif"))); // NOI18N
        LabelEnterrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LabelEnterrarKeyPressed(evt);
            }
        });
        getContentPane().add(LabelEnterrar);
        LabelEnterrar.setBounds(4, 4, 1280, 710);

        LabelNaoEnterrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Aceitar/nao-enterrar.gif"))); // NOI18N
        getContentPane().add(LabelNaoEnterrar);
        LabelNaoEnterrar.setBounds(4, -6, 1280, 720);

        LabelSaindoDoFarol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Saindo-do-farol.gif"))); // NOI18N
        getContentPane().add(LabelSaindoDoFarol);
        LabelSaindoDoFarol.setBounds(4, 4, 1280, 710);

        LabelSegundoNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farol/Negar viagem convertido/Segundo-não.gif"))); // NOI18N
        getContentPane().add(LabelSegundoNao);
        LabelSegundoNao.setBounds(4, 4, 1280, 710);

        BContinuarEnterrar.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarEnterrar.setText("jButton1");
        BContinuarEnterrar.setActionCommand("");
        BContinuarEnterrar.setBorder(null);
        BContinuarEnterrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarEnterrarActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarEnterrar);
        BContinuarEnterrar.setBounds(313, 553, 520, 130);

        B1PerguntaNao.setBackground(new java.awt.Color(255,255,255,0));
        B1PerguntaNao.setBorder(null);
        B1PerguntaNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1PerguntaNaoActionPerformed(evt);
            }
        });
        getContentPane().add(B1PerguntaNao);
        B1PerguntaNao.setBounds(740, 560, 320, 90);

        BContinuarAnuncioDePecas.setBackground(new java.awt.Color(255,255,255,0)
        );
        BContinuarAnuncioDePecas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarAnuncioDePecasKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarAnuncioDePecas);
        BContinuarAnuncioDePecas.setBounds(423, 533, 430, 160);

        B2Paragrafo.setBackground(new java.awt.Color(255,255,255,0));
        B2Paragrafo.setBorder(null);
        B2Paragrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ParagrafoActionPerformed(evt);
            }
        });
        B2Paragrafo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B2ParagrafoKeyPressed(evt);
            }
        });
        getContentPane().add(B2Paragrafo);
        B2Paragrafo.setBounds(350, 480, 450, 230);

        BAtenderRadio.setBackground(new java.awt.Color(255,255,255,0));
        BAtenderRadio.setBorder(null);
        BAtenderRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtenderRadioActionPerformed(evt);
            }
        });
        getContentPane().add(BAtenderRadio);
        BAtenderRadio.setBounds(13, 223, 520, 400);

        BDesligarRadio.setBorder(null);
        BDesligarRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDesligarRadioActionPerformed(evt);
            }
        });
        getContentPane().add(BDesligarRadio);
        BDesligarRadio.setBounds(783, 273, 430, 320);

        BContinuarAtenderRadio.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarAtenderRadio.setBorder(null);
        BContinuarAtenderRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarAtenderRadioActionPerformed(evt);
            }
        });
        BContinuarAtenderRadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarAtenderRadioKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarAtenderRadio);
        BContinuarAtenderRadio.setBounds(603, 613, 460, 90);

        BContinuarChegouNoVilarejo.setBorder(null);
        getContentPane().add(BContinuarChegouNoVilarejo);
        BContinuarChegouNoVilarejo.setBounds(613, 603, 470, 90);

        BContinuarDePeNoLocal.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarDePeNoLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarDePeNoLocalKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarDePeNoLocal);
        BContinuarDePeNoLocal.setBounds(613, 593, 490, 110);

        BContinuarDesligouORadio.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarDesligouORadio.setBorder(null);
        BContinuarDesligouORadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarDesligouORadioActionPerformed(evt);
            }
        });
        BContinuarDesligouORadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarDesligouORadioKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarDesligouORadio);
        BContinuarDesligouORadio.setBounds(683, 603, 430, 100);

        BContinuarEntediadoDescansarColuna.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarEntediadoDescansarColuna.setBorder(null);
        BContinuarEntediadoDescansarColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarEntediadoDescansarColunaActionPerformed(evt);
            }
        });
        BContinuarEntediadoDescansarColuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarEntediadoDescansarColunaKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarEntediadoDescansarColuna);
        BContinuarEntediadoDescansarColuna.setBounds(673, 603, 400, 100);

        BEnterrarCoelho.setBackground(new java.awt.Color(255,255,255,0)
        );
        BEnterrarCoelho.setBorder(null);
        BEnterrarCoelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnterrarCoelhoActionPerformed(evt);
            }
        });
        BEnterrarCoelho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BEnterrarCoelhoKeyPressed(evt);
            }
        });
        getContentPane().add(BEnterrarCoelho);
        BEnterrarCoelho.setBounds(33, 313, 450, 220);

        BVoltarParaTrem.setBackground(new java.awt.Color(255,255,255,0));
        BVoltarParaTrem.setBorder(null);
        BVoltarParaTrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarParaTremActionPerformed(evt);
            }
        });
        getContentPane().add(BVoltarParaTrem);
        BVoltarParaTrem.setBounds(713, 333, 560, 160);

        BEscreverPoema.setBackground(new java.awt.Color(255,255,255,0));
        BEscreverPoema.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BEscreverPoema.setText("Salva poema");
        BEscreverPoema.setBorder(null);
        BEscreverPoema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEscreverPoemaActionPerformed(evt);
            }
        });
        getContentPane().add(BEscreverPoema);
        BEscreverPoema.setBounds(313, 493, 280, 100);

        BFecharCaderno.setBackground(new java.awt.Color(255,255,255,0));
        BFecharCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharCadernoActionPerformed(evt);
            }
        });
        getContentPane().add(BFecharCaderno);
        BFecharCaderno.setBounds(723, 503, 310, 100);

        BContinuarFalarAVerdade.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarFalarAVerdade.setBorder(null);
        BContinuarFalarAVerdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarFalarAVerdadeActionPerformed(evt);
            }
        });
        BContinuarFalarAVerdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarFalarAVerdadeKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarFalarAVerdade);
        BContinuarFalarAVerdade.setBounds(443, 593, 450, 110);

        BVoltarParaMenu.setBackground(new java.awt.Color(255,255,255,0));
        BVoltarParaMenu.setBorder(null);
        getContentPane().add(BVoltarParaMenu);
        BVoltarParaMenu.setBounds(1020, 573, 260, 130);

        BContinuarIgnorar.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarIgnorar.setBorder(null);
        getContentPane().add(BContinuarIgnorar);
        BContinuarIgnorar.setBounds(433, 583, 500, 120);

        BContinuarMeiaHoraDepois.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarMeiaHoraDepois.setBorder(null);
        BContinuarMeiaHoraDepois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarMeiaHoraDepoisActionPerformed(evt);
            }
        });
        BContinuarMeiaHoraDepois.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarMeiaHoraDepoisKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarMeiaHoraDepois);
        BContinuarMeiaHoraDepois.setBounds(443, 573, 470, 130);

        BContinuarMentir.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarMentir.setBorder(null);
        BContinuarMentir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarMentirActionPerformed(evt);
            }
        });
        BContinuarMentir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarMentirKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarMentir);
        BContinuarMentir.setBounds(283, 593, 640, 110);

        BMentir.setBackground(new java.awt.Color(255,255,255,0));
        BMentir.setBorder(null);
        BMentir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMentirActionPerformed(evt);
            }
        });
        getContentPane().add(BMentir);
        BMentir.setBounds(13, 353, 440, 190);

        BFalarAVerdade.setBackground(new java.awt.Color(255,255,255,0));
        BFalarAVerdade.setBorder(null);
        BFalarAVerdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFalarAVerdadeActionPerformed(evt);
            }
        });
        getContentPane().add(BFalarAVerdade);
        BFalarAVerdade.setBounds(843, 353, 370, 180);

        BContinuarMorteCoelho.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarMorteCoelho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarMorteCoelhoKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarMorteCoelho);
        BContinuarMorteCoelho.setBounds(413, 573, 490, 130);

        BContinuarNemMesmoNoFarol.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarNemMesmoNoFarol.setBorder(null);
        BContinuarNemMesmoNoFarol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarNemMesmoNoFarolActionPerformed(evt);
            }
        });
        BContinuarNemMesmoNoFarol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarNemMesmoNoFarolKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarNemMesmoNoFarol);
        BContinuarNemMesmoNoFarol.setBounds(373, 583, 560, 120);

        BContinuarFarolEraOnde.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarFarolEraOnde.setBorder(null);
        BContinuarFarolEraOnde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarFarolEraOndeActionPerformed(evt);
            }
        });
        BContinuarFarolEraOnde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarFarolEraOndeKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarFarolEraOnde);
        BContinuarFarolEraOnde.setBounds(353, 573, 580, 140);

        BContinuarOlhandoParaORadio.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarOlhandoParaORadio.setBorder(null);
        BContinuarOlhandoParaORadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarOlhandoParaORadioActionPerformed(evt);
            }
        });
        BContinuarOlhandoParaORadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarOlhandoParaORadioKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarOlhandoParaORadio);
        BContinuarOlhandoParaORadio.setBounds(453, 583, 490, 130);

        BContinuarPoemaTemp.setText("jButton2");
        BContinuarPoemaTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarPoemaTempActionPerformed(evt);
            }
        });
        BContinuarPoemaTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarPoemaTempKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarPoemaTemp);
        BContinuarPoemaTemp.setBounds(433, 583, 530, 120);

        BContinuarPreSucicidio.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarPreSucicidio.setBorder(null);
        BContinuarPreSucicidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarPreSucicidioActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarPreSucicidio);
        BContinuarPreSucicidio.setBounds(453, 573, 520, 140);

        BContinuarPronunciarse.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarPronunciarse.setBorder(null);
        BContinuarPronunciarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarPronunciarseActionPerformed(evt);
            }
        });
        BContinuarPronunciarse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarPronunciarseKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarPronunciarse);
        BContinuarPronunciarse.setBounds(273, 573, 650, 140);

        BContinuarRepetiaVariosOutros.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarRepetiaVariosOutros.setBorder(null);
        BContinuarRepetiaVariosOutros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarRepetiaVariosOutrosKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarRepetiaVariosOutros);
        BContinuarRepetiaVariosOutros.setBounds(353, 603, 610, 100);

        BContinuarTentandoFugir.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarTentandoFugir.setBorder(null);
        BContinuarTentandoFugir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarTentandoFugirActionPerformed(evt);
            }
        });
        BContinuarTentandoFugir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarTentandoFugirKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarTentandoFugir);
        BContinuarTentandoFugir.setBounds(403, 583, 530, 130);

        BContinuarTremAtropela.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarTremAtropela.setBorder(null);
        BContinuarTremAtropela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarTremAtropelaKeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarTremAtropela);
        BContinuarTremAtropela.setBounds(433, 553, 520, 150);

        BContinuar1Paragrafo.setBackground(new java.awt.Color(255,255,255,0));
        BContinuar1Paragrafo.setBorder(null);
        BContinuar1Paragrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BContinuar1Paragrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuar1ParagrafoActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuar1Paragrafo);
        BContinuar1Paragrafo.setBounds(453, 470, 490, 230);

        B1PerguntaSim.setBackground(new java.awt.Color(255,255,255,0));
        B1PerguntaSim.setBorder(null);
        B1PerguntaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1PerguntaSimActionPerformed(evt);
            }
        });
        getContentPane().add(B1PerguntaSim);
        B1PerguntaSim.setBounds(313, 563, 280, 90);

        BContinuar2Paragrafo.setBackground(new java.awt.Color(255,255,255,0));
        BContinuar2Paragrafo.setBorder(null);
        getContentPane().add(BContinuar2Paragrafo);
        BContinuar2Paragrafo.setBounds(343, 603, 420, 100);

        BContinuarOutrosParagrafos.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarOutrosParagrafos.setBorder(null);
        BContinuarOutrosParagrafos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarOutrosParagrafosActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarOutrosParagrafos);
        BContinuarOutrosParagrafos.setBounds(400, 593, 390, 110);

        BBuscarAjuda.setBackground(new java.awt.Color(255,255,255,0));
        BBuscarAjuda.setBorder(null);
        BBuscarAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(BBuscarAjuda);
        BBuscarAjuda.setBounds(53, 283, 460, 190);

        BTentarEsquentala.setBackground(new java.awt.Color(255,255,255,0));
        BTentarEsquentala.setBorder(null);
        BTentarEsquentala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTentarEsquentalaActionPerformed(evt);
            }
        });
        getContentPane().add(BTentarEsquentala);
        BTentarEsquentala.setBounds(633, 283, 640, 190);

        BContinuarChegandoNaVila.setBackground(new java.awt.Color(255,255,255,0)
        );
        BContinuarChegandoNaVila.setBorder(null);
        BContinuarChegandoNaVila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarChegandoNaVilaActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarChegandoNaVila);
        BContinuarChegandoNaVila.setBounds(340, 590, 540, 120);

        BDormir.setBackground(new java.awt.Color(255,255,255,0));
        BDormir.setBorder(null);
        BDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDormirActionPerformed(evt);
            }
        });
        getContentPane().add(BDormir);
        BDormir.setBounds(203, 553, 290, 100);

        BFicarAcordado.setBackground(new java.awt.Color(255,255,255,0));
        BFicarAcordado.setBorder(null);
        BFicarAcordado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFicarAcordadoActionPerformed(evt);
            }
        });
        getContentPane().add(BFicarAcordado);
        BFicarAcordado.setBounds(743, 563, 320, 90);

        BContinuarDormiu.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarDormiu.setBorder(null);
        BContinuarDormiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarDormiuActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarDormiu);
        BContinuarDormiu.setBounds(343, 603, 470, 110);

        BContinuarEntrandoNaCasa.setText("jButton2");
        BContinuarEntrandoNaCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarEntrandoNaCasaActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarEntrandoNaCasa);
        BContinuarEntrandoNaCasa.setBounds(333, 603, 490, 110);

        BContinuarFarolSemTempestade.setText("jButton2");
        BContinuarFarolSemTempestade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarFarolSemTempestadeActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarFarolSemTempestade);
        BContinuarFarolSemTempestade.setBounds(303, 593, 530, 110);

        BContinuarFarolTempestade.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarFarolTempestade.setBorder(null);
        BContinuarFarolTempestade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarFarolTempestadeActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarFarolTempestade);
        BContinuarFarolTempestade.setBounds(333, 593, 440, 120);

        BFicarNoFarol.setBackground(new java.awt.Color(255,255,255,0));
        BFicarNoFarol.setBorder(null);
        BFicarNoFarol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFicarNoFarolActionPerformed(evt);
            }
        });
        getContentPane().add(BFicarNoFarol);
        BFicarNoFarol.setBounds(73, 523, 360, 180);

        BProcurarPessoas.setBackground(new java.awt.Color(255,255,255,0));
        BProcurarPessoas.setBorder(null);
        BProcurarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProcurarPessoasActionPerformed(evt);
            }
        });
        getContentPane().add(BProcurarPessoas);
        BProcurarPessoas.setBounds(563, 433, 540, 200);

        BPerguntarOQueAconteceu.setBackground(new java.awt.Color(255,255,255,0));
        BPerguntarOQueAconteceu.setBorder(null);
        BPerguntarOQueAconteceu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPerguntarOQueAconteceuActionPerformed(evt);
            }
        });
        getContentPane().add(BPerguntarOQueAconteceu);
        BPerguntarOQueAconteceu.setBounds(33, 453, 590, 240);

        BAbrirCaminho.setBackground(new java.awt.Color(255,255,255,0));
        BAbrirCaminho.setBorder(null);
        BAbrirCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAbrirCaminhoActionPerformed(evt);
            }
        });
        getContentPane().add(BAbrirCaminho);
        BAbrirCaminho.setBounds(753, 513, 480, 160);

        BAbrirCaminhoOqueEstaAcontecendo.setText("jButton2");
        BAbrirCaminhoOqueEstaAcontecendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAbrirCaminhoOqueEstaAcontecendoActionPerformed(evt);
            }
        });
        getContentPane().add(BAbrirCaminhoOqueEstaAcontecendo);
        BAbrirCaminhoOqueEstaAcontecendo.setBounds(383, 553, 460, 150);

        BContinuarPerguntarCrianca.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarPerguntarCrianca.setBorder(null);
        BContinuarPerguntarCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarPerguntarCriancaActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarPerguntarCrianca);
        BContinuarPerguntarCrianca.setBounds(403, 503, 470, 210);

        BSimPrimeiro.setBackground(new java.awt.Color(255,255,255,0));
        BSimPrimeiro.setToolTipText("");
        BSimPrimeiro.setBorder(null);
        getContentPane().add(BSimPrimeiro);
        BSimPrimeiro.setBounds(270, 550, 270, 150);

        BPrimeiroNao.setText("jButton2");
        BPrimeiroNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPrimeiroNaoActionPerformed(evt);
            }
        });
        getContentPane().add(BPrimeiroNao);
        BPrimeiroNao.setBounds(753, 563, 310, 110);

        BContinuarSaindoDoFarol.setText("jButton2");
        BContinuarSaindoDoFarol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarSaindoDoFarolActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarSaindoDoFarol);
        BContinuarSaindoDoFarol.setBounds(283, 553, 590, 150);

        BContinuarSegundoNao.setBackground(new java.awt.Color(255,255,255,0));
        BContinuarSegundoNao.setBorder(null);
        BContinuarSegundoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarSegundoNaoActionPerformed(evt);
            }
        });
        getContentPane().add(BContinuarSegundoNao);
        BContinuarSegundoNao.setBounds(273, 563, 610, 140);

        BSalvarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(BSalvarTexto);
        BSalvarTexto.setBounds(423, 603, 440, 80);

        BRepetiaVariosOutrosDias2.setBackground(new java.awt.Color(255,255,255,0));
        BRepetiaVariosOutrosDias2.setBorder(null);
        BRepetiaVariosOutrosDias2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BRepetiaVariosOutrosDias2KeyPressed(evt);
            }
        });
        getContentPane().add(BRepetiaVariosOutrosDias2);
        BRepetiaVariosOutrosDias2.setBounds(413, 593, 390, 100);

        BContinuarAnuncioDePecas2.setText("jButton1");
        BContinuarAnuncioDePecas2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarAnuncioDePecas2KeyPressed(evt);
            }
        });
        getContentPane().add(BContinuarAnuncioDePecas2);
        BContinuarAnuncioDePecas2.setBounds(300, 560, 610, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BContinuar1ParagrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuar1ParagrafoActionPerformed
        // TODO add your handling code here:
        Label1Paragrafo.setVisible(false);
        BContinuar1Paragrafo.setVisible(false);
        Label2Paragrafo.setVisible(true);
        B2Paragrafo.setVisible(true);
        
    }//GEN-LAST:event_BContinuar1ParagrafoActionPerformed

    private void B2ParagrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ParagrafoActionPerformed
        // TODO add your handling code here:
        Label2Paragrafo.setVisible(false);
        B2Paragrafo.setVisible(false);
        Label34Paragrafo.setVisible(true);
        BContinuarOutrosParagrafos.setVisible(true);
    }//GEN-LAST:event_B2ParagrafoActionPerformed

    private void BContinuarOutrosParagrafosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarOutrosParagrafosActionPerformed
        Label34Paragrafo.setVisible(false);
        BContinuarOutrosParagrafos.setVisible(false);
        Label1Pergunta.setVisible(true);
        B1PerguntaSim.setVisible(true);
        B1PerguntaNao.setVisible(true);
    }//GEN-LAST:event_BContinuarOutrosParagrafosActionPerformed

    private void B1PerguntaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1PerguntaSimActionPerformed
        Label1Pergunta.setVisible(false);
        B1PerguntaSim.setVisible(false);
        B1PerguntaNao.setVisible(false);
        LabelTremAtropelaCoelho.setVisible(true);
        BContinuarTremAtropela.setVisible(true);
    }//GEN-LAST:event_B1PerguntaSimActionPerformed

    private void BContinuarTremAtropelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarTremAtropelaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelTremAtropelaCoelho.setVisible(false);
            BContinuarTremAtropela.setVisible(false);
            LabelMorteDoCoelho.setVisible(true);
            BContinuarMorteCoelho.setVisible(true);
        }
 
    }//GEN-LAST:event_BContinuarTremAtropelaKeyPressed

    private void BContinuarMorteCoelhoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarMorteCoelhoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelMorteDoCoelho.setVisible(false);
            BContinuarMorteCoelho.setVisible(false);
            LabelDePeNoLocal.setVisible(true);
            BContinuarDePeNoLocal.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarMorteCoelhoKeyPressed

    private void BContinuarDePeNoLocalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarDePeNoLocalKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelDePeNoLocal.setVisible(false);
            BContinuarDePeNoLocal.setVisible(false);
            LabelEnterraouVoltar.setVisible(true);
            BEnterrarCoelho.setVisible(true);
            BVoltarParaTrem.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarDePeNoLocalKeyPressed

    private void BEnterrarCoelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnterrarCoelhoActionPerformed
           
            LabelEnterraouVoltar.setVisible(false);
            BEnterrarCoelho.setVisible(false);
            BVoltarParaTrem.setVisible(false);
            LabelEnterrar.setVisible(true);
            BContinuarEnterrar.setVisible(true);
            
    }//GEN-LAST:event_BEnterrarCoelhoActionPerformed

    private void B1PerguntaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1PerguntaNaoActionPerformed
        Label1Pergunta.setVisible(false);
        B1PerguntaSim.setVisible(false);
        B1PerguntaNao.setVisible(false);
        LabelPrimeiroNao.setVisible(true);
        B1PerguntaSim.setVisible(true);
        B1PerguntaNao.setVisible(true);
    }//GEN-LAST:event_B1PerguntaNaoActionPerformed

    private void LabelEnterrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LabelEnterrarKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_SPACE){
         LabelEnterrar.setVisible(false);
         LabelPronunciarSe.setVisible(true);
         BContinuarPronunciarse.setVisible(true);
       }
    }//GEN-LAST:event_LabelEnterrarKeyPressed

    private void BVoltarParaTremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarParaTremActionPerformed
        LabelEnterraouVoltar.setVisible(false);
        BEnterrarCoelho.setVisible(false);
        BVoltarParaTrem.setVisible(false);
        LabelNaoEnterrar.setVisible(true);
        BContinuarPronunciarse.setVisible(true);
    }//GEN-LAST:event_BVoltarParaTremActionPerformed

    private void BContinuarPronunciarseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarPronunciarseKeyPressed
        LabelPronunciarSe.setVisible(false);
        BContinuarPronunciarse.setVisible(false);
        LabelMentirOuFalarAVerdade.setVisible(true);
        BMentir.setVisible(true);
        BFalarAVerdade.setVisible(true);
        BContinuarEnterrar.setVisible(false);
    }//GEN-LAST:event_BContinuarPronunciarseKeyPressed

    private void BMentirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMentirActionPerformed
        LabelMentirOuFalarAVerdade.setVisible(false);
        BMentir.setVisible(false);
        BFalarAVerdade.setVisible(false);
        LabelMentir.setVisible(true);
        BContinuarMentir.setVisible(true);
    }//GEN-LAST:event_BMentirActionPerformed

    private void BFalarAVerdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFalarAVerdadeActionPerformed
        BMentir.setVisible(false);
        LabelMentirOuFalarAVerdade.setVisible(false);
        BFalarAVerdade.setVisible(false);
        LabelFalarAVerdade.setVisible(true);
        BContinuarFalarAVerdade.setVisible(true);
    }//GEN-LAST:event_BFalarAVerdadeActionPerformed

    private void BContinuarMentirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarMentirKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelMentir.setVisible(false);
            BContinuarMentir.setVisible(false);
            LabelOFarolEraOnde.setVisible(true);
            BContinuarFarolEraOnde.setVisible(true);
       }
    }//GEN-LAST:event_BContinuarMentirKeyPressed

    private void BContinuarFalarAVerdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarFalarAVerdadeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelFalarAVerdade.setVisible(false);
            BContinuarFalarAVerdade.setVisible(false);
            LabelOFarolEraOnde.setVisible(true);
            BContinuarFarolEraOnde.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarFalarAVerdadeKeyPressed

    private void BContinuarFarolEraOndeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarFarolEraOndeKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelOFarolEraOnde.setVisible(false);
            BContinuarFarolEraOnde.setVisible(false);
            LabelNemMesmoNoFarol.setVisible(true);
            BContinuarNemMesmoNoFarol.setVisible(true);
       }
    }//GEN-LAST:event_BContinuarFarolEraOndeKeyPressed

    private void BContinuarNemMesmoNoFarolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarNemMesmoNoFarolKeyPressed
      if(evt.getKeyCode()== KeyEvent.VK_SPACE){
        BContinuarNemMesmoNoFarol.setVisible(false);
        LabelNemMesmoNoFarol.setVisible(false);
        LabelTentandoFugirDaRealidade.setVisible(true);
        BContinuarTentandoFugir.setVisible(true);
      }
    }//GEN-LAST:event_BContinuarNemMesmoNoFarolKeyPressed

    private void BContinuarTentandoFugirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarTentandoFugirKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            BContinuarTentandoFugir.setVisible(false);
            LabelTentandoFugirDaRealidade.setVisible(false);
            LabelPoemaTempestade.setVisible(true);
            BEscreverPoema.setVisible(true);
            BFecharCaderno.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarTentandoFugirKeyPressed

    private void BContinuarPoemaTempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarPoemaTempKeyPressed
      
    }//GEN-LAST:event_BContinuarPoemaTempKeyPressed

    private void BSalvarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarTextoActionPerformed
        TextoPoema.setVisible(false);
        BSalvarTexto.setVisible(false);
        LabelRepetiaSeVariosOutrosDias.setVisible(true);
        BContinuarRepetiaVariosOutros.setVisible(true);
    }//GEN-LAST:event_BSalvarTextoActionPerformed

    private void BContinuarRepetiaVariosOutrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarRepetiaVariosOutrosKeyPressed
       LabelRepetiaSeVariosOutrosDias.setVisible(false);
        BContinuarRepetiaVariosOutros.setVisible(false);
        LabelAnunciodePecas.setVisible(true);
        BContinuarAnuncioDePecas.setVisible(true);
    }//GEN-LAST:event_BContinuarRepetiaVariosOutrosKeyPressed

    private void BContinuarAnuncioDePecasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarAnuncioDePecasKeyPressed
       LabelAnunciodePecas.setVisible(false);
        BContinuarAnuncioDePecas.setVisible(false);
        LabelDescansaColuna.setVisible(true);
        BContinuarEntediadoDescansarColuna.setVisible(true);
    }//GEN-LAST:event_BContinuarAnuncioDePecasKeyPressed

    private void BFecharCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharCadernoActionPerformed
        LabelEscreverPoema.setVisible(false);
        LabelPoemaTempestade.setVisible(false);
        BEscreverPoema.setVisible(false);
        BFecharCaderno.setVisible(false);
        LabelRepetiaSeVariosOutrosDias.setVisible(false);
        BRepetiaVariosOutrosDias2.setVisible(true);
    }//GEN-LAST:event_BFecharCadernoActionPerformed

    private void BRepetiaVariosOutrosDias2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BRepetiaVariosOutrosDias2KeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            BRepetiaVariosOutrosDias2.setVisible(false);
            LabelAnunciodePecas.setVisible(true);
            BContinuarAnuncioDePecas2.setVisible(true);
       }
    }//GEN-LAST:event_BRepetiaVariosOutrosDias2KeyPressed

    private void BContinuarAnuncioDePecas2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarAnuncioDePecas2KeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_SPACE){ 
            LabelAnunciodePecas.setVisible(false);
            BContinuarAnuncioDePecas2.setVisible(false);
            LabelDescansaColuna.setVisible(true);
            BContinuarEntediadoDescansarColuna.setVisible(true);
       }
    }//GEN-LAST:event_BContinuarAnuncioDePecas2KeyPressed

    private void BContinuarEntediadoDescansarColunaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarEntediadoDescansarColunaKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelDescansaColuna.setVisible(false);
            BContinuarEntediadoDescansarColuna.setVisible(false);
            LabelMeiaHoraDepois.setVisible(true);
            BContinuarMeiaHoraDepois.setVisible(true);
       }
    }//GEN-LAST:event_BContinuarEntediadoDescansarColunaKeyPressed

    private void BContinuarMeiaHoraDepoisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarMeiaHoraDepoisKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelMeiaHoraDepois.setVisible(false);
            BContinuarMeiaHoraDepois.setVisible(false);
            LabelOlhandoParaORadio.setVisible(true);
            BContinuarOlhandoParaORadio.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarMeiaHoraDepoisKeyPressed

    private void BContinuarOlhandoParaORadioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarOlhandoParaORadioKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelOlhandoParaORadio.setVisible(false);
            BContinuarOlhandoParaORadio.setVisible(false);
            LabelAtenderouDesligar.setVisible(true);
            BAtenderRadio.setVisible(true);
            BDesligarRadio.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarOlhandoParaORadioKeyPressed

    private void BAtenderRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtenderRadioActionPerformed
        BAtenderRadio.setVisible(false);
        BDesligarRadio.setVisible(false);
        LabelAtenderRadio.setVisible(true);
        BContinuarAtenderRadio.setVisible(true);
    }//GEN-LAST:event_BAtenderRadioActionPerformed

    private void BDesligarRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDesligarRadioActionPerformed
        BAtenderRadio.setVisible(false);
        BDesligarRadio.setVisible(false);
        LabelAtenderouDesligar.setVisible(false);
        LabelDesligarRadio.setVisible(true);
        BContinuarDesligouORadio.setVisible(true);
    }//GEN-LAST:event_BDesligarRadioActionPerformed
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    private void BContinuarAtenderRadioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarAtenderRadioKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelAtenderRadio.setVisible(false);
            BContinuarAtenderRadio.setVisible(false);
            LabelPreSucidio.setVisible(true);
            BContinuarPreSucicidio.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarAtenderRadioKeyPressed

    private void BContinuarDesligouORadioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarDesligouORadioKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            LabelDesligarRadio.setVisible(false);
            BContinuarDesligouORadio.setVisible(false);
        }
        
    }//GEN-LAST:event_BContinuarDesligouORadioKeyPressed

    private void Label34ParagrafoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Label34ParagrafoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_SPACE){
            Label34Paragrafo.setVisible(false);
            BContinuarOutrosParagrafos.setVisible(false);
            Label1Pergunta.setVisible(true);
            BContinuarOutrosParagrafos.setVisible(false);
            B1PerguntaSim.setVisible(true);
            B1PerguntaNao.setVisible(true);
        }
    }//GEN-LAST:event_Label34ParagrafoKeyPressed

    private void Label1ParagrafoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Label1ParagrafoKeyPressed
        Label1Paragrafo.setVisible(false);
        B2Paragrafo.setVisible(false);
        Label2Paragrafo.setVisible(true);
        B2Paragrafo.setVisible(true);
    }//GEN-LAST:event_Label1ParagrafoKeyPressed

    private void Label2ParagrafoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Label2ParagrafoKeyPressed
     if(evt.getKeyCode()== KeyEvent.VK_SPACE){
          Label2Paragrafo.setVisible(false);
          B2Paragrafo.setVisible(false);
          Label34Paragrafo.setVisible(true);
          BContinuarOutrosParagrafos.setVisible(true);
     }
    }//GEN-LAST:event_Label2ParagrafoKeyPressed

    private void B2ParagrafoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B2ParagrafoKeyPressed
     
    }//GEN-LAST:event_B2ParagrafoKeyPressed

    private void LabelDePeNoLocalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LabelDePeNoLocalKeyPressed
        if(evt.getKeyCode()!= 0){
            LabelDePeNoLocal.setVisible(false);
            BContinuarDePeNoLocal.setVisible(false);
            LabelEnterraouVoltar.setVisible(true);
            BEnterrarCoelho.setVisible(true);
            BVoltarParaTrem.setVisible(true);
        }
    }//GEN-LAST:event_LabelDePeNoLocalKeyPressed

    private void BContinuarPronunciarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarPronunciarseActionPerformed
        LabelPronunciarSe.setVisible(false);
        BContinuarPronunciarse.setVisible(false);
        LabelMentirOuFalarAVerdade.setVisible(true);
        BMentir.setVisible(true);
        BFalarAVerdade.setVisible(true);
        
    }//GEN-LAST:event_BContinuarPronunciarseActionPerformed

    private void BEnterrarCoelhoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BEnterrarCoelhoKeyPressed
        
    }//GEN-LAST:event_BEnterrarCoelhoKeyPressed

    private void BContinuarEnterrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarEnterrarActionPerformed
         LabelEnterrar.setVisible(false);
         BContinuarEnterrar.setVisible(false);
         LabelPronunciarSe.setVisible(true);
         BContinuarPronunciarse.setVisible(true);
    }//GEN-LAST:event_BContinuarEnterrarActionPerformed

    private void LabelPronunciarSeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LabelPronunciarSeKeyPressed
        if(evt.getKeyCode()!= 0){
            LabelPronunciarSe.setVisible(false);
            BContinuarPronunciarse.setVisible(false);
            LabelMentirOuFalarAVerdade.setVisible(true);
            BMentir.setVisible(true);
            BFalarAVerdade.setVisible(true);
            BContinuarEnterrar.setVisible(false);
        }
    }//GEN-LAST:event_LabelPronunciarSeKeyPressed

    private void BContinuarFalarAVerdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarFalarAVerdadeActionPerformed
            LabelFalarAVerdade.setVisible(false);
            BContinuarFalarAVerdade.setVisible(false);
            LabelOFarolEraOnde.setVisible(true);
            BContinuarFarolEraOnde.setVisible(true);
    }//GEN-LAST:event_BContinuarFalarAVerdadeActionPerformed

    private void BContinuarMentirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarMentirActionPerformed
            LabelMentir.setVisible(false);
            BContinuarMentir.setVisible(false);
            LabelOFarolEraOnde.setVisible(true);
            BContinuarFarolEraOnde.setVisible(true);
    }//GEN-LAST:event_BContinuarMentirActionPerformed

    private void BContinuarFarolEraOndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarFarolEraOndeActionPerformed
             BContinuarPronunciarse.setVisible(false);
            LabelOFarolEraOnde.setVisible(false);
            BContinuarFarolEraOnde.setVisible(false);
            LabelNemMesmoNoFarol.setVisible(true);
            BContinuarNemMesmoNoFarol.setVisible(true);
    }//GEN-LAST:event_BContinuarFarolEraOndeActionPerformed

    private void BContinuarNemMesmoNoFarolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarNemMesmoNoFarolActionPerformed
        BContinuarNemMesmoNoFarol.setVisible(false);
        LabelNemMesmoNoFarol.setVisible(false);
        LabelTentandoFugirDaRealidade.setVisible(true);
        BContinuarTentandoFugir.setVisible(true);
    }//GEN-LAST:event_BContinuarNemMesmoNoFarolActionPerformed

    private void BContinuarTentandoFugirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarTentandoFugirActionPerformed
            BContinuarTentandoFugir.setVisible(true);
            LabelTentandoFugirDaRealidade.setVisible(false);
            LabelPoemaTempestade.setVisible(true);
            BContinuarPoemaTemp.setVisible(true);
    }//GEN-LAST:event_BContinuarTentandoFugirActionPerformed

    private void BEscreverPoemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEscreverPoemaActionPerformed
            LabelEscreverPoema.setVisible(false);
            BEscreverPoema.setVisible(false);
            BFecharCaderno.setVisible(false);
            TextoPoema.setVisible(true);
            BSalvarTexto.setVisible(true);
            
    }//GEN-LAST:event_BEscreverPoemaActionPerformed

    private void BContinuarPoemaTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarPoemaTempActionPerformed
            LabelPoemaTempestade.setVisible(false);
            BContinuarPoemaTemp.setVisible(false);
            LabelEscreverPoema.setVisible(true);
            BEscreverPoema.setVisible(true);
            BFecharCaderno.setVisible(true);
    }//GEN-LAST:event_BContinuarPoemaTempActionPerformed

    private void BContinuarEntediadoDescansarColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarEntediadoDescansarColunaActionPerformed
        LabelDescansaColuna.setVisible(false);
        BContinuarEntediadoDescansarColuna.setVisible(false);
        LabelMeiaHoraDepois.setVisible(true);
        BContinuarMeiaHoraDepois.setVisible(true);
    }//GEN-LAST:event_BContinuarEntediadoDescansarColunaActionPerformed

    private void BContinuarMeiaHoraDepoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarMeiaHoraDepoisActionPerformed
        LabelMeiaHoraDepois.setVisible(false);
        BContinuarMeiaHoraDepois.setVisible(false);
        LabelOlhandoParaORadio.setVisible(true);
        BContinuarOlhandoParaORadio.setVisible(true);
    }//GEN-LAST:event_BContinuarMeiaHoraDepoisActionPerformed

    private void BContinuarOlhandoParaORadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarOlhandoParaORadioActionPerformed
        BContinuarOlhandoParaORadio.setVisible(false);
        LabelOlhandoParaORadio.setVisible(false);
        LabelAtenderouDesligar.setVisible(true);
        BAtenderRadio.setVisible(true);
        BDesligarRadio.setVisible(true);
    }//GEN-LAST:event_BContinuarOlhandoParaORadioActionPerformed

    private void BContinuarDesligouORadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarDesligouORadioActionPerformed
        BContinuarDesligouORadio.setVisible(false);
        LabelDesligarRadio.setVisible(false); //VER AQUI SE TA CERTO
        if(!TextoPoema.equals("")){
            LabelFimSemAjudaPoema.setVisible(true);
            BVoltarParaMenu.setVisible(true);
        }
        else{
            LabelFimAjudaNoPoema.setVisible(true);
            BVoltarParaMenu.setVisible(true);
        }
    }//GEN-LAST:event_BContinuarDesligouORadioActionPerformed

    private void BContinuarAtenderRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarAtenderRadioActionPerformed
        LabelAtenderRadio.setVisible(false);
        BContinuarAtenderRadio.setVisible(false);
        LabelPreSucidio.setVisible(true);
        BContinuarPreSucicidio.setVisible(true);
    }//GEN-LAST:event_BContinuarAtenderRadioActionPerformed

    private void BContinuarPreSucicidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarPreSucicidioActionPerformed
       LabelPreSucidio.setVisible(false);
        BContinuarPreSucicidio.setVisible(false);
        LabelFimSuicido.setVisible(true);
        BVoltarParaMenu.setVisible(true);
        
    }//GEN-LAST:event_BContinuarPreSucicidioActionPerformed

    private void BPrimeiroNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPrimeiroNaoActionPerformed
        LabelPrimeiroNao.setVisible(false);
        B1PerguntaSim.setVisible(false);
        B1PerguntaNao.setVisible(false);
        LabelSegundoNao.setVisible(true);
        BContinuarSegundoNao.setVisible(true);
    }//GEN-LAST:event_BPrimeiroNaoActionPerformed

    private void BContinuarSegundoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarSegundoNaoActionPerformed
       LabelSegundoNao.setVisible(false);
        BContinuarSegundoNao.setVisible(false);
        LabelFarolSemTempestade.setVisible(true);
        BContinuarFarolSemTempestade.setVisible(true);
    }//GEN-LAST:event_BContinuarSegundoNaoActionPerformed

    private void BContinuarFarolSemTempestadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarFarolSemTempestadeActionPerformed
        LabelFarolSemTempestade.setVisible(false);
        BContinuarFarolSemTempestade.setVisible(false);
        LabelFarolTempestade.setVisible(true);
        BContinuarFarolTempestade.setVisible(true);
    }//GEN-LAST:event_BContinuarFarolSemTempestadeActionPerformed

    private void BContinuarFarolTempestadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarFarolTempestadeActionPerformed
       LabelFarolTempestade.setVisible(false);
        BContinuarFarolTempestade.setVisible(false);
        DormirOuFicarAcordado.setVisible(true);
        BDormir.setVisible(true);
        BFicarAcordado.setVisible(true);
        
    }//GEN-LAST:event_BContinuarFarolTempestadeActionPerformed

    private void BDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDormirActionPerformed
        BDormir.setVisible(false);
        BFicarAcordado.setVisible(false);
        LabelDormiu.setVisible(true);
        BContinuarDormiu.setVisible(true);
        
    }//GEN-LAST:event_BDormirActionPerformed

    private void BContinuarDormiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarDormiuActionPerformed
        LabelDormiu.setVisible(false);
        BContinuarDormiu.setVisible(false);
        LabelChegandoNaVila.setVisible(true);
        BContinuarChegandoNaVila.setVisible(true);
    }//GEN-LAST:event_BContinuarDormiuActionPerformed

    private void BContinuarChegandoNaVilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarChegandoNaVilaActionPerformed
        LabelChegandoNaVila.setVisible(false);
        BContinuarChegandoNaVila.setVisible(false);
        LabelPerguntarOuAbrir.setVisible(true);
        BPerguntarOQueAconteceu.setVisible(true);
        BAbrirCaminho.setVisible(true);
    }//GEN-LAST:event_BContinuarChegandoNaVilaActionPerformed

    private void BPerguntarOQueAconteceuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPerguntarOQueAconteceuActionPerformed
        LabelPerguntarOuAbrir.setVisible(false);
        BPerguntarOQueAconteceu.setVisible(false);
        BAbrirCaminho.setVisible(false);
        LabelOqueEstaAcontecendoAqui.setVisible(true);
        BAbrirCaminho.setVisible(true);
    }//GEN-LAST:event_BPerguntarOQueAconteceuActionPerformed

    private void BAbrirCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAbrirCaminhoActionPerformed
        LabelOqueEstaAcontecendoAqui.setVisible(false);
        BAbrirCaminho.setVisible(false);
        LabelFimSemLenha1.setVisible(true);
        BVoltarParaMenu.setVisible(true);
    }//GEN-LAST:event_BAbrirCaminhoActionPerformed

    private void BFicarAcordadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFicarAcordadoActionPerformed
        BFicarAcordado.setVisible(false);
        DormirOuFicarAcordado.setVisible(false);
        LabelFicarAcordado.setVisible(true);
        BFicarNoFarol.setVisible(true);
        BProcurarPessoas.setVisible(true);
        
    }//GEN-LAST:event_BFicarAcordadoActionPerformed

    private void BFicarNoFarolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFicarNoFarolActionPerformed
       LabelFicarAcordado.setVisible(false);
        BFicarNoFarol.setVisible(false);
        BProcurarPessoas.setVisible(false);
        LabelFicarFarolAteAmanhecer.setVisible(true);
        BPerguntarOQueAconteceu.setVisible(true);
        BAbrirCaminho.setVisible(true);
    }//GEN-LAST:event_BFicarNoFarolActionPerformed

    private void LabelOqueEstaAcontecendoAquiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LabelOqueEstaAcontecendoAquiAncestorAdded
       LabelFicarFarolAteAmanhecer.setVisible(false);
        BPerguntarOQueAconteceu.setVisible(false);
        BAbrirCaminho.setVisible(false);
        LabelOqueEstaAcontecendoAqui.setVisible(true);
        BAbrirCaminho.setVisible(true);
    }//GEN-LAST:event_LabelOqueEstaAcontecendoAquiAncestorAdded

    private void BAbrirCaminhoOqueEstaAcontecendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAbrirCaminhoOqueEstaAcontecendoActionPerformed
        LabelOqueEstaAcontecendoAqui.setVisible(false);
        BAbrirCaminho.setVisible(false);
        LabelFimSemLenha2.setVisible(true);
        BVoltarParaMenu.setVisible(true);
    }//GEN-LAST:event_BAbrirCaminhoOqueEstaAcontecendoActionPerformed

    private void BProcurarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProcurarPessoasActionPerformed
        BProcurarPessoas.setVisible(false);
        LabelFicarFarolAteAmanhecer.setVisible(false);
        LabelSaindoDoFarol.setVisible(true);
        BContinuarSaindoDoFarol.setVisible(true);
    }//GEN-LAST:event_BProcurarPessoasActionPerformed

    private void BContinuarSaindoDoFarolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarSaindoDoFarolActionPerformed
       LabelSaindoDoFarol.setVisible(false);
        BContinuarSaindoDoFarol.setVisible(false);
        LabelEntrandoNaCasa.setVisible(true);
        BContinuarEntrandoNaCasa.setVisible(true);
    }//GEN-LAST:event_BContinuarSaindoDoFarolActionPerformed

    private void BContinuarEntrandoNaCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarEntrandoNaCasaActionPerformed
        LabelEntrandoNaCasa.setVisible(false);
        BContinuarEntrandoNaCasa.setVisible(false);
        LabelPerguntarACrianca.setVisible(true);
        BContinuarPerguntarCrianca.setVisible(true);
    }//GEN-LAST:event_BContinuarEntrandoNaCasaActionPerformed

    private void BContinuarPerguntarCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarPerguntarCriancaActionPerformed
       LabelPerguntarACrianca.setVisible(false);
        BContinuarPerguntarCrianca.setVisible(false);
        LabelBuscarAjudaOuEsquentar.setVisible(true);
        BBuscarAjuda.setVisible(true);
        BTentarEsquentala.setVisible(true);
        
    }//GEN-LAST:event_BContinuarPerguntarCriancaActionPerformed

    private void BTentarEsquentalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTentarEsquentalaActionPerformed
        LabelBuscarAjudaOuEsquentar.setVisible(false);
        BBuscarAjuda.setVisible(false);
        BTentarEsquentala.setVisible(false);
        LabelFimSemLenha4.setVisible(true);
        BVoltarParaMenu.setVisible(true);
    }//GEN-LAST:event_BTentarEsquentalaActionPerformed

    private void BBuscarAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarAjudaActionPerformed
        LabelBuscarAjudaOuEsquentar.setVisible(false);
        BBuscarAjuda.setVisible(false);
        BTentarEsquentala.setVisible(false);
        LabelFimSemLenha3.setVisible(true);
        BVoltarParaMenu.setVisible(true);
    }//GEN-LAST:event_BBuscarAjudaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1PerguntaNao;
    private javax.swing.JButton B1PerguntaSim;
    private javax.swing.JButton B2Paragrafo;
    private javax.swing.JButton BAbrirCaminho;
    private javax.swing.JButton BAbrirCaminhoOqueEstaAcontecendo;
    private javax.swing.JButton BAtenderRadio;
    private javax.swing.JButton BBuscarAjuda;
    private javax.swing.JButton BContinuar1Paragrafo;
    private javax.swing.JButton BContinuar2Paragrafo;
    private javax.swing.JButton BContinuarAnuncioDePecas;
    private javax.swing.JButton BContinuarAnuncioDePecas2;
    private javax.swing.JButton BContinuarAtenderRadio;
    private javax.swing.JButton BContinuarChegandoNaVila;
    private javax.swing.JButton BContinuarChegouNoVilarejo;
    private javax.swing.JButton BContinuarDePeNoLocal;
    private javax.swing.JButton BContinuarDesligouORadio;
    private javax.swing.JButton BContinuarDormiu;
    private javax.swing.JButton BContinuarEntediadoDescansarColuna;
    private javax.swing.JButton BContinuarEnterrar;
    private javax.swing.JButton BContinuarEntrandoNaCasa;
    private javax.swing.JButton BContinuarFalarAVerdade;
    private javax.swing.JButton BContinuarFarolEraOnde;
    private javax.swing.JButton BContinuarFarolSemTempestade;
    private javax.swing.JButton BContinuarFarolTempestade;
    private javax.swing.JButton BContinuarIgnorar;
    private javax.swing.JButton BContinuarMeiaHoraDepois;
    private javax.swing.JButton BContinuarMentir;
    private javax.swing.JButton BContinuarMorteCoelho;
    private javax.swing.JButton BContinuarNemMesmoNoFarol;
    private javax.swing.JButton BContinuarOlhandoParaORadio;
    private javax.swing.JButton BContinuarOutrosParagrafos;
    private javax.swing.JButton BContinuarPerguntarCrianca;
    private javax.swing.JButton BContinuarPoemaTemp;
    private javax.swing.JButton BContinuarPreSucicidio;
    private javax.swing.JButton BContinuarPronunciarse;
    private javax.swing.JButton BContinuarRepetiaVariosOutros;
    private javax.swing.JButton BContinuarSaindoDoFarol;
    private javax.swing.JButton BContinuarSegundoNao;
    private javax.swing.JButton BContinuarTentandoFugir;
    private javax.swing.JButton BContinuarTremAtropela;
    private javax.swing.JButton BDesligarRadio;
    private javax.swing.JButton BDormir;
    private javax.swing.JButton BEnterrarCoelho;
    private javax.swing.JButton BEscreverPoema;
    private javax.swing.JButton BFalarAVerdade;
    private javax.swing.JButton BFecharCaderno;
    private javax.swing.JButton BFicarAcordado;
    private javax.swing.JButton BFicarNoFarol;
    private javax.swing.JButton BMentir;
    private javax.swing.JButton BPerguntarOQueAconteceu;
    private javax.swing.JButton BPrimeiroNao;
    private javax.swing.JButton BProcurarPessoas;
    private javax.swing.JButton BRepetiaVariosOutrosDias2;
    private javax.swing.JButton BSalvarTexto;
    private javax.swing.JButton BSimPrimeiro;
    private javax.swing.JButton BTentarEsquentala;
    private javax.swing.JButton BVoltarParaMenu;
    private javax.swing.JButton BVoltarParaTrem;
    private javax.swing.JLabel DormirOuFicarAcordado;
    private javax.swing.JLabel Label1Paragrafo;
    private javax.swing.JLabel Label1Pergunta;
    private javax.swing.JLabel Label2Paragrafo;
    private javax.swing.JLabel Label34Paragrafo;
    private javax.swing.JLabel LabelAnunciodePecas;
    private javax.swing.JLabel LabelAtenderRadio;
    private javax.swing.JLabel LabelAtenderouDesligar;
    private javax.swing.JLabel LabelBuscarAjudaOuEsquentar;
    private javax.swing.JLabel LabelChegandoNaVila;
    private javax.swing.JLabel LabelChegounoVilarejo;
    private javax.swing.JLabel LabelDePeNoLocal;
    private javax.swing.JLabel LabelDescansaColuna;
    private javax.swing.JLabel LabelDesligarRadio;
    private javax.swing.JLabel LabelDormiu;
    private javax.swing.JLabel LabelEnterraouVoltar;
    private javax.swing.JLabel LabelEnterrar;
    private javax.swing.JLabel LabelEntrandoNaCasa;
    private javax.swing.JLabel LabelEscreverPoema;
    private javax.swing.JLabel LabelFalarAVerdade;
    private javax.swing.JLabel LabelFarolSemTempestade;
    private javax.swing.JLabel LabelFarolTempestade;
    private javax.swing.JLabel LabelFarolTempestadeNoite;
    private javax.swing.JLabel LabelFicarAcordado;
    private javax.swing.JLabel LabelFicarFarolAteAmanhecer;
    private javax.swing.JLabel LabelFimAjudaNoPoema;
    private javax.swing.JLabel LabelFimSemAjudaPoema;
    private javax.swing.JLabel LabelFimSemLenha1;
    private javax.swing.JLabel LabelFimSemLenha2;
    private javax.swing.JLabel LabelFimSemLenha3;
    private javax.swing.JLabel LabelFimSemLenha4;
    private javax.swing.JLabel LabelFimSuicido;
    private javax.swing.JLabel LabelIgnorar;
    private javax.swing.JLabel LabelMeiaHoraDepois;
    private javax.swing.JLabel LabelMentir;
    private javax.swing.JLabel LabelMentirOuFalarAVerdade;
    private javax.swing.JLabel LabelMorteDoCoelho;
    private javax.swing.JLabel LabelNaoEnterrar;
    private javax.swing.JLabel LabelNemMesmoNoFarol;
    private javax.swing.JLabel LabelOFarolEraOnde;
    private javax.swing.JLabel LabelOlhandoParaORadio;
    private javax.swing.JLabel LabelOqueEstaAcontecendoAqui;
    private javax.swing.JLabel LabelPerguntarACrianca;
    private javax.swing.JLabel LabelPerguntarOuAbrir;
    private javax.swing.JLabel LabelPoemaTempestade;
    private javax.swing.JLabel LabelPreSucidio;
    private javax.swing.JLabel LabelPrimeiroNao;
    private javax.swing.JLabel LabelPronunciarSe;
    private javax.swing.JLabel LabelRepetiaSeVariosOutrosDias;
    private javax.swing.JLabel LabelSaindoDoFarol;
    private javax.swing.JLabel LabelSegundoNao;
    private javax.swing.JLabel LabelTentandoFugirDaRealidade;
    private javax.swing.JLabel LabelTremAtropelaCoelho;
    private javax.swing.JTextArea TextoPoema;
    // End of variables declaration//GEN-END:variables

    
}
