package net.viralpatel.hibernate;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Department department = new Department();
		department.setDepartmentName("Sales");
		session.save(department);
		
		Employee emp1 = new Employee("Nina", "Mayers", "111");
		Employee emp2 = new Employee("Tony", "Almeida", "222");

		emp1.setDepartment(department);
		emp2.setDepartment(department);
		
		session.save(emp1);
		session.save(emp2);

		session.getTransaction().commit();
		session.close();
	}
}
