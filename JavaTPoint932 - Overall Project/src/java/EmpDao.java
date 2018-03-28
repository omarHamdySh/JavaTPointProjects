
import java.util.*;
import java.sql.*;
import com.mysql.jdbc.Driver;
import javax.security.auth.message.callback.PrivateKeyCallback;
import javax.servlet.http.HttpSession;
public class EmpDao {

   

    public static int save(Emp e,Connection con) {
        int status = 0;
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Emp (name,password,email,country) VALUES (?,?,?,?)");
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getCountry());

            status = ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }

    public static int update(Emp e,Connection con) {
        int status = 0;
        try {
            PreparedStatement ps = con.prepareStatement("update Emp set name=?,password=?,email=?,country=? where id=?");
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getCountry());
            ps.setInt(5, e.getId());

            status = ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }

    public static int delete(int id,Connection con) {
        int status = 0;
        try {
            PreparedStatement ps = con.prepareStatement("delete from Emp where id=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public static Emp getEmployeeById(int id,Connection con) {
        Emp e = new Emp();

        try {
            PreparedStatement ps = con.prepareStatement("select * from Emp where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setEmail(rs.getString(4));
                e.setCountry(rs.getString(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return e;
    }

    public static List<Emp> getAllEmployees(Connection con) {
        List<Emp> list = new ArrayList<Emp>();

        try {
            PreparedStatement ps = con.prepareStatement("select * from Emp");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Emp e = new Emp();
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
