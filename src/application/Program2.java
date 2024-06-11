package application;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in); 
		DepartmentDao departmentDao = DaoFactory.createDeparmentDao(); 
		
		System.out.println("=== Test 1: Department findById =====");
		Department dep = departmentDao.findById(3); 
		System.out.println(dep);
		
		System.out.println("\n=== Test 2: Department findAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department lis: list) {
			System.out.println(lis);
		}
		
		System.out.println("\n=== Test 3: Department insert =====");
		Department newDepartment = new Department(null, "Infantil"); 
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+newDepartment.getId());
		
		System.out.println("\n=== Test 4: Department update =====");
		dep = departmentDao.findById(1);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n=== Test 6: Department delete =====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}	

	

}
