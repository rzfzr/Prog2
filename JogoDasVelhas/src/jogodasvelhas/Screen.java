/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodasvelhas;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import jogodasvelhas.JogoDasVelhas;
/**
 *
 * @author rzfzr
 */
public class Screen extends javax.swing.JFrame {

    JogoDasVelhas jogo;
    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
        jogo = new JogoDasVelhas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        TextName1 = new javax.swing.JTextField();
        TextName2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TextSimb1 = new javax.swing.JTextField();
        TextSimb2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        c11 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c31 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c32 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c33 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelSimb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Jogador 1");

        jLabel2.setText("Jogador 2");

        jLabel3.setText("Simbolo 1");

        jLabel4.setText("Simbolo 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextName2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(TextName1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextSimb2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextSimb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSimb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(TextName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSimb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Criar", jPanel1);

        c11.setText(" ");
        c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ActionPerformed(evt);
            }
        });

        c21.setText(" ");
        c21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c21ActionPerformed(evt);
            }
        });

        c31.setText(" ");
        c31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c31ActionPerformed(evt);
            }
        });

        c12.setText(" ");
        c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12ActionPerformed(evt);
            }
        });

        c22.setText(" ");
        c22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c22ActionPerformed(evt);
            }
        });

        c32.setText(" ");
        c32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c32ActionPerformed(evt);
            }
        });

        c13.setText(" ");
        c13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c13ActionPerformed(evt);
            }
        });

        c23.setText(" ");
        c23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c23ActionPerformed(evt);
            }
        });

        c33.setText(" ");
        c33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c33ActionPerformed(evt);
            }
        });

        jLabel5.setText("Proximo Jogador :");

        LabelNome.setText("Nome");

        LabelSimb.setText("Simbolo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelSimb))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c11)
                            .addComponent(c21)
                            .addComponent(c31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c12)
                            .addComponent(c22)
                            .addComponent(c32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c13)
                            .addComponent(c23)
                            .addComponent(c33))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LabelNome)
                    .addComponent(LabelSimb))
                .addGap(114, 114, 114)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(c13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(c11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(c12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c32)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jogar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String nome1 ;
    String simb1 ;               
    String nome2;
    String simb2 ;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        nome1 = TextName1.getText();
        simb1 = TextSimb1.getText();
                
        nome2 = TextName2.getText();
        simb2 = TextSimb2.getText();
        
        LabelNome.setText(nome1);
        LabelSimb.setText(simb1);
        
        jogo.IniciarJogo(nome1,simb1,nome2,simb2);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11ActionPerformed
        c11.setText(LabelSimb.getText());        
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }
        
        c11.setEnabled(false);
        
    }//GEN-LAST:event_c11ActionPerformed

    private void c31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c31ActionPerformed
           c31.setText(LabelSimb.getText());         
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());       
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }     // TODO add your handling code here:
        c31.setEnabled(false);
    }//GEN-LAST:event_c31ActionPerformed

    private void c21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c21ActionPerformed
        c21.setText(LabelSimb.getText());           
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());     
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }        // TODO add your handling code here:
        c21.setEnabled(false);
    }//GEN-LAST:event_c21ActionPerformed

    private void c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12ActionPerformed
        c12.setText(LabelSimb.getText());         
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());       
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }        // TODO add your handling code here:
        c12.setEnabled(false);
    }//GEN-LAST:event_c12ActionPerformed

    private void c22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c22ActionPerformed
        c22.setText(LabelSimb.getText());          
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());      
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }        // TODO add your handling code here:
        c22.setEnabled(false);
    }//GEN-LAST:event_c22ActionPerformed

    private void c32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c32ActionPerformed
        c32.setText(LabelSimb.getText());           
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());     
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }        // TODO add your handling code here:
        c32.setEnabled(false);
    }//GEN-LAST:event_c32ActionPerformed

    private void c13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c13ActionPerformed
        c13.setText(LabelSimb.getText());         
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());       
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }        // TODO add your handling code here:
        c13.setEnabled(false);
    }//GEN-LAST:event_c13ActionPerformed

    private void c23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c23ActionPerformed
        c23.setText(LabelSimb.getText());            
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());    
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }        // TODO add your handling code here:
        c23.setEnabled(false);
    }//GEN-LAST:event_c23ActionPerformed

    private void c33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c33ActionPerformed
        c33.setText(LabelSimb.getText());          
        jogo.Jogada(c11.getText(), c12.getText(), c13.getText(),
                    c21.getText(), c22.getText(), c23.getText(),
                    c31.getText(), c32.getText(), c33.getText(),
                        LabelNome.getText());      
        if(LabelNome.getText()==nome1){ //se for igual a 1
            LabelNome.setText(nome2);  //setar 2
            LabelSimb.setText(simb2);
        }else{
            LabelNome.setText(nome1);
            LabelSimb.setText(simb1);            
        }        // TODO add your handling code here:
        c33.setEnabled(false);
    }//GEN-LAST:event_c33ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }
    
    
    public static void Ganhou(String n){
        JOptionPane.showMessageDialog(null, n+" Ganhou");
    }
        public static void Velha(){
        JOptionPane.showMessageDialog(null,"Velha");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSimb;
    private javax.swing.JTextField TextName1;
    private javax.swing.JTextField TextName2;
    private javax.swing.JTextField TextSimb1;
    private javax.swing.JTextField TextSimb2;
    private javax.swing.JButton c11;
    private javax.swing.JButton c12;
    private javax.swing.JButton c13;
    private javax.swing.JButton c21;
    private javax.swing.JButton c22;
    private javax.swing.JButton c23;
    private javax.swing.JButton c31;
    private javax.swing.JButton c32;
    private javax.swing.JButton c33;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}