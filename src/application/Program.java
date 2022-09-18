package application;

import java.util.Date;
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

        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        sellers.forEach(System.out::println);

        System.out.println();
        System.out.println("===== Find All test =====");

        sellers = sellerDao.findAll();
        sellers.forEach(System.out::println);

        System.out.println();
        System.out.println("===== Insert Seller test =====");

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);

        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println();
        System.out.println("===== Seller Update test =====");


        seller = sellerDao.findById(1);
        System.out.println(seller);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Seller updated! New data:");
        System.out.println(sellerDao.findById(1));
    }
}
