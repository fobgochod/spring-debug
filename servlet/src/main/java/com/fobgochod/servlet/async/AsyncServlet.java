package com.fobgochod.servlet.async;

import com.fobgochod.listener.MyListener;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AsyncServlet extends HttpServlet {

    private String message;

    @Override
    public void init() {
        message = "开始检查工作";
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.flush();

        List<String> jobs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            jobs.add("job" + i);
        }
        AsyncContext asyncContext = req.startAsync();
        asyncContext.addListener(new MyListener());
        doWork(asyncContext, jobs);

        out.println("<h1>任务处理完成</h1>");
        out.println("</body></html>");
        out.flush();
    }

    public void doWork(AsyncContext ac, List<String> jobs) {
        ac.setTimeout(60 * 60 * 1000L);
        ac.start(() -> {
            try {
                PrintWriter writer = ac.getResponse().getWriter();
                for (String job : jobs) {
                    writer.println("<h3>" + job + "正在执行过程中</h3>");
                    writer.flush();
                    Thread.sleep(1000L);
                }
                ac.complete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void destroy() {
    }
}
