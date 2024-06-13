package com.example.userauth;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String username = (session != null) ? (String) session.getAttribute("username") : null;

        if (username == null || username.isEmpty()) {
            response.sendRedirect("index.jsp?unauthorized=true");
        } else {
            request.setAttribute("username", username);
            request.setAttribute("isLoggedIn", true);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
