package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args){

        Department d = new Department(1, "Sellers");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, d);

        System.out.println(d);
        System.out.println(seller);

    }
}
