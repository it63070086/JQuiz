
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NetworkDevelopement
 */
public class EditMultiChoiceView extends javax.swing.JPanel {

    /**
     * Creates new form EditChoiceView
     */
    public EditMultiChoiceView() {
        initComponents();
    }
    public EditMultiChoiceView(String question, String a, String b, String c, String d, String answer){
        initComponents();
        this.tfQuestion.setText(question);
        this.tfCBA.setText(a);
        this.tfCBB.setText(b);
        this.tfCBC.setText(c);
        this.tfCBD.setText(d);   
    }

    public JButton getBtnDelQuiz() {
        return btnDelQuiz;
    }

    public JButton getBtnEditQuiz() {
        return btnEditQuiz;
    }

    public JCheckBox getCbA() {
        return cbA;
    }

    public JCheckBox getCbB() {
        return cbB;
    }

    public JCheckBox getCbC() {
        return cbC;
    }

    public JCheckBox getCbD() {
        return cbD;
    }

    public JTextField getTfCBA() {
        return tfCBA;
    }

    public JTextField getTfCBB() {
        return tfCBB;
    }

    public JTextField getTfCBC() {
        return tfCBC;
    }

    public JTextField getTfCBD() {
        return tfCBD;
    }

    public JTextField getTfQuestion() {
        return tfQuestion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tfQuestion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cbA = new javax.swing.JCheckBox();
        cbC = new javax.swing.JCheckBox();
        cbB = new javax.swing.JCheckBox();
        cbD = new javax.swing.JCheckBox();
        tfCBA = new javax.swing.JTextField();
        tfCBC = new javax.swing.JTextField();
        tfCBB = new javax.swing.JTextField();
        tfCBD = new javax.swing.JTextField();
        btnDelQuiz = new javax.swing.JButton();
        btnEditQuiz = new javax.swing.JButton();

        tfQuestion.setText("jTextField10");
        add(tfQuestion);

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbA, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbC, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbD, gridBagConstraints);

        tfCBA.setText("jTextField2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(tfCBA, gridBagConstraints);

        tfCBC.setText("jTextField3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(tfCBC, gridBagConstraints);

        tfCBB.setText("jTextField4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(tfCBB, gridBagConstraints);

        tfCBD.setText("jTextField5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(tfCBD, gridBagConstraints);

        add(jPanel1);

        btnDelQuiz.setText("Delete");
        add(btnDelQuiz);

        btnEditQuiz.setText("Edit");
        add(btnEditQuiz);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelQuiz;
    private javax.swing.JButton btnEditQuiz;
    private javax.swing.JCheckBox cbA;
    private javax.swing.JCheckBox cbB;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCBA;
    private javax.swing.JTextField tfCBB;
    private javax.swing.JTextField tfCBC;
    private javax.swing.JTextField tfCBD;
    private javax.swing.JTextField tfQuestion;
    // End of variables declaration//GEN-END:variables
}
