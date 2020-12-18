package dao;


import tools.JdbcUtil;
import vo.Number;

import java.sql.*;
import java.util.ArrayList;

public class CityTemperDao {
   public ArrayList<Number> queryNumber(){
       Number number = null;
       ArrayList<Number> numberArrayList = new ArrayList<>();
       Connection con = JdbcUtil.getConnection();

       String sql = "select * from t_Number";
       PreparedStatement ps = null;
       try {
           ps = con.prepareStatement(sql);
       } catch (SQLException e) {
           e.printStackTrace();
       }
       ResultSet rs = null;
       try {
           rs = ps.executeQuery();
       } catch (SQLException e) {
           e.printStackTrace();
       }
       try {
           while (rs.next()) {
               String foodName = rs.getString("foodName");    
               float[] numberArray = new float[12];
               number = new Number(foodName,numberArray);
               numberArrayList.add(number);
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }


       JdbcUtil.closeAll(rs, ps, con);

       return numberArrayList;


   }
}
