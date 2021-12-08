import java.awt.*;
import net.proteanit.sql.DbUtils;
//management database table
import java.sql.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QuizController implements ActionListener{
    private LoginView loginView = new LoginView();
    private RegView regView = new RegView();
    private MainView mainView = new MainView();
    private Connection con = null;
//    connection
    private ResultSet rs = null;
//    dataRespone
    private PreparedStatement pst = null;
//    Command Sql
    public void ShowDataToForm(){
        String Sql = "SELECT * FROM course";
        try {
            pst = con.prepareStatement(Sql);
            rs = pst.executeQuery();
            mainView.getTbCourse().setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public QuizController(){
        con = Connect.ConnectDB();
        ShowDataToForm();
        loginView.setVisible(true);
        loginView.getBtnReg().addActionListener(this);
        regView.getBtnReg().addActionListener(this);
        loginView.getBtnLogin().addActionListener(this);
    }
    public static void main(String[] args) {
        new QuizController();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginView.getBtnReg())){
            loginView.setVisible(false);
            regView.setVisible(true);
        }
        if (e.getSource().equals(regView.getBtnReg())){
            loginView.setVisible(true);
            regView.setVisible(false);
        }
        if (e.getSource().equals(loginView.getBtnLogin())){
            loginView.setVisible(false);
            mainView.setVisible(true);
        }
        
    }
}
