/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_System1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.Timer;


/**
 *
 * @author KIIT
 */
public class food_System extends javax.swing.JFrame {

        double firstnum;
        double secondnum;
        double result;
        String operation;
         double delivery_cost=17.40;
      
       double a[]={ '0','0','0','0'};
        
        
         double costofvegsandwich=20.00;
         double costofvegmaggi=30.00;
         double costofvegmachurian=40.00;
         double costoficecream=10.00;
        
    public food_System() {
        initComponents();
        showdate();
        showtime();
    }
    void showdate(){
        Date d=new Date();
        SimpleDateFormat s= new SimpleDateFormat("yyyy:MM:dd");
        JDate2.setText(s.format(d));
        
    }
    void showtime(){
        new Timer(0,new ActionListener()
        {
                @Override
                public void actionPerformed(ActionEvent a){
        
                Date d=new Date();
                 SimpleDateFormat s= new SimpleDateFormat("hh:mm:ss a");
                     JTime2.setText(s.format(d));
                }
    }).start();
                }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBtn21 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JDate2 = new javax.swing.JLabel();
        JTime2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Jcustomername = new javax.swing.JTextField();
        Jphonenumber = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Jpaymentmode = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        JQvegmaggi = new javax.swing.JTextField();
        JPvegmaggi = new javax.swing.JTextField();
        Jpvegsandwich = new javax.swing.JTextField();
        JQvegsandwich = new javax.swing.JTextField();
        JQvegmachurian = new javax.swing.JTextField();
        Jpvegmachurian = new javax.swing.JTextField();
        JQicecream = new javax.swing.JTextField();
        Jpicecream = new javax.swing.JTextField();
        JQdrinks = new javax.swing.JTextField();
        Jpiceccream = new javax.swing.JTextField();
        Jphonedelivery = new javax.swing.JTextField();
        Jptax = new javax.swing.JTextField();
        Jptotal = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Jbtn1 = new javax.swing.JButton();
        Jbtn2 = new javax.swing.JButton();
        Jbtn3 = new javax.swing.JButton();
        Jbtn4 = new javax.swing.JButton();
        Jbtn5 = new javax.swing.JButton();
        JBtn6 = new javax.swing.JButton();
        Jbtn7 = new javax.swing.JButton();
        Jbtn8 = new javax.swing.JButton();
        Jbtn9 = new javax.swing.JButton();
        Jbtnzero = new javax.swing.JButton();
        Jbtnpoint = new javax.swing.JButton();
        Jbtnplus = new javax.swing.JButton();
        Jbtnminus = new javax.swing.JButton();
        Jbtnmulti = new javax.swing.JButton();
        Jbtndivide = new javax.swing.JButton();
        Jbtnclear = new javax.swing.JButton();
        Jbtnresult = new javax.swing.JButton();
        Jdisplay = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Jfinaltotal = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Jdate1 = new javax.swing.JLabel();
        Jtime1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jcostofdrink = new javax.swing.JTextField();
        Jcostofmeal = new javax.swing.JTextField();
        Jcostofdelivery = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Jvegmaggi = new javax.swing.JCheckBox();
        Jvegsandwich = new javax.swing.JCheckBox();
        Jvegmachurian = new javax.swing.JCheckBox();
        Jice_cream = new javax.swing.JCheckBox();
        Jmaggi = new javax.swing.JTextField();
        Jsandwich = new javax.swing.JTextField();
        Jmachurian = new javax.swing.JTextField();
        Jicecream = new javax.swing.JTextField();
        Jtax = new javax.swing.JCheckBox();
        JHomeDelivery = new javax.swing.JCheckBox();
        Jdrinks = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JCountry = new javax.swing.JComboBox<>();
        JAmounttext = new javax.swing.JTextField();
        Jconvert = new javax.swing.JButton();
        JDisplayText = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jsubtotal = new javax.swing.JTextField();
        Jsubtax = new javax.swing.JTextField();
        Jtotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Jname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Jphone = new javax.swing.JTextField();
        Jpayment = new javax.swing.JComboBox<>();

        JBtn21.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        JBtn21.setText("2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Welcome in  Food Billing System");

        jLabel12.setText("Customer Name : ");

        jLabel13.setText("Phone Number: ");

        JDate2.setText("Date :");

        JTime2.setText("Time :");

