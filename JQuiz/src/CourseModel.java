//import java.io.*;
//import java.util.ArrayList; public class BookModel {
// private ArrayList<Book> book = new ArrayList<Book>();
// public ArrayList<Book> getBook(){
// return book;
// }
// public void load(){
// File f = new File("Book.data");
// if (f.exists()){
// try(FileInputStream fin = new FileInputStream(f);
// ObjectInputStream on = new ObjectInputStream(fin);){
// book = (ArrayList<Book>)on.readObject();
// }catch(IOException ex){}
// catch(ClassNotFoundException ex){}
// }
// }
// public void save(){
// File f = new File("Book.data");
// try(FileOutputStream fout = new FileOutputStream(f);
// ObjectOutputStream on = new ObjectOutputStream(fout);){
// on.writeObject(book);
// System.out.println("saved");
// System.out.println(book);
// }catch(IOException ex){}
// }
//}