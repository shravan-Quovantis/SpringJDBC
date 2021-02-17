package model;

import db.CustomerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class App {
    public static void main(String[] args) {
        //Spring JDBC Template

        //Using XML file for Configuration
        final ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        //Using Annotation for Configuration
//        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        final CustomerDao customerdao = (CustomerDao) context.getBean("customerDaoBean");

        final Customer customer = new Customer();
        customer.setId(357);
        customer.setName("Priyanka");
        customer.setCity("Giridih");

        //SQL Operations
//        final int resultA = customerdao.insert(customer);
//        System.out.println(resultA + " row affected");
//        final int resultB = customerdao.alter(customer);
//        System.out.println(resultB + " row affected");
//        final int resultC = customerdao.delete(716);
//        System.out.println(resultC + " row affected");

        final Customer customerA = customerdao.select(788);
        System.out.println("Fetched Single Customer: " + customerA);

        final List<Customer> customerList = customerdao.selectAll();
        System.out.println("Customer List:");
        for (Customer singleCustomer : customerList) {
            System.out.println(singleCustomer);
        }
    }
}
