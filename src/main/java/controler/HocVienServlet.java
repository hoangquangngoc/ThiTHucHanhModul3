package controler;
import dao.CRUD_HocVien;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.HocVienService;

import java.io.IOException;

@WebServlet(urlPatterns = "/hocviens")
public class HocVienServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hocviens", CRUD_HocVien.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showHocVien.jsp");
        dispatcher.forward(req,resp);
    }
}
