
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Course {
    private int CourseID;
    private String CourseName;
    private int CourseScore;
    private String CourseRelease;
    private String CourseExpire;
    private String CourseOwner;
    private ArrayList<Quiz> Quiz;
    
    public Course(){
        
    }
    public Course(int CourseID, String CourseName, int CourseScore, String CourseRelease, String CourseExpire, String CourseOwner, ArrayList<Quiz> Quiz){
        setCourseID(CourseID);
        setCourseName(CourseName);
        setCourseScore(CourseScore);
        setCourseRelease(CourseRelease);
        setCourseExpire(CourseExpire);
        setCourseOwner(CourseOwner);
        setQuiz(Quiz);
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public int getCourseScore() {
        return CourseScore;
    }

    public void setCourseScore(int CourseScore) {
        this.CourseScore = CourseScore;
    }

    public String getCourseRelease() {
        return CourseRelease;
    }

    public void setCourseRelease(String CourseRelease) {
        this.CourseRelease = CourseRelease;
    }

    public String getCourseExpire() {
        return CourseExpire;
    }

    public void setCourseExpire(String CourseExpire) {
        this.CourseExpire = CourseExpire;
    }

    public String getCourseOwner() {
        return CourseOwner;
    }

    public void setCourseOwner(String CourseOwner) {
        this.CourseOwner = CourseOwner;
    }

    public ArrayList<Quiz> getQuiz() {
        return Quiz;
    }

    public void setQuiz(ArrayList<Quiz> Quiz) {
        this.Quiz = Quiz;
    }
    
}
