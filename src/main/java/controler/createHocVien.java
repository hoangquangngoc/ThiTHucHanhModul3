package controler;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.HocVien;
import service.HocVienService;

import java.io.IOException;
import java.sql.Date;

@WebServlet (urlPatterns = "/create")
public class createHocVien extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Date DateOfBirth = Date.valueOf(req.getParameter("DateOfBirth"));
        String address = req.getParameter("address");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        int classRoom = Integer.parseInt(req.getParameter("classRoom"));

        HocVienService.add(new HocVien(id,name, DateOfBirth.toLocalDate(),address,phoneNumber,email,classRoom));
        resp.sendRedirect("/hocviens");
    }
}
