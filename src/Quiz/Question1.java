
import java.awt.Color;


public class Question1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Question1
     */
    public Question1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Joption1 = new javax.swing.JRadioButton();
        Joption2 = new javax.swing.JRadioButton();
        Joption3 = new javax.swing.JRadioButton();
        Joption4 = new javax.swing.JRadioButton();
        Jsubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 51, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Which supercomputer is developed by the Indian Scientists?");

        Joption1.setBackground(new java.awt.Color(51, 255, 0));
        Joption1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Joption1.setForeground(new java.awt.Color(255, 0, 51));
        Joption1.setText("Param");
        Joption1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Joption1MouseClicked(evt);
            }
        });
        Joption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Joption1ActionPerformed(evt);
            }
        });

        Joption2.setBackground(new java.awt.Color(51, 255, 0));
        Joption2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Joption2.setForeground(new java.awt.Color(255, 0, 51));
        Joption2.setText("Super 301");

        Joption3.setBackground(new java.awt.Color(51, 255, 0));
        Joption3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Joption3.setForeground(new java.awt.Color(255, 0, 51));
        Joption3.setText("Compaq Presario");

        Joption4.setBackground(new java.awt.Color(51, 255, 0));
        Joption4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Joption4.setForeground(new java.awt.Color(255, 0, 51));
        Joption4.setText("CRAY YMP");

        Jsubmit.setText("Submit");
        Jsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JsubmitMouseClicked(evt);
            }
        });
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
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 115, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Joption1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Joption1MouseClicked
        
        
    }//GEN-LAST:event_Joption1MouseClicked

    private void JsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsubmitActionPerformed
           
        if(Joption1.isSelected() )
                       {
                           QuestionSet.marks ++;
                           if(Joption2.isSelected() || Joption3.isSelected()|| Joption4.isSelected()) 
                                   {
                                       QuestionSet.marks--;
                                   }
                       }
        else if(Joption2.isSelected() || Joption3.isSelected()|| Joption4.isSelected() )
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

    private void JsubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JsubmitMouseClicked
        
    }//GEN-LAST:event_JsubmitMouseClicked

    private void Joption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Joption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Joption1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Joption1;
    private javax.swing.JRadioButton Joption2;
    private javax.swing.JRadioButton Joption3;
    private javax.swing.JRadioButton Joption4;
    private javax.swing.JButton Jsubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
