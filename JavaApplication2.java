package javaapplication2;
import java.lang.*;
import java.util.*;
import java.sql.*;
public class JavaApplication2 {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try{
            
        
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");
        PreparedStatement ps=con.prepareStatement("insert into employee value(?,?,?)");
        ps.setInt(1,10);
        ps.setString(2,"jjdj");
        ps.setString(3,"Manager");
        int n=ps.executeUpdate();
        PreparedStatement st=con.prepareStatement("select id,name,addr from employee");
        ResultSet rs= st.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception e){
                e.printStackTrace();
                }
        
    }
    
}
