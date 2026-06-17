package com.example.demo;

import java.sql.*;

import org.springframework.stereotype.Repository;


@Repository
public class StudentRepository
{
    public Connection  DBConnection()
    {
        Connection con=null;

         try 
         {
            Class.forName("org.postgresql.Driver");

         } 
         
         catch (ClassNotFoundException e) 
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
          String URL ="jdbc:postgresql://localhost:5432/Students_Managenement";
          String USERNAME = "postgres";
          String PASSWORD = "Prasanth@96";

        try 
        {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } 
        
        catch (SQLException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return con;

    }


        public int insertStudent(Student student)
        {
           Connection conn = DBConnection();
          int res = 0;

           try 
           {
            PreparedStatement psmt = conn.prepareStatement("insert into students values(?,?,?)");
            psmt.setInt(1, student.getId());
            psmt.setString(2, student.getname());
            psmt.setInt(3, student.getAge());

            res = psmt.executeUpdate();

           } 
           catch (SQLException e) 
           {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }

            return res;

            
        }
}
