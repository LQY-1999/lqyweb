package controller;

import com.google.gson.Gson;
import dao.NumberDao;
import dao.PriceDao;
import vo.Number;
import vo.Price;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/createLineChart.do")
public class CreateLineChartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsonStr;
        NumberDao numberDao = new NumberDao();
        ArrayList<Number> cityTemperArrayList = numberDao.queryNumber();
        jsonStr = new Gson().toJson(numberArrayList);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        System.out.print("2.折线图信息：");
        System.out.println(jsonStr);
        System.out.println();

        out.print(jsonStr);
        out.flush();
        out.close();


    }
}
