/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class apuestas_autom extends javax.swing.JFrame {

    /**
     * Creates new form apuestas_autom
     */
    public apuestas_autom() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);

        txt_nro_apuestas.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nro_apuestas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_estra_conserva = new javax.swing.JRadioButton();
        btn_estra_arriesg = new javax.swing.JRadioButton();
        btn_estra_econo = new javax.swing.JRadioButton();
        btn_estra_derrocha = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        btn_apostar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/621cc7f3c39fa322212e2468eb1bd92b.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 190, 340, 260);

        txt_nro_apuestas.setBackground(new java.awt.Color(0, 0, 0));
        txt_nro_apuestas.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txt_nro_apuestas.setForeground(new java.awt.Color(255, 255, 255));
        txt_nro_apuestas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_nro_apuestas);
        txt_nro_apuestas.setBounds(660, 100, 180, 27);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Numero de apuestas:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 100, 180, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Probabilidad de ganar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 160, 190, 40);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Valor apostado");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(710, 160, 190, 40);

        btn_estra_conserva.setBackground(new java.awt.Color(0, 0, 0));
        btn_estra_conserva.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btn_estra_conserva.setForeground(new java.awt.Color(255, 255, 255));
        btn_estra_conserva.setText("Estrategia conservadora");
        btn_estra_conserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estra_conservaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_estra_conserva);
        btn_estra_conserva.setBounds(400, 280, 180, 50);

        btn_estra_arriesg.setBackground(new java.awt.Color(0, 0, 0));
        btn_estra_arriesg.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btn_estra_arriesg.setForeground(new java.awt.Color(255, 255, 255));
        btn_estra_arriesg.setText("Estrategia arriesgada");
        btn_estra_arriesg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estra_arriesgActionPerformed(evt);
            }
        });
        jPanel1.add(btn_estra_arriesg);
        btn_estra_arriesg.setBounds(400, 380, 180, 50);

        btn_estra_econo.setBackground(new java.awt.Color(0, 0, 0));
        btn_estra_econo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btn_estra_econo.setForeground(new java.awt.Color(255, 255, 255));
        btn_estra_econo.setText("Estrategia economizadora");
        btn_estra_econo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estra_econoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_estra_econo);
        btn_estra_econo.setBounds(710, 280, 210, 50);

        btn_estra_derrocha.setBackground(new java.awt.Color(0, 0, 0));
        btn_estra_derrocha.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btn_estra_derrocha.setForeground(new java.awt.Color(255, 255, 255));
        btn_estra_derrocha.setText("Estrategia derrochadora");
        btn_estra_derrocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estra_derrochaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_estra_derrocha);
        btn_estra_derrocha.setBounds(710, 380, 210, 50);

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(660, 140, 280, 340);

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 140, 580, 80);

        Fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(Fondo);
        Fondo.setBounds(360, 140, 580, 340);

        btn_apostar.setBackground(new java.awt.Color(0, 0, 0));
        btn_apostar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btn_apostar.setForeground(new java.awt.Color(255, 255, 255));
        btn_apostar.setText("Apostar");
        btn_apostar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btn_apostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apostarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_apostar);
        btn_apostar.setBounds(537, 510, 250, 50);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 10, 130, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_estra_conservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estra_conservaActionPerformed
        analizar_cons();
    }//GEN-LAST:event_btn_estra_conservaActionPerformed

    private void btn_estra_arriesgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estra_arriesgActionPerformed
       analizar_arriesg();
    }//GEN-LAST:event_btn_estra_arriesgActionPerformed

    private void btn_estra_econoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estra_econoActionPerformed
        analizar_economica();
    }//GEN-LAST:event_btn_estra_econoActionPerformed

    private void btn_estra_derrochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estra_derrochaActionPerformed
        analizar_derrocha();
    }//GEN-LAST:event_btn_estra_derrochaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Apuestas_frame apu= new Apuestas_frame();
        dispose();
        apu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_apostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apostarActionPerformed
        long nro=Long.parseLong(txt_nro_apuestas.getText());
        for(long i=0;i<nro;i++){
            ap_cons_eco();
            ap_cons_derr();
            ap_arr_eco();
            ap_arr_derr();
        }
        
        
    }//GEN-LAST:event_btn_apostarActionPerformed

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
            java.util.logging.Logger.getLogger(apuestas_autom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apuestas_autom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apuestas_autom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apuestas_autom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apuestas_autom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btn_apostar;
    private javax.swing.JRadioButton btn_estra_arriesg;
    private javax.swing.JRadioButton btn_estra_conserva;
    private javax.swing.JRadioButton btn_estra_derrocha;
    private javax.swing.JRadioButton btn_estra_econo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_nro_apuestas;
    // End of variables declaration//GEN-END:variables

public void analizar_cons(){
    if(btn_estra_conserva.isSelected()==true){
        btn_estra_arriesg.setEnabled(false);
    }else{
         btn_estra_arriesg.setEnabled(true);
    }
}
public void analizar_arriesg(){
    if(btn_estra_arriesg.isSelected()==true){
        btn_estra_conserva.setEnabled(false);
    }else{
         btn_estra_conserva.setEnabled(true);
    }
}
public void analizar_economica(){
    if(btn_estra_econo.isSelected()==true){
        btn_estra_derrocha.setEnabled(false);
    }else{
         btn_estra_derrocha.setEnabled(true);
    }
}
public void analizar_derrocha(){
    if(btn_estra_derrocha.isSelected()==true){
        btn_estra_econo.setEnabled(false);
    }else{
         btn_estra_econo.setEnabled(true);
    }
}




/*----------------------------------------------*/

public void ap_cons_eco(){
    if(btn_estra_conserva.isSelected()==true && btn_estra_econo.isSelected()==true){
       
        double pg=((Math.random() * (1 - 0.5)) + 0.5);
        double randomNum = 1/pg;
        BigDecimal randomm = new BigDecimal(randomNum).setScale(2, RoundingMode.HALF_UP);
        double rand1 = randomm.doubleValue();
        
        double VA=((Math.random() * (5000000 - 0)) + 0);
        BigDecimal random = new BigDecimal(VA).setScale(2, RoundingMode.HALF_UP);
        double rand2 = random.doubleValue();
        long VG= (long)(rand1*rand2);
        
        
        DecimalFormat formato_va = new DecimalFormat("$#,###.###");
        String VaP = formato_va.format(rand2);
        
        
        DecimalFormat formato = new DecimalFormat("$#,###.###");
        String VGP = formato.format(VG);
        
        JOptionPane.showMessageDialog(null,"CA: " + rand1 + "\nVA: $ " + VaP+"\nVG: $ "+VGP);
    }
}


public void ap_cons_derr(){
    if(btn_estra_conserva.isSelected()==true && btn_estra_derrocha.isSelected()==true){
        double pg=((Math.random() * (1 - 0.5)) + 0.5);
        double randomNum = 1/pg;
        BigDecimal randomm = new BigDecimal(randomNum).setScale(2, RoundingMode.HALF_UP);
        double rand1 = randomm.doubleValue();
        
        double VA=((Math.random() * (500000000 - 5000000)) + 5000000);
        BigDecimal random = new BigDecimal(VA).setScale(2, RoundingMode.HALF_UP);
        double rand2 = random.doubleValue();
        long VG= (long)(rand1*rand2);
        DecimalFormat formato_va = new DecimalFormat("$#,###.###");
        String VaP = formato_va.format(rand2);
        
        
        DecimalFormat formato = new DecimalFormat("$#,###.###");
        String VGP = formato.format(VG);
        JOptionPane.showMessageDialog(null,"CA: " + rand1 + "\nVA: $ " + VaP+"\nVG: $ "+VGP);
    }
}


public void ap_arr_eco(){
    if(btn_estra_arriesg.isSelected()==true && btn_estra_econo.isSelected()==true){
        double pg=((Math.random() * (0.5 - 0)) + 0);
        double randomNum = 1/pg;
        BigDecimal randomm = new BigDecimal(randomNum).setScale(2, RoundingMode.HALF_UP);
        double rand1 = randomm.doubleValue();
        
        
        double VA=((Math.random() * (5000000 - 0)) + 0);
        BigDecimal random = new BigDecimal(VA).setScale(2, RoundingMode.HALF_UP);
        double rand2 = random.doubleValue();
        long VG= (long)(rand1*rand2);
        DecimalFormat formato_va = new DecimalFormat("$#,###.###");
        String VaP = formato_va.format(rand2);
        DecimalFormat formato = new DecimalFormat("$#,###.###");
        String VGP = formato.format(VG);
        
        JOptionPane.showMessageDialog(null,"CA: " + rand1 + "\nVA: $ " + VaP+"\nVG: $ "+VGP);
        
    }
}


public void ap_arr_derr(){
    if(btn_estra_arriesg.isSelected()==true && btn_estra_derrocha.isSelected()==true){
         double pg=((Math.random() * (0.5 - 0)) + 0);
        double randomNum = 1/pg;
        BigDecimal randomm = new BigDecimal(randomNum).setScale(2, RoundingMode.HALF_UP);
        double rand1 = randomm.doubleValue();
        
        double VA=((Math.random() * (500000000 - 5000000)) + 5000000);
        BigDecimal random = new BigDecimal(VA).setScale(2, RoundingMode.HALF_UP);
        double rand2 = random.doubleValue();
        
        long VG= (long)(rand1*rand2);
        
        DecimalFormat formato_va = new DecimalFormat("$#,###.###");
        String VaP = formato_va.format(rand2);
        DecimalFormat formato = new DecimalFormat("$#,###.###");
        String VGP = formato.format(VG);
        JOptionPane.showMessageDialog(null,"CA: " + rand1 + "\nVA: $ " + VaP+"\nVG: $ "+VGP);
        
    }
}




}
