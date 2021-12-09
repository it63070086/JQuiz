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
public class StudentModel {
    private ArrayList<Student> Student;
    public StudentModel(){
        Student = new ArrayList<Student>();
    }
    public boolean loadData(){
        File f = new File("dataStudent.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("dataStudent.dat");
                ObjectInputStream in = new ObjectInputStream(fin);){
                Student = (ArrayList<Student>) in.readObject();
                return true;
            } catch (Exception i) {
                return false;
            }
        }
    return false;
    }
    public boolean saveData(){
        try(FileOutputStream fOut = new FileOutputStream("dataStudent.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(Student);
            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public ArrayList<Student> getStudent() {
        return Student;
    }

    public void setStudent(ArrayList<Student> Student) {
        this.Student = Student;
    }
    
}
