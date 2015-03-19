package net.viralpatel.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hibernate One-To-One example (Annotation)");

		// open a session
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		EmployeeDetail employeeDetail = new EmployeeDetail("10th Street", "LA", "San Francisco", "U.S.");
		
		Employee employee = new Employee("Nina", "Mayers", new Date(),"114-857-965");
		employee.setEmployeeDetail(employeeDetail);
		employeeDetail.setEmployee(employee);
		session.save(employee);
		
		@SuppressWarnings("unchecked")
		List<Employee> employees = session.createQuery("from Employee").list();
		for (Employee employee1 : employees) {
			System.out.println(employee1.getFirstname() + " , "
					+ employee1.getLastname() + ", "
					+ employee1.getEmployeeDetail().getState());
		}
		session.getTransaction().commit();
		session.close();
	}
}
