
public class AppUI01 extends javax.swing.JPanel {

    public static void main(String[] args) {
   
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppUI01().setVisible(true);
            }
        });
  
    }

    public AppUI01() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jRadioConnaissance = new javax.swing.JRadioButton();
        jRadioButtonFamille = new javax.swing.JRadioButton();
        jRadioButtonAmi = new javax.swing.JRadioButton();
        jTextFieldNom = new javax.swing.JTextField();
        JLnom = new javax.swing.JLabel();
        jTextFieldPrenom = new javax.swing.JTextField();
        JLprenom = new javax.swing.JLabel();
        jTextFieldAdresse = new javax.swing.JTextField();
        JLadresse = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        JLcp = new javax.swing.JLabel();
        jTextFieldVille = new javax.swing.JTextField();
        JLville = new javax.swing.JLabel();
        jTextFieldTelphone = new javax.swing.JTextField();
        JLtelephone = new javax.swing.JLabel();
        jTextFieldMobile = new javax.swing.JTextField();
        JLmobile = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        JLemail = new javax.swing.JLabel();
        jTextFieldNaissance = new javax.swing.JTextField();
        JLnaissance = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 600));
        setLayout(null);

        jLabel2.setText("Creation de contact");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ObjectProperty.create(), jLabel2, org.jdesktop.beansbinding.BeanProperty.create("verticalAlignment"));
        bindingGroup.addBinding(binding);

        add(jLabel2);
        jLabel2.setBounds(150, 10, 94, 15);

        buttonGroup1.add(jRadioConnaissance);
        jRadioConnaissance.setText("Connaissance");
        jRadioConnaissance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioConnaissanceActionPerformed(evt);
            }
        });
        add(jRadioConnaissance);
        jRadioConnaissance.setBounds(40, 40, 94, 23);

        buttonGroup1.add(jRadioButtonFamille);
        jRadioButtonFamille.setText("Famille");
        add(jRadioButtonFamille);
        jRadioButtonFamille.setBounds(170, 40, 57, 23);

        buttonGroup1.add(jRadioButtonAmi);
        jRadioButtonAmi.setText("Ami");
        add(jRadioButtonAmi);
        jRadioButtonAmi.setBounds(300, 40, 43, 23);

        jTextFieldNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNom.setText(" ");
        add(jTextFieldNom);
        jTextFieldNom.setBounds(130, 90, 240, 19);

        JLnom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLnom.setText("Nom");
        add(JLnom);
        JLnom.setBounds(11, 90, 120, 15);

        jTextFieldPrenom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrenom.setText(" ");
        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });
        add(jTextFieldPrenom);
        jTextFieldPrenom.setBounds(130, 120, 240, 19);

        JLprenom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLprenom.setText("Prenom");
        add(JLprenom);
        JLprenom.setBounds(10, 120, 120, 15);

        jTextFieldAdresse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAdresse.setText(" ");
        add(jTextFieldAdresse);
        jTextFieldAdresse.setBounds(130, 150, 240, 19);

        JLadresse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLadresse.setText("Adresse");
        add(JLadresse);
        JLadresse.setBounds(10, 150, 120, 15);

        jTextFieldCP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCP.setText(" ");
        add(jTextFieldCP);
        jTextFieldCP.setBounds(130, 180, 240, 19);

        JLcp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLcp.setText("CP");
        add(JLcp);
        JLcp.setBounds(10, 180, 120, 15);

        jTextFieldVille.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldVille.setText(" ");
        add(jTextFieldVille);
        jTextFieldVille.setBounds(130, 210, 240, 19);

        JLville.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLville.setText("Ville");
        add(JLville);
        JLville.setBounds(10, 210, 120, 15);

        jTextFieldTelphone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTelphone.setText(" ");
        add(jTextFieldTelphone);
        jTextFieldTelphone.setBounds(130, 240, 240, 19);

        JLtelephone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLtelephone.setText("Telephone");
        add(JLtelephone);
        JLtelephone.setBounds(10, 240, 120, 15);

        jTextFieldMobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMobile.setText(" ");
        add(jTextFieldMobile);
        jTextFieldMobile.setBounds(130, 270, 240, 19);

        JLmobile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLmobile.setText("Mobile");
        add(JLmobile);
        JLmobile.setBounds(10, 270, 120, 15);

        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setText(" ");
        add(jTextFieldEmail);
        jTextFieldEmail.setBounds(130, 300, 240, 19);

        JLemail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLemail.setText("Email");
        add(JLemail);
        JLemail.setBounds(10, 300, 120, 15);

        jTextFieldNaissance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNaissance.setText(" ");
        add(jTextFieldNaissance);
        jTextFieldNaissance.setBounds(130, 330, 240, 19);

        JLnaissance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLnaissance.setText("Date de naissance");
        add(JLnaissance);
        JLnaissance.setBounds(10, 330, 120, 15);

        jButtonSave.setText("Enregistrer");
        add(jButtonSave);
        jButtonSave.setBounds(160, 370, 190, 25);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioConnaissanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioConnaissanceActionPerformed
        JLmobile.setVisible(jRadioConnaissance.isSelected());
        JLnaissance.setVisible(jRadioConnaissance.isSelected());
    }//GEN-LAST:event_jRadioConnaissanceActionPerformed

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLadresse;
    private javax.swing.JLabel JLcp;
    private javax.swing.JLabel JLemail;
    private javax.swing.JLabel JLmobile;
    private javax.swing.JLabel JLnaissance;
    private javax.swing.JLabel JLnom;
    private javax.swing.JLabel JLprenom;
    private javax.swing.JLabel JLtelephone;
    private javax.swing.JLabel JLville;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonAmi;
    private javax.swing.JRadioButton jRadioButtonFamille;
    private javax.swing.JRadioButton jRadioConnaissance;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMobile;
    private javax.swing.JTextField jTextFieldNaissance;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldTelphone;
    private javax.swing.JTextField jTextFieldVille;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

