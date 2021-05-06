package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Department department = departmentDao.findById(2);
		
		System.out.println(department);
		
		System.out.println("=== TEST 2: seller findAll ===");
		List<Department> dep = departmentDao.findAll();
		
		for (Department d : dep){
			System.out.println(d);
		}
		
		System.out.println("=== TEST 3: seller insert ===");
		Department newDepartment = new Department(null,"Computers");
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! new id:  " + newDepartment.getId());
		
		System.out.println("=== TEST 4: seller update ===");
		department = departmentDao.findById(1);
		department.setName("Music");
		departmentDao.update(department);
		
		System.out.println("Update completed!");
		
		System.out.println("=== TEST 4: seller update ===");
		
		departmentDao.deleteById(3);
		
		System.out.println("successfully deleted");

	}

}
