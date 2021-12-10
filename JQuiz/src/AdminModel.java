import java.util.*;
import java.io.*;

public class AdminModel {
    private ArrayList<Admin> Admin;
    public AdminModel(){
        Admin = new ArrayList<Admin>();
    }
    public boolean loadData(){
        File f = new File("dataAdmin.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("dataAdmin.dat");
                ObjectInputStream in = new ObjectInputStream(fin);){
                Admin = (ArrayList<Admin>) in.readObject();
                return true;
            } catch (Exception i) {
                return false;
            }
        }
    return false;
    }
    public boolean saveData(){
        try(FileOutputStream fOut = new FileOutputStream("dataAdmin.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(Admin);
            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public ArrayList<Admin> getAdmin() {
        return Admin;
    }

    public void setAdmin(ArrayList<Admin> Admin) {
        this.Admin = Admin;
    }
    
    
}
