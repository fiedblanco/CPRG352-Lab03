/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 854276
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //this will display request JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture the parameters from POST request (the form)
        String entered_Age = request.getParameter("age");

        
         if (entered_Age == null || entered_Age.equals("")){
            request.setAttribute("invalidmessage", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
        } else if(!entered_Age.matches("[0-9]+")){
            request.setAttribute("invalidmessage", "You must enter a number");

        } else {
        
        int ageNext = Integer.parseInt(entered_Age) + 1; 
        
             request.setAttribute("invalidmessage", "Your age next birthday will be " + ageNext);

        }
         
         
         
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
