
public class Question2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Question2
     */
    public Question2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Joption3 = new javax.swing.JRadioButton();
        Joption2 = new javax.swing.JRadioButton();
        Joption4 = new javax.swing.JRadioButton();
        Joption1 = new javax.swing.JRadioButton();
        Jsubmit = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("One Gigabyte is approximately equal is:");

        Joption3.setBackground(new java.awt.Color(51, 255, 51));
        Joption3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption3.setForeground(new java.awt.Color(255, 0, 0));
        Joption3.setText("1000,000,000,000 bytes");

        Joption2.setBackground(new java.awt.Color(51, 255, 51));
        Joption2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption2.setForeground(new java.awt.Color(255, 0, 0));
        Joption2.setText("1000,000,000 bytes");
        Joption2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Joption2MouseClicked(evt);
            }
        });

        Joption4.setBackground(new java.awt.Color(51, 255, 51));
        Joption4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption4.setForeground(new java.awt.Color(255, 0, 0));
        Joption4.setText("None of these");

        Joption1.setBackground(new java.awt.Color(51, 255, 51));
        Joption1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption1.setForeground(new java.awt.Color(255, 0, 0));
        Joption1.setText("1000,000 bytes");
        Joption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Joption1ActionPerformed(evt);
            }
        });

        Jsubmit.setText("Submit");
        Jsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96))))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Joption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Joption1ActionPerformed
        
    }//GEN-LAST:event_Joption1ActionPerformed

    private void Joption2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Joption2MouseClicked
                        
    }//GEN-LAST:event_Joption2MouseClicked

    private void JsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsubmitActionPerformed
       
        if(Joption2.isSelected() )
                       {
                           QuestionSet.marks ++;
                           if(Joption1.isSelected() || Joption3.isSelected()|| Joption4.isSelected()) 
                                   {
                                       QuestionSet.marks--;
                                   }
                       }
        else if(Joption1.isSelected() || Joption3.isSelected() || Joption4.isSelected() )
        {
            QuestionSet.count++;
        }
        
                else
                    QuestionSet.unanswered ++;
        
        System.out.println(QuestionSet.count);
                System.out.println(QuestionSet.marks);
                        System.out.println(QuestionSet.unanswered);
                        
        if(Jsubmit.getActionCommand().equals("Submit")) 
        {
            setVisible(false);
            
        }
    }//GEN-LAST:event_JsubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Joption1;
    private javax.swing.JRadioButton Joption2;
    private javax.swing.JRadioButton Joption3;
    private javax.swing.JRadioButton Joption4;
    private javax.swing.JButton Jsubmit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
