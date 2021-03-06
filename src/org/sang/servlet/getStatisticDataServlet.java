package org.sang.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sang.bean.StatisticUnit;
import org.sang.service.StatisticUnitService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "getStatisticDataServlet")
public class getStatisticDataServlet extends HttpServlet {
    private StatisticUnitService statisticUnitService = new StatisticUnitService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<StatisticUnit> list = statisticUnitService.allMeetingRoomStatistic(30);
        ObjectMapper mapper = new ObjectMapper(); // 提供java-json相互转换功能的类

        String result = mapper.writeValueAsString(list); // 将list中的对象转换为Json字符串


        System.out.println(result);

        // 将json字符串数据返回给前端
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json; charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write(result);
        out.close();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
