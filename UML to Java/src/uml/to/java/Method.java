/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.to.java;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Method extends javax.swing.JFrame {
static String printt ="";
    /**
     * Creates new form Method
     */
    public Method() {
        initComponents();
    }
    
    public Method(String n ){
        initComponents();
        //l1.setText(n+".1");
        
        String h = "method details of class ";
        String g = h+n ;
        
        l1.setText(n);
    }
    JLabel lblNewLabel = new JLabel("");
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MethodDetails = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        enterMethod = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        returnType = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        addCustomMethod = new javax.swing.JButton();
        accessModifier = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t4.setVisible(false);
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MethodDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MethodDetails.setText("Method");

        l1.setFont(new java.awt.Font("Tahoma", 1, 18));

        enterMethod.setText("Name:");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        returnType.setText("Return Type");

        addCustomMethod.setText("Add in a Print Statement?");
        addCustomMethod.setVisible(false);
        addCustomMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomMethodActionPerformed(evt);
            }
        });

        accessModifier.setText("Acces Modifier");
        
        JButton btnDone = new JButton("done?");
        btnDone.setVisible(false);
        
        btnDone.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String d= t3.getText()+" "+ t2.getText()+ " "+ t1.getText()+ "() {";
        		String l = printt+" }";
        		System.out.println(d);
        		System.out.println(l);
        		dispose();
        		
        		
        	}
        });
        JLabel lblNewLabel_1 = new JLabel("");
        
        
        JButton btnAttributesConfirm = new JButton("Attributes confirm");
        btnAttributesConfirm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		addCustomMethod.setVisible(true);
        		t4.setVisible(true);
        		lblNewLabel.setVisible(true);
        		btnDone.setVisible(true);
        		lblNewLabel_1.setText("Method Header defined!");
        		btnAttributesConfirm.setVisible(false);
        		
        		
        		
        		
        	}
        });
        
       
     

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(206)
        			.addComponent(lblNewLabel)
        			.addGap(462))
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(48)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(24)
        									.addComponent(MethodDetails, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
        								.addComponent(btnDone))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(returnType, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        										.addComponent(enterMethod, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(t2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        										.addComponent(t1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
        								.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        									.addGap(43)
        									.addComponent(addCustomMethod)
        									.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
        									.addComponent(t4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(lblNewLabel_1)
        										.addComponent(accessModifier, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
        									.addComponent(t3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
        							.addGap(29))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnAttributesConfirm)
        							.addPreferredGap(ComponentPlacement.RELATED, 384, Short.MAX_VALUE)))
        					.addGap(60))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(l1, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(7)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(enterMethod)
        						.addComponent(t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(29)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(returnType)
        						.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(accessModifier))
        					.addGap(13))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(MethodDetails, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        					.addGap(69)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAttributesConfirm)
        				.addComponent(lblNewLabel_1))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnDone)
        						.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblNewLabel))
        				.addComponent(addCustomMethod))
        			.addGap(47))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void addCustomMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomMethodActionPerformed
        String s = t4.getText();
        String h= "System.out.println(\" "+s+ " \" );" ;
        printt = h;
        lblNewLabel.setText("print statement  added");
        
        addCustomMethod.setVisible(false);
        
        
    }
    //GEN-LAST:event_addCustomMethodActionPerformed

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
            java.util.logging.Logger.getLogger(Method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Method().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MethodDetails;
    private javax.swing.JLabel accessModifier;
    private javax.swing.JButton addCustomMethod;
    private javax.swing.JLabel enterMethod;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel returnType;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
}