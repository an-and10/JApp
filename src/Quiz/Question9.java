/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Question9 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Question9
     */
    public Question9() {
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
        Joption4 = new javax.swing.JRadioButton();
        Joption2 = new javax.swing.JRadioButton();
        Jsubmit = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Find out the odd one:");

        Joption1.setBackground(new java.awt.Color(153, 255, 153));
        Joption1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption1.setForeground(new java.awt.Color(204, 0, 51));
        Joption1.setText("Internet");

        Joption3.setBackground(new java.awt.Color(153, 255, 153));
        Joption3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption3.setForeground(new java.awt.Color(204, 0, 51));
        Joption3.setText("Linux");

        Joption4.setBackground(new java.awt.Color(153, 255, 153));
        Joption4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption4.setForeground(new java.awt.Color(204, 0, 51));
        Joption4.setText("Unix");

        Joption2.setBackground(new java.awt.Color(153, 255, 153));
        Joption2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption2.setForeground(new java.awt.Color(204, 0, 51));
        Joption2.setText("Windows");

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
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Joption1;
    private javax.swing.JRadioButton Joption2;
    private javax.swing.JRadioButton Joption3;
    private javax.swing.JRadioButton Joption4;
    private javax.swing.JButton Jsubmit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
