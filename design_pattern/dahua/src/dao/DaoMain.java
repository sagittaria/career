package dao;

import java.util.*;

public class DaoMain {

    public static void main(String[] args) {
        CustomerDao dao =new CustomerDaoImpl();
        System.out.println("------before=--------");
        query(dao);
        System.out.println("------getById--------");
        getById(dao);
        System.out.println("------added----------");
        add(dao);
        query(dao);
        System.out.println("------updated--------");
        update(dao);
        query(dao);
        System.out.println("------deleted--------");
        delete(dao);
        query(dao);
    }

    public static void add(CustomerDao dao){
        Customer c=new Customer();
        c.setName("名");
        c.setEmail("x@y.z");
        dao.add(c);
    }
    
    public static void update(CustomerDao dao){
        Customer c=new Customer();
        c.setId(2);
        c.setName("名-gai");
        c.setEmail("x@y.z-gai");
        dao.update(c);
    }
    
    public static void delete(CustomerDao dao){
        dao.delete(3);
    }
    
    public static void query(CustomerDao dao){
        List<Customer> list = dao.query();
        for(Customer c:list){
            System.out.println(c.getId()+" "+c.getName()+" "+c.getEmail());
        }
    }
    
    public static void getById(CustomerDao dao){
        Customer c=dao.getCustomerById(1);
        System.out.println(c.getId()+" "+c.getName()+" "+c.getEmail());
    }
}
