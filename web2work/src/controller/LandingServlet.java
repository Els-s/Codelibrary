package controller;

import bean.User;
import service.UserService;
import utils.MaptoBeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author service
 * @date 2019/8/12 21:07
 * @company www.ads.com
 * @desc
 */
public class LandingServlet extends HttpServlet {
    private UserService uss=new UserService();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        try {
            User user = MaptoBeanUtils.MapToBean(map);
            boolean landing = uss.landing(user);
            if (landing){
                req.getRequestDispatcher("landOK.html").forward(req,resp);
            }else{
                req.getRequestDispatcher("landingFailed.html").forward(req,resp);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