        jLabel16.setText("Payment Mode");

        jLabel18.setText("Veg Maggi");

        jLabel19.setText("Veg Sandwich");

        jLabel20.setText("Veg MAchurian");

        jLabel21.setText("Ice cream");

        jLabel22.setText("Drinks");

        jLabel23.setText("Home Delivery Charges");

        jLabel24.setText("Total Taxes");

        jLabel25.setText("Total Charges");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jpaymentmode, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(JQvegmachurian, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Jpvegmachurian, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JQicecream)
                                    .addComponent(JQdrinks))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jpicecream, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(Jpiceccream)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JQvegsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JQvegmaggi)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPvegmaggi, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(Jpvegsandwich)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jphonedelivery)
                            .addComponent(Jptax)
                            .addComponent(Jptotal, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(JDate2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTime2)
                .addGap(64, 64, 64))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Jcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Jphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(JDate2)
                    .addComponent(JTime2))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jpaymentmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(JQvegmaggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPvegmaggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Jpvegsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JQvegsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(JQvegmachurian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpvegmachurian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(JQicecream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpicecream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(JQdrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpiceccream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Jphonedelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Jptax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jptotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generate Receipt", jPanel8);

        Jbtn1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn1.setText("1");
        Jbtn1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn1ActionPerformed(evt);
            }
        });

        Jbtn2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn2.setText("2");
        Jbtn2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn2ActionPerformed(evt);
            }
        });

        Jbtn3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn3.setText("3");
        Jbtn3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn3ActionPerformed(evt);
            }
        });

        Jbtn4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn4.setText("4");
        Jbtn4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn4ActionPerformed(evt);
            }
        });

        Jbtn5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn5.setText("5");
        Jbtn5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn5ActionPerformed(evt);
            }
        });

        JBtn6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JBtn6.setText("6");
        JBtn6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        JBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn6ActionPerformed(evt);
            }
        });

        Jbtn7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn7.setText("7");
        Jbtn7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn7ActionPerformed(evt);
            }
        });

        Jbtn8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn8.setText("8");
        Jbtn8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn8ActionPerformed(evt);
            }
        });

        Jbtn9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtn9.setText("9");
        Jbtn9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn9ActionPerformed(evt);
            }
        });

        Jbtnzero.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtnzero.setText("0");
        Jbtnzero.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnzeroActionPerformed(evt);
            }
        });

        Jbtnpoint.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtnpoint.setText(".");
        Jbtnpoint.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtnpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnpointActionPerformed(evt);
            }
        });

        Jbtnplus.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtnplus.setText("+");
        Jbtnplus.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnplusActionPerformed(evt);
            }
        });

        Jbtnminus.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtnminus.setText("-");
        Jbtnminus.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnminusActionPerformed(evt);
            }
        });

        Jbtnmulti.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtnmulti.setText("*");
        Jbtnmulti.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnmultiActionPerformed(evt);
            }
        });

        Jbtndivide.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtndivide.setText("/");
        Jbtndivide.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtndivideActionPerformed(evt);
            }
        });

        Jbtnclear.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtnclear.setText("clear");
        Jbtnclear.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnclearActionPerformed(evt);
            }
        });

        Jbtnresult.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Jbtnresult.setText("=");
        Jbtnresult.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        Jbtnresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnresultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(Jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jbtnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(Jbtnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jbtnpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(Jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(Jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(Jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(Jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jbtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(Jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(Jbtnresult, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Jdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtnpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtnresult, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculator", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 204)));

        Jfinaltotal.setText("Total");
        Jfinaltotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JfinaltotalMouseClicked(evt);
            }
        });
        Jfinaltotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfinaltotalActionPerformed(evt);
            }
        });

        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Receipt");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Jfinaltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(Jdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(452, 452, 452)
                .addComponent(Jtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jfinaltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jdate1)
                    .addComponent(Jtime1))
                .addGap(30, 30, 30))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel3.setText("Cost of Drink");

        jLabel4.setText("Ciost of Meal");

        jLabel5.setText("Cost of Delivery");

        Jcostofmeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcostofmealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jcostofdrink)
                    .addComponent(Jcostofmeal)
                    .addComponent(Jcostofdelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcostofdrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcostofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcostofdelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel4.setForeground(new java.awt.Color(0, 255, 255));

        Jvegmaggi.setBackground(new java.awt.Color(255, 255, 0));
        Jvegmaggi.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        Jvegmaggi.setForeground(new java.awt.Color(255, 0, 0));
        Jvegmaggi.setText("Veg Maggi");
        Jvegmaggi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Jvegmaggi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JvegmaggiMouseClicked(evt);
            }
        });
        Jvegmaggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JvegmaggiActionPerformed(evt);
            }
        });

        Jvegsandwich.setBackground(new java.awt.Color(255, 255, 0));
        Jvegsandwich.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        Jvegsandwich.setForeground(new java.awt.Color(255, 0, 0));
        Jvegsandwich.setText("Veg Sandwich");
        Jvegsandwich.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Jvegsandwich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JvegsandwichMouseClicked(evt);
            }
        });
        Jvegsandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JvegsandwichActionPerformed(evt);
            }
        });

        Jvegmachurian.setBackground(new java.awt.Color(255, 255, 0));
        Jvegmachurian.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        Jvegmachurian.setForeground(new java.awt.Color(255, 0, 0));
        Jvegmachurian.setText("Veg Machurian");
        Jvegmachurian.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Jvegmachurian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JvegmachurianMouseClicked(evt);
            }
        });

        Jice_cream.setBackground(new java.awt.Color(255, 255, 0));
        Jice_cream.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        Jice_cream.setForeground(new java.awt.Color(255, 0, 0));
        Jice_cream.setText("Icecream");
        Jice_cream.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Jice_cream.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jice_creamMouseClicked(evt);
            }
        });
        Jice_cream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jice_creamActionPerformed(evt);
            }
        });

        Jmaggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmaggiActionPerformed(evt);
            }
        });

        Jmachurian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmachurianActionPerformed(evt);
            }
        });

        Jicecream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JicecreamActionPerformed(evt);
            }
        });

        Jtax.setText("Tax Included");
        Jtax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtaxMouseClicked(evt);
            }
        });
        Jtax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtaxActionPerformed(evt);
            }
        });

        JHomeDelivery.setText("Home Dilevery");
        JHomeDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JHomeDeliveryMouseClicked(evt);
            }
        });
        JHomeDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JHomeDeliveryActionPerformed(evt);
            }
        });

        Jdrinks.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Jdrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Drink", "Pepsi", "Mazza", "Sprite", "Frooti", " " }));
        Jdrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdrinksActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Drinks");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Jdrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Jvegmaggi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Jmaggi))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Jvegsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Jsandwich))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Jvegmachurian, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Jmachurian))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jice_cream, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jtax))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(JHomeDelivery)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Jicecream))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jvegmaggi)
                    .addComponent(Jmaggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jvegsandwich)
                    .addComponent(Jsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jvegmachurian)
                    .addComponent(Jmachurian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jice_cream)
                    .addComponent(Jicecream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jdrinks)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtax)
                    .addComponent(JHomeDelivery))
                .addGap(17, 17, 17))
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        JCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JCountry.setForeground(new java.awt.Color(255, 102, 102));
        JCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Country", "India", "Aurstilia", "Canada", "Srilanka", "England", " " }));
        JCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCountryActionPerformed(evt);
            }
        });

        JAmounttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAmounttextActionPerformed(evt);
            }
        });

        Jconvert.setText("Convert");
        Jconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JconvertActionPerformed(evt);
            }
        });

        JDisplayText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDisplayTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JDisplayText)
                    .addComponent(JCountry, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JAmounttext, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Jconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(JCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JAmounttext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(JDisplayText, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("Tax");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("Sub Total");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("Total");

        Jsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsubtotalActionPerformed(evt);
            }
        });

        Jsubtax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsubtaxActionPerformed(evt);
            }
        });

        Jtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Jsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jsubtax, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(Jsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jsubtax, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                                     Food Billing System");

        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel10.setForeground(new java.awt.Color(51, 0, 255));

        jLabel9.setText("Enter Name: ");

        jLabel10.setText("Enter Phone Number: ");

        Jpayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Payment Mode:", "By Cash", "By Debit card" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Jpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Jphone))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Jname)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(Jpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JconvertActionPerformed
                 double rupees= Double.parseDouble(JAmounttext.getText());
                double converted_value=1.5;
                if(JCountry.getSelectedItem().equals("India"))
                {
                    String Convert1=String.format("$ %.2f", rupees * converted_value);
                    JDisplayText.setText(Convert1);
                }
                else
                    JDisplayText.setText(""+rupees);
                    
    }//GEN-LAST:event_JconvertActionPerformed

    private void JCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCountryActionPerformed

    private void JdrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdrinksActionPerformed
            double price;
            if(Jdrinks.getSelectedItem().equals("Pepsi"))
                {
                  price=35.35;
                    Jcostofdrink.setText(""+price);
                }
            if(Jdrinks.getSelectedItem().equals("Mazza"))
                {
                  price=42.12;
                    Jcostofdrink.setText(""+price);
                }
            
            if(Jdrinks.getSelectedItem().equals("Frooti"))
                {
                  price=39.25;
                    Jcostofdrink.setText(""+price);
                }
                
            if(Jdrinks.getSelectedItem().equals("Sprite"))
                {
                  price=31.15;
                    Jcostofdrink.setText(""+price);
                }
            if(Jdrinks.getSelectedItem().equals("Select Drink"))
                {
                  
                    Jcostofdrink.setText("");
                }
    }//GEN-LAST:event_JdrinksActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void JHomeDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JHomeDeliveryMouseClicked
              
            if(JHomeDelivery.isSelected())
            {
                Jcostofdelivery.setText( " " +delivery_cost);
            }
            else
                Jcostofdelivery.setText(" ");
    }//GEN-LAST:event_JHomeDeliveryMouseClicked

    private void JHomeDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JHomeDeliveryActionPerformed
            
    }//GEN-LAST:event_JHomeDeliveryActionPerformed

    private void JtaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtaxMouseClicked
      double gst_tax=18;
       if(Jtax.isSelected())
            {   
                double value1 = Double.parseDouble(Jcostofdelivery.getText());
                 double value2 = Double.parseDouble(Jcostofdrink.getText());
                 double value3 = Double.parseDouble(Jcostofmeal.getText());
                value1=(double)value1*0.18;
                value2=(double)value2*0.18;
                value3=(double)value3*0.18;
                
                
                
                 double get_values1 = Double.parseDouble(Jcostofdelivery.getText());
                 double final_result1= (double)(get_values1+value1);
                 
                Jcostofdelivery.setText( " " +final_result1);
                
                 double get_values2 = Double.parseDouble(Jcostofdrink.getText());
                 int final_result2= (int)(get_values2+value2);
                 
                Jcostofdrink.setText( " " +final_result2);
                
                 
                
                
                 double get_values3 = Double.parseDouble(Jcostofmeal.getText());
                 int final_result3= (int)(get_values3+value3);
                 
                Jcostofmeal.setText( " " +final_result3);
                
                
                 
                
                
                
            }
       
            else
                Jcostofdelivery.setText(" ");
      
    }//GEN-LAST:event_JtaxMouseClicked

    private void JtaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtaxActionPerformed

    private void JvegmaggiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JvegmaggiMouseClicked
             double number=Double.parseDouble(Jmaggi.getText());
             //double  labelcostofmeal=Double.parseDouble(Jcostofmeal.getText());
             if(Jvegmaggi.isSelected())
             {     
                 
                  a[0]=(number*costofvegmaggi)    ;
                 String pmeal=String.format("%.2f",a[0]);
                 Jcostofmeal.setText(pmeal);
             }
            
            
             
    }//GEN-LAST:event_JvegmaggiMouseClicked

    private void JcostofmealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcostofmealActionPerformed
         
        Jcostofmeal.setText("Hello");
    }//GEN-LAST:event_JcostofmealActionPerformed

    private void JvegmaggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JvegmaggiActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_JvegmaggiActionPerformed

    private void JvegsandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JvegsandwichActionPerformed
                 double number=Double.parseDouble(Jsandwich.getText());
             double  labelcostofmeal=Double.parseDouble(Jcostofmeal.getText());
             if(Jvegmaggi.isSelected())
             {     
                 
                 a[1] =(number*costofvegsandwich) ;
                  double total1= labelcostofmeal+ a[1];
                 String pmeal=String.format("%.2f",total1);
                 Jcostofmeal.setText(pmeal);
             }   // TODO add your handling code here:
    }//GEN-LAST:event_JvegsandwichActionPerformed

    private void JvegsandwichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JvegsandwichMouseClicked
             
            
    }//GEN-LAST:event_JvegsandwichMouseClicked

    private void JmachurianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmachurianActionPerformed
                
    }//GEN-LAST:event_JmachurianActionPerformed

    private void JicecreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JicecreamActionPerformed
                     double number=Double.parseDouble(Jice_cream.getText());
             double  labelcostofmeal=Double.parseDouble(Jcostofmeal.getText());
             if(Jice_cream.isSelected())
             {     
                 
                 a[1] =(number*costofvegmachurian) ;
                  double total1= labelcostofmeal+ a[1] + a[0];
                 String pmeal=String.format("%.2f",total1);
                 Jcostofmeal.setText(pmeal);
             }         // TODO add your handling code here:
    }//GEN-LAST:event_JicecreamActionPerformed

    private void Jice_creamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jice_creamActionPerformed
                    // TODO add your handling code here:
    }//GEN-LAST:event_Jice_creamActionPerformed

    private void JvegmachurianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JvegmachurianMouseClicked
                     double number=Double.parseDouble(Jmachurian.getText());
             //double  labelcostofmeal=Double.parseDouble(Jcostofmeal.getText());
             if(Jvegmachurian.isSelected())
             {     
                 
                 a[2] =(number*costofvegmachurian) ;
                  double total1=  a[1] + a[0] + a[2];
                 String pmeal=String.format("%.2f",total1);
                 Jcostofmeal.setText(pmeal);
             }   // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_JvegmachurianMouseClicked

    private void Jice_creamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jice_creamMouseClicked
                 double number=Double.parseDouble(Jicecream.getText());
             //double  labelcostofmeal=Double.parseDouble(Jcostofmeal.getText());
             if(Jice_cream.isSelected())
             {     
                 
                 a[3] =(number*costoficecream) ;
                  double total1=  a[1] + a[0] + a[2] +a[3];
                 String pmeal=String.format("%.2f",total1);
                 Jcostofmeal.setText(pmeal);
             }   // TODO add your handling code here:            // TODO add your handling code here:
    }//GEN-LAST:event_Jice_creamMouseClicked

    private void JAmounttextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAmounttextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAmounttextActionPerformed

    private void JDisplayTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDisplayTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDisplayTextActionPerformed

    private void JsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsubtotalActionPerformed
                               
    }//GEN-LAST:event_JsubtotalActionPerformed

    private void JtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtotalActionPerformed

    private void JfinaltotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfinaltotalActionPerformed
                   
                    
    }//GEN-LAST:event_JfinaltotalActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            Jcustomername.setText(Jname.getText());
            Jphonenumber.setText(Jphone.getText());
           if(Jpayment.getSelectedItem().equals("By Cash"))
               Jpaymentmode.setText("By Cash");
           else
               Jpaymentmode.setText("By Debit Card");
           JQvegmaggi.setText(Jmaggi.getText());
           double price2= Double.parseDouble(Jmaggi.getText());
           price2 = price2 * costofvegmaggi;
           JPvegmaggi.setText( "" +price2);
           
           JQvegsandwich.setText(Jsandwich.getText());
           double price3= Double.parseDouble(Jsandwich.getText());
           price3 = price3 * costofvegsandwich;
           Jpvegsandwich.setText( "" +price3);
           
           JQvegmachurian.setText(Jmachurian.getText());
           double price4= Double.parseDouble(Jmachurian.getText());
           price4 = price4 * costofvegmachurian;
           Jpvegmachurian.setText( "" +price4);
           
           JQicecream.setText(Jicecream.getText());
           double price5= Double.parseDouble(Jicecream.getText());
           price5 = price5 * costoficecream;
           Jpvegmachurian.setText( "" +price5);
           
           
           
           Jphonedelivery.setText(Jcostofdelivery.getText());
           Jptax.setText(Jsubtax.getText());
           Jptotal.setText(Jtotal.getText());
           
           
            
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JsubtaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsubtaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JsubtaxActionPerformed

    private void JfinaltotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JfinaltotalMouseClicked
                 double total1;
                    total1=a[0]+a[1]+a[2]+a[3];
                    if(JHomeDelivery.isSelected())
                        total1 = total1+ delivery_cost;
             double price;
            if(Jdrinks.getSelectedItem().equals("Pepsi"))
                {
                  price=35.35;
                     total1 = total1+ price;
                }
            if(Jdrinks.getSelectedItem().equals("Mazza"))
                {
                  price=42.12;
                    total1 = total1+ price;
                }
            
            if(Jdrinks.getSelectedItem().equals("Frooti"))
                {
                  price=39.25;
                   total1 = total1+ price; 
                }
                
            if(Jdrinks.getSelectedItem().equals("Sprite"))
                {
                  price=31.15;
                    total1 = total1+ price;
                }
            
            String sub_total=Double.toString(total1);
            Jsubtotal.setText(sub_total);
            double total_tax;
            if(Jtax.isSelected())
            {
                 total_tax=total1*0.18;
            String sub_taxtotal=Double.toString(total_tax);
            Jsubtax.setText(sub_taxtotal);
            }
            else
            {
                 total_tax=total1*0;
            String sub_taxtotal=Double.toString(total_tax);
            Jsubtax.setText(sub_taxtotal);
            }
               
           
            double final_total;
            final_total=total_tax+ total1;
            String final_total2=Double.toString(final_total);
            Jtotal.setText(final_total2);
            
                      // TODO add your handling code here:
    }//GEN-LAST:event_JfinaltotalMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                    
            Jcostofmeal.setText(null);
            Jcostofdrink.setText(null);
            Jcostofdelivery.setText(null);
            Jsubtotal.setText(null);
            Jsubtax.setText(null);
            Jtotal.setText(null);
            Jcustomername.setText(null);
            Jphonenumber.setText(null);
           
               Jpaymentmode.setText(null);
          
           JQvegmaggi.setText(null);
           
           JPvegmaggi.setText( null);
           
           JQvegsandwich.setText(null);
           
           
           Jpvegsandwich.setText( null);
           
           JQvegmachurian.setText(null);
           //double price4= Double.parseDouble(Jmachurian.getText());
           //price4 = price4 * costofvegmachurian;
           Jpvegmachurian.setText(null);
           
           JQicecream.setText(null);
           //double price5= Double.parseDouble(Jicecream.getText());
           //price5 = price5 * costoficecream;
           Jpvegmachurian.setText(null);
           
           Jphonedelivery.setText(null);
           Jptax.setText(null);
           Jptotal.setText(null);
           
            

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void JmaggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmaggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmaggiActionPerformed

    private void Jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn3ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn3.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn3ActionPerformed

    private void JbtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnclearActionPerformed
                Jdisplay.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnclearActionPerformed

    private void Jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn1ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn1.getText();
            Jdisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn1ActionPerformed

    private void Jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn2ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn2.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn2ActionPerformed

    private void Jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn4ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn4.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn4ActionPerformed

    private void Jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn5ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn5.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn5ActionPerformed

    private void JBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn6ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + JBtn6.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_JBtn6ActionPerformed

    private void Jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn7ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn7.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn7ActionPerformed

    private void Jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn8ActionPerformed
            String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn8.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn8ActionPerformed

    private void Jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn9ActionPerformed
                    String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtn9.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn9ActionPerformed

    private void JbtnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnzeroActionPerformed
