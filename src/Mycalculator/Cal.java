/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mycalculator;

/**
 *
 * @author KIIT
 */
public class Cal extends javax.swing.JFrame {

        double firstnum;
        double secondnum;
        double result;
        String operation;
        
        
    
    public Cal() {
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

        jDisplay = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        JBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        JBtnzero = new javax.swing.JButton();
        JBtnpoint = new javax.swing.JButton();
        jBtnplus = new javax.swing.JButton();
        JBtnminus = new javax.swing.JButton();
        jBtndivide = new javax.swing.JButton();
        jBtnmulti = new javax.swing.JButton();
        jBtnclear = new javax.swing.JButton();
        jBtnresult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDisplay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        JBtn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JBtn7.setText("7");
        JBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        JBtnzero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JBtnzero.setText("0");
        JBtnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnzeroActionPerformed(evt);
            }
        });

        JBtnpoint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JBtnpoint.setText(".");
        JBtnpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnpointActionPerformed(evt);
            }
        });

        jBtnplus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnplus.setText("+");
        jBtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnplusActionPerformed(evt);
            }
        });

        JBtnminus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JBtnminus.setText("-");
        JBtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnminusActionPerformed(evt);
            }
        });

        jBtndivide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtndivide.setText("/");
        jBtndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtndivideActionPerformed(evt);
            }
        });

        jBtnmulti.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnmulti.setText("*");
        jBtnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnmultiActionPerformed(evt);
            }
        });

        jBtnclear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnclear.setText("Clear");
        jBtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnclearActionPerformed(evt);
            }
        });

        jBtnresult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnresult.setText("Result");
        jBtnresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnresultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBtnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBtnminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBtnzero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBtnpoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtndivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnplus, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jBtnmulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jBtnresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBtnzero, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jBtnplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBtnpoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBtnminus, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jBtndivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnmulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnclear, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jBtnresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisplayActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
    String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn1.getText();
            jDisplay.setText(Enternumber);
                    
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
             String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn2.getText();
            jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
             String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn3.getText();
            jDisplay.setText(Enternumber); 
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn4.getText();
            jDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn5.getText();
            jDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn6.getText();
            jDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void JBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn7ActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + JBtn7.getText();
            jDisplay.setText(Enternumber); // TODO add your handling code here:
    }//GEN-LAST:event_JBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn8.getText();
            jDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn9.getText();
            jDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void JBtnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnzeroActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + JBtnzero.getText();
            jDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_JBtnzeroActionPerformed

    private void jBtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnclearActionPerformed
            
            jDisplay.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnclearActionPerformed

    private void jBtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnplusActionPerformed
            firstnum = Double.parseDouble(jDisplay.getText()); 
            jDisplay.setText("");
             operation= "+";// TODO add your handling code here:
    }//GEN-LAST:event_jBtnplusActionPerformed

    private void JBtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnminusActionPerformed
             firstnum = Double.parseDouble(jDisplay.getText()); 
            jDisplay.setText("");
             operation= "-";        // TODO add your handling code here:
    }//GEN-LAST:event_JBtnminusActionPerformed

    private void jBtndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtndivideActionPerformed
             firstnum = Double.parseDouble(jDisplay.getText()); 
            jDisplay.setText("");
             operation= "/";        // TODO add your handling code here:
    }//GEN-LAST:event_jBtndivideActionPerformed

    private void jBtnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnmultiActionPerformed
         firstnum = Double.parseDouble(jDisplay.getText()); 
            jDisplay.setText("");
             operation= "*";        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnmultiActionPerformed

    private void JBtnpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnpointActionPerformed
            String Enternumber;   
            Enternumber =   jDisplay.getText() + jBtn1.getText();
            jDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_JBtnpointActionPerformed

    private void jBtnresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnresultActionPerformed
            String answer;
            secondnum=Double.parseDouble(jDisplay.getText());
            
            if(operation =="+")
            {
                result=firstnum + secondnum;
                answer=String.format("%.0f", result);
                jDisplay.setText(answer);    
            }
            else if(operation =="-")
            {
                result=firstnum - secondnum;
                answer=String.format("%.0f", result);
                jDisplay.setText(answer);    
            }
            else if(operation =="*")
            {
                result=firstnum * secondnum;
                answer=String.format("%.0f", result);
                jDisplay.setText(answer);    
            }
            else if(operation =="/")
            {
                result=firstnum / secondnum;
                answer=String.format("%.0f", result);
                jDisplay.setText(answer);    
            }
            
                
            
    }//GEN-LAST:event_jBtnresultActionPerformed

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
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtn7;
    private javax.swing.JButton JBtnminus;
    private javax.swing.JButton JBtnpoint;
    private javax.swing.JButton JBtnzero;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnclear;
    private javax.swing.JButton jBtndivide;
    private javax.swing.JButton jBtnmulti;
    private javax.swing.JButton jBtnplus;
    private javax.swing.JButton jBtnresult;
    private javax.swing.JTextField jDisplay;
    // End of variables declaration//GEN-END:variables
}