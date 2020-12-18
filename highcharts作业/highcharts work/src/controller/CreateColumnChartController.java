package controller;

import com.google.gson.Gson;
import dao.PriceDao;
import vo.Price;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/creatColumnChart.do")
public class CreateColumnChartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsonStr;
        PriceDao priceDao = new PriceDao();
        ArrayList<Price> goodsArrayList = priceDao.queryPrice();
        jsonStr = new Gson().toJson(priceArrayList);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        System.out.print("1.条形图信息：");
        System.out.println(jsonStr);
        System.out.println();

        out.print(jsonStr);
        out.flush();
        out.close();
    }
}
