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
		
		System.out.println("=== TEST 1: findAll =====");
		List<Department> deps = departmentDao.findAll();
		for(Department dep: deps) {
			System.out.println(dep);
		}
		
		System.out.println();
		System.out.println("=== TEST 2: findById =====");
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 3: insert =====");
		Department newDep = new Department(4, "Mc Donalds");
		departmentDao.insert(newDep);
		
		System.out.println();
		System.out.println("=== TEST 4: update =====");
		newDep.setName("Burguer King");
		departmentDao.update(newDep);
		
		System.out.println();
		System.out.println("=== TEST 5: delete =====");
		System.out.println("Digite um id para ser deletado:");
		int id = sc.nextInt();
		sc.nextLine();
		departmentDao.deleteById(id);
		
		sc.close();

	}

}
