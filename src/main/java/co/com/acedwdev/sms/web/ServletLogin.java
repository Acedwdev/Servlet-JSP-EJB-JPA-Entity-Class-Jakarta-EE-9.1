
package co.com.acedwdev.sms.web;

import co.com.acedwdev.sms.domain.Login;
import co.com.acedwdev.sms.service.ServiceLogin;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/logins")
public class ServletLogin extends HttpServlet{
    
    @Inject
    ServiceLogin serviceLogin;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Login> logins = serviceLogin.loginList();
        System.out.println("logins:" + logins);
        request.setAttribute("logins", logins);
        request.getRequestDispatcher("/loginList.jsp").forward(request, response);
    }
}
