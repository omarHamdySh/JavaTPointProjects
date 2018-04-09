package DAO;


import java.util.*;
import java.sql.*;
import Beans.Employee;
public class EmpDao {

   
    public static List<Employee> getAllEmployees(Connection con,int start,int total) {
        List<Employee> list = new ArrayList<Employee>();

        try {
            PreparedStatement ps = con.prepareStatement("select * from emp limit "+(start-1)+","+total);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setEmail(rs.getString(4));
                e.setCountry(rs.getString(5));
                list.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
