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
 * @date 2019/8/13 12:57
 * @company www.ads.com
 * @desc
 */
public class LoginServlet extends HttpServlet {
    private UserService userSer=new UserService();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> map = req.getParameterMap();
        //req.setCharacterEncoding("UTF-8");
        //resp.setCharacterEncoding("UTF-8");
        //resp.setContentType("text/html;charset=UTF-8");
        //System.out.println(map.get("name"));
        //System.out.println(map.get("sex"));
        //System.out.println(map.get("password"));
        //System.out.println(map.get("fav"));
        try {
            User u = MaptoBeanUtils.MapToBean(map);
            boolean login = userSer.login(u);
            if (login) {
                req.getRequestDispatcher("loginOk.html").forward(req,resp);
            }else{
                req.getRequestDispatcher("loginFailed.html").forward(req,resp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
