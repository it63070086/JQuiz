import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class CourseModel {
    private ArrayList<Course> Course;
    public CourseModel(){
        Course = new ArrayList<Course>();
    }
    public boolean loadData(){
        File f = new File("dataCourse.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("dataCourse.dat");
                ObjectInputStream in = new ObjectInputStream(fin);){
                Course = (ArrayList<Course>) in.readObject();
                return true;
            } catch (Exception i) {
                return false;
            }
        }
    return false;
    }
    public boolean saveData(){
        try(FileOutputStream fOut = new FileOutputStream("dataCourse.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(Course);
            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public ArrayList<Course> getCourse() {
        return Course;
    }

    public void setCourse(ArrayList<Course> Course) {
        this.Course = Course;
    }
    
    
}

