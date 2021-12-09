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
    private String FullName;
    private String Mail;
    private String ID;
    private String Permission;
    private String UserName;
    private String UserPassword;
    
    public User(){
        this("", "", "", "", "", "");
    }
    
    public User(String FullName, String ID, String Mail, String Permission, String UserName, String UserPassword){
        setFullName(FullName);
        setID(ID);
        setMail(Mail);
        setPermission(Permission);
        setUserName(UserName);;
        setUserPassword(UserPassword);
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
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

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }
    
}
