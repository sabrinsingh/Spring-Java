package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		//Object Construction 	| Done by us(developer)
		Employee eRef=new Employee();
		eRef.setEid(101);
		eRef.setEname("James");
		eRef.setEaddress("Winchester");
		
		System.out.println("Employee Details " +eRef);
	
	
	//Spring Way | IOC(Inversion Of Control)
	Resource resource=new ClassPathResource("employeebean.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	//BeanFactory is a Spring Container which shall parse/read XML file and construct object
	
	Employee e1=(Employee)factory.getBean("emp1");
	Employee e2=factory.getBean("emp2", Employee.class);//Either way
	
	System.out.println("Employee1 Details: " +e1);
	System.out.println("Employee2 Details: " +e2);
}
	
}
