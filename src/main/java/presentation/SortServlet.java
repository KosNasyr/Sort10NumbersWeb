package presentation;

import ejb.Sorting;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SortServlet", urlPatterns = {"/Sorting"})
public class SortServlet extends HttpServlet{
    @EJB
    Sorting sorting;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ArrayList<Integer> nums = new ArrayList<>();
        String result;
        if(!request.getParameter("n1").matches("-?[\\d]+") ||
                !request.getParameter("n2").matches("-?[\\d]+") ||
                !request.getParameter("n3").matches("-?[\\d]+") ||
                !request.getParameter("n4").matches("-?[\\d]+") ||
                !request.getParameter("n5").matches("-?[\\d]+") ||
                !request.getParameter("n6").matches("-?[\\d]+") ||
                !request.getParameter("n7").matches("-?[\\d]+") ||
                !request.getParameter("n8").matches("-?[\\d]+") ||
                !request.getParameter("n9").matches("-?[\\d]+") ||
                !request.getParameter("n10").matches("-?[\\d]+")){
            result = "Вы должны вводить числа!";
        }
        else {
            Integer n1 = Integer.parseInt(request.getParameter("n1"));
            nums.add(n1);
            Integer n2 = Integer.parseInt(request.getParameter("n2"));
            nums.add(n2);
            Integer n3 = Integer.parseInt(request.getParameter("n3"));
            nums.add(n3);
            Integer n4 = Integer.parseInt(request.getParameter("n4"));
            nums.add(n4);
            Integer n5 = Integer.parseInt(request.getParameter("n5"));
            nums.add(n5);
            Integer n6 = Integer.parseInt(request.getParameter("n6"));
            nums.add(n6);
            Integer n7 = Integer.parseInt(request.getParameter("n7"));
            nums.add(n7);
            Integer n8 = Integer.parseInt(request.getParameter("n8"));
            nums.add(n8);
            Integer n9 = Integer.parseInt(request.getParameter("n9"));
            nums.add(n9);
            Integer n10 = Integer.parseInt(request.getParameter("n10"));
            nums.add(n10);
            result = sorting.sorting(nums);
        }
        request.setAttribute("result", result);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

}
