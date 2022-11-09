package dao;

import model.HocVien;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CRUD_HocVien {
    static Connection connection = Connect_MySql.getConnect();

    public static List<HocVien> getAll(){
        String sql = "Select * from hocvien";
        List<HocVien> hocViens = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDate DateOfBirth = resultSet.getDate("DateOfBirth").toLocalDate();
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                int classRoom = resultSet.getInt("classRoom");
                hocViens.add(new HocVien(id,name,DateOfBirth,address,phoneNumber,email,classRoom));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hocViens;
    }

    public static void save(HocVien hocVien){
        try {
            String sql = "insert into hocvien (id, name, DateOfBirth, address,phoneNumber,email,classRoom) value (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, hocVien.getId());
            preparedStatement.setString(2,  hocVien.getName());
            preparedStatement.setDate(3, Date.valueOf(hocVien.getDateOfBirth()));
            preparedStatement.setString(4, hocVien.getAddress());
            preparedStatement.setString(5, hocVien.getPhoneNumber());
            preparedStatement.setString(6,hocVien.getEmail());
            preparedStatement.setInt(7, hocVien.getClassRoom());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void delete(int id){
        try {
            String sql = "delete from hocvien where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void edit(HocVien hocVien) {
        try {
            String sql = "update hocvien set name = ? , DateOfBirth = ?, address = ? , phoneNumber = ?, email = ?, classRoom= ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, hocVien.getName());
            preparedStatement.setDate(2, Date.valueOf(hocVien.getDateOfBirth()));
            preparedStatement.setString(3, hocVien.getAddress());
            preparedStatement.setString(4, hocVien.getPhoneNumber());
            preparedStatement.setString(5, hocVien.getEmail());
            preparedStatement.setInt(6, hocVien.getClassRoom());
            preparedStatement.setInt(7, hocVien.getId());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<HocVien> searchByName(String txtSearch){
        List<HocVien> hocViens = new ArrayList<>();
        String sql = "Select * from hocvien where name like ?";

        try {
            Connection connection = Connect_MySql.getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%" +txtSearch +"%");
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date DateOfBirth = resultSet.getDate("DateOfBirth");

                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                int classRoom = resultSet.getInt("classRoom");
                hocViens.add(new HocVien(id, name, DateOfBirth.toLocalDate(), address, phoneNumber, email, classRoom));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hocViens;
    }
}