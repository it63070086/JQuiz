/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
class User {
    private String Name;
    private String Surname;
    private String Mail;
    private String ID;
    private String Permission;
    
    public User(){
        this("", "", "", "", "");
    }
    public User(String Name, String Surname, String ID, String Mail, String Permission){
        setName(Name);
        setSurname(Surname);
        setID(ID);
        setMail(Mail);
        setPermission(Permission);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getPermission() {
        return Permission;
    }

    public void setPermission(String Permission) {
        this.Permission = Permission;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }
    
}
