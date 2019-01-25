/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.maincontrol;
import java.util.Arrays;


/**
 *
 * @author hannah.claus
 */
public class AnmeldeFenster extends javax.swing.JFrame {
 private maincontrol c;
    /**
     * Creates new form NewJFrame
     */
    public AnmeldeFenster() {
        initComponents();
    }

       public AnmeldeFenster(maincontrol mc) {
        this.c = mc;
        
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

        StockOverflowAnmeldung = new javax.swing.JLabel();
        AnmeldenBenutzernameEingeben = new javax.swing.JTextPane();
        AnmeldenBenutzername = new javax.swing.JLabel();
        AnmeldenPasswort = new javax.swing.JLabel();
        PasswortEingeben = new javax.swing.JPasswordField();
        AnmeldenAnmelden = new javax.swing.JButton();
        AnmeldenAbbrechen = new javax.swing.JButton();
        AnmeldenRegistrieren = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StockOverflowAnmeldung.setFont(new java.awt.Font("Penultimate", 1, 36)); // NOI18N
        StockOverflowAnmeldung.setText("StockOverflow");

        AnmeldenBenutzernameEingeben.setFont(new java.awt.Font("Penultimate", 0, 11)); // NOI18N

        AnmeldenBenutzername.setFont(new java.awt.Font("Penultimate", 0, 11)); // NOI18N
        AnmeldenBenutzername.setText("Benutzername");

        AnmeldenPasswort.setFont(new java.awt.Font("Penultimate", 0, 11)); // NOI18N
        AnmeldenPasswort.setText("Passwort");

        PasswortEingeben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswortEingebenActionPerformed(evt);
            }
        });

        AnmeldenAnmelden.setFont(new java.awt.Font("Penultimate", 0, 14)); // NOI18N
        AnmeldenAnmelden.setText("Anmelden");
        AnmeldenAnmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnmeldenActionPerformed(evt);
            }
        });

        AnmeldenAbbrechen.setFont(new java.awt.Font("Penultimate", 0, 14)); // NOI18N
        AnmeldenAbbrechen.setText("Abbrechen");
        AnmeldenAbbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnmeldenAbbrechenActionPerformed(evt);
            }
        });

        AnmeldenRegistrieren.setFont(new java.awt.Font("Penultimate", 0, 14)); // NOI18N
        AnmeldenRegistrieren.setText("Registrieren");
        AnmeldenRegistrieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnmeldenRegistrierenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnmeldenPasswort)
                            .addComponent(AnmeldenBenutzername)
                            .addComponent(StockOverflowAnmeldung)
                            .addComponent(PasswortEingeben, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnmeldenBenutzernameEingeben, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AnmeldenAbbrechen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnmeldenAnmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnmeldenRegistrieren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StockOverflowAnmeldung)
                .addGap(20, 20, 20)
                .addComponent(AnmeldenBenutzername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnmeldenBenutzernameEingeben, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(AnmeldenPasswort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswortEingeben, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(AnmeldenAnmelden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnmeldenRegistrieren, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnmeldenAbbrechen)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnmeldenAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnmeldenAbbrechenActionPerformed
       this.c.switchTo("StockOverflowGUI");
    }//GEN-LAST:event_AnmeldenAbbrechenActionPerformed

    private void AnmeldenAnmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnmeldenAnmeldenActionPerformed
        this.c.switchTo("EigenesDepot");
    }//GEN-LAST:event_AnmeldenAnmeldenActionPerformed

    private void AnmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnmeldenActionPerformed
        this.c.login(this.AnmeldenBenutzernameEingeben.getText(), new String(this.PasswortEingeben.getPassword()));
       
       
    }//GEN-LAST:event_AnmeldenActionPerformed

    private void PasswortEingebenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswortEingebenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswortEingebenActionPerformed

    private void AnmeldenRegistrierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnmeldenRegistrierenActionPerformed
        this.c.switchTo("RegistrierFenster");
    }//GEN-LAST:event_AnmeldenRegistrierenActionPerformed

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
            java.util.logging.Logger.getLogger(AnmeldeFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnmeldeFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnmeldeFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnmeldeFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnmeldeFenster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnmeldenAbbrechen;
    private javax.swing.JButton AnmeldenAnmelden;
    private javax.swing.JLabel AnmeldenBenutzername;
    private javax.swing.JTextPane AnmeldenBenutzernameEingeben;
    private javax.swing.JLabel AnmeldenPasswort;
    private javax.swing.JButton AnmeldenRegistrieren;
    private javax.swing.JPasswordField PasswortEingeben;
    private javax.swing.JLabel StockOverflowAnmeldung;
    // End of variables declaration//GEN-END:variables
}
