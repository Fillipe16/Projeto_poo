package BilheteriaNacional.JFrames;


import BilheteriaNacional.Beans.Sessao;
import BilheteriaNacional.DAO.SessaoDAO;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Tela_Inicial extends javax.swing.JFrame {
    ArrayList<Sessao> sessoes=new ArrayList();
    ArrayList<String> filmes=new ArrayList();
    ArrayList<String> dias=new ArrayList();
    
    Comprar comprar;
    
    String salae="";
    String horarioe="";
    
    Sessao se;
    public JButton getComprar(){
        return jcompra;
    }
    public ArrayList initCadeiras(){
        SessaoDAO SBanco=new SessaoDAO();
        for(int k=0;k<dias.size();k++){
            for(int i=0;i<filmes.size();i++){
                int contador=0;
                String sala="";
                String hr="";

                for(int j=0;j<filmes.get(i).length();j++){
                    char c=filmes.get(i).charAt(j);
                    if(c=='|'){
                        contador++;
                    }
                    if(contador==1 && Character.isDigit(c)){
                        sala+=c;
                    }
                    if(contador==2 && Character.isDigit(c) ||(c==':' && Character.isDigit(filmes.get(i).charAt(j+1)))){
                        hr+=c;
                    }
                }
                Sessao s=new Sessao(sala,hr,dias.get(k));
                s.init(s);
                SBanco.adicionar(s);
                sessoes.add(s);
            }
            
        }
        return sessoes;
    }
    
    public void initFilmes(){
        filmes.add("Filme: A | Sala: 1 | Horário: 14:20");
        filmes.add("Filme: B | Sala: 1 | Horário: 16:30");
        filmes.add("Filme: C | Sala: 2 | Horário: 13:00");
        
        dias.add("29/12");
        dias.add("30/12");
        
        jdias.addItem(dias.get(0));
        jdias.addItem(dias.get(1));
        
    }
    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
        initComponents();
        initFilmes();
        initCadeiras();
        jlist.setListData(filmes.toArray());     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jcompraricon = new javax.swing.JLabel();
        jcompra = new javax.swing.JButton();
        jvalidacaoicon = new javax.swing.JLabel();
        jvalidacao = new javax.swing.JButton();
        jmudaricon = new javax.swing.JLabel();
        jmudar = new javax.swing.JButton();
        jreembolsoicon = new javax.swing.JLabel();
        jreembolso = new javax.swing.JButton();
        jsairicon = new javax.swing.JLabel();
        jsair = new javax.swing.JButton();
        jlabeltitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist = new javax.swing.JList();
        jdias = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbackground = new javax.swing.JLabel();
        jvalidacaoicon1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jcompraricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/comprar.png"))); // NOI18N
        getContentPane().add(jcompraricon);
        jcompraricon.setBounds(400, 150, 40, 50);

        jcompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jcompra.setForeground(new java.awt.Color(242, 241, 239));
        jcompra.setText("Comprar");
        jcompra.setBorderPainted(false);
        jcompra.setContentAreaFilled(false);
        jcompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcompraActionPerformed(evt);
            }
        });
        getContentPane().add(jcompra);
        jcompra.setBounds(420, 160, 200, 30);

        jvalidacaoicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/validar.png"))); // NOI18N
        jvalidacaoicon.setToolTipText("");
        getContentPane().add(jvalidacaoicon);
        jvalidacaoicon.setBounds(400, 190, 40, 50);

        jvalidacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jvalidacao.setForeground(new java.awt.Color(242, 241, 239));
        jvalidacao.setText("Validar Ingresso");
        jvalidacao.setBorderPainted(false);
        jvalidacao.setContentAreaFilled(false);
        jvalidacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jvalidacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jvalidacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvalidacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jvalidacao);
        jvalidacao.setBounds(420, 200, 200, 30);

        jmudaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/mudar.png"))); // NOI18N
        getContentPane().add(jmudaricon);
        jmudaricon.setBounds(400, 230, 40, 50);

        jmudar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmudar.setForeground(new java.awt.Color(242, 241, 239));
        jmudar.setText("Mudar sessão");
        jmudar.setBorderPainted(false);
        jmudar.setContentAreaFilled(false);
        jmudar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmudar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jmudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmudarActionPerformed(evt);
            }
        });
        getContentPane().add(jmudar);
        jmudar.setBounds(420, 240, 200, 30);

        jreembolsoicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/reembolso.png"))); // NOI18N
        getContentPane().add(jreembolsoicon);
        jreembolsoicon.setBounds(400, 270, 30, 50);

        jreembolso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jreembolso.setForeground(new java.awt.Color(242, 241, 239));
        jreembolso.setText("Reembolso");
        jreembolso.setBorderPainted(false);
        jreembolso.setContentAreaFilled(false);
        jreembolso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jreembolso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jreembolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreembolsoActionPerformed(evt);
            }
        });
        getContentPane().add(jreembolso);
        jreembolso.setBounds(420, 280, 200, 30);

        jsairicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/sair.png"))); // NOI18N
        getContentPane().add(jsairicon);
        jsairicon.setBounds(400, 310, 40, 50);

        jsair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jsair.setForeground(new java.awt.Color(242, 241, 239));
        jsair.setText("Sair");
        jsair.setBorderPainted(false);
        jsair.setContentAreaFilled(false);
        jsair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsairActionPerformed(evt);
            }
        });
        getContentPane().add(jsair);
        jsair.setBounds(420, 320, 200, 30);

        jlabeltitulo.setFont(new java.awt.Font("Dialog", 1, 45)); // NOI18N
        jlabeltitulo.setForeground(new java.awt.Color(242, 241, 239));
        jlabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabeltitulo.setText(" Bilheteria Nacional");
        getContentPane().add(jlabeltitulo);
        jlabeltitulo.setBounds(0, 10, 640, 50);

        jlist.setBackground(new java.awt.Color(37, 116, 169));
        jlist.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlist.setForeground(new java.awt.Color(242, 241, 239));
        jScrollPane1.setViewportView(jlist);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 290, 310);

        jdias.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jdias.setOpaque(false);
        jdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdiasActionPerformed(evt);
            }
        });
        getContentPane().add(jdias);
        jdias.setBounds(10, 130, 100, 25);

        jSeparator2.setBackground(new java.awt.Color(242, 241, 239));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(360, 160, 10, 310);

        jSeparator3.setBackground(new java.awt.Color(242, 241, 239));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(130, 60, 400, 10);

        jbackground.setBackground(new java.awt.Color(255, 255, 255));
        jbackground.setForeground(new java.awt.Color(255, 255, 255));
        jbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/background 4.png"))); // NOI18N
        getContentPane().add(jbackground);
        jbackground.setBounds(0, 0, 640, 480);

        jvalidacaoicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/validar.png"))); // NOI18N
        jvalidacaoicon1.setToolTipText("");
        getContentPane().add(jvalidacaoicon1);
        jvalidacaoicon1.setBounds(400, 190, 40, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcompraActionPerformed
        // TODO add your handling code here:
        Object aux=jlist.getSelectedValue();
        if(aux==null){
            JOptionPane.showMessageDialog(rootPane, "Sessão não selecionada!");
        }else{
            salae=Sessao.dados(aux.toString()).get(0);
            horarioe=Sessao.dados(aux.toString()).get(1);
            for(int i=0;i<sessoes.size();i++){
                if(sessoes.get(i).getSala().equals(salae) && sessoes.get(i).getHorario().equals(horarioe)){
                    se=sessoes.get(i);
                }
            }

            comprar=new Comprar();
            comprar.setVisible(true);
            comprar.atualizarQuantidadeCadLivres(27);
            comprar.atualizarComprar(sessoes,aux.toString(),horarioe,salae,se,jdias.getSelectedItem().toString());
        }

    }//GEN-LAST:event_jcompraActionPerformed

    private void jdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdiasActionPerformed

    private void jsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsairActionPerformed
        JOptionPane.showMessageDialog(null, "Volte sempre!");
        dispose();
    }//GEN-LAST:event_jsairActionPerformed

    private void jvalidacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvalidacaoActionPerformed
        // TODO add your handling code here:
        ValidarIngresso VI=new ValidarIngresso();
        VI.setVisible(true);
    }//GEN-LAST:event_jvalidacaoActionPerformed

    private void jreembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jreembolsoActionPerformed
        // TODO add your handling code here:
        Reembolso r=new Reembolso();
        r.setVisible(true);
        r.recebendo(sessoes);
    }//GEN-LAST:event_jreembolsoActionPerformed

    private void jmudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmudarActionPerformed
        // TODO add your handling code here:
        MudancaSessao MS=new MudancaSessao();
        MS.setVisible(true);
        MS.recebendo(sessoes,filmes);
    }//GEN-LAST:event_jmudarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tela_Inicial t = new Tela_Inicial();
                t.setVisible(true);
                t.setSize(640, 480);
                t.setResizable(false);
                t.setLocationRelativeTo(null);
            }
        });
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jbackground;
    private javax.swing.JButton jcompra;
    private javax.swing.JLabel jcompraricon;
    private javax.swing.JComboBox jdias;
    private javax.swing.JLabel jlabeltitulo;
    private javax.swing.JList jlist;
    private javax.swing.JButton jmudar;
    private javax.swing.JLabel jmudaricon;
    private javax.swing.JButton jreembolso;
    private javax.swing.JLabel jreembolsoicon;
    private javax.swing.JButton jsair;
    private javax.swing.JLabel jsairicon;
    private javax.swing.JButton jvalidacao;
    private javax.swing.JLabel jvalidacaoicon;
    private javax.swing.JLabel jvalidacaoicon1;
    // End of variables declaration//GEN-END:variables
}
