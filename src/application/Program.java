package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args){

        

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println();
        System.out.println("===== Find by ID test =====");

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();
        System.out.println("===== Find by Department ID test =====");

        List<Seller> sellers = sellerDao.findByDepartment(new Department(2, "Eletronics"));
        sellers.forEach(System.out::println);

        System.out.println();
        System.out.println("===== Find All test =====");

        sellers = sellerDao.findAll();
        sellers.forEach(System.out::println);

    }
}
