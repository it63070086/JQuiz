/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Student extends User{
    public Student(){
        this("", "", "", "Student", "", "");
    }

    public Student(String FullName, String ID, String Mail, String Role, String UserName, String UserPassword){
        super(FullName, ID, Mail, "Student", UserName, UserPassword);
    }
}
