/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PABD_j;

import java.sql.*;

/**
 *
 * @author 20211074010035
 */
public class PABD_j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Customer c = new Customer(1, "Guilherme", "Leal", "guilerme.leal@ifrn.edu.br", 1, 1);
        
        CustomerDAO dao = new CustomerDAO();
        
        System.out.println(dao.getCustomers());
    
    }
    
}