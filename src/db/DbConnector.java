package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnector
{
    public static Connection c;
    public static Statement st;
    static
    {
        try
        {
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSl=false","root","123456");
            st=c.createStatement();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

