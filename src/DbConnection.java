import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnection 
{
    Connection con;
    
    public Connection getDbConnection()
    {
        try
        {
            String dbpath="jdbc:mysql://localhost:3306/bookstore";
            con=DriverManager.getConnection(dbpath,"root","");
        }
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        return con;
    }
            
    
    
}