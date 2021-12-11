import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QuizController implements ActionListener, KeyListener, WindowListener{
    private ArrayList<Course> course = new ArrayList<Course>();
    private LoginView loginView = new LoginView();
    private RegView regView = new RegView();
    private MainView mainView = new MainView();
    private CourseModel courseModel = new CourseModel();
    private CardCourseModel cardCourse = new CardCourseModel();
    private AdminMainView adminMainView = new AdminMainView();
    private AddCourseView addCourseView = new AddCourseView();
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private String userRoleCurrent = "User";
    private String userNameCurrent = "NOT FOUND CURRENT USER";
    public void ShowDataToForm(){
        String selectSql = "SELECT * FROM course";
        try {
            pst = con.prepareStatement(selectSql);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public QuizController(){
        con = Connect.ConnectDB();
        loginView.setVisible(true);
//        AddAction
        loginView.getBtnReg().addActionListener(this);
        regView.getBtnReg().addActionListener(this);
        loginView.getBtnLogin().addActionListener(this);
        regView.getTfEmail().addKeyListener(this);
        mainView.addWindowListener(this);
        adminMainView.addWindowListener(this);
        adminMainView.getBtnAddCourse().addActionListener(this);
        addCourseView.getBtnCreateCourse().addActionListener(this);
        adminMainView.getBtnCourse().addActionListener(this);
        mainView.getBtnCourse().addActionListener(this);
    }
    public static void main(String[] args) {
        new QuizController();
    }
    public void reAdminMainView(){
        adminMainView.getCardPanel().removeAll();
        courseModel.load();
        course = courseModel.getCourse();
        for (int i=0; i < course.size(); i++){
            System.out.println(course.get(i).getCourseID());
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(),
                    course.get(i).getCourseName(), 
                    course.get(i).getCourseScore(), 
                    course.get(i).getCourseRelease(), 
                    course.get(i).getCourseExpire(), 
                    course.get(i).getCourseOwner()));
            adminMainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(this);
        }
        adminMainView.setVisible(true);
        
    }
    public void reMainView(){
        mainView.getCardPanel().removeAll();
        courseModel.load();
        course = courseModel.getCourse();
        for (int i=0; i<course.size(); i++){
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(),course.get(i).getCourseName(), course.get(i).getCourseScore(), course.get(i).getCourseRelease(), course.get(i).getCourseExpire(), course.get(i).getCourseOwner()));
            mainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(this);
            mainView.setVisible(true);
        }
    }
//    Press BTN
    @Override
    public void actionPerformed(ActionEvent e) {
//        Show AddCourse
        if (e.getSource().equals(adminMainView.getBtnAddCourse())){
            addCourseView.setVisible(true);
        }
            ArrayList<Course> data = courseModel.getCourse();
//            Create Course
        if (e.getSource().equals(addCourseView.getBtnCreateCourse())){
            data.add(new Course(data.size()+1, 
                    addCourseView.getTfCourseName().getText(),
                    Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                    addCourseView.getTfCourseRelease().getText(), 
                    addCourseView.getTfCourseExpire().getText(),
                    userNameCurrent,
                    new QuizModel(data.size()+1).getQuiz()));
            courseModel.save(addCourseView.getTfCourseName().getText(), 
                    Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                    addCourseView.getTfCourseRelease().getText(),
                    addCourseView.getTfCourseExpire().getText(),
                    userNameCurrent);
                    reAdminMainView();
                    addCourseView.dispose();
        }
//        Login WIth User
        if (this.userRoleCurrent.equals("User")){
            for (CardCourseView i: cardCourse.getCardCourse()){
                if (e.getSource().equals(i.getBtnEnter())){
                    System.out.println(cardCourse.getCardCourse().indexOf(i)+1);
                }
            }
        }
//        Login With Admin
        if (this.userRoleCurrent.equals("Admin")){
            for (CardCourseView i: cardCourse.getCardCourse()){
                if (e.getSource().equals(i.getBtnEnter())){
                    System.out.println(cardCourse.getCardCourse().indexOf(i)+1);
                }
            }
        }
        
//        Register Login View
        if (e.getSource().equals(loginView.getBtnReg())){
            loginView.setVisible(false);
            regView.setVisible(true);
        }
//        Submit Register View
        if (e.getSource().equals(regView.getBtnReg())){
            String username = regView.getTfUsername().getText();
            String password = regView.getTfPassword().getText();
            String fullname = regView.getTfFirstname().getText()+" "+regView.getTfLastname().getText();
            String email = regView.getTfEmail().getText();
            String findSql = "SELECT userName, userPassword FROM user WHERE userName = '"+username+"' OR userEmail = '"+email+"'";
            String insertSql = "INSERT INTO user (userName, userPassword, userFullname, UserEmail, userRole) VALUES (?, ?, ?, ?, ?);";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next() == true){
                    JOptionPane.showMessageDialog(null, "Already User Or Email", "Duplicate Information", JOptionPane.WARNING_MESSAGE);
                }
                //                  Valid input check By toenTeen
                else if("".equals(username) || "".equals(password) || "".equals(fullname) || "".equals(email)){
                    JOptionPane.showMessageDialog(null, "Empty Informatin !!", "Empty Information", JOptionPane.WARNING_MESSAGE);
                }
                else if(!regView.getTfEmail().getText().contains("@")){
                    JOptionPane.showMessageDialog(null, "Invalid Email Information !!", "Invalid Email", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    pst = con.prepareStatement(insertSql);
                    pst.setString(1, username);
                    pst.setString(2, password);
                    pst.setString(3, fullname);
                    pst.setString(4, email);
                    pst.setString(5, "Student");
                    pst.execute();
                    loginView.setVisible(true);
                    regView.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        Login
        if (e.getSource().equals(loginView.getBtnLogin())){
            String username = loginView.getTfUsername().getText();
            String userPassWord = loginView.getTfUserPassword().getText();
            String findSql = "SELECT userName, userPassword, userRole FROM user WHERE userName = '"+username+"' AND userPassword = '"+userPassWord+"'";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next()){
                    this.userNameCurrent = rs.getString("userName");
                    if (rs.getString("userRole").equals("Admin")){
                        loginView.setVisible(false);
                        adminMainView.setVisible(true);
                        this.userRoleCurrent = "Admin";
                    }else{
                        loginView.setVisible(false);
                        mainView.setVisible(true);
                        this.userRoleCurrent = "User";
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Username or Password Incorrect", "Invalid Information", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(adminMainView.getBtnCourse())){
            reAdminMainView();
        }
        if (e.getSource().equals(mainView.getBtnCourse())){
            reMainView();
        }
    }
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if(!regView.getTfEmail().getText().contains("@")){
            regView.getLbEmail().setText("Email Invalid");
        }
        else{
            regView.getLbEmail().setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {
        
        if (we.getSource().equals(mainView)){
            
        }
        if (we.getSource().equals(adminMainView)){
            
        }
        
    }
    @Override
    public void windowClosing(WindowEvent we) {
    }
    @Override
    public void windowClosed(WindowEvent we) {
    }
    @Override
    public void windowIconified(WindowEvent we) {
    }
    @Override
    public void windowDeiconified(WindowEvent we) {
    }
    @Override
    public void windowActivated(WindowEvent we) {
    }
    @Override
    public void windowDeactivated(WindowEvent we) {
    }
}
