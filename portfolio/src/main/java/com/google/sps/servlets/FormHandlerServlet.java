package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String message = request.getParameter("text-input");
    String email = request.getParameter("email");
    String name = request.getParameter("name");

    // Print the value so you can see it in the server logs.
    System.out.println("Your name: " + name);
    System.out.println("You email: " + email);
    System.out.println("You message: " + message);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You name: " + name);
    response.getWriter().println("You email: " + email);
    response.getWriter().println("You submitted: " + message);
  }
}