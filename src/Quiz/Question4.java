/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Question4 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Question4
     */
    public Question4() {
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
        Joption2 = new javax.swing.JRadioButton();
        Joption3 = new javax.swing.JRadioButton();
        Joption4 = new javax.swing.JRadioButton();
        Jsubmit = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText(" Which of the following is not an example of Operating System?");

        Joption1.setBackground(new java.awt.Color(102, 255, 102));
        Joption1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption1.setForeground(new java.awt.Color(255, 0, 51));
        Joption1.setText("Windows 98");

        Joption2.setBackground(new java.awt.Color(102, 255, 102));
        Joption2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption2.setForeground(new java.awt.Color(255, 0, 51));
        Joption2.setText("BSD Unix");

        Joption3.setBackground(new java.awt.Color(102, 255, 102));
        Joption3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption3.setForeground(new java.awt.Color(255, 0, 51));
        Joption3.setText("Microsoft Office Xp");
        Joption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Joption3ActionPerformed(evt);
            }
        });

        Joption4.setBackground(new java.awt.Color(102, 255, 102));
        Joption4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Joption4.setForeground(new java.awt.Color(255, 0, 51));
        Joption4.setText("Red Hat Linus");

        Jsubmit.setBackground(new java.awt.Color(51, 204, 0));
        Jsubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Jsubmit.setForeground(new java.awt.Color(255, 0, 51));
        Jsubmit.setText("Submit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Joption3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Joption4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Joption2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Joption1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Joption1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joption3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Joption2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Joption4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(Jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Joption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Joption3ActionPerformed
       if(Joption3.isSelected() )
                       {
                           QuestionSet.marks ++;
                           if(Joption1.isSelected() || Joption2.isSelected()|| Joption4.isSelected()) 
                                   {
                                       QuestionSet.marks--;
                                   }
                       }
        else if(Joption1.isSelected() || Joption2.isSelected()|| Joption4.isSelected() )
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
    }//GEN-LAST:event_Joption3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Joption1;
    private javax.swing.JRadioButton Joption2;
    private javax.swing.JRadioButton Joption3;
    private javax.swing.JRadioButton Joption4;
    private javax.swing.JButton Jsubmit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
