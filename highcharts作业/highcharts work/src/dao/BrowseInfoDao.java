package dao;

import tools.JdbcUtil;
import vo.BrowseInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BrowseInfoDAO {
    public ArrayList<BrowseInfo> queryBrowseInfo() {
        BrowseInfo browseInfo = null;
        ArrayList<BrowseInfo> pageViewInfoArrayList = new ArrayList<>();
        Connection con = JdbcUtil.getConnection();

        String sql = "select * from t_pageview_info";
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
                String browserName = rs.getString("browserName");
                float percent = rs.getFloat("percent");
                browseInfo = new BrowseInfo(browserName, percent);
                pageViewInfoArrayList.add(browseInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        JdbcUtil.closeAll(rs, ps, con);

        return browseInfoArrayList;
    }
}
