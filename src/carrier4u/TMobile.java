package carrier4u;
import javax.swing.ButtonGroup;


public class TMobile extends javax.swing.JFrame {

    private void tmobileDataGroup(){
        ButtonGroup tmobileData = new ButtonGroup();
        tmobileData.add(gb1);
        tmobileData.add(gb3);
        tmobileData.add(gb5);
        tmobileData.add(gbUnlimit);
    }
    
    private void tmobileLineGroup(){
        ButtonGroup tmobileLine = new ButtonGroup();
        tmobileLine.add(line2);
        tmobileLine.add(line3);
        tmobileLine.add(line4);
        tmobileLine.add(line5);
        tmobileLine.add(line6);
        
    }
    
    private void tmobileFamDataGroup(){
        ButtonGroup tmobileFamData = new ButtonGroup();
        tmobileFamData.add(data2);
        tmobileFamData.add(data4);
        tmobileFamData.add(data5);
        tmobileFamData.add(dataUnlimit);
    }

    public TMobile() {
        initComponents();
        tmobileDataGroup();
        tmobileLineGroup();
        tmobileFamDataGroup();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gb1 = new javax.swing.JRadioButton();
        gbUnlimit = new javax.swing.JRadioButton();
        gb3 = new javax.swing.JRadioButton();
        gb5 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        line2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        line3 = new javax.swing.JRadioButton();
        line5 = new javax.swing.JRadioButton();
        line4 = new javax.swing.JRadioButton();
        line6 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        data2 = new javax.swing.JRadioButton();
        data4 = new javax.swing.JRadioButton();
        dataUnlimit = new javax.swing.JRadioButton();
        data5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("T-Mobile Individual Plan");

        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Minutes:");

        jLabel3.setText("Total Text Messages:");

        jRadioButton1.setText("Unlimited");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Unlimited");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("$50");

        jLabel5.setText("Total LTE Data:");

        gb1.setText("1GB $50");
        gb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb1ActionPerformed(evt);
            }
        });

        gbUnlimit.setText("Unlimited $80");
        gbUnlimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbUnlimitActionPerformed(evt);
            }
        });

        gb3.setText("3GB $60");
        gb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb3ActionPerformed(evt);
            }
        });

        gb5.setText("5GB $70");
        gb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb5ActionPerformed(evt);
            }
        });

        jLabel6.setText("T-Mobile Family Plan");

        jLabel7.setText("Total Minutes:");

        jRadioButton7.setText("Unlimited");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel8.setText("Total Text Messages:");

        jRadioButton8.setText("Unlimited");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        line2.setText("2 Lines $80");
        line2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Total Lines:");

        line3.setText("3 Lines $90");
        line3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line3ActionPerformed(evt);
            }
        });

        line5.setText("5 Lines $110");
        line5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line5ActionPerformed(evt);
            }
        });

        line4.setText("4 Lines $100");
        line4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line4ActionPerformed(evt);
            }
        });

        line6.setText("6 Lines $120");
        line6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Total LTE Data:");

        data2.setText("2.5GB Included");
        data2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data2ActionPerformed(evt);
            }
        });

        data4.setText("4.5GB $10 Per Line");
        data4.setActionCommand("4.5GB $10 per line");
        data4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data4ActionPerformed(evt);
            }
        });

        dataUnlimit.setText("Unlimited $30 Per Line");
        dataUnlimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataUnlimitActionPerformed(evt);
            }
        });

        data5.setText("5GB $20 Per Line");
        data5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gb1)
                                    .addComponent(gb5))
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gb3)
                                    .addComponent(jRadioButton2)
                                    .addComponent(gbUnlimit))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(11, 11, 11))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(line4)
                                    .addComponent(line2)
                                    .addComponent(line6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(line5)
                                    .addComponent(line3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(data5)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(data2))
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(data4)
                                    .addComponent(dataUnlimit))))))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gb1)
                    .addComponent(gb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gbUnlimit)
                    .addComponent(gb5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jRadioButton7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(line2)
                        .addComponent(line3))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(line5)
                    .addComponent(line4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(line6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data4)
                    .addComponent(data2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataUnlimit)
                    .addComponent(data5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
        AllCarrier s = new AllCarrier();
        s.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void gb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gb1ActionPerformed

    private void gbUnlimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbUnlimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbUnlimitActionPerformed

    private void gb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gb3ActionPerformed

    private void gb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gb5ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void line2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line2ActionPerformed

    private void line3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line3ActionPerformed

    private void line5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line5ActionPerformed

    private void line4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line4ActionPerformed

    private void line6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line6ActionPerformed

    private void data2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data2ActionPerformed

    private void dataUnlimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataUnlimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataUnlimitActionPerformed

    private void data4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data4ActionPerformed

    private void data5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data5ActionPerformed

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
            java.util.logging.Logger.getLogger(TMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMobile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton data2;
    private javax.swing.JRadioButton data4;
    private javax.swing.JRadioButton data5;
    private javax.swing.JRadioButton dataUnlimit;
    private javax.swing.JRadioButton gb1;
    private javax.swing.JRadioButton gb3;
    private javax.swing.JRadioButton gb5;
    private javax.swing.JRadioButton gbUnlimit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton line2;
    private javax.swing.JRadioButton line3;
    private javax.swing.JRadioButton line4;
    private javax.swing.JRadioButton line5;
    private javax.swing.JRadioButton line6;
    // End of variables declaration//GEN-END:variables
}
