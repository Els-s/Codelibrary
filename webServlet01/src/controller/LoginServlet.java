package controller;

import bean.User;
import org.apache.commons.beanutils.BeanUtils;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author kmj
 * @date 2019/8/15 17:16
 * @company www.ads.com
 * @desc
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService us=new UserService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> paraMap = request.getParameterMap();
        User user=new User();
        try {
            BeanUtils.populate(user,paraMap);
            boolean login = us.Login(user);
            if (login) {
                request.getRequestDispatcher("loginOK.html").forward(request,response);
            }else{
                request.getRequestDispatcher("loginFailed.html").forward(request,response);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
