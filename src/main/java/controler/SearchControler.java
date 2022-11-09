package controler;
import dao.CRUD_HocVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.HocVien;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/search")
public class SearchControler extends HttpServlet  {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String txtSearch = req.getParameter("txt");
        CRUD_HocVien crud_hocVien = new CRUD_HocVien();
        List<HocVien> hocViens = crud_hocVien.searchByName(txtSearch);
        req.setAttribute("hocviens",hocViens);
        req.getRequestDispatcher("showHocVien.jsp").forward(req,resp);
    }
}
