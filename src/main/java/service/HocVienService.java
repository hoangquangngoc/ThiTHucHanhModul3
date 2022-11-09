package service;

import dao.CRUD_HocVien;
import model.HocVien;

import java.util.ArrayList;
import java.util.List;

public class HocVienService {
    public static List<HocVien> hocViens = CRUD_HocVien.getAll();


    public static void add(HocVien hocVien){
        CRUD_HocVien.save(hocVien);
        hocViens = CRUD_HocVien.getAll();
    }
    public static void edit(int id , HocVien hocVien){
        for (int i = 0; i < hocViens.size(); i++) {
            if (hocViens.get(i).getId() == id){
                hocViens.set(i,hocVien);
                CRUD_HocVien.edit(hocVien);
            }

        }
    }
    public static void delete(int id){
        for (int i = 0; i < hocViens.size(); i++) {
            if (hocViens.get(i).getId() == id){
                hocViens.remove(i);
                CRUD_HocVien.delete(id);
            }

        }

    }
}
