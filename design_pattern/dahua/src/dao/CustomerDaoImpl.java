package dao;

import java.sql.*;
import java.util.*;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void add(Customer c) {
        String sql = "insert into CustomerTbl(name,email) values(?,?)";
        Connection conn = DBUtil.open();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getName());
            pstmt.setString(2, c.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
    }

    @Override
    public void update(Customer c) {
        String sql = "update CustomerTbl set name=?,email=? where id=?";
        Connection conn = DBUtil.open();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getName());
            pstmt.setString(2, c.getEmail());
            pstmt.setInt(3, c.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from CustomerTbl where id=?";
        Connection conn = DBUtil.open();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
    }

    @Override
    public Customer getCustomerById(int id) {
        String sql = "select id,name,email from CustomerTbl where id=?";
        Connection conn = DBUtil.open();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setEmail(rs.getString(3));
                return c;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
        return null;
    }

    @Override
    public List<Customer> query() {
        String sql = "select id,name,email from CustomerTbl";
        Connection conn = DBUtil.open();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Customer> list = new ArrayList<Customer>();
            while (rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setEmail(rs.getString(3));
                list.add(c);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
        return null;
    }

}
