/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author yannis.hofmann
 */
public class Leaderboard extends javax.swing.JFrame {

    /**
     * Creates new form Leaderboard
     */
    public Leaderboard() {
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

        jLabel1 = new javax.swing.JLabel();
        Platz1 = new javax.swing.JTextField();
        Punktzahl1 = new javax.swing.JTextField();
        Platz2 = new javax.swing.JTextField();
        Punktzahl2 = new javax.swing.JTextField();
        Platz3 = new javax.swing.JTextField();
        Punktzahl3 = new javax.swing.JTextField();
        Platz4 = new javax.swing.JTextField();
        Punktzahl4 = new javax.swing.JTextField();
        Platz5 = new javax.swing.JTextField();
        Punktzahl5 = new javax.swing.JTextField();
        GesamtPunktzahl = new javax.swing.JTextField();
        Gesamtkapital = new javax.swing.JLabel();
        JLPlatz1 = new javax.swing.JLabel();
        JLPlatz2 = new javax.swing.JLabel();
        JLPlatz3 = new javax.swing.JLabel();
        JLPlatz4 = new javax.swing.JLabel();
        JLPlatz5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setText("Leaderboard");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Platz1.setEditable(false);
        Platz1.setToolTipText("");
        Platz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Platz1ActionPerformed(evt);
            }
        });

        Punktzahl1.setEditable(false);
        Punktzahl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punktzahl1ActionPerformed(evt);
            }
        });

        Platz2.setEditable(false);
        Platz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Platz2ActionPerformed(evt);
            }
        });

        Punktzahl2.setEditable(false);
        Punktzahl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punktzahl2ActionPerformed(evt);
            }
        });

        Platz3.setEditable(false);
        Platz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Platz3ActionPerformed(evt);
            }
        });

        Punktzahl3.setEditable(false);
        Punktzahl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punktzahl3ActionPerformed(evt);
            }
        });

        Platz4.setEditable(false);
        Platz4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Platz4ActionPerformed(evt);
            }
        });

        Punktzahl4.setEditable(false);
        Punktzahl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punktzahl4ActionPerformed(evt);
            }
        });

        Platz5.setEditable(false);
        Platz5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Platz5ActionPerformed(evt);
            }
        });

        Punktzahl5.setEditable(false);
        Punktzahl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punktzahl5ActionPerformed(evt);
            }
        });

        GesamtPunktzahl.setEditable(false);
        GesamtPunktzahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GesamtPunktzahlActionPerformed(evt);
            }
        });

        Gesamtkapital.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Gesamtkapital.setText("Gesamtkapital");

        JLPlatz1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        JLPlatz1.setText("Platz 1");

        JLPlatz2.setText("Platz 2");

        JLPlatz3.setText("Platz 3");

        JLPlatz4.setText("Platz 4");

        JLPlatz5.setText("Platz 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLPlatz2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLPlatz3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLPlatz4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLPlatz5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(GesamtPunktzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Platz4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(Punktzahl4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Platz5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(Punktzahl5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Platz3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Platz2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Punktzahl2)
                                    .addComponent(Punktzahl3))))
                        .addGap(139, 139, 139))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Gesamtkapital)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Punktzahl1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(JLPlatz1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(Platz1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(JLPlatz1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Platz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Punktzahl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Platz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punktzahl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPlatz2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Platz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punktzahl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPlatz3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Platz4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punktzahl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPlatz4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Platz5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punktzahl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPlatz5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(Gesamtkapital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GesamtPunktzahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Platz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Platz1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Platz1ActionPerformed

    private void Punktzahl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punktzahl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Punktzahl1ActionPerformed

    private void Platz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Platz2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Platz2ActionPerformed

    private void Punktzahl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punktzahl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Punktzahl2ActionPerformed

    private void Platz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Platz3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Platz3ActionPerformed

    private void Punktzahl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punktzahl3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Punktzahl3ActionPerformed

    private void Platz4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Platz4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Platz4ActionPerformed

    private void Punktzahl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punktzahl4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Punktzahl4ActionPerformed

    private void Platz5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Platz5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Platz5ActionPerformed

    private void Punktzahl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punktzahl5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Punktzahl5ActionPerformed

    private void GesamtPunktzahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GesamtPunktzahlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GesamtPunktzahlActionPerformed

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
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leaderboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GesamtPunktzahl;
    private javax.swing.JLabel Gesamtkapital;
    private javax.swing.JLabel JLPlatz1;
    private javax.swing.JLabel JLPlatz2;
    private javax.swing.JLabel JLPlatz3;
    private javax.swing.JLabel JLPlatz4;
    private javax.swing.JLabel JLPlatz5;
    private javax.swing.JTextField Platz1;
    private javax.swing.JTextField Platz2;
    private javax.swing.JTextField Platz3;
    private javax.swing.JTextField Platz4;
    private javax.swing.JTextField Platz5;
    private javax.swing.JTextField Punktzahl1;
    private javax.swing.JTextField Punktzahl2;
    private javax.swing.JTextField Punktzahl3;
    private javax.swing.JTextField Punktzahl4;
    private javax.swing.JTextField Punktzahl5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
