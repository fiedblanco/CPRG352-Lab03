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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //this will display request JSP as a view
        request.setAttribute("resultmessage", "--");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture the parameters from POST request (the form)
        //  String entered_Age = request.getParameter("age");
        String entered_fir = request.getParameter("first");
        String entered_sec = request.getParameter("second");

        String button = request.getParameter("buttons");

        request.setAttribute("first", entered_fir);
        request.setAttribute("second", entered_sec);

        if (entered_fir == null || entered_fir.equals("") || entered_sec == null || entered_sec.equals("")) {
            request.setAttribute("invalidmessage", "Invalid. Cannot be empty");
            request.setAttribute("resultmessage", "--");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } else if (!entered_fir.matches("[0-9]+") || !entered_sec.matches("[0-9]+")) {
            request.setAttribute("invalidmessage", "Invalid. Entry is not a number");
            request.setAttribute("resultmessage", "--");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } else if (button.equals("+")) {
            int add_results = Integer.parseInt(entered_fir) + Integer.parseInt(entered_sec);
            request.setAttribute("resultmessage", add_results);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }else if (button.equals("-")) {
            int add_results = Integer.parseInt(entered_fir) - Integer.parseInt(entered_sec);
            request.setAttribute("resultmessage", add_results);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }else if (button.equals("*")) {
            int add_results = Integer.parseInt(entered_fir) * Integer.parseInt(entered_sec);
            request.setAttribute("resultmessage", add_results);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }else if (button.equals("%")) {
            int add_results = Integer.parseInt(entered_fir) % Integer.parseInt(entered_sec);
            request.setAttribute("resultmessage", add_results);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
