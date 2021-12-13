
import javax.swing.JButton;
import javax.swing.JTextField;


public class EditFillAnswerView extends javax.swing.JPanel {

    public EditFillAnswerView() {
        initComponents();
    }
    public EditFillAnswerView(String question, String answer) {
        initComponents();
        this.getTfQuestion().setText(question);
        this.getTfAnswer().setText(answer);
    }

    public JButton getBtnDelQuiz() {
        return btnDelQuiz;
    }

    
    
    public JButton getBtnEditQuiz() {
        return btnEditQuiz;
    }

    public JTextField getTfAnswer() {
        return tfAnswer;
    }

    public JTextField getTfQuestion() {
        return tfQuestion;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfQuestion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tfAnswer = new javax.swing.JTextField();
        btnDelQuiz = new javax.swing.JButton();
        btnEditQuiz = new javax.swing.JButton();

        tfQuestion.setText("jTextField10");
        tfQuestion.setPreferredSize(new java.awt.Dimension(140, 19));
        add(tfQuestion);

        tfAnswer.setText("jTextField1");
        tfAnswer.setPreferredSize(new java.awt.Dimension(280, 19));
        jPanel3.add(tfAnswer);

        jPanel4.add(jPanel3);

        add(jPanel4);

        btnDelQuiz.setText("Delete");
        add(btnDelQuiz);

        btnEditQuiz.setText("Edit");
        add(btnEditQuiz);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelQuiz;
    private javax.swing.JButton btnEditQuiz;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tfAnswer;
    private javax.swing.JTextField tfQuestion;
    // End of variables declaration//GEN-END:variables
}
