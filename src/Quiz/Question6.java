/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Question6 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Question6
     */
    public Question6() {
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
        Joption1 = new javax.swing.JRadioButton();
        Joption3 = new javax.swing.JRadioButton();
        Joption2 = new javax.swing.JRadioButton();
        Joption4 = new javax.swing.JRadioButton();
        Jsubmit = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("What do you use to create a chart?");

        Joption1.setBackground(new java.awt.Color(102, 255, 102));
        Joption1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption1.setForeground(new java.awt.Color(255, 0, 51));
        Joption1.setText("Pie Wizard");

        Joption3.setBackground(new java.awt.Color(102, 255, 102));
        Joption3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption3.setForeground(new java.awt.Color(255, 0, 51));
        Joption3.setText("Data Wizard");

        Joption2.setBackground(new java.awt.Color(102, 255, 102));
        Joption2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption2.setForeground(new java.awt.Color(255, 0, 51));
        Joption2.setText("Excel Wizard");

        Joption4.setBackground(new java.awt.Color(102, 255, 102));
        Joption4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption4.setForeground(new java.awt.Color(255, 0, 51));
        Joption4.setText("Chart Wizard");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(131, 131, 131)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Joption4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(Joption3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsubmitActionPerformed
if(Joption4.isSelected() )
                       {
                           QuestionSet.marks ++;
                           if(Joption2.isSelected() || Joption3.isSelected()|| Joption1.isSelected()) 
                                   {
                                       QuestionSet.marks--;
                                   }
                       }
        else if(Joption2.isSelected() || Joption3.isSelected()|| Joption1.isSelected() )
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
        }// TODO add your handling code here:
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