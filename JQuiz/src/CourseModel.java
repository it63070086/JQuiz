import java.io.*;
import java.util.*;
import java.sql.*;
import java.util.ArrayList; 
import net.proteanit.sql.DbUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CourseModel {
    private MainView mainView;
    private ArrayList<Course> course;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    public CourseModel(){
        course = new ArrayList<Course>();
        con = Connect.ConnectDB();
    }
    public ArrayList<Course> getCourse(){
        return course;
    }
    public void load(){
        String selectSql = "SELECT * FROM course";
        try {
            pst = con.prepareStatement(selectSql);           
            rs = pst.executeQuery();
            while (rs.next()){
                Course acourse = new Course(Integer.parseInt(rs.getString("courseId")), rs.getString("courseName"), Integer.parseInt(rs.getString("CourseScore")), 
                    rs.getString("CourseRelease"), rs.getString("CourseExpire"), rs.getString("CourseOwner"), new ArrayList<Quiz>());
                course.add(acourse);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void save(){
        String selectSql = "INSERT INTO course (courseName, courseScore, courseRelease, courseExpire, courseOwner) VALUES (?, ?, ?, ?, ?);";
        try {
            pst = con.prepareStatement(selectSql);   
//            pst.setString(1, );
            rs = pst.executeQuery();
            while (rs.next()){
                Course acourse = new Course(Integer.parseInt(rs.getString("courseId")), rs.getString("courseName"), Integer.parseInt(rs.getString("CourseScore")), 
                    rs.getString("CourseRelease"), rs.getString("CourseExpire"), rs.getString("CourseOwner"), new ArrayList<Quiz>());
                course.add(acourse);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}