package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.printf("=== TEST 1: seller findById =====\n\n");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.printf("\n=== TEST 2: seller findById =====\n\n");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}