String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtnzero.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_JbtnzeroActionPerformed

    private void JbtnpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnpointActionPerformed
String Enternumber;   
            Enternumber =   Jdisplay.getText() + Jbtnpoint.getText();
            Jdisplay.setText(Enternumber);         // TODO add your handling code here:
    }//GEN-LAST:event_JbtnpointActionPerformed

    private void JbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnplusActionPerformed
                      firstnum = Double.parseDouble(Jdisplay.getText()); 
            Jdisplay.setText("");
             operation= "+";        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnplusActionPerformed

    private void JbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnminusActionPerformed
            firstnum = Double.parseDouble(Jdisplay.getText()); 
            Jdisplay.setText("");
             operation= "-";         // TODO add your handling code here:
    }//GEN-LAST:event_JbtnminusActionPerformed

    private void JbtnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnmultiActionPerformed
        firstnum = Double.parseDouble(Jdisplay.getText()); 
            Jdisplay.setText("");
             operation= "*";         // TODO add your handling code here:
    }//GEN-LAST:event_JbtnmultiActionPerformed

    private void JbtndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtndivideActionPerformed
        firstnum = Double.parseDouble(Jdisplay.getText()); 
            Jdisplay.setText("");
             operation= "/";         // TODO add your handling code here:
    }//GEN-LAST:event_JbtndivideActionPerformed

    private void JbtnresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnresultActionPerformed
                String answer;
            secondnum=Double.parseDouble(Jdisplay.getText());
            
            if(operation =="+")
            {
                result=firstnum + secondnum;
                answer=String.format("%.0f", result);
                Jdisplay.setText(answer);    
            }
            else if(operation =="-")
            {
                result=firstnum - secondnum;
                answer=String.format("%.0f", result);
                Jdisplay.setText(answer);    
            }
            else if(operation =="*")
            {
                result=firstnum * secondnum;
                answer=String.format("%.0f", result);
                Jdisplay.setText(answer);    
            }
            else if(operation =="/")
            {
                result=firstnum / secondnum;
                answer=String.format("%.0f", result);
                Jdisplay.setText(answer);    
            }        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnresultActionPerformed
            
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
            java.util.logging.Logger.getLogger(food_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(food_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(food_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(food_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new food_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAmounttext;
    private javax.swing.JButton JBtn21;
    private javax.swing.JButton JBtn6;
    private javax.swing.JComboBox<String> JCountry;
    private javax.swing.JLabel JDate2;
    private javax.swing.JTextField JDisplayText;
    private javax.swing.JCheckBox JHomeDelivery;
    private javax.swing.JTextField JPvegmaggi;
    private javax.swing.JTextField JQdrinks;
    private javax.swing.JTextField JQicecream;
    private javax.swing.JTextField JQvegmachurian;
    private javax.swing.JTextField JQvegmaggi;
    private javax.swing.JTextField JQvegsandwich;
    private javax.swing.JLabel JTime2;
    private javax.swing.JButton Jbtn1;
    private javax.swing.JButton Jbtn2;
    private javax.swing.JButton Jbtn3;
    private javax.swing.JButton Jbtn4;
    private javax.swing.JButton Jbtn5;
    private javax.swing.JButton Jbtn7;
    private javax.swing.JButton Jbtn8;
    private javax.swing.JButton Jbtn9;
    private javax.swing.JButton Jbtnclear;
    private javax.swing.JButton Jbtndivide;
    private javax.swing.JButton Jbtnminus;
    private javax.swing.JButton Jbtnmulti;
    private javax.swing.JButton Jbtnplus;
    private javax.swing.JButton Jbtnpoint;
    private javax.swing.JButton Jbtnresult;
    private javax.swing.JButton Jbtnzero;
    private javax.swing.JButton Jconvert;
    private javax.swing.JTextField Jcostofdelivery;
    private javax.swing.JTextField Jcostofdrink;
    private javax.swing.JTextField Jcostofmeal;
    private javax.swing.JTextField Jcustomername;
    private javax.swing.JLabel Jdate1;
    private javax.swing.JTextField Jdisplay;
    private javax.swing.JComboBox<String> Jdrinks;
    private javax.swing.JButton Jfinaltotal;
    private javax.swing.JCheckBox Jice_cream;
    private javax.swing.JTextField Jicecream;
    private javax.swing.JTextField Jmachurian;
    private javax.swing.JTextField Jmaggi;
    private javax.swing.JTextField Jname;
    private javax.swing.JComboBox<String> Jpayment;
    private javax.swing.JTextField Jpaymentmode;
    private javax.swing.JTextField Jphone;
    private javax.swing.JTextField Jphonedelivery;
    private javax.swing.JTextField Jphonenumber;
    private javax.swing.JTextField Jpiceccream;
    private javax.swing.JTextField Jpicecream;
    private javax.swing.JTextField Jptax;
    private javax.swing.JTextField Jptotal;
    private javax.swing.JTextField Jpvegmachurian;
    private javax.swing.JTextField Jpvegsandwich;
    private javax.swing.JTextField Jsandwich;
    private javax.swing.JTextField Jsubtax;
    private javax.swing.JTextField Jsubtotal;
    private javax.swing.JCheckBox Jtax;
    private javax.swing.JLabel Jtime1;
    private javax.swing.JTextField Jtotal;
    private javax.swing.JCheckBox Jvegmachurian;
    private javax.swing.JCheckBox Jvegmaggi;
    private javax.swing.JCheckBox Jvegsandwich;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
