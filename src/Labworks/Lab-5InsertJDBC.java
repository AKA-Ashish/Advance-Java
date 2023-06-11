package Labworks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Lab-5InsertJDBC{

    public static void main(String[] args)throws SQLException {

        //DatabaseDetails

        String database_username = "root";
        String database_password = "root";

        String insert_query = "insert into employee_information(name,email,address) values ();"

        Connection conn = DriverManager.getConnection(database_url, database_username, database_password);
        System.out.println("connection successful");

        String name = "Ashish";
        String email = "meashish2020@gmail.com";
        String address = "Swoyambhu";


        PreparedStatement preparedStatement = conn.prepareStatement(insert_query);

        preparedStatement.setString(1,name);
        preparedStatement.setString(2, email);
        preparedStatement.setString(3,  address);

        preparedStatemen.executeUpdate();
        System.out.println("Insert Success");




        
    }
    
}
// DATABASE NAME : ajava_2023

// mysql> create table employee_information (id INT AUTO_INCREMENT PRIMARY KEY ,
// name VARCHAR(50) , email VARCHAR(100) , address VARCHAR(50) );

