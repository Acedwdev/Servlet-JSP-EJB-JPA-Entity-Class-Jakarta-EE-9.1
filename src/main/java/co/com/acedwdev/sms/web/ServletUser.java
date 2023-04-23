
package co.com.acedwdev.sms.web;


import co.com.acedwdev.sms.domain.User;
import co.com.acedwdev.sms.service.ServiceUser;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/users")
public class ServletUser extends HttpServlet{
    
    @Inject
    ServiceUser serviceUser;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<User> users = serviceUser.userList();
        System.out.println("users:" + users);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/userList.jsp").forward(request, response);
    }
}
