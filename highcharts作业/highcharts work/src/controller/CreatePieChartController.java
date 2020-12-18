package controller;

import com.google.gson.Gson;
import dao.NumberDao;
import dao.BrowseInfoDao;
import vo.Number;
import vo.BrowseInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/createPieChart.do")
public class CreatePieChartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String jsonStr;
        BrowseInfoDao browseInfoDao = new BrowseInfoDao();
        ArrayList<BrowseInfo> browseInfoArrayList = browseInfoDao.queryBrowseInfo();

        //转成json
        jsonStr = new Gson().toJson(BrowseInfoArrayList);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        System.out.print("3.饼图信息：");
        System.out.println(jsonStr);
        System.out.println();

        out.print(jsonStr);
        out.flush();
        out.close();

    }

}
