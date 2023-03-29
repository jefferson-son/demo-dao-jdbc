package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department department = new Department(1, "Book");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.00, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(department);
		System.out.println(seller);

	}

}
