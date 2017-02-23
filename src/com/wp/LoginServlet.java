package com.wp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@WebServlet(name = "LoginServlet" , urlPatterns = "/loginServlet.do")
    public class LoginServlet extends HttpServlet{

        /**
         * 
         */
        private static final long serialVersionUID = -6451894481175083005L;
        
        private static Map<String,User> users = new HashMap<String,User>();
        
        private static Log LOG = LogFactory.getLog(LoginServlet.class);
        
        static {
            users.put("tom", new User("1001", "tom", "123456"));
            users.put("king", new User("1002", "king", "123456"));
            users.put("sam", new User("1003", "sam", "123456"));
            users.put("jack", new User("1004", "jack", "123456"));
        }

        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            
             String userName = request.getParameter("userName");  
             String password = request.getParameter("password");  
             LOG.info("Raw input:userName=" + userName + ",password=" + password);  
             String url = request.getContextPath();
             LOG.info("URL------>>" + url);
             if(userName!=null && password!=null  
                       && users.containsKey(userName)  
                       && users.get(userName).getPassword().equals(password)) {  
                  LOG.info("Login;status=SUCCESS");  
                  HttpSession session = request.getSession();
                  session.setAttribute("SESSION_USER", users.get(userName));
                  LOG.info("SessionID----->>" + session.getId());
                  response.sendRedirect(url + "/success.jsp");
             } else {  
                  LOG.info("Login;status=FAIL");  
                  request.getRequestDispatcher("login.jsp").forward(request, response);
             }  
        }
    }