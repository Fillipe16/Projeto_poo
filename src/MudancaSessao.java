
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JButton;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fillipe
 */
public class MudancaSessao extends javax.swing.JFrame {

    /**
     * Creates new form MudancaSessao
     */
    ArrayList<Sessao> sessoes=new ArrayList();
    ArrayList<String> filmes=new ArrayList();
    public void recebendo(ArrayList<Sessao> s,ArrayList<String> f){
        this.filmes=f;
        this.sessoes=s;
    }
    public MudancaSessao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProximaSala = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jProximoHorario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcodigoAtual = new javax.swing.JTextField();
        jtrocaricon = new javax.swing.JLabel();
        jTrocar = new javax.swing.JButton();
        jcancelaicon = new javax.swing.JLabel();
        jCancela = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jbackground = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 241, 239));
        jLabel1.setText("Sessão Atual:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(162, 149, 110, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 241, 239));
        jLabel5.setText("Próxima Sessão:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 290, 134, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 241, 239));
        jLabel6.setText("Sala:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 320, 41, 30);

        jProximaSala.setBackground(new java.awt.Color(37, 116, 169));
        jProximaSala.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jProximaSala.setForeground(new java.awt.Color(242, 241, 239));
        jProximaSala.setOpaque(false);
        jProximaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProximaSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jProximaSala);
        jProximaSala.setBounds(207, 321, 89, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 241, 239));
        jLabel7.setText("Horário:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(324, 318, 64, 30);

        jProximoHorario.setBackground(new java.awt.Color(37, 116, 169));
        jProximoHorario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jProximoHorario.setForeground(new java.awt.Color(242, 241, 239));
        jProximoHorario.setOpaque(false);
        getContentPane().add(jProximoHorario);
        jProximoHorario.setBounds(392, 321, 86, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 241, 239));
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(162, 176, 62, 30);

        jcodigoAtual.setBackground(new java.awt.Color(37, 116, 169));
        jcodigoAtual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcodigoAtual.setForeground(new java.awt.Color(242, 241, 239));
        jcodigoAtual.setOpaque(false);
        getContentPane().add(jcodigoAtual);
        jcodigoAtual.setBounds(228, 179, 250, 30);

        jtrocaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mudar.png"))); // NOI18N
        getContentPane().add(jtrocaricon);
        jtrocaricon.setBounds(510, 410, 40, 70);

        jTrocar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTrocar.setForeground(new java.awt.Color(242, 241, 239));
        jTrocar.setText("Trocar");
        jTrocar.setBorderPainted(false);
        jTrocar.setContentAreaFilled(false);
        jTrocar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrocarActionPerformed(evt);
            }
        });
        getContentPane().add(jTrocar);
        jTrocar.setBounds(530, 430, 85, 33);

        jcancelaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair.png"))); // NOI18N
        getContentPane().add(jcancelaicon);
        jcancelaicon.setBounds(20, 410, 50, 70);

        jCancela.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCancela.setForeground(new java.awt.Color(242, 241, 239));
        jCancela.setText("Cancelar");
        jCancela.setBorderPainted(false);
        jCancela.setContentAreaFilled(false);
        jCancela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelaActionPerformed(evt);
            }
        });
        getContentPane().add(jCancela);
        jCancela.setBounds(40, 430, 105, 33);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 241, 239));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B. N. - Mudar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 10, 640, 58);

        jSeparator1.setBackground(new java.awt.Color(242, 241, 239));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(180, 70, 280, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(80, 140, 470, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(80, 220, 470, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(80, 280, 470, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(80, 360, 470, 10);

        jbackground.setForeground(new java.awt.Color(242, 241, 239));
        jbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background 4.png"))); // NOI18N
        getContentPane().add(jbackground);
        jbackground.setBounds(0, 0, 640, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrocarActionPerformed
        // TODO add your handling code here:
        SessaoDAO Sbanco=new SessaoDAO();
        IngressoDAO Ibanco=new IngressoDAO();
        
        Sessao sessaoAnterior=new Sessao();
        
        String codigoAntigo=jcodigoAtual.getText();
        
        String nomeCadAntigo=codigoAntigo.substring(0, codigoAntigo.length()-9);
        System.out.println("Nome:"+nomeCadAntigo);
        String salaAntiga=codigoAntigo.substring(codigoAntigo.length()-9,codigoAntigo.length()-8);
        
        String horarioAntigo=codigoAntigo.substring(codigoAntigo.length()-8,codigoAntigo.length()-6) + ":" + codigoAntigo.substring(codigoAntigo.length()-6,codigoAntigo.length()-4);
        System.out.println("");
        for(int i=0;i<sessoes.size();i++){
            if(sessoes.get(i).getSala().equals(salaAntiga) && sessoes.get(i).getHorario().equals(horarioAntigo)){
                System.out.println("ENTORU");
                sessaoAnterior=sessoes.get(i);
            }
        }
        Sessao sessaoProx=new Sessao();
        for(int i=0;i<sessoes.size();i++){
            if(sessoes.get(i).getSala().equals(jProximaSala.getText()) && sessoes.get(i).getHorario().equals(jProximoHorario.getText())){
                sessaoProx=sessoes.get(i);
            }
        }
        if(sessaoAnterior.getSala().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Existe algum erro no codigo digitado");
        }else{
           Ibanco.deleteI(codigoAntigo);
           String cadeiraCompeta = "cad"+nomeCadAntigo;
           System.out.println("CADEIRACOMPLETA:"+cadeiraCompeta);
           char ultimoDigitodaCad;
           if(nomeCadAntigo.length()>1){
               ultimoDigitodaCad=nomeCadAntigo.charAt(1);
           }else{
               ultimoDigitodaCad=nomeCadAntigo.charAt(0);
           }
           Cadeira c=new Cadeira();
           String cads=Sbanco.verC(salaAntiga, horarioAntigo);
           int tamanho=cads.length();
           int indexfim=0;
           for(int i=0;i<cads.length();i++){
               
               if(cads.charAt(i)==ultimoDigitodaCad && (cads.charAt(i+1)==',' || cads.charAt(i+1)==',')){
                   indexfim=i;
               }
           }
           String sessaoS="";
           for(int i=0;i<filmes.size();i++){
               if(filmes.get(i).contains(jProximoHorario.getText())){
                   sessaoS=filmes.get(i);
               }
           }
            System.out.println("Sessao sTRING:"+sessaoS);
           if(nomeCadAntigo.length()>1){
               cads=cads.substring(0, indexfim-4)+cads.substring(indexfim+3, tamanho);
           }else{
               cads=cads.substring(0, indexfim-3)+cads.substring(indexfim+3, tamanho);
           }
            System.out.println("CADS:"+cads);
            Sbanco.analisarCadeira(cads, salaAntiga, horarioAntigo);
            Comprar inputDados=new Comprar();
            JButton confirmar=inputDados.getConfirmar();
            String proxHorario=jProximoHorario.getText();
            String proxSala=jProximaSala.getText();
            inputDados.recebendo(sessoes,sessaoS, proxHorario, proxSala, sessaoProx);
            inputDados.setVisible(true);
        }
        MudancaSessao.this.dispose();
        
    }//GEN-LAST:event_jTrocarActionPerformed

    private void jCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_jCancelaActionPerformed

    private void jProximaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProximaSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProximaSalaActionPerformed

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
            java.util.logging.Logger.getLogger(MudancaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MudancaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MudancaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MudancaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MudancaSessao m = new MudancaSessao();
                m.setVisible(true);
                m.setSize(640, 480);
                m.setResizable(false);
                m.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jProximaSala;
    private javax.swing.JTextField jProximoHorario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jTrocar;
    private javax.swing.JLabel jbackground;
    private javax.swing.JLabel jcancelaicon;
    private javax.swing.JTextField jcodigoAtual;
    private javax.swing.JLabel jtrocaricon;
    // End of variables declaration//GEN-END:variables
}
