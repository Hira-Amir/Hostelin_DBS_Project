import java.sql.*;
public class DBSConnection {
    public Connection c;
    public Statement s;

    public DBSConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel system", "root" ,"");
            s = c.createStatement();
            System.out.print("Database Connected Successfully");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new DBSConnection();
    }
}
