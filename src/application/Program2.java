package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST1: department findById ====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST3: department insert ====");
		Department newDepartment = new Department(null, "Home appliances");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST4: department update ====");
		department = departmentDao.findById(7);
		department.setName("Furniture");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST5: department delete ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted completed!");
		
		sc.close();
	}

}
